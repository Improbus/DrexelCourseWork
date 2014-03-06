package dragonchess.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import dragonchess.game.GamePieceType;

public class PromoteComboPanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = -8944655920766404790L;
	private DragonChessMW parent;
	private JButton promote;
	private JComboBox promotables;

	public PromoteComboPanel(DragonChessMW parent) {
		super();
		this.parent = parent;
		this.createComboBox();
	}

	public void createComboBox() {
		GamePieceType[] pieces = { GamePieceType.Knight, GamePieceType.Bishop,
			GamePieceType.Rook, GamePieceType.Queen };
		super.setLayout(new GridLayout(1, 2));
		promotables = new JComboBox(pieces);
		super.add(promotables);

		promote = new JButton("Promote");
		promote.addActionListener(this);
		super.add(promote);
		return;

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == promote) {
			// TODO: add code to promote current piece
			GamePieceType gpt = (GamePieceType)this.promotables.getSelectedItem();
//			Promoteable gp = // add code to get the Pawn that is to be promoted
//			PromoteCommand cmd = new PromoteCommand(gp, gpt);
//			this.parent.sendCommand(cmd);
		}
		return;
	}
}
