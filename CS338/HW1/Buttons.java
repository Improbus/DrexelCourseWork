    /*
     * Daniel A DeCamillo
     * dad56@drexel.edu
     * CS338:GUI, Assignment [1]
     */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Buttons implements ActionListener {
	JPanel panel = new JPanel(new BorderLayout());
	JButton save = new JButton("Save");
	static JButton change = new JButton("Change");
	static JButton remove = new JButton("Remove");
	JLabel ops = new JLabel("Options");

	public Buttons(){}

	//Creates Buttons
	public Component makeButtons(){
		panel.setBorder (BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(ops);
		panel.add (Box.createRigidArea (new Dimension (200,15)));
		panel.add(save);
		panel.add (Box.createRigidArea (new Dimension (200,15)));
		panel.add(change);
		panel.add (Box.createRigidArea (new Dimension (200,15)));
		panel.add(remove);
		save.addActionListener(this);
		save.setActionCommand("save");
		remove.addActionListener(this);
		remove.setActionCommand("remove");
		change.addActionListener(this);
		change.setActionCommand("change");
		return panel;
	}

	public void actionPerformed(ActionEvent e) {		
		if("save".equals(e.getActionCommand())){
			SongLogger.save();
		}
		else if("remove".equals(e.getActionCommand())){
			SongLogger.remove();
		}
		else if("change".equals(e.getActionCommand())){
			SongLogger.change();
		}

	}
	
	public static void disable() {
		remove.setEnabled(false);
		change.setEnabled(false);
	}
	
	public static void enable() {
		remove.setEnabled(true);
		change.setEnabled(true);
	}
	

	public JButton getChange() {
		return change;
	}

	public void setChange(JButton change) {
		Buttons.change = change;
	}

	public JLabel getOps() {
		return ops;
	}

	public void setOps(JLabel ops) {
		this.ops = ops;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JButton getRemove() {
		return remove;
	}

	public void setRemove(JButton remove) {
		Buttons.remove = remove;
	}

	public JButton getSave() {
		return save;
	}

	public void setSave(JButton save) {
		this.save = save;
	}



	
}
