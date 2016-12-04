package br.com.siacop.enumeradores;

public enum TipoTurno {
	
	// {manha, tarde, noite}
	MANHA("Manha"), TARDE("Tarde"), NOITE("Noite");
	
	private String turno;

	TipoTurno(String turno){
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	
}
