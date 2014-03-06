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

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;


public class dButtons implements ActionListener {
	JPanel panel = new JPanel(new BorderLayout());
	static JButton Ok = new JButton("Ok");
	static JButton Cancel = new JButton("Cancel");
	
	public dButtons(){}

	//Creates Buttons
	public Component makeButtons(){
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0,1,0,0));
		panel.add (Box.createRigidArea (new Dimension (100,15)));
		panel.add(Ok);
		Ok.setPreferredSize(new Dimension(100,100));
		Cancel.setPreferredSize(new Dimension(100,100));
		panel.add (Box.createRigidArea (new Dimension (100,15)));
		panel.add(Cancel);
		Ok.addActionListener(this);
		Ok.setActionCommand("Ok");
		Cancel.addActionListener(this);
		Cancel.setActionCommand("Cancel");
		return panel;
	}

	//Calls Relative funtions to the Main Class
	public void actionPerformed(ActionEvent e) {	
		if("Ok".equals(e.getActionCommand())){
			SimpleDraw.drawShape();
		}
		else if("Cancel".equals(e.getActionCommand())){
			SimpleDraw.closeDialog();
		}
		
	}
	
	




	
}
