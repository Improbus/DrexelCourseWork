/*
 * Daniel A DeCamillo
 * dad56@drexel.edu
 * CS338:GUI, Assignment [2]
 */

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LineTab implements ActionListener, KeyListener {
	
	JPanel panel = new JPanel(new BorderLayout());
    JTextField x1 = new JTextField();
    JTextField y1 = new JTextField();
    JTextField x2 = new JTextField();
    JTextField y2 = new JTextField();
    String[] colorStrings = { "Black", "Blue", "Green", "Red", "Yellow" };
    JComboBox color = new JComboBox(colorStrings);
    JLabel x1Label = new JLabel("x1");
    JLabel y1Label = new JLabel("y1");
    JLabel x2Label = new JLabel("x2");
    JLabel y2Label = new JLabel("y2");
    JLabel colorLabel = new JLabel("Color");
    String colorSelection;
    boolean fillSelect;
    
    public LineTab(){}
    
    //Creates tab
    public Component makeTab(){
    	color.setSelectedIndex(0);
    	color.addActionListener(this);
    	panel.setLayout(new GridLayout(0,1));
        panel.add (Box.createRigidArea (new Dimension (200,15)));
        panel.add(x1Label);
        panel.add(x1);
        x1.addKeyListener(this);
        panel.add (Box.createRigidArea (new Dimension (200,15)));
        panel.add(y1Label);
        panel.add(y1);
        y1.addKeyListener(this);
        panel.add (Box.createRigidArea (new Dimension (200,15)));
        panel.add(x2Label);
        panel.add(x2);
        x2.addKeyListener(this);
        panel.add (Box.createRigidArea (new Dimension (200,15)));
        panel.add(y2Label);
        panel.add(y2);
        y2.addKeyListener(this);
        panel.add (Box.createRigidArea (new Dimension (200,15)));
        panel.add(colorLabel);
        panel.add(color);
        panel.add (Box.createRigidArea (new Dimension (200,15)));
        return panel;
    }

	public JComboBox getColor() {
		return color;
	}

	public void setColor(JComboBox color) {
		this.color = color;
	}

	public JLabel getColorLabel() {
		return colorLabel;
	}

	public void setColorLabel(JLabel colorLabel) {
		this.colorLabel = colorLabel;
	}

	public String[] getColorStrings() {
		return colorStrings;
	}

	public void setColorStrings(String[] colorStrings) {
		this.colorStrings = colorStrings;
	}


	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	
	//Monitors ComboBox
	public void actionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox) e.getSource();
		colorSelection = (String) cb.getSelectedItem();
		
	}

	public String getColorSelection() {
		return colorSelection;
	}

	public void setColorSelection(String colorSelection) {
		this.colorSelection = colorSelection;
	}

	public boolean isFillSelect() {
		return fillSelect;
	}

	public void setFillSelect(boolean fillSelect) {
		this.fillSelect = fillSelect;
	}

	public JTextField getX1() {
		return x1;
	}

	public void setX1(JTextField x1) {
		this.x1 = x1;
	}

	public JLabel getX1Label() {
		return x1Label;
	}

	public void setX1Label(JLabel label) {
		x1Label = label;
	}

	public JTextField getX2() {
		return x2;
	}

	public void setX2(JTextField x2) {
		this.x2 = x2;
	}

	public JLabel getX2Label() {
		return x2Label;
	}

	public void setX2Label(JLabel label) {
		x2Label = label;
	}

	public JTextField getY1() {
		return y1;
	}

	public void setY1(JTextField y1) {
		this.y1 = y1;
	}

	public JLabel getY1Label() {
		return y1Label;
	}

	public void setY1Label(JLabel label) {
		y1Label = label;
	}

	public JTextField getY2() {
		return y2;
	}

	public void setY2(JTextField y2) {
		this.y2 = y2;
	}

	public JLabel getY2Label() {
		return y2Label;
	}

	public void setY2Label(JLabel label) {
		y2Label = label;
	}
	
	//Only Accepts Valid input
	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		if (!((c >= '0') && (c <= '9') ||
				(c == KeyEvent.VK_BACK_SPACE) ||
				(c == KeyEvent.VK_DELETE))) {
			e.consume();

		}
	}

	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
