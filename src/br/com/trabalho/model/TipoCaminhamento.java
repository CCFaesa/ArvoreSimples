package br.com.trabalho.model;

public enum TipoCaminhamento {
	CENTRAL("Por G�nero [CENTRAL]"), POS_FIXADO("Por Ano [POS FIXADO]");
	
	String descricao;
	
	private TipoCaminhamento(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return this.descricao;
	}
}
