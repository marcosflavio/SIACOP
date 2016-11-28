package br.com.siacop.service;

import java.util.List;

import br.com.siacop.model.SolicitacaoConsulta;;

public interface IServiceSolicitacaoConsulta {
	
	public SolicitacaoConsulta save (SolicitacaoConsulta solicitacao);
	
	public List<SolicitacaoConsulta> findAll();

	public SolicitacaoConsulta findOne(int id);
	
	public SolicitacaoConsulta update(SolicitacaoConsulta solicitacaoConsulta);

	public void delete(int id);

}
