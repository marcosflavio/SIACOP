package br.com.siacop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.siacop.model.Consulta;
import br.com.siacop.model.Usuario;

public interface IRepositoryConsulta extends JpaRepository<Consulta, Integer>{
	
	public int countByUsuario(Usuario usuario);
	
}
