/*
 * Daniel A DeCamillo
 * dad56@drexel.edu
 * CS338:GUI, Assignment [2]
 */

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;


public class Line extends JComponent{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int x1;
	public int y1;
	public int x2;
	public int y2;
	public String sColor;
	public Color color;
	final Color bg = Color.white;
	final Color fg = Color.black;
	final Color filler = Color.black;
	
	public Line(){}
	
	//Main Constructor
	public Line(int x1, int y1, int x2, int y2, Color color){
		this.x1 =x1;
		this.y1 =y1;
		this.x2 =x2;
		this.y2 =y2;
		this.color = color;
	}
	
	//Overwritten graphics drawer
	public void paintComponent(Graphics g){

		super.paintComponent(g); // handle default drawing
		g.setColor(color);
		g.drawLine(x1, y1, x2, y2);
		
		
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

	public Color getFiller() {
		return filler;
	}

	public String getSColor() {
		return sColor;
	}

	public void setSColor(String color) {
		sColor = color;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

}
