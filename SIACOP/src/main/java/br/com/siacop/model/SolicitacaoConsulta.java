package br.com.siacop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "solicitacao_consulta")
public class SolicitacaoConsulta {
	
	@Id
	@GeneratedValue
	private Integer idSolicitacao;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private Usuario usuario;	
	
	@Column
	private String encaminhadoPor; // {Vontade Própria, Professor, Diretoria}
	
	@Column
	private String motivo;
	
	@Column
	private String melhorDia; // {seg, terca, quarta, quinta, sexta}
	
	@Column
	private String melhorPeriodo;// {Manhã, tarde, noite}
	
	public SolicitacaoConsulta() {
	}

	public Integer getIdSolicitacao() {
		return idSolicitacao;
	}

	public void setIdSolicitacao(Integer idSolicitacao) {
		this.idSolicitacao = idSolicitacao;
	}	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getEncaminhadoPor() {
		return encaminhadoPor;
	}

	public void setEncaminhadoPor(String encaminhadoPor) {
		this.encaminhadoPor = encaminhadoPor;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getMelhorDia() {
		return melhorDia;
	}

	public void setMelhorDia(String melhorDia) {
		this.melhorDia = melhorDia;
	}

	public String getMelhorPeriodo() {
		return melhorPeriodo;
	}

	public void setMelhorPeriodo(String melhorPeriodo) {
		this.melhorPeriodo = melhorPeriodo;
	}
	
	
}
