package br.com.siacop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "psicologa")
public class Psicologa {
	
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String nome;
	@Column
	private String senha;
	@Column
	private String login;
	@Column
	private String matriculaCRP; // Conselho Regional de Psicologia  

	public Psicologa() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMatriculaCRP() {
		return matriculaCRP;
	}

	public void setMatriculaCRP(String matriculaCRP) {
		this.matriculaCRP = matriculaCRP;
	}
	
	
}
