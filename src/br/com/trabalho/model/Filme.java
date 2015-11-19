package br.com.trabalho.model;
public class Filme {
	
	private int id;
	private String nome;

	public Filme(int chave) {
		this.id = chave;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
