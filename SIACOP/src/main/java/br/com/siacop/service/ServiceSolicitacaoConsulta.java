package br.com.siacop.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siacop.model.Psicologa;
import br.com.siacop.model.SolicitacaoConsulta;
import br.com.siacop.model.Usuario;
import br.com.siacop.repository.IRepositorySolicitacaoConsulta;

@Service
@Transactional
public class ServiceSolicitacaoConsulta implements IServiceSolicitacaoConsulta {
	
	@Autowired
	private IRepositorySolicitacaoConsulta repository;

	@Override
	public List<SolicitacaoConsulta> findAll() {
		return repository.findAll();
	}

	@Override
	public SolicitacaoConsulta findOne(int id) {
		return repository.findOne(id);
	}

	@Override
	public SolicitacaoConsulta update(SolicitacaoConsulta solicitacaoConsulta) {
		return repository.save(solicitacaoConsulta);
	}

	@Override
	public void delete(int id) {
		repository.delete(id);
	}
	
	@Override
	public int countByUsuario(Usuario usuario) {
		return repository.countByUsuario(usuario);
	}
	
	@Override
	public long count() {
		return repository.count();
	}
	
	@Override
	public SolicitacaoConsulta save(SolicitacaoConsulta solicitacao) {
		return repository.save(solicitacao);
	}
}
