package br.com.siacop.enumeradores;

public enum TipoCurso {

	ES("Engenharia de Software"), SI("Sistemas de Informação"), EC("Engenharia da Computação"), DD(
			"Design Digital"), RC("Redes de Computadores"), CC("Ciências da Computação");

	TipoCurso(String curso) {
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	private String curso;
}
