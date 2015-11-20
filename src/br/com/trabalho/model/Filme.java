package br.com.trabalho.model;
public class Filme {
	
	private static int contado = 0;
	
	private int id ;
	private String nome;
	private Genero genero;
	private int anoLancamento;

	public Filme() {
		super();
		this.id = ++contado;
	}
	
	public Filme(String nome) {
		this();
		this.nome = nome;
	}
	
	public Filme(String nome, Genero genero, int anoLancamento) {
		this();
		this.nome = nome;
		this.genero = genero;
		this.anoLancamento = anoLancamento;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	@Override
	public String toString() {
		return "#" + this.id + ": " + this.nome + " - " + this.anoLancamento + "{" + this.genero.getDescricao() + "}";
	}
	
}
