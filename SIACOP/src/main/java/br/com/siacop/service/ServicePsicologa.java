package br.com.siacop.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.siacop.model.Psicologa;
import br.com.siacop.repository.IRepositoryPsicologa;

@Service
@Transactional
public class ServicePsicologa implements IServicePsicologa {
	
	@Autowired
	private IRepositoryPsicologa repository;


	@Override
	public List<Psicologa> findAll() {
		return repository.findAll();
	}

	@Override
	public Psicologa findOne(int id) {
		return repository.findOne(id);
	}
	
	@Override
	public Psicologa findByLogin(String login) {
		return repository.findByLogin(login);
	}
	
	@Override
	public Psicologa update(Psicologa psicologa) {
		return repository.save(psicologa);
	}

	@Override
	public void delete(int id) {
		repository.delete(id);
	}

	@Override
	public Psicologa save(Psicologa psicologa) {
		return repository.save(psicologa);
	}

}
