package br.com.trabalho.view.componente;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import br.com.trabalho.global.Design;
import br.com.trabalho.model.NoArv;

public class CFolha extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private JLabel background;
	private JLabel txt;
	private Font fonte;
	private NoArv noArv;
	
	private CFolha esquerda;
	private CFolha direita;
	
	public CFolha() {
		super();
		criaComponentes();
		addComponentes();
	}
	
	public CFolha(String text) {
		this();
		
		this.setText(text);
	}
	
	public CFolha(NoArv pNoArv) {
		this();
		this.noArv = pNoArv;
		String text = noArv != null && noArv.getInfo() != null ? noArv.getInfo().getId() + "" : ""; 
		this.setText(text);
	}
	
	public CFolha(NoArv pNoArv, int x, int y){
		this(pNoArv);
		
		this.setBounds(x, y, 60, 60);
	}
	
	private void criaComponentes() {
		this.setLayout(null);
		this.setBackground(Design.BACKGROUND_PRINCIPAL);
		
		background = new JLabel(new ImageIcon("res/Ring-folha.png"));
		txt = new JLabel("", SwingConstants.CENTER);
		fonte = new Font("Arial", Font.PLAIN, 12);
		
		txt.setFont(fonte);
		background.setBounds(0, 0, 60, 60);
		txt.setBounds(0, 20, 60, 20);
	}
	
	private void addComponentes() {
		this.add(background);
		this.add(txt);
	}
	
	public void setText(String text){
		this.txt.setText(text);
	}
	
	public Point getTopo(){
		return new Point(this.getX()+30, this.getY());
	}
	
	public Point getBase(){
		return new Point(this.getX()+30, this.getY()+60);
	}

	public NoArv getNoArv() {
		return noArv;
	}

	public void setNoArv(NoArv noArv) {
		this.noArv = noArv;
	}

	public CFolha getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(CFolha esquerda) {
		this.esquerda = esquerda;
	}

	public CFolha getDireita() {
		return direita;
	}

	public void setDireita(CFolha direita) {
		this.direita = direita;
	}
	
	public void setFolhas(CFolha esquerda, CFolha direita){
		this.esquerda = esquerda;
		this.direita = direita;
	}
}
