/*
 * Daniel A DeCamillo
 * dad56@drexel.edu
 * CS338:GUI, Assignment [2]
 */

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;



public class Oval extends JComponent {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int x;
	public int y;
	public int rxsize;
	public int rysize;
	public boolean fill;
	public String sColor;
	public Color color;
		
	public Oval(){}
	
	//Main Constructor
	public Oval(int x, int y, int rxsize, int rysize, boolean fill, Color color){
		this.x = x;
		this.y = y;
		this.rxsize = rxsize;
		this.rysize = rysize;
		this.fill = fill;
		this.color = color;
		setForeground (color);
	}
	
	//Ovverides graphics paint
	public void paintComponent(Graphics g){

		if(fill){
			setForeground (color);
			setBackground(color);
			super.paintComponent(g); // handle default drawing
			g.fillOval(x, y, rxsize, rysize);
		}
		else{
			setForeground (color);
			super.paintComponent(g); // handle default drawing
			g.drawOval (x, y, rxsize, rysize);
		}
		
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}


	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}



	public boolean isFill() {
		return fill;
	}

	public void setFill(boolean fill) {
		this.fill = fill;
	}



	public String getSColor() {
		return sColor;
	}

	public void setSColor(String color) {
		sColor = color;
	}

	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRxsize() {
		return rxsize;
	}

	public void setRxsize(int rxsize) {
		this.rxsize = rxsize;
	}

	public int getRysize() {
		return rysize;
	}

	public void setRysize(int rysize) {
		this.rysize = rysize;
	}
	


}
