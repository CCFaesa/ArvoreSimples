package br.com.trabalho.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

import br.com.trabalho.global.Design;
import br.com.trabalho.view.componente.CFolha;
import br.com.trabalho.view.componente.CLinha;

public class Principal extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JPanel frame;
	private JScrollPane scroll;
	
	private ArrayList<CFolha> folhas;
	
	public static void main(String[] args) {
		Principal principal = new Principal("Arvore Binaria");
		
		principal.criaElementos();
		principal.adicionaElementos();
		principal.addArvoreUI();
		principal.addListeners();
		
		principal.proximasExecucoes();
		principal.repaint();
		
	}
	
	
	private void proximasExecucoes() {
			}
	public Principal() {
		frame = new JPanel();
		frame.setBounds(100, 100, 450, 300);
		frame.setVisible(true);
	}

	
	public Principal(String title) {
		super(title);
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		
			this.setVisible(true);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setSize(1410, 960);
			this.setLayout(new BorderLayout());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void criaElementos() {
		//CRIA O ELEMENTO RESPONSAVEL PELO SCROLL E DEPOIS O PAINEL INTERNO COM O TAMANHO DESEJADO
		frame = new JPanel();
		scroll = new JScrollPane(frame);
		
		frame.setBorder(BorderFactory.createLineBorder(Color.red));
		frame.setBackground(Design.BACKGROUND_PRINCIPAL);
        frame.setPreferredSize(new Dimension(1380, 900));
        frame.setLayout(null);
	}
	
	private void adicionaElementos() {
		add(scroll, BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	private void addArvoreUI() {

		folhas = Design.getPosicoes();
		CLinha linha;
		for (CFolha folha : folhas) {
			frame.add(folha);
			
			if(folha.getDireita() != null){
				linha = new CLinha(folha.getBase(), folha.getDireita().getTopo());
				frame.add(linha);
			}
			if(folha.getEsquerda() != null){
				linha = new CLinha(folha.getBase(), folha.getEsquerda().getTopo());
				frame.add(linha);
			}
		}
	}
	private void addListeners() {
		
	}
	
}
