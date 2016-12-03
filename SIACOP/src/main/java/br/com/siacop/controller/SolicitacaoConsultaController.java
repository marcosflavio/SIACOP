package br.com.siacop.controller;

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
import br.com.siacop.service.IServiceSolicitacaoConsulta;

@Controller
public class SolicitacaoConsultaController {
	@Autowired
	private IServiceSolicitacaoConsulta service;
	
	@RequestMapping(value={"/solicitarConsulta"}, method = { RequestMethod.GET, RequestMethod.POST })
	public String solicitarCoonsulta(){
		return "solicitarConsulta";
	}	
	
	@RequestMapping("/solicitarConsulta/novo")
	public ModelAndView novo(SolicitacaoConsulta solicitacaoConsulta) {
		ModelAndView mv = new ModelAndView("/solicitarConsulta/novo"); 
		mv.addObject("tipoPeriodo", TipoPeriodo.values());
		mv.addObject("tipoEncaminhamento", TipoEncaminhamento.values());		
		
		return mv;
	}

	@RequestMapping(value = "/solicitarConsulta/novo", method = RequestMethod.POST)
	public ModelAndView salva(@Valid SolicitacaoConsulta solicitacaoConsulta, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors())
			return novo(solicitacaoConsulta);		
		
		service.save(solicitacaoConsulta);
		
		attributes.addFlashAttribute("mensagemSucesso", "Solicitação de consulta realizada com sucesso!");
		
		return new ModelAndView("redirect:/solicitarConsulta/novo");
	}
}
