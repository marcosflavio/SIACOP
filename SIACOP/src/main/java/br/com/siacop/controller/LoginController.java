package br.com.siacop.controller;

import java.security.Principal;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.siacop.model.Usuario;

@Controller
public class LoginController {
	
	@RequestMapping(value={"/login"}, method = { RequestMethod.GET, RequestMethod.POST })
	public String login(){
		return "login";
	}
	
	@RequestMapping(value={"/home"}, method = { RequestMethod.GET})
	public String home(){
		return "home";
	}
	
	@RequestMapping(value={"/index"}, method = { RequestMethod.GET})
	public String index(Model model, HttpServletRequest request){
		if(request.isUserInRole("ROLE_PSICO"))
			return "redirect:dashboard";
		if(request.isUserInRole("ROLE_USER"))
			return "home";
		return "403";
	}
}
