package br.com.siacop.service;

import java.util.List;

import br.com.siacop.model.Usuario;

public interface IServiceUsuario {

	public Usuario save(Usuario usuario);

	public List<Usuario> findAll();

	public Usuario findOne(int id);

	public Usuario update(Usuario usuario);
	
	public Usuario findByLogin(String login);

	public void delete(int id);

}
