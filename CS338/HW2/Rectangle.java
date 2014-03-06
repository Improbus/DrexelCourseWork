/*
 * Daniel A DeCamillo
 * dad56@drexel.edu
 * CS338:GUI, Assignment [2]
 */

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;


public class Rectangle extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int x;
	public int y;
	public int sSize;
	public int wSize;
	public boolean fill;
	public String sColor;
	public Color color;
	final Color bg = Color.white;
	final Color fg = Color.black;
	final Color filler = Color.black;
	
	public Rectangle(){}

	//Main Constructor
	public Rectangle(int x, int y, int sSize, int wSize, boolean fill, Color color){
		this.x = x;
		this.y = y;
		this.sSize = sSize;
		this.wSize = wSize;
		this.fill = fill;
		this.color = color;
		setForeground (color);
	}
	
	//Overrides Graphics Draw
	public void paintComponent(Graphics g){

		if(fill){
			setForeground (color);
			setBackground(color);
			super.paintComponent(g); // handle default drawing
			g.fillRect(x, y, sSize, wSize);
		}
		else{
			setForeground (color);
			super.paintComponent(g); // handle default drawing
			g.drawRect(x, y, sSize, wSize);
		}
		
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Color getBg() {
		return bg;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Color getFg() {
		return fg;
	}

	public boolean isFill() {
		return fill;
	}

	public void setFill(boolean fill) {
		this.fill = fill;
	}

	public Color getFiller() {
		return filler;
	}

	public String getSColor() {
		return sColor;
	}

	public void setSColor(String color) {
		sColor = color;
	}



	public int getSSize() {
		return sSize;
	}

	public void setSSize(int size) {
		sSize = size;
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

	public int getWSize() {
		return wSize;
	}

	public void setWSize(int size) {
		wSize = size;
	}

}
