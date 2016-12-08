package br.com.siacop.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.mail.EmailException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.siacop.enumeradores.TipoDiaSemana;
import br.com.siacop.enumeradores.TipoPeriodo;
import br.com.siacop.model.Consulta;
import br.com.siacop.model.Psicologa;
import br.com.siacop.model.EventFC;
import br.com.siacop.model.SolicitacaoConsulta;
import br.com.siacop.model.Usuario;
import br.com.siacop.service.IServiceConsulta;
import br.com.siacop.service.IServiceSolicitacaoConsulta;
import br.com.siacop.util.EmailUtil;

@Controller
public class ConsultaController {
	
	@Autowired
	private IServiceConsulta serviceConsulta;
	
	@Autowired
	private IServiceSolicitacaoConsulta serviceSolicitacaoConsulta;
	
	@RequestMapping(value = "/confirmacaoConsulta", method = RequestMethod.GET)
	public ModelAndView novo(@RequestParam(value = "idSolicitacao") int idSolicitacao, HttpSession session) {		
		SolicitacaoConsulta solicitacaoConsulta = serviceSolicitacaoConsulta.findOne(idSolicitacao);
		Usuario usuario = solicitacaoConsulta.getUsuario();
		Psicologa psicologa = (Psicologa) session.getAttribute("user_logged");
		
		Consulta consulta = new Consulta();
		consulta.setUsuario(usuario);
		consulta.setPsicologa(psicologa);				
		
		ModelAndView mv = new ModelAndView("confirmacaoConsulta");
		mv.addObject("consulta", consulta);
		mv.addObject("tipoDiaSemana", TipoDiaSemana.values());
		mv.addObject("tipoPeriodo", TipoPeriodo.values());
		
		return mv;
	}
	
	@RequestMapping(value = "/confirmacaoConsulta", method = RequestMethod.POST)
	public ModelAndView confirmarConsulta(@RequestParam(value = "idSolicitacao") int idSolicitacao, @Valid Consulta consulta, BindingResult result, RedirectAttributes attributes, HttpSession session){
		try{
			if (result.hasErrors())			
				return novo(idSolicitacao, session);				
			
			serviceConsulta.save(consulta);
			serviceSolicitacaoConsulta.delete(idSolicitacao);
			
			attributes.addFlashAttribute("mensagemSucesso", "Consulta confirmada com sucesso!");
			
			EmailUtil email = new EmailUtil();
			email.sendConfirmMail(consulta.getUsuario(), consulta);
			
			return new ModelAndView("redirect:/listaSolicitacoesConsultas");
		} catch (ClassCastException e){
			attributes.addFlashAttribute("mensagemSucesso", "Erro ao confirmar a consulta! Operação abortada!");
			return new ModelAndView("redirect:/listaSolicitacoesConsultas");
		} catch (EmailException e){
			attributes.addFlashAttribute("mensagemSucesso", "Erro ao enviar email de confirmação!");
			return new ModelAndView("redirect:/listaSolicitacoesConsultas");
		}
	}
	
	@RequestMapping(value="/getconsultas")
	public @ResponseBody List<EventFC> getConsultas(Model model){
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		ObjectMapper mapper = new ObjectMapper();
		mapper.setDateFormat(df);
		
		List<Consulta> consultas = serviceConsulta.findAll();
		List<EventFC> events = new ArrayList<EventFC>();
		
		
		for (Consulta consulta : consultas) {
			EventFC evento = new EventFC();
			evento.setTitle(consulta.getUsuario().getNome() + " - " + consulta.getStatusConsulta());
			evento.setStart(consulta.getDataConsulta().toString());
			events.add(evento);
		}
		return events;
	}
}
