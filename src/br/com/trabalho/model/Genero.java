package br.com.trabalho.model;

public enum Genero {
	
	ACAO(1, "Ação"), AVENTURA(2, "Aventura"), COMEDIA(3, "Comédia"), DRAMA(4, "Drama"), TERROR(5, "Terror");
	
	private int id;
	private String descricao;

	Genero(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return this.getDescricao();
	}
}
