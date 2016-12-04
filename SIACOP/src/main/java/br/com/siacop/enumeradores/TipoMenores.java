package br.com.siacop.enumeradores;

public enum TipoMenores {
	
	SIM("Sim"), NAO("Não");
	
	private String resposta;
	
	TipoMenores(String resposta){
		this.resposta = resposta;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

}
