package br.com.siacop.enumeradores;

public enum TipoResideCom {
	
	// {Parentes, familiares, amigos, sozinho}
	PARENTES("Parentes"), FAMILIARES("Familiares"), AMIGOS("Amigos"), SOZINHO("Sozinho");
	
	private String reside;
	
	TipoResideCom(String reside) {
		this.reside = reside;
	}

	public String getReside() {
		return reside;
	}

	public void setReside(String reside) {
		this.reside = reside;
	}
	
}
