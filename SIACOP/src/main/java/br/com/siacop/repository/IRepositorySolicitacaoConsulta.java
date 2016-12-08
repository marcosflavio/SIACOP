package br.com.siacop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.siacop.model.Psicologa;
import br.com.siacop.model.SolicitacaoConsulta;
import br.com.siacop.model.Usuario;

public interface IRepositorySolicitacaoConsulta extends JpaRepository<SolicitacaoConsulta, Integer> {

	public int countByUsuario(Usuario usuario);
	
}
