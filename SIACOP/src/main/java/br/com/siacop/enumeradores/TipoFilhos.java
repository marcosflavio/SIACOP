package br.com.siacop.enumeradores;

public enum TipoFilhos {

	SIM("Sim"), NAO("Não");
	
	private String resposta;
	
	TipoFilhos(String resposta){
		this.resposta = resposta;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
}
