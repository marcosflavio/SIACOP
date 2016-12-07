package br.com.siacop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.siacop.model.Psicologa;
import br.com.siacop.service.IServicePsicologa;
import br.com.siacop.service.IServiceSolicitacaoConsulta;
import br.com.siacop.service.ServicePsicologa;

@Controller
public class PsicologaController {

	@Autowired
	private ServicePsicologa psicologaSvc;

	@Autowired
	private IServiceSolicitacaoConsulta serviceSolicitacaoConsulta;

	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		Psicologa psi = getCurrentUser(psicologaSvc);
		model.addAttribute("usuario", psi);
		return "index";
	}

	@RequestMapping("/listaSolicitacoesConsultas")
	public ModelAndView listaConsultas(Model model) {
		ModelAndView mv = new ModelAndView("listaSolicitacoesConsultasStub");
		Psicologa psi = getCurrentUser(psicologaSvc);

		model.addAttribute("usuario", psi);
		mv.addObject("solicitacoesConsulta", serviceSolicitacaoConsulta.findAll());

		return mv;
	}

	/*
	 * Retorna a psicologa atualmente logada atraves do spring security
	 */
	@Autowired
	public static Psicologa getCurrentUser(IServicePsicologa psicologaSvc) {
		String nome = SecurityContextHolder.getContext().getAuthentication().getName();
		Psicologa psico = psicologaSvc.findByLogin(nome);
		return psico;
	}
}
