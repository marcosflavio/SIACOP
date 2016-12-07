package br.com.siacop.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import br.com.siacop.enumeradores.TipoDiaSemana;
import br.com.siacop.enumeradores.TipoPeriodo;
import br.com.siacop.enumeradores.TipoStatusConsulta;

@Entity
@Table(name = "consulta")
public class Consulta {
	
	@Id
	@GeneratedValue
	private Integer idConsulta;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	@ManyToOne
	@JoinColumn(name = "idPsicologa")
	private Psicologa psicologa;
	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataConsulta;
	@Column
	@Enumerated(EnumType.STRING)
	private TipoPeriodo periodoConsulta;
	@Column
	@Enumerated(EnumType.STRING)
	private TipoDiaSemana diaConsulta;
	@Column
	private String observacoes;
	@Column
	private String horario;
	@Column
	@Enumerated(EnumType.STRING)
	private TipoStatusConsulta statusConsulta;
	
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

	public TipoPeriodo getPeriodoConsulta() {
		return periodoConsulta;
	}

	public void setPeriodoConsulta(TipoPeriodo periodoConsulta) {
		this.periodoConsulta = periodoConsulta;
	}

	public TipoDiaSemana getDiaConsulta() {
		return diaConsulta;
	}

	public void setDiaConsulta(TipoDiaSemana diaConsulta) {
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
	
	public TipoStatusConsulta getStatusConsulta() {
		return statusConsulta;
	}

	public void setStatusConsulta(TipoStatusConsulta statusConsulta) {
		this.statusConsulta = statusConsulta;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
}
