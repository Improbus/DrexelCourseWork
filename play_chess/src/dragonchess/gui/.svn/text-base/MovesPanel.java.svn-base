package dragonchess.gui;

import java.awt.event.MouseListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

import org.apache.log4j.Logger;

import dragonchess.pgn.Hit;

/**
 * A listing of all the moves of both players.
 *
 * @author Group 4
 */
public class MovesPanel extends JPanel {

	private static final long serialVersionUID = 334455667L;
	private static final Logger log = Logger.getLogger(MovesPanel.class);

	private JList movesList;
	private JScrollPane scrollPane;
	private DragonChessMW parent;
	private TimerPanel timer;
	private PromoteComboPanel promote;

	/**
	 * Default constructor
	 */
	public MovesPanel(DragonChessMW parent) {
		super();

		this.parent = parent;
		this.createMovesPanel();

		return;
	}

	/**
	 * Set the maxinum time - in minutes - each Player has to
	 * complete all of his/her moves.
	 *
	 * @param maxTime
	 */
	public void setMaxTime(int maxTime) {
		this.timer.setWhiteTime(maxTime * 60);
		this.timer.setBlackTime(maxTime * 60);

		return;
	}

	public void setWhiteName() {
		this.timer.setWhiteName();

		return;
	}

	public void setBlackName() {
		this.timer.setBlackName();

		return;
	}

	/**
	 * Add a hit to the movesList.
	 *
	 * @param hit
	 */
	public void addHit(Hit hit) {
		ListModel model = this.movesList.getModel();

		if (model != null) {
			((DefaultListModel)model).addElement(hit);
		}

		return;
	}

	/**
	 * Remove a hit from the movesList.
	 *
	 * @param hit
	 */
	public void removeHit(Hit hit) {
		ListModel model = this.movesList.getModel();

		if (model != null) {
			((DefaultListModel)model).removeElement(hit);
		}

		return;
	}

	/**
	 * Update a hit from the movesList.
	 *
	 * @param hit
	 */
	public void updateHit(Hit hit) {
		ListModel model = this.movesList.getModel();

		if (model != null) {
			DefaultListModel dm = (DefaultListModel)model;
			int idx = dm.indexOf(hit);
			if (idx > -1) {
				dm.removeElement(hit);
				dm.add(idx, hit);
			}
		}

		return;
	}

	/**
	 *
	 * @param mouseListener
	 */
	public void addListMouseListener(MouseListener listener) {
		if (this.movesList != null) {
			this.movesList.addMouseListener(listener);
		}

		return;
	}

	/**
	 * Return the value of the selected item from movesList.
	 */
	public Hit getSelectedValue() {
		Hit hit = null;

		if (this.movesList != null) {
			hit = (Hit)this.movesList.getSelectedValue();
		}

		return hit;
	}

	/**
	 *
	 */
	private void createMovesPanel() {
		super.setBorder(null);
		super.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));

		this.movesList = new JList();
		DefaultListModel model = new DefaultListModel();
		this.movesList.setModel(model);
		this.movesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.movesList.setSelectedIndex(0);
		this.scrollPane = new JScrollPane(this.movesList);
		
		this.timer = new TimerPanel(this.parent);
		
		//this.promote = new PromoteComboPanel(this.parent);
		
		super.add(this.scrollPane);
		//super.add(this.promote);
		super.add(Box.createVerticalGlue());
		super.add(this.timer);	

		return;
	}

}
