package br.com.siacop.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.siacop.enumeradores.TipoCurso;
import br.com.siacop.enumeradores.TipoEstadoCivil;
import br.com.siacop.enumeradores.TipoFilhos;
import br.com.siacop.enumeradores.TipoMenores;
import br.com.siacop.enumeradores.TipoPapel;
import br.com.siacop.enumeradores.TipoResideCom;
import br.com.siacop.enumeradores.TipoSemestre;
import br.com.siacop.enumeradores.TipoSituacaoFuncional;
import br.com.siacop.enumeradores.TipoTurno;
import br.com.siacop.model.Usuario;
import br.com.siacop.service.IServiceUsuario;

@Controller
@RequestMapping(value = "/usuario")
public class UsuarioController {

	@Autowired
	private IServiceUsuario service;
	
	@RequestMapping("/novo")
	public ModelAndView novo(Usuario usuario) {
		ModelAndView mv = new ModelAndView("/usuario/cadastroUsuario"); 
		mv.addObject("tipoCurso", TipoCurso.values());
		mv.addObject("tipoEstadoCivil", TipoEstadoCivil.values());
		mv.addObject("tipoPapel", TipoPapel.values());
		mv.addObject("tipoResideCom", TipoResideCom.values());
		mv.addObject("tipoSituacaoFuncional", TipoSituacaoFuncional.values());
		mv.addObject("tipoTurno", TipoTurno.values());
		mv.addObject("tipoMenores", TipoMenores.values());
		mv.addObject("tipoFilhos", TipoFilhos.values());
		mv.addObject("tipoSemestre", TipoSemestre.values());
		
		return mv;
	}

	@RequestMapping(value = "/novo", method = RequestMethod.POST)
	public ModelAndView salva(@Valid Usuario usuario, BindingResult result, RedirectAttributes attributes) {
		
		if (result.hasErrors()) {
			return novo(usuario);
		}
		service.save(usuario);
		attributes.addFlashAttribute("mensagemSucesso", "Usuário cadastrado com sucesso!");
		
		return new ModelAndView("redirect:/usuario/novo");

	}
}
