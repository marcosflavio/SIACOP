package br.com.siacop.service;

import java.util.List;

import br.com.siacop.model.Consulta;
import br.com.siacop.model.Usuario;

public interface IServiceConsulta {
	
	public Consulta save (Consulta consulta);
	
	public List<Consulta> findAll();

	public Consulta findOne(int id);
	
	public Consulta update(Consulta consulta);
	
	public int countByUsuario(Usuario usuario);

	public void delete(int id);

}
