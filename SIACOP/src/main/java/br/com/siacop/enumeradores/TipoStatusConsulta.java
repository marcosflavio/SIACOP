package br.com.siacop.enumeradores;

public enum TipoStatusConsulta {
	CONFIRMADA("Confirmada"), RECUSADA("Recusada"), REALIZADA("Realizada");
	
	private String statusConsulta;

	private TipoStatusConsulta(String statusConsulta) {
		this.statusConsulta = statusConsulta;
	}
	
	public String getStatusConsulta() {
		return statusConsulta;
	}
	
	public void setStatusConsulta(String statusConsulta) {
		this.statusConsulta = statusConsulta;
	}
}
