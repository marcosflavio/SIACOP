package br.com.siacop.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.siacop.enumeradores.TipoEncaminhamento;
import br.com.siacop.enumeradores.TipoPeriodo;
import br.com.siacop.model.SolicitacaoConsulta;
import br.com.siacop.model.Usuario;
import br.com.siacop.service.IServiceSolicitacaoConsulta;

@Controller

public class SolicitacaoConsultaController {
	@Autowired
	private IServiceSolicitacaoConsulta service;
	
	@RequestMapping(value = "/solicitarConsulta")
	public ModelAndView novo(SolicitacaoConsulta solicitacaoConsulta) {
		ModelAndView mv = new ModelAndView("solicitarConsulta"); 		
		mv.addObject("tipoEncaminhamento", TipoEncaminhamento.values());
		mv.addObject("tipoPeriodo", TipoPeriodo.values());
		
		return mv;
	}

	@RequestMapping(value = "/solicitarConsulta", method = RequestMethod.POST)
	public ModelAndView salva(@Valid SolicitacaoConsulta solicitacaoConsulta, BindingResult result, RedirectAttributes attributes, HttpSession session) {
		if (result.hasErrors())
			return novo(solicitacaoConsulta);
		
		Usuario user = (Usuario) session.getAttribute("user_logged");
		
		solicitacaoConsulta.setUsuario(user);
		service.save(solicitacaoConsulta);
		
		attributes.addFlashAttribute("mensagemSucesso", "Solicitação de consulta realizada com sucesso!");
		
		return new ModelAndView("redirect:/solicitarConsulta");
	}
}