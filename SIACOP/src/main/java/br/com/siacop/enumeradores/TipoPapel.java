package br.com.siacop.enumeradores;

public enum TipoPapel {
	// Papel do suaurio {'USER','PSICO'}
	
	USER("Usuário"), PSICO("Psicologa");
	
	private String papel;
	
	TipoPapel(String papel){
		this.papel = papel;
	}

	public String getPapel() {
		return papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
	}
	
	
}
