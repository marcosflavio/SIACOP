package br.com.siacop.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siacop.model.Consulta;
import br.com.siacop.repository.IRepositoryConsulta;

@Service
@Transactional
public class ServiceConsulta implements IServiceConsulta {

	@Autowired
	private IRepositoryConsulta repository;
	
	

	@Override
	public List<br.com.siacop.model.Consulta> findAll() {
		return repository.findAll();
	}

	@Override
	public br.com.siacop.model.Consulta findOne(int id) {
		return repository.findOne(id);
	}

	@Override
	public br.com.siacop.model.Consulta update(br.com.siacop.model.Consulta consulta) {
		return repository.save(consulta);
	}

	@Override
	public void delete(int id) {
		repository.delete(id);
		
	}

	@Override
	public Consulta save(Consulta consulta) {
		return repository.save(consulta);
	}

	
	
}
