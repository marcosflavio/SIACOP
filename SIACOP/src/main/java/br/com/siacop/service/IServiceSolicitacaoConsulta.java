package br.com.siacop.service;

import java.util.List;

import br.com.siacop.model.Psicologa;
import br.com.siacop.model.SolicitacaoConsulta;
import br.com.siacop.model.Usuario;;

public interface IServiceSolicitacaoConsulta {
	
	public SolicitacaoConsulta save (SolicitacaoConsulta solicitacao);
	
	public List<SolicitacaoConsulta> findAll();

	public SolicitacaoConsulta findOne(int id);
	
	public SolicitacaoConsulta update(SolicitacaoConsulta solicitacaoConsulta);
	
	public int countByUsuario(Usuario usuario);
	
	public long count();

	public void delete(int id);

}
