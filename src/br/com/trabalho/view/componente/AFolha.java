package br.com.trabalho.view.componente;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class AFolha extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private JLabel background;
	private JLabel txt;
	private Font fonte;
	
	public AFolha() {
		super();
		criaComponentes();
		addComponentes();
	}
	
	public AFolha(String text) {
		super();
		criaComponentes();
		addComponentes();
		
		this.setText(text);
	}

	private void criaComponentes() {
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		
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
}
