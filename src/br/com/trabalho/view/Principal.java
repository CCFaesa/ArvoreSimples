package br.com.trabalho.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

public class Principal extends JFrame{

	private JPanel frame;
	private JScrollPane scroll;

	public static void main(String[] args) {
		Principal principal = new Principal("Árvore Binária");
		
		principal.criaElementos();
		principal.adicionaElementos();
		principal.addListeners();
		
		principal.proximasExecucoes();
		principal.repaint();
		
	}
	
	
	private void proximasExecucoes() {
		addNivel1();
		addNivel2();
		addNivel3();
		addNivel4();
		addNivel5();
	}


	private void addNivel1() {

		JPanel teste;
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(50, 800, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(130, 800, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(210, 800, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(290, 800, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(370, 800, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(450, 800, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(530, 800, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(610, 800, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(690, 800, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(770, 800, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(850, 800, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(930, 800, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(1010, 800, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(1090, 800, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(1170, 800, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(1250, 800, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
	}
	
	private void addNivel2(){


		JPanel teste;
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(90, 690, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(250, 690, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(410, 690, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(570, 690, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(730, 690, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(890, 690, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(1050, 690, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(1210, 690, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
	
	}

	private void addNivel3(){
		JPanel teste;
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(170, 580, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(490, 580, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(810, 580, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(1130, 580, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
	
	
	}

	private void addNivel4(){

		JPanel teste;
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(330, 470, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(970, 470, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
		
	}
	
	private void addNivel5(){
		JPanel teste;
		
		teste = new JPanel();
		teste.setBorder(BorderFactory.createLineBorder(Color.red));
		teste.setBounds(650, 360, 60, 60);
		teste.setLayout(null);
		
		frame.add(teste);
	}
	
	public Principal(String title) {
		super(title);
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		
			this.setVisible(true);
			this.setResizable(false);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setExtendedState(Frame.MAXIMIZED_BOTH);
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
        frame.setPreferredSize(new Dimension(2000, 4000));
        frame.setLayout(null);
        
	}
	
	private void adicionaElementos() {
		add(scroll, BorderLayout.CENTER);
		this.setVisible(true);
		
		
	}
	private void addListeners() {
		
	}
}
