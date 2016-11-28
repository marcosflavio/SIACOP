package br.com.siacop.service;

import java.util.List;
import br.com.siacop.model.Psicologa;

public interface IServicePsicologa {
	
	
	public Psicologa save (Psicologa Psicologa);
	
	public List<Psicologa> findAll();

	public Psicologa findOne(int id);
	
	public Psicologa update(Psicologa psicologa);

	public void delete(int id);
}
