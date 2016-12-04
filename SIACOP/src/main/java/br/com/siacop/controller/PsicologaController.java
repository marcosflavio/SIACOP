package br.com.siacop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.siacop.model.Psicologa;
import br.com.siacop.service.IServicePsicologa;
import br.com.siacop.service.ServicePsicologa;

@Controller
public class PsicologaController {
	
	@Autowired
	ServicePsicologa psicologaSvc;
	
	@RequestMapping("/dashboard")
	public String dashboard(Model model){
		Psicologa psi = getCurrentUser(psicologaSvc);
		model.addAttribute("usuario",psi);
		return "index";
	}
	
	
	/*
	 * Retorna a psicologa atualmente logada atraves do spring security
	 */
	@Autowired
	public static Psicologa getCurrentUser(IServicePsicologa psicologaSvc){
		String nome = SecurityContextHolder.getContext().getAuthentication().getName();
		Psicologa psico = psicologaSvc.findByLogin(nome);
		return psico;
	}
}
