package dragonchess.gui;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;

import javax.swing.JPanel;

import org.apache.log4j.Logger;

import dragonchess.MatchState;
import dragonchess.game.Command;
import dragonchess.game.GamePiece;
import dragonchess.game.GamePieceColor;
import dragonchess.game.GamePieceType;
import dragonchess.game.King;
import dragonchess.game.Player;
import dragonchess.game.Position;
import dragonchess.game.Rook;
import dragonchess.game.Square;
import dragonchess.game.commands.CastleCommand;
import dragonchess.game.commands.MoveCommand;
import dragonchess.game.commands.SetTurnCommand;

/**
 * The ChessBoard JPanel.
 * 
 * @author Group 4
 */
public class ChessBoardPanel extends JPanel {

	private static final long serialVersionUID = 778899001L;
	private static final Logger log = Logger.getLogger(ChessBoardPanel.class);

	private Dimension prefSize;
	private DragonChessMW parent;
	private ChessBoardSquare[] squares;
	private Square selection1;
	private Square selection2;
	private Player localplayer;
	private boolean boardDrawn;
	private Collection<Square> validmoves;

	/**
	 * Create a new JDialog.
	 */
	public ChessBoardPanel(DragonChessMW parent) {
		super();

		this.parent     = parent;
		this.validmoves = new ArrayList<Square>();
		this.squares    = new ChessBoardSquare[64];

		int i = 0;
		boolean black = true;
		for (Position p : EnumSet.range(Position.A1, Position.H8)) {
			Square sq = this.parent.getSquare(p);
			if (black) {
				this.squares[i] = new ChessBoardSquare(Color.BLACK, sq);
			} else {
				this.squares[i] = new ChessBoardSquare(Color.WHITE, sq);
			}
			this.parent.getMainApp().addDrawListener(p, this.squares[i]);
			this.squares[i].addMouseListener(listener);
			i++;
			black = !black;
			if (i % 8 == 0)
				black = !black;
		}

		this.localplayer = this.parent.getLocalPlayer();
		if (this.localplayer == null) {
			this.localplayer = new Player(GamePieceColor.White);
		}
		this.createChessBoardPanel();
		this.selection1 = null;
		this.selection2 = null;

		return;
	}

	public void clearHighlights() {
		for (int i = Position.A1.ordinal(); i <= Position.H8.ordinal(); i++) {
			squares[i].setHighlight(false);
			squares[i].repaint();
		}

		return;
	}

	private MouseListener listener = new MouseAdapter() {
		public void mouseClicked(MouseEvent event) {
			ChessBoardPanel.this.clearHighlights();
			ChessBoardSquare selected = (ChessBoardSquare) event.getSource();
			Square sq = ChessBoardPanel.this.parent.getSquare(
				selected.getPosition());

			MatchState turn = ChessBoardPanel.this.parent.getTurn();
			ChessBoardPanel.log.debug(String.format("mouseClicked():  %1$s",
				turn.toString()));
			boolean localturn = false;
			if (turn == MatchState.BlackTurn &&
				ChessBoardPanel.this.localplayer.getGamePieceColor() ==
					GamePieceColor.Black) {
				localturn = true;
			} else if (turn == MatchState.WhiteTurn &&
				ChessBoardPanel.this.localplayer.getGamePieceColor() ==
					GamePieceColor.White) {
				localturn = true;
			}
			ChessBoardPanel.log.debug(String.format(
				"Empty:  %1$s, Color:  %2$s, localturn:  %3$s",
				(sq.isEmpty() ? "True" : "Flase"),
				ChessBoardPanel.this.localplayer.getGamePieceColor().toString(),
				(localturn ? "True" : "False"))
			);
			if (!sq.isEmpty() && sq.getPiece().getColor() ==
					ChessBoardPanel.this.localplayer.getGamePieceColor() &&
				localturn) {
				ChessBoardPanel.this.selection1 = sq;
				ChessBoardPanel.log.debug(String.format("Selection 1: %1$s",
					sq.getPosition().toString()));
				ChessBoardPanel.this.validmoves = sq.getPiece().getMoves(
						ChessBoardPanel.this.parent.getMainApp().getBoard());
				ChessBoardPanel.this.highlightMoves();
			} else if (localturn) {
				ChessBoardPanel.this.selection2 = sq;
				ChessBoardPanel.log.debug(String.format("Selection 2: %1$s",
					sq.getPosition().toString()));
				if (ChessBoardPanel.this.validmoves.contains(sq)) {
					Command cmd = new MoveCommand(
						ChessBoardPanel.this.selection1.getPiece(),
						ChessBoardPanel.this.selection2.getPosition());
					if(selection1.getPiece().getType().equals(GamePieceType.King)){
						Position castlingPos = selection2.getPosition();
						GamePiece rook = null;
						int kingRank = selection1.getPosition().getRank();
						char rookFile = selection2.getPosition().getFile();
						int rookRank = selection2.getPosition().getRank();
						Position nextPos = null;
						if(castlingPos.getFile() == 'c'){
							if(kingRank == 1){
								rook = parent.getMainApp().getBoard().getGamePiece(Position.A1);
								nextPos = Position.getPositionWithRankAndFile('d', 1);
							}
							else if(kingRank == 8){
								rook = parent.getMainApp().getBoard().getGamePiece(Position.A8);
								nextPos = Position.getPositionWithRankAndFile('d', 8);
							}
							if (rook instanceof Rook) {
								cmd = new CastleCommand((King)selection1.getPiece(),
									selection2.getPosition(), new MoveCommand(rook,nextPos));
							}
						}else if(castlingPos.getFile() == 'g'){
							if(kingRank == 1){
								rook = parent.getMainApp().getBoard().getGamePiece(Position.H1);
								nextPos = Position.getPositionWithRankAndFile('f', 1);
							}
							else if(kingRank == 8){
								rook = parent.getMainApp().getBoard().getGamePiece(Position.H8);
								nextPos = Position.getPositionWithRankAndFile('f', 8);
							}
							if (rook instanceof Rook) {
								cmd = new CastleCommand((King)selection1.getPiece(),
									selection2.getPosition(), new MoveCommand(rook,nextPos));
							}
						}
					}
					ChessBoardPanel.this.parent.sendCommand(cmd);
					if (turn == MatchState.BlackTurn) {
						cmd = new SetTurnCommand(MatchState.WhiteTurn);
					} else if (turn == MatchState.WhiteTurn) {
						cmd = new SetTurnCommand(MatchState.BlackTurn);
					}
					ChessBoardPanel.this.parent.sendCommand(cmd);
				}
			}

		}
	};

	private void highlightMoves() {
		for (Square sq : this.validmoves) {
			Position p = sq.getPosition();
			this.squares[p.ordinal()].setHighlight(true);
			this.squares[p.ordinal()].repaint();
		}

		return;
	}

	/**
	 * Called from w/in the constructor to create the ChessBoardPanel.
	 */
	private void createChessBoardPanel() {
		ChessBoardPanel.log.debug("Panel Created");
		this.prefSize = new Dimension(500, 500);

		super.setOpaque(true);
		super.setBackground(Color.white);
		super.setPreferredSize(this.prefSize);
		super.setLayout(new GridLayout(8, 8));

		super.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		if (this.localplayer.getGamePieceColor() == GamePieceColor.White) {
			// Setup for White
			for (int i = Position.H8.ordinal(); i >= Position.A1.ordinal(); i--) {
				super.add(this.squares[i]);
			}
		} else {
			// Setup for Black
			for (int i = Position.A1.ordinal(); i <= Position.H8.ordinal(); i++) {
				super.add(this.squares[i]);
			}
		}

		return;
	}

}
