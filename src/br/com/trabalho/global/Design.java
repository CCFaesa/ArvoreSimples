package br.com.trabalho.global;

import java.awt.Color;
import java.util.ArrayList;

import br.com.trabalho.view.componente.CFolha;

public abstract class Design {
	public static Color BACKGROUND_PRINCIPAL = Color.WHITE;
	
	public static ArrayList<CFolha> getPosicoes(){
		ArrayList<CFolha> retorno = new ArrayList<>();
		
		retorno.add(new CFolha(null, 660, 120));
		
		retorno.add(new CFolha(null, 340, 240));
		retorno.add(new CFolha(null, 980, 240));
		
		retorno.add(new CFolha(null, 180, 360));
		retorno.add(new CFolha(null, 500, 360));
		retorno.add(new CFolha(null, 820, 360));
		retorno.add(new CFolha(null, 1140, 360));
		
		retorno.add(new CFolha(null, 100, 480));
		retorno.add(new CFolha(null, 260, 480));
		retorno.add(new CFolha(null, 420, 480));
		retorno.add(new CFolha(null, 580, 480));
		retorno.add(new CFolha(null, 740, 480));
		retorno.add(new CFolha(null, 900, 480));
		retorno.add(new CFolha(null, 1060, 480));
		retorno.add(new CFolha(null, 1220, 480));
		
		retorno.add(new CFolha(null, 60, 600));
		retorno.add(new CFolha(null, 140, 600));
		retorno.add(new CFolha(null, 220, 600));
		retorno.add(new CFolha(null, 300, 600));
		retorno.add(new CFolha(null, 380, 600));
		retorno.add(new CFolha(null, 460, 600));
		retorno.add(new CFolha(null, 540, 600));
		retorno.add(new CFolha(null, 620, 600));
		retorno.add(new CFolha(null, 700, 600));
		retorno.add(new CFolha(null, 780, 600));
		retorno.add(new CFolha(null, 860, 600));
		retorno.add(new CFolha(null, 940, 600));
		retorno.add(new CFolha(null, 1020, 600));
		retorno.add(new CFolha(null, 1100, 600));
		retorno.add(new CFolha(null, 1180, 600));
		retorno.add(new CFolha(null, 1260, 600));
		
		arrumarFilhas(retorno);
		
		return retorno;
	}
	
	public static ArrayList<CFolha> arrumarFilhas(ArrayList<CFolha> lista){
		int contador = 0;
		for (int i = 0; i < lista.size()/2; i++) {
			lista.get(i).setFolhas(lista.get(++contador), lista.get(++contador));
		}
		
		return lista;
	}
}
