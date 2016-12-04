package br.com.siacop.enumeradores;

public enum TipoSituacaoFuncional {
	// {Bolsista, Auxilio, Não
	// recebe}
	
	BOLSISTA("Bolsista"), AUXILIO("Auxilio"), NAORECEBE("Não recebe");
	
	private String situacao;
	
	 TipoSituacaoFuncional(String situacao) {
		 this.situacao = situacao;
	 }

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	 
}
