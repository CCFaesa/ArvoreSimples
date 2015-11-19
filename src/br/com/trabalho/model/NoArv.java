package br.com.trabalho.model;
public class NoArv {
	private Filme info; 
	private NoArv esq, dir;

	public NoArv(Filme elem){
		this.info = elem;
	}
	public NoArv getEsq(){
		return this.esq;
	}
	public NoArv getDir(){
		return this.dir;
	}
	public Filme getInfo(){
		return this.info;
	}
	public void setEsq(NoArv elem){
		this.esq = elem;
	}
	public void setDir(NoArv elem){
		this.dir = elem;
	}
	public void setInfo(Filme elem){
		this.info = elem;
	}
}