package br.com.siacop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.siacop.service.IServicePsicologa;
import br.com.siacop.service.IServiceUsuario;

@Controller
public class LoginController {

	@Autowired
	private IServiceUsuario usrService;
	@Autowired
	private IServicePsicologa psicoService;

	@RequestMapping(value = { "/login" }, method = { RequestMethod.GET, RequestMethod.POST })
	public String login() {
		return "login";
	}

	@RequestMapping(value = { "/home" }, method = { RequestMethod.GET })
	public String home() {
		return "home";
	}

	@RequestMapping(value = { "/index" }, method = { RequestMethod.GET })
	public String index(HttpServletRequest request, HttpSession session) {
		String login = request.getUserPrincipal().getName();
		Object usr = psicoService.findByLogin(login);

		if (usr == null)
			usr = usrService.findByLogin(login);

		session.setAttribute("user_logged", usr);

		if (request.isUserInRole("ROLE_PSICO"))
			return "redirect:dashboard";
		if (request.isUserInRole("ROLE_USER"))
			return "home";

		return "403";
	}
}
