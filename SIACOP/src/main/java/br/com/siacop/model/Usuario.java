package br.com.siacop.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import br.com.siacop.enumeradores.TipoCurso;
import br.com.siacop.enumeradores.TipoFilhos;
import br.com.siacop.enumeradores.TipoMenores;
import br.com.siacop.enumeradores.TipoResideCom;
import br.com.siacop.enumeradores.TipoSemestre;
import br.com.siacop.enumeradores.TipoSituacaoFuncional;
import br.com.siacop.enumeradores.TipoTurno;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank(message = "O nome do usuário não pode estar em branco!")
	@Column
	private String nome;

	@NotBlank(message = "O campo login deve ser preenchido!")
	@Column
	private String login;

	@NotBlank(message = "O campo Senha deve ser preenchido!")
	@Column
	private String senha;

	@NotBlank(message = "O campo naturalidade deve ser preenchido!")
	@Column
	private String naturalidade;

	//@NotNull(message = "A data de nascimento não pode ser nula!")
	@Column
	private Date nascimento;

	@NotBlank(message = "A estado civil deve ser preenchido!")
	@Column
	private String estadoCivil; // {Casado, Solteiro, Divorciado, União Estável}

	@NotNull(message = "O campo Filhos deve ser selecionado!")
	@Enumerated(EnumType.STRING)
	@Column
	private TipoFilhos filhos;

	@NotNull(message = "O campo Menores deve ser selecionado!")
	@Enumerated(EnumType.STRING)
	@Column
	private TipoMenores menores;

	@NotNull(message = "O campo Reside com deve ser selecionado!")
	@Enumerated(EnumType.STRING)
	@Column
	private TipoResideCom resideCom; // {Parentes, familiares, amigos, sozinho}

	@NotBlank(message = "O campo Endereço deve ser preenchido!")
	@Column
	private String endereco;

	@NotNull(message = "O campo Telefone para Contato deve ser preenchido!")
	@Column
	private Long telefoneContato;

	@NotBlank(message = "O campo E-mail deve ser preenchido!")
	@Column
	private String email;

	@NotNull(message = "O campo Curso deve ser selecionado!")
	@Enumerated(EnumType.STRING)
	@Column
	private TipoCurso curso; // {es, si, cc, dd, ec, redes}

	@NotNull(message = "O campo Matrícula deve ser preenchido!")
	@Column
	private Long matricula;

	@NotNull(message = "O campo Semestre deve ser selecionado!")
	@Column
	@Enumerated(EnumType.STRING)
	private TipoSemestre semestre;

	@NotNull(message = "O campo Turno deve ser selecionado!")
	@Enumerated(EnumType.STRING)
	@Column
	private TipoTurno turno; // {manha, tarde, noite}

	@NotNull(message = "O campo Situação Funcional deve ser selecionado!")
	@Enumerated(EnumType.STRING)
	@Column
	private TipoSituacaoFuncional situacaoFuncional; // {Bolsista, Auxilio, Não
														// recebe}

//	@NotNull(message = "Este campo não pode ser nulo!")
//	@Enumerated(EnumType.STRING)
//	@Column
//	private TipoPapel papel; // Papel do suaurio {'USER','PSICO'}

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

	public TipoFilhos getFilhos() {
		return filhos;
	}

	public void setFilhos(TipoFilhos filhos) {
		this.filhos = filhos;
	}

	public TipoMenores getMenores() {
		return menores;
	}

	public void setMenores(TipoMenores menores) {
		this.menores = menores;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	
	public TipoSemestre getSemestre() {
		return semestre;
	}

	public void setSemestre(TipoSemestre semestre) {
		this.semestre = semestre;
	}

	public TipoResideCom getResideCom() {
		return resideCom;
	}

	public void setResideCom(TipoResideCom resideCom) {
		this.resideCom = resideCom;
	}

	public TipoCurso getCurso() {
		return curso;
	}

	public void setCurso(TipoCurso curso) {
		this.curso = curso;
	}

	public TipoTurno getTurno() {
		return turno;
	}

	public void setTurno(TipoTurno turno) {
		this.turno = turno;
	}

	public TipoSituacaoFuncional getSituacaoFuncional() {
		return situacaoFuncional;
	}

	public void setSituacaoFuncional(TipoSituacaoFuncional situacaoFuncional) {
		this.situacaoFuncional = situacaoFuncional;
	}

//	public TipoPapel getPapel() {
//		return papel;
//	}
//
//	public void setPapel(TipoPapel papel) {
//		this.papel = papel;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((estadoCivil == null) ? 0 : estadoCivil.hashCode());
		result = prime * result + ((filhos == null) ? 0 : filhos.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((menores == null) ? 0 : menores.hashCode());
		result = prime * result + ((nascimento == null) ? 0 : nascimento.hashCode());
		result = prime * result + ((naturalidade == null) ? 0 : naturalidade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
	//	result = prime * result + ((papel == null) ? 0 : papel.hashCode());
		result = prime * result + ((resideCom == null) ? 0 : resideCom.hashCode());
		result = prime * result + ((semestre == null) ? 0 : semestre.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		result = prime * result + ((situacaoFuncional == null) ? 0 : situacaoFuncional.hashCode());
		result = prime * result + ((telefoneContato == null) ? 0 : telefoneContato.hashCode());
		result = prime * result + ((turno == null) ? 0 : turno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (curso != other.curso)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (estadoCivil == null) {
			if (other.estadoCivil != null)
				return false;
		} else if (!estadoCivil.equals(other.estadoCivil))
			return false;
		if (filhos == null) {
			if (other.filhos != null)
				return false;
		} else if (!filhos.equals(other.filhos))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (menores == null) {
			if (other.menores != null)
				return false;
		} else if (!menores.equals(other.menores))
			return false;
		if (nascimento == null) {
			if (other.nascimento != null)
				return false;
		} else if (!nascimento.equals(other.nascimento))
			return false;
		if (naturalidade == null) {
			if (other.naturalidade != null)
				return false;
		} else if (!naturalidade.equals(other.naturalidade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
//		if (papel != other.papel)
//			return false;
		if (resideCom != other.resideCom)
			return false;
		if (semestre == null) {
			if (other.semestre != null)
				return false;
		} else if (!semestre.equals(other.semestre))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		if (situacaoFuncional != other.situacaoFuncional)
			return false;
		if (telefoneContato == null) {
			if (other.telefoneContato != null)
				return false;
		} else if (!telefoneContato.equals(other.telefoneContato))
			return false;
		if (turno != other.turno)
			return false;
		return true;
	}

}
