package dragonchess.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import org.apache.log4j.Logger;

/**
 * A custom "about" JDialog.
 *
 * @author Group 4
 */
public class AboutDialog extends JDialog {

	private static final long serialVersionUID = 666666666L;
	private static final Logger log = Logger.getLogger(AboutDialog.class);

	/**
	 * Create a new JDialog.
	 *
	 * @param owner
	 * @param title
	 */
	public AboutDialog(JFrame owner, String title) {
		super(owner, title, true);

		this.createAboutDialog();

		return;
    }

	/**
	 * Called from w/in the constructor to create the mainPanel.
	 */
	private void createAboutDialog() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension aSize = new Dimension(350, 250);
		Dimension sSize = tk.getScreenSize();
		Container cPane = super.getContentPane();

		Box box = Box.createVerticalBox();
		box.add(Box.createGlue());
		box.add(new JLabel(
			"This is Group 4's implementation of \"Lets Play Chess\""));
		box.add(new JSeparator());
		box.add(new JLabel("Group Name:  DragonChess"));
		box.add(new JLabel("Group Members:"));
		box.add(new JLabel("George N. D'Andrea"));
		box.add(new JLabel("Daniel DeCamillo"));
		box.add(new JLabel("Alexander L. Gerveshi"));
		box.add(new JLabel("Adedamola Mabogunje"));
		box.add(new JLabel("Dimitri Yiantsios"));
		box.add(Box.createGlue());

		JPanel okPanel   = new JPanel();
		JButton okButton = new JButton("Ok");
		okPanel.add(okButton);

		cPane.add(box, "Center");
		cPane.add(okPanel, "South");

		super.setSize(aSize);
		super.setLocation(sSize.width / 2 - (aSize.width / 2),
			sSize.height / 4 - (aSize.height / 2));

		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				AboutDialog.super.setVisible(false);
				return;
			}
		});

		return;
	}

}
