package br.com.trabalho.global;

import java.util.ArrayList;

import br.com.trabalho.model.Arvore;
import br.com.trabalho.model.NoArv;
import br.com.trabalho.view.componente.CFolha;

public abstract class Parseadora {
	
	public static void setArvoreUI(Arvore arvore, ArrayList<CFolha> folhas){
		ArrayList<NoArv> arvAux = getListOrdemLinha(arvore);
		CFolha folha;
		for (int i = 0; i < folhas.size(); i++) {
			folha = folhas.get(i);
			folha.setNoArv(arvAux.size() <= 0 ? null : arvAux.get(i));
			
			NoArv noArv =  folha.getNoArv();
			if(noArv != null){
				folha.setText("#"+noArv.getInfo().getId());
			}else{
				folha.setText("");
			}
		}
	}
	
	public static ArrayList<NoArv> getListOrdemLinha(Arvore arvore){
		ArrayList<NoArv> retorno = new ArrayList<>();
		
		if(arvore.getRaiz() == null){
			return retorno;
		}
		
		retorno.add(arvore.getRaiz());
		
		for (int i = 0; i < 15; i++) {
			if(retorno.get(i) == null){
				retorno.add(null);
				retorno.add(null);
			}else{
				retorno.add(retorno.get(i).getEsq());
				retorno.add(retorno.get(i).getDir());
			}
			
		}
		return retorno;
	}

}
