package br.com.siacop.enumeradores;

public enum TipoPeriodo {
	
	MANHA("Manha"), TARDE("Tarde"), NOITE("Noite");
	
	private String periodo;
	
	private TipoPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	public String getPeriodo(){
		return periodo;
	}
	
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
}
