package br.com.siacop.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.siacop.model.Usuario;
import br.com.siacop.repository.IRepositoryUsuario;

@Service
@Transactional
public class ServiceUsuario implements IServiceUsuario{
	
	@Autowired
	private IRepositoryUsuario repository;
	
	@Override
	public Usuario findByLogin(String login) {
		return repository.findByLogin(login);
	}

	@Override
	public List<Usuario> findAll() {
		return repository.findAll();
	}

	@Override
	public Usuario findOne(int id) {
		return repository.findOne(id);
	}

	@Override
	public Usuario update(Usuario usuario) {
		return repository.save(usuario);
	}

	@Override
	public void delete(int id) {
		repository.delete(id);
	}

	@Override
	public br.com.siacop.model.Usuario save(br.com.siacop.model.Usuario usuario) {

		return repository.save(usuario);
	}

}
