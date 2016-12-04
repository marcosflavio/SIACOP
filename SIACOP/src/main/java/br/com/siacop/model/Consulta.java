package br.com.siacop.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "consulta")
public class Consulta {
	
	@Id
	@GeneratedValue
	private Integer idConsulta;
	@Column
	private Date dataConsulta;
	@Column
	private String periodoConsulta;
	@Column
	private String diaConsulta;
	@Column
	private String observacoes;
	@Column
	private String horario;
	
	@OneToOne(optional=false)
	private Psicologa psicologa;
	@OneToOne(optional=false)
	private Usuario usuario;
	@Column
	private String statusConsulta;
	@Column
	private Boolean confirma;
	@Column
	private Boolean desconfirma;
	@Column
	private Boolean retorno;
	
	public Consulta() {
		super();
	}

	public Integer getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(Integer idConsulta) {
		this.idConsulta = idConsulta;
	}

	public Date getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public String getPeriodoConsulta() {
		return periodoConsulta;
	}

	public void setPeriodoConsulta(String periodoConsulta) {
		this.periodoConsulta = periodoConsulta;
	}

	public String getDiaConsulta() {
		return diaConsulta;
	}

	public void setDiaConsulta(String diaConsulta) {
		this.diaConsulta = diaConsulta;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Psicologa getPsicologa() {
		return psicologa;
	}

	public void setPsicologa(Psicologa psicologa) {
		this.psicologa = psicologa;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getStatusConsulta() {
		return statusConsulta;
	}

	public void setStatusConsulta(String statusConsulta) {
		this.statusConsulta = statusConsulta;
	}

	public Boolean getConfirma() {
		return confirma;
	}

	public void setConfirma(Boolean confirma) {
		this.confirma = confirma;
	}

	public Boolean getDesconfirma() {
		return desconfirma;
	}

	public void setDesconfirma(Boolean desconfirma) {
		this.desconfirma = desconfirma;
	}

	public Boolean getRetorno() {
		return retorno;
	}

	public void setRetorno(Boolean retorno) {
		this.retorno = retorno;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
}
