package br.com.siacop.enumeradores;

public enum TipoEncaminhamento {
	
	VONTADEPROPRIA("Vontade propria"), PROFESSOR("Professor"), DIRETORIA("Diretoria");
	
	private String encaminhamento;
	
	private TipoEncaminhamento(String encaminhamento) {
		this.encaminhamento = encaminhamento;
	}

	public String getEncaminhamento() {
		return encaminhamento;
	}

	public void setEncaminhamento(String encaminhamento) {
		this.encaminhamento = encaminhamento;
	}	
}
