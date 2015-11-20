package br.com.trabalho.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.text.NumberFormat;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import br.com.trabalho.global.Design;
import br.com.trabalho.model.Genero;
import br.com.trabalho.view.componente.CFolha;
import br.com.trabalho.view.componente.CLinha;

public class Principal extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JPanel frame;
	private JScrollPane scroll;
	
	private JLabel titulo;
	
	private JLabel lblNome;
	private JLabel lblGenero;
	private JLabel lblAno;
	private JLabel lblTituloCadastro;
	
	private JTextField txtNome;
	private JComboBox<Genero> cbxGeneros;
	private JTextField txtAno;
	
	private JButton btnCadastrar;
	
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
        
        titulo = new JLabel("Árvore Binária de Filmes");
        lblNome = new JLabel("Nome:", SwingConstants.RIGHT);
        lblGenero = new JLabel("Genero:", SwingConstants.RIGHT);
        lblAno = new JLabel("Ano:", SwingConstants.RIGHT);
        lblTituloCadastro = new JLabel("Cadastro Filmes");
        
        txtNome = new JTextField();
        cbxGeneros = new JComboBox<Genero>(Genero.values());
        txtAno = new JTextField();
        
        btnCadastrar = new JButton("Cadastrar");
        
        titulo.setBounds(525, 50, 350, 35);
        lblNome.setBounds(45, 788, 55, 20);
        lblGenero.setBounds(45, 821, 55, 20);
        lblAno.setBounds(305, 821, 55, 20);
        lblTituloCadastro.setBounds(45, 750, 200, 25);
        
        txtNome.setBounds(110, 785, 335, 30);
        cbxGeneros.setBounds(110, 818, 200, 30);
        txtAno.setBounds(365, 818, 80, 30);
        
        btnCadastrar.setBounds(325, 860, 120, 30);
        
        
        lblNome.setFont(Design.FONTE_PADRAO);
        lblGenero.setFont(Design.FONTE_PADRAO);
        lblAno.setFont(Design.FONTE_PADRAO);
        txtNome.setFont(Design.FONTE_PADRAO);
        cbxGeneros.setFont(Design.FONTE_PADRAO);
        txtAno.setFont(Design.FONTE_PADRAO);
        btnCadastrar.setFont(Design.FONTE_PADRAO);
        lblTituloCadastro.setFont(Design.FONTE_TITULO2);
        titulo.setFont(Design.FONTE_TITULO1);
        
        titulo.setForeground(Design.TITULO_PRINCIPAL);
        
        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setBounds(40, 775, 410, 5);
        frame.add(separator);
        
        frame.add(titulo);

        frame.add(lblNome);
        frame.add(lblGenero);
        frame.add(lblAno);
        frame.add(lblTituloCadastro);
        
        frame.add(txtNome);
        frame.add(cbxGeneros);
        frame.add(txtAno);
        
        frame.add(btnCadastrar);
        
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
