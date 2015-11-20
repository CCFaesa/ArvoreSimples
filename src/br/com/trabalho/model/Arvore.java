package br.com.trabalho.model;

public class Arvore {
	private NoArv raiz;
	private int quantNos;

	public Arvore(){
		this.quantNos=0;
		this.raiz = null;
	}
	
	public boolean ÈVazia (){
		return (this.raiz == null);
	}
	
	public NoArv getRaiz(){
		return this.raiz;
	}
	
	public int getQuantNos(){
		return this.quantNos;
	}

	public boolean inserir (Filme elem){
		if (pesquisar (elem.getId())){
			return false;
		}else{
			this.raiz = inserir (elem, this.raiz);
			this.quantNos++;
			return true;
		}
	}
	public NoArv inserir (Filme elem, NoArv no){
		if (no == null){
			NoArv novo = new NoArv(elem);
			return novo;
		}else {
			if (elem.getId() < no.getInfo().getId()){
				no.setEsq(inserir(elem, no.getEsq()));
				return no;
			}else{
				no.setDir(inserir(elem, no.getDir()));
				return no;
			}
		}
	}
	public boolean pesquisar (int chave){
		if (pesquisar (chave, this.raiz)!= null){
			return true;
		}else{
			return false;
		}
	}
	private NoArv pesquisar (int chave, NoArv no){
		if (no != null){
			if (chave < no.getInfo().getId()){
				no = pesquisar (chave, no.getEsq());
			}else{
				if (chave > no.getInfo().getId()){
					no = pesquisar (chave, no.getDir());
				}
			}
		}
		return no;
	}
	public boolean remover (int chave){
		if (pesquisar (chave, this.raiz) != null){
			this.raiz = remover (chave, this.raiz);
			this.quantNos--;
			return true;
		}
		else {
			return false;
		}
	}
	public NoArv remover (int chave, NoArv arv){
		if (chave < arv.getInfo().getId()){
			arv.setEsq(remover (chave, arv.getEsq()));
		}else{
			if (chave > arv.getInfo().getId()){
				arv.setDir(remover (chave, arv.getDir()));
			}else{
				if (arv.getDir()== null){
					return arv.getEsq();
				}else{
					if (arv.getEsq() == null){ 
						return arv.getDir();
					}else{
						arv.setEsq(Arrumar (arv, arv.getEsq()));
					}
				}
			}
		}
		return arv;
	}
	private NoArv Arrumar (NoArv arv, NoArv maior){
		if (maior.getDir() != null){
			maior.setDir(Arrumar (arv, maior.getDir()));
		}
		else{
			arv.setInfo(maior.getInfo());
			maior = maior.getEsq();
		}
		return maior;
	}
	public Filme [] CamCentral (){
		int []n= new int[1];
		n[0]=0;
		Filme [] vet = new Filme[this.quantNos];
		return (FazCamCentral (this.raiz, vet, n));
	}
	private Filme [] FazCamCentral (NoArv arv, Filme [] vet, int []n){
		if (arv != null) {
			vet = FazCamCentral (arv.getEsq(),vet,n);
			vet[n[0]] = arv.getInfo();
			n[0]++;
			vet = FazCamCentral (arv.getDir(),vet,n);
		}
		return vet;
	}
	public Filme [] CamPreFixado (){
		int []n= new int[1];
		n[0]=0;
		Filme [] vet = new Filme[this.quantNos];
		return (FazCamPreFixado (this.raiz, vet, n));
	}
	private Filme [] FazCamPreFixado (NoArv arv, Filme [] vet, int []n){
		if (arv != null) {
			vet[n[0]] = arv.getInfo();
			n[0]++;
			vet = FazCamPreFixado (arv.getEsq(), vet,n);
			vet = FazCamPreFixado (arv.getDir(), vet,n);
		}
		return vet;
	}
	public Filme [] CamPosFixado (){
		int []n= new int[1];
		n[0]=0;
		Filme [] vet = new Filme[this.quantNos];
		return (FazCamPosFixado (this.raiz, vet, n));
	}
	private Filme [] FazCamPosFixado (NoArv arv, Filme[] vet, int []n){
		if (arv != null) {
			vet = FazCamPosFixado (arv.getEsq(), vet,n);
			vet = FazCamPosFixado (arv.getDir(), vet,n);
			vet[n[0]] = arv.getInfo();
			n[0]++;
		}
		return vet;
	}
}
