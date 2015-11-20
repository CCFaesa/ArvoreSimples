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

import br.com.trabalho.global.Design;
import br.com.trabalho.view.componente.AFolha;

public class Principal extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JPanel frame;
	private JScrollPane scroll;
	
	
	//VARIAVEIS DO KEOMA
	//APAGUE ESTA LINHA E COLOQUE SUAS VARIAVEIS NESSA AREA //TODO KEOMA
	//FIM VARIAVEIS DO KEOMA

	public static void main(String[] args) {
		Principal principal = new Principal("�rvore Bin�ria");
		
		principal.criaElementos();
		principal.adicionaElementos();
		principal.addListeners();
		
		principal.proximasExecucoes();
		principal.repaint();
		
	}
	
	
	private void proximasExecucoes() {

//		AFolha folha = new AFolha("#001");
//		folha.setBounds(10, 10, 60, 60);
//		frame.add(folha);
		
		//TODO KEOMA: crie na area do quadrado azul um cadastro de filmes com as entradas: nome, genero e ano
		//TODO KEOMA: um botao cadastrar que cria o objeto
		JPanel apagar = new JPanel();
		apagar.setBounds(20, 20, 220, 400);
		apagar.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		apagar.setBackground(Design.BACKGROUND_PRINCIPAL);
		
		frame.add(apagar);
		
		

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
		frame.setBackground(Design.BACKGROUND_PRINCIPAL);
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
