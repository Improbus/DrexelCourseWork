package dragonchess.gui;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import dragonchess.Utils;
import dragonchess.game.GamePiece;
import dragonchess.game.GamePieceColor;
import dragonchess.game.listeners.DrawListener;

public class CapturedPanel extends JPanel implements DrawListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7971133851984097427L;
	private DragonChessMW parent;
	private GamePieceColor color;
	private List<GamePiece> pieces;

	public CapturedPanel(DragonChessMW parent, GamePieceColor color) {
		super();
		this.parent = parent;
		this.color = color;
		updatePieces();
		super.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		if(this.color.equals(GamePieceColor.White))
			this.parent.getMainApp().getBoard().setWhiteCaptureListener(this);
		else
			this.parent.getMainApp().getBoard().setBlackCaptureListener(this);

	}

	public void updatePieces() {
		if (color.equals(GamePieceColor.White))
			pieces = parent.getMainApp().getBoard().getBlackCaptured();
		else
			pieces = parent.getMainApp().getBoard().getWhiteCaptured();

	}

	public void paintComponent(Graphics g) {
		updatePieces();
		int ypos = 5;
		File imageFile;
		Image image;
		super.paintComponent(g);
		for (int i = 0; i < pieces.size(); i++) {
			if (color.equals(GamePieceColor.White))
				imageFile = new File(Utils.W_IMAGES[pieces.get(i).getType()
					.ordinal()]);
			else
				imageFile = new File(Utils.B_IMAGES[pieces.get(i).getType()
				                					.ordinal()]);
			image = getToolkit().getImage(imageFile.getPath());
			if (image != null) {
				g.drawImage(image, 0, ypos, this);
				ypos += 30;
			}
		}
	}

	public void draw() {
		super.repaint();
		
	}

}
