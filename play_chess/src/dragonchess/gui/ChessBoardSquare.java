package dragonchess.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

import org.apache.log4j.Logger;

import dragonchess.Utils;
import dragonchess.game.GamePiece;
import dragonchess.game.GamePieceColor;
import dragonchess.game.Position;
import dragonchess.game.Square;
import dragonchess.game.listeners.DrawListener;

public class ChessBoardSquare extends JPanel implements DrawListener {

	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(ChessBoardSquare.class);

	private Square square;
	private Position pos;
	private GamePiece piece;
	private Image image;
	private File imageFile;
	private boolean highlighted;
	private Border highlightBdr;

	public ChessBoardSquare(Color col, Square sq) {
		super();
		this.square = sq;
		this.pos = square.getPosition();
		setBackground(col);
		// JLabel label = new JLabel("r" + Integer.toString(pos.getRank()) +
		// ":f"
		// + Character.toString(pos.getFile()));
		// this.add(label);
		image = null;
		highlighted = false;
		highlightBdr = BorderFactory.createLineBorder(Color.GREEN, 2);
	}

	public void updateSquare() {
		this.piece = square.getPiece();
		// Color pieceColor;
		if (this.piece != null) {
			if (this.piece.getColor() == GamePieceColor.White) {
				// pieceColor = Color.WHITE;
				this.imageFile = new File(Utils.W_IMAGES[this.piece.getType()
						.ordinal()]);
			} else {
				// pieceColor = Color.BLACK;
				this.imageFile = new File(Utils.B_IMAGES[this.piece.getType()
						.ordinal()]);
			}
			// int pieceVal = piece.getType().getValue();
			image = getToolkit().getImage(imageFile.getPath());
		} else {
			image = null;
		}
		if (this.highlighted == true) {
			super.setBorder(highlightBdr);
		} else
			super.setBorder(null);
		return;
	}

	public void paintComponent(Graphics g) {
		updateSquare();
		super.paintComponent(g);
		if (image != null) {
			g.drawImage(image, 8, 8, this);
		}
	}

	public void setHighlight(boolean h) {
		this.highlighted = h;
	}

	public Position getPosition() {
		return pos;
	}

	//
	// implement DrawListener
	//

	/**
	 * Repaint a ChessBoardSquare.
	 */
	public void draw() {
		super.repaint();

		return;
	}

}
