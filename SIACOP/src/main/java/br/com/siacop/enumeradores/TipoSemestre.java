package br.com.siacop.enumeradores;

public enum TipoSemestre {
	
	PRIMEIRO("Primeiro Semestre"), SEGUNDO("Segundo Semestre"), TERCEIRO("Terceiro Semestre")
	, QUARTO("Quarto Semestre"), QUINTO("Quinto Semestre"), SEXTO("Sexto Semestre")
	, SETIMO("Sétimo Semestre"), OITAVO ("Oitavo Semestre");
	
	private String semestre;
	
	TipoSemestre(String semestre) {
		this.semestre = semestre;

	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	 
}
