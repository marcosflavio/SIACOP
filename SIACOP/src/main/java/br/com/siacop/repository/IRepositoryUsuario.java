package br.com.siacop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.siacop.model.Usuario;

public interface IRepositoryUsuario extends JpaRepository<Usuario, Integer>{
	
	@Query("SELECT us FROM Usuario us WHERE us.login =:login")
	public Usuario findByLogin(@Param("login") String login);
}
