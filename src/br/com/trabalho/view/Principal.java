package br.com.trabalho.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import br.com.trabalho.global.Design;
import br.com.trabalho.global.Parseadora;
import br.com.trabalho.model.Arvore;
import br.com.trabalho.model.Filme;
import br.com.trabalho.model.Genero;
import br.com.trabalho.model.TipoCaminhamento;
import br.com.trabalho.view.componente.CFolha;
import br.com.trabalho.view.componente.CLinha;

public class Principal extends JFrame implements ActionListener, KeyListener, ItemListener{

	private static final long serialVersionUID = 1L;
	
	private JPanel frame;
	private JScrollPane scroll;
	
	private JLabel titulo;
	private JLabel lblTituloCadastro;
	private JLabel lblTituloCaminhamento;
	private JLabel lblNome;
	private JLabel lblGenero;
	private JLabel lblAno;
	private JLabel lblTipoCaminhamento;
	private JLabel lblCamAno;
	private JLabel lblCamGenero;
	
	private JTextField txtNome;
	private JComboBox<Genero> cbxGeneros;
	private JTextField txtAno;
	private JComboBox<TipoCaminhamento> cbxTipoCaminhamento;
	private JTextField txtCamAno;
	private JComboBox<Genero> cbxCamGeneros;
	
	private JButton btnCaminhar;
	private JButton btnCadastrar;
	private JButton btnAdicionar;
	private JButton btnBuscar;
	private JButton btnRemover;
	
	private JList<Filme> listFilmes;
	private DefaultListModel<Filme> listModel = new DefaultListModel<Filme>();
	
	private Arvore arvore = new Arvore();
	
	private ArrayList<CFolha> folhas;
	
	public static void main(String[] args) {
		Principal principal = new Principal("Arvore Binaria");
		
		principal.criaElementos();
		principal.adicionaElementos();
		principal.itemStateChanged(null);

		principal.addArvoreUI();
		principal.addListeners();
		
		principal.repaint();
	}
	
	
	public Principal(String title) {
		super(title);
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		
			this.setVisible(true);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setSize(Design.TAMANHO_TELA_X, Design.TAMANHO_TELA_Y);
			this.setLayout(new BorderLayout());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void criaElementos() {
		//CRIA O ELEMENTO RESPONSAVEL PELO SCROLL E DEPOIS O PAINEL INTERNO COM O TAMANHO DESEJADO
		frame = new JPanel();
		scroll = new JScrollPane(frame);
		
		//Set Configuracoes do Painel de fundo
		frame.setBorder(BorderFactory.createLineBorder(Color.red));
		frame.setBackground(Design.BACKGROUND_PRINCIPAL);
        frame.setPreferredSize(new Dimension(Design.TAMANHO_TELA_X - 30, Design.TAMANHO_TELA_Y - 60));
        frame.setLayout(null);
        
        //LABELS INSTANCIANDO
        titulo = new JLabel("Árvore Binária de Filmes");
        lblTituloCadastro = new JLabel("Cadastro Filmes");
        lblTituloCaminhamento = new JLabel("Caminhamentos:");
        lblNome = new JLabel("Nome:", SwingConstants.RIGHT);
        lblGenero = new JLabel("Gênero:", SwingConstants.RIGHT);
        lblAno = new JLabel("Ano:", SwingConstants.RIGHT);
        lblTipoCaminhamento = new JLabel("Tipo Caminhamento:");
        lblCamAno = new JLabel("Ano: ");
        lblCamGenero = new JLabel("Gênero: ");

        //ENTRADAS INSTANCIANDO
        txtNome = new JTextField();
        txtAno = new JTextField();
        txtCamAno = new JTextField();
        cbxGeneros = new JComboBox<Genero>(Genero.values());
        cbxTipoCaminhamento = new JComboBox<TipoCaminhamento>(TipoCaminhamento.values());
        cbxCamGeneros = new JComboBox<Genero>(Genero.values());
        listFilmes = new JList<Filme>(listModel);
        
        //BOTOES INSTANCIANDO
        btnCadastrar = new JButton("Cadastrar");
     	btnCaminhar = new JButton("Caminhar");
     	btnAdicionar = new JButton("Adicionar");
     	btnRemover = new JButton("Remover");
     	btnBuscar = new JButton("Buscar");
     	

        //LABELS TAMANHO E POSICAO
     	titulo.setBounds(525, 50, 350, 35);
        lblTituloCadastro.setBounds(45, 750, 200, 25);
        lblTituloCaminhamento.setBounds(510, 750, 200, 25);
        lblNome.setBounds(45, 788, 55, 20);
        lblGenero.setBounds(45, 821, 55, 20);
        lblAno.setBounds(305, 821, 55, 20);
        lblTipoCaminhamento.setBounds(510, 788, 140, 20);
        lblCamAno.setBounds(510, 821, 45, 20);
        lblCamGenero.setBounds(510, 821, 57, 20);
        
        //ENTRADAS TAMANHO E POSICAO
        txtNome.setBounds(110, 785, 335, 30);
        txtAno.setBounds(365, 818, 80, 30);
        txtCamAno.setBounds(545, 818, 80, 30);
        cbxGeneros.setBounds(110, 818, 200, 30);
        cbxTipoCaminhamento.setBounds(655, 785, 257, 30);
        cbxCamGeneros.setBounds(575, 818, 200, 30);
        listFilmes.setBounds(1380, 80, 350, 620);

        //BOTOES TAMANHO E POSICAO
        btnCadastrar.setBounds(325, 860, 120, 30);
        btnCaminhar.setBounds(790, 860, 120, 30);
        btnAdicionar.setBounds(1378, 705, 120, 30);
        btnBuscar.setBounds(1498, 705, 115, 30);
        btnRemover.setBounds(1613, 705, 120, 30);
        
        //CONFIGURACAO DE LAYOUT
        titulo.setFont(Design.FONTE_TITULO1);
        titulo.setForeground(Design.TITULO_PRINCIPAL);
        lblTituloCadastro.setFont(Design.FONTE_TITULO2);
        lblTituloCaminhamento.setFont(Design.FONTE_TITULO2);
        lblNome.setFont(Design.FONTE_PADRAO);
        lblGenero.setFont(Design.FONTE_PADRAO);
        lblAno.setFont(Design.FONTE_PADRAO);
        lblTipoCaminhamento.setFont(Design.FONTE_PADRAO);
        lblCamAno.setFont(Design.FONTE_PADRAO);
        lblCamGenero.setFont(Design.FONTE_PADRAO);
        txtNome.setFont(Design.FONTE_PADRAO);
        txtAno.setFont(Design.FONTE_PADRAO);
        txtCamAno.setFont(Design.FONTE_PADRAO);
        cbxGeneros.setFont(Design.FONTE_PADRAO);
        cbxTipoCaminhamento.setFont(Design.FONTE_PADRAO);
        cbxCamGeneros.setFont(Design.FONTE_PADRAO);
        btnCadastrar.setFont(Design.FONTE_PADRAO);
        btnAdicionar.setFont(Design.FONTE_PADRAO);
        btnBuscar.setFont(Design.FONTE_PADRAO);
        btnRemover.setFont(Design.FONTE_PADRAO);
        btnCaminhar.setFont(Design.FONTE_PADRAO);
        listFilmes.setBorder(BorderFactory.createLineBorder(Design.TITULO_PRINCIPAL));
        
        //ADICIONANDO SEPARADORES
        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setBounds(40, 775, 410, 5);
        frame.add(separator);
        
        separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setBounds(505, 775, 410, 5);
        frame.add(separator);
        
	}
	
	private void adicionaElementos() {
		add(scroll, BorderLayout.CENTER);
		this.setVisible(true);
		
		frame.add(titulo);

        frame.add(lblNome);
        frame.add(lblGenero);
        frame.add(lblAno);
        frame.add(lblTituloCadastro);
        frame.add(lblTituloCaminhamento);
        frame.add(lblTipoCaminhamento);
        frame.add(lblCamAno);
        frame.add(lblCamGenero);
        
        frame.add(txtNome);
        frame.add(cbxGeneros);
        frame.add(txtAno);
        frame.add(cbxTipoCaminhamento);
        frame.add(txtCamAno);
        frame.add(cbxCamGeneros);
        
        frame.add(btnCadastrar);
        frame.add(btnCaminhar);
        frame.add(btnBuscar);
        frame.add(btnRemover);
        frame.add(btnAdicionar);
        
        frame.add(listFilmes);
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
		btnCadastrar.addActionListener(this);
		btnAdicionar.addActionListener(this);
		btnBuscar.addActionListener(this);
		btnRemover.addActionListener(this);
		btnCaminhar.addActionListener(this);
		txtAno.addKeyListener(this);
		txtCamAno.addKeyListener(this);
		cbxTipoCaminhamento.addItemListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnCadastrar){
			if(listModel.getSize() >= 31) return;
			
			String mensagem = "";
			
			String nome = "";
			int anoLancamento = 0;
			Genero genero = Genero.ACAO;

			try {
				nome = txtNome.getText().toUpperCase();
				anoLancamento = Integer.valueOf(txtAno.getText());
				genero = (Genero) cbxGeneros.getSelectedItem();
			} catch (Exception e2) {}
			
			if(nome.isEmpty()){
				mensagem = "Campo nome é obrigatório!";
			}else if(anoLancamento < 1900 || anoLancamento > 2050){
				mensagem = "Data inválida!";
			}
			
			if(!mensagem.isEmpty()){
				JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			Filme filme = new Filme(nome, genero, anoLancamento);
			listModel.addElement(filme);
		}else if(e.getSource() == btnCaminhar){
			if(cbxTipoCaminhamento.getSelectedItem().equals(TipoCaminhamento.POS_FIXADO)){
				int ano = Integer.valueOf(txtCamAno.getText().isEmpty() ? "0" :  txtCamAno.getText());
				
				if(ano < 1900 || ano > 2050){
					JOptionPane.showMessageDialog(null, "Data Inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				Filme[] retorno = arvore.CamPosFixado(ano);
				StringBuilder msg = new StringBuilder();
				boolean achouUm = false;
				
				for (int i = 0; i < retorno.length; i++) {
					if(retorno[i] == null) break;
					msg.append("#" + retorno[i].getId() + "; ");
					achouUm = true;
				}
				
				JOptionPane.showMessageDialog(null, achouUm ? msg.toString() : "Não Encontrou Registro!", achouUm ? "Sucesso" : "Erro", achouUm ? JOptionPane.PLAIN_MESSAGE : JOptionPane.ERROR_MESSAGE);
				
			}else if(cbxTipoCaminhamento.getSelectedItem().equals(TipoCaminhamento.CENTRAL)){
				Filme[] retorno = arvore.CamCentral((Genero)cbxCamGeneros.getSelectedItem());
				
				StringBuilder msg = new StringBuilder();
				boolean achouUm = false;
				
				for (int i = 0; i < retorno.length; i++) {
					if(retorno[i] == null) break;
					msg.append("#" + retorno[i].getId() + "; ");
					achouUm = true;
				}
				
				JOptionPane.showMessageDialog(null, achouUm ? msg.toString() : "Não Encontrou Registro!", achouUm ? "Sucesso" : "Erro", achouUm ? JOptionPane.PLAIN_MESSAGE : JOptionPane.ERROR_MESSAGE);
			}
		
		}else if(e.getSource() == btnAdicionar){
			if(listFilmes.getSelectedIndex() > -1){
				Filme filme = listFilmes.getSelectedValue();
				arvore.inserir(filme);
				
				Parseadora.setArvoreUI(arvore, folhas);
			}
		}else if(e.getSource() == btnBuscar){
			if(listFilmes.getSelectedIndex() > -1){
				Filme filme = listFilmes.getSelectedValue();
				StringBuilder strb = new StringBuilder();
				if(arvore.pesquisar(filme.getId(), strb)){
					JOptionPane.showMessageDialog(null, strb.toString() + "[ACHOU]  #" + filme.getId(), "Sucesso", JOptionPane.PLAIN_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(null, "Não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
				}
			}
		}else if(e.getSource() == btnRemover){
			if(listFilmes.getSelectedIndex() > -1){
				Filme filme = listFilmes.getSelectedValue();
				listModel.removeElement(filme);
				arvore.remover(filme.getId());
				
				Parseadora.setArvoreUI(arvore, folhas);
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent ev) {}

	@Override
	public void keyReleased(KeyEvent ev) {
		JTextField aux = (JTextField)ev.getSource();
		String texto = aux.getText();
		String retorno = "";
		
		for (int i = 0; i < texto.length(); i++) {
			try {
                Integer.parseInt( String.valueOf( texto.charAt(i) ) );
                retorno += String.valueOf( texto.charAt(i) );
            } catch ( NumberFormatException exc ) {
            }
		}
		aux.setText(retorno);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}

	@Override
	public void itemStateChanged(ItemEvent ev) {
		
		if( cbxTipoCaminhamento.getSelectedItem().equals(TipoCaminhamento.POS_FIXADO)){
			lblCamAno.setVisible(true);
			txtCamAno.setVisible(true);
			lblCamGenero.setVisible(false);
			cbxCamGeneros.setVisible(false);
		}else{
			lblCamAno.setVisible(false);
			txtCamAno.setVisible(false);
			lblCamGenero.setVisible(true);
			cbxCamGeneros.setVisible(true);
		}
	}
	
}
