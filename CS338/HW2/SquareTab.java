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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SquareTab implements ActionListener, ItemListener, KeyListener{
	
	JPanel panel = new JPanel(new BorderLayout());
    JTextField x = new JTextField();
    JTextField y = new JTextField();
    JTextField size = new JTextField();
    String[] colorStrings = { "Black", "Blue", "Green", "Red", "Yellow" };
    JComboBox color = new JComboBox(colorStrings);
    JCheckBox fill = new JCheckBox();
    JLabel xLabel = new JLabel("x");
    JLabel yLabel = new JLabel("y");
    JLabel sizeLabel = new JLabel("Size");
    JLabel colorLabel = new JLabel("Color");
    JLabel fillLabel = new JLabel("Fill");
    String colorSelection;
    boolean fillSelect;
    
    public SquareTab(){}
    
    //Creates a Square Tab
    public Component makeTab(){
    	color.setSelectedIndex(0);
    	color.addActionListener(this);
    	panel.setLayout(new GridLayout(0,1));
        panel.add (Box.createRigidArea (new Dimension (200,15)));
        panel.add(xLabel);
        panel.add(x);
        x.addKeyListener(this);
        panel.add (Box.createRigidArea (new Dimension (200,15)));
        panel.add(yLabel);
        panel.add(y);
        y.addKeyListener(this);
        panel.add (Box.createRigidArea (new Dimension (200,15)));
        panel.add(sizeLabel);
        panel.add(size);
        size.addKeyListener(this);
        panel.add (Box.createRigidArea (new Dimension (200,15)));
        panel.add(fillLabel);
        panel.add(fill);
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

	public JCheckBox getFill() {
		return fill;
	}

	public void setFill(JCheckBox fill) {
		this.fill = fill;
	}

	public JLabel getFillLabel() {
		return fillLabel;
	}

	public void setFillLabel(JLabel fillLabel) {
		this.fillLabel = fillLabel;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JTextField getSize() {
		return size;
	}

	public void setSize(JTextField size) {
		this.size = size;
	}

	public JLabel getSizeLabel() {
		return sizeLabel;
	}

	public void setSizeLabel(JLabel sizeLabel) {
		this.sizeLabel = sizeLabel;
	}

	public JTextField getX() {
		return x;
	}

	public void setX(JTextField x) {
		this.x = x;
	}

	public JLabel getXLabel() {
		return xLabel;
	}

	public void setXLabel(JLabel label) {
		xLabel = label;
	}

	public JTextField getY() {
		return y;
	}

	public void setY(JTextField y) {
		this.y = y;
	}

	public JLabel getYLabel() {
		return yLabel;
	}

	public void setYLabel(JLabel label) {
		yLabel = label;
	}

	//Monitors ComboBox Changes
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
	
	//Monitors CheckBox Changes
	public void itemStateChanged(ItemEvent e) {
		Object source = e.getItemSelectable();
		
		if(source == fill){
			fillSelect = true;
		}
		else{
			fillSelect = false;
		}
		
	}

	//Allows Only Valid input
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
