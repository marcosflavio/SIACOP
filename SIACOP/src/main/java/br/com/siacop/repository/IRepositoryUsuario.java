package br.com.siacop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.siacop.model.Usuario;

public interface IRepositoryUsuario extends JpaRepository<Usuario, Integer>{

}
