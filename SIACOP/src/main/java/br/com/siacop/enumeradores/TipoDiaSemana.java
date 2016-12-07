package br.com.siacop.enumeradores;

public enum TipoDiaSemana {
	SEGUNDA("Segunda"), TERCA("Terca"), QUARTA("Quarta"), QUINTA("Quinta"), SEXTA("Sexta");
	
	private String diaSemana;
	
	private TipoDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	
	public String getDiaSemana() {
		return diaSemana;
	}
	
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
}
