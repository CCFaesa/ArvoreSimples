package br.com.trabalho.view.componente;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

public class CLinha extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private Point ini;
	private Point fim;
	
	public CLinha(Point ini, Point fim) {
		super();
		this.ini = ini;
		this.fim = fim;
		
		int x = (int)Math.min(ini.getX(), fim.getX());
		int y = (int)Math.min(ini.getY(), fim.getY());
		int width = (int)Math.max(ini.getX(), fim.getX()) - x;
		int height = (int)Math.max(ini.getY(), fim.getY()) - y ;
		
		this.setBounds(x, y, width, height);
		
		this.repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		if(ini.getX() > fim.getX()){
			g.drawLine(0, getHeight(), getWidth(), 0);
		}else{
			g.drawLine(0, 0, getWidth(), getHeight());
		}
	}
    
  
}
