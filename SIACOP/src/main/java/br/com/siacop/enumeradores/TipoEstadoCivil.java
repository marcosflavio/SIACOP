package br.com.siacop.enumeradores;

public enum TipoEstadoCivil {

	// {Casado, Solteiro, Divorciado, União Estável}
	
	CASADO("Casado"), SOLTEIRO("Solteiro"), DIVORCIADO("Divorciado"), UE("União Estável");
	
	private String estadoCivil;
	
	TipoEstadoCivil(String estado){
		this.estadoCivil = estado;
	}
	
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	
	
}
