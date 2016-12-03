package br.com.siacop.repository;

import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.siacop.model.Psicologa;

public interface IRepositoryPsicologa extends JpaRepository<Psicologa, Integer>{

	@Query("SELECT ps FROM Psicologa ps WHERE ps.login =:login")
	public Psicologa findByLogin(@Param("login") String login);
	
}
