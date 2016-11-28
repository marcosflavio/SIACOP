package br.com.siacop.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String nome;
	@Column
	private String login;
	@Column
	private String senha;
	@Column
	private String naturalidade;
	@Column
	private Date nascimento;
	@Column
	private String estadoCivil; //{Casado, Solteiro, Divorciado, União Estável}
	@Column
	private Boolean filhos;
	@Column
	private Boolean menores;
	@Column
	private String resideCom; //{Parentes, familiares, amigos, sozinho}
	@Column
	private String endereço;
	@Column
	private Long telefoneContato;
	@Column
	private String email;
	@Column
	private String curso; //{es, si, cc, dd, ec, redes}
	@Column
	private Long matrícula;
	@Column
	private Integer semestre;
	@Column
	private String turno; //{manha, tarde, noite}
	@Column
	private String situaçãoFuncional; // {Bolsista, Auxilio, Não recebe}

	
	public Usuario() {
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


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getNaturalidade() {
		return naturalidade;
	}


	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}


	public Date getNascimento() {
		return nascimento;
	}


	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}


	public String getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public Boolean getFilhos() {
		return filhos;
	}


	public void setFilhos(Boolean filhos) {
		this.filhos = filhos;
	}


	public Boolean getMenores() {
		return menores;
	}


	public void setMenores(Boolean menores) {
		this.menores = menores;
	}


	public String getResideCom() {
		return resideCom;
	}


	public void setResideCom(String resideCom) {
		this.resideCom = resideCom;
	}


	public String getEndereço() {
		return endereço;
	}


	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}


	public Long getTelefoneContato() {
		return telefoneContato;
	}


	public void setTelefoneContato(Long telefoneContato) {
		this.telefoneContato = telefoneContato;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public Long getMatrícula() {
		return matrícula;
	}


	public void setMatrícula(Long matrícula) {
		this.matrícula = matrícula;
	}


	public Integer getSemestre() {
		return semestre;
	}


	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}


	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}


	public String getSituaçãoFuncional() {
		return situaçãoFuncional;
	}


	public void setSituaçãoFuncional(String situaçãoFuncional) {
		this.situaçãoFuncional = situaçãoFuncional;
	}
	
}
