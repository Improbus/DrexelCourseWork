package dragonchess.game;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.EnumSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import dragonchess.Utils;
import dragonchess.game.commands.CastleCommand;
import dragonchess.game.commands.MoveCommand;
import dragonchess.game.commands.PromoteCommand;
import dragonchess.game.listeners.DrawListener;
import dragonchess.pgn.Hit;

/**
 * DragonChess' ChessBoard.
 * 
 * @author Group 4
 */
public class ChessBoard {

	private static final Logger log = Logger.getLogger(ChessBoard.class);

	private Map<Position, Square> squares;
	private Map<Position, Map<Direction, List<Position>>> rays;
	private Map<GamePieceSAN, GamePiece> pieces;
	private Deque<UndoableCommand> commands;
	private List<GamePiece> whiteCaptured;
	private List<GamePiece> blackCaptured;
	private Map<Position, DrawListener> drawListeners;
	private DrawListener whiteCaptureListener, blackCaptureListener;

	/**
	 * Create a new ChessBoard.
	 */
	public ChessBoard() {
		this(Utils.CHESS_BOARD);

		return;
	}

	/**
	 * Create a new ChessBoard with the specified squares.
	 * 
	 * @param squares
	 */
	public ChessBoard(Square[] squares) {
		this.squares = new Hashtable<Position, Square>();
		this.rays = new Hashtable<Position, Map<Direction, List<Position>>>();
		this.pieces = new Hashtable<GamePieceSAN, GamePiece>();
		this.commands = new ArrayDeque<UndoableCommand>();
		this.whiteCaptured = new ArrayList<GamePiece>();
		this.blackCaptured = new ArrayList<GamePiece>();
		this.drawListeners = new Hashtable<Position, DrawListener>();

		this.setSquares(squares);
		this.populateRays();

		return;
	}

	/**
	 * Return the Map of Positions to Squares of this CHessBoard.
	 */
	public Map<Position, Square> getSquares() {
		return this.squares;
	}

	/**
	 * Set the Map of Positions to Squares of this CHessBoard.
	 * 
	 * @squares
	 */
	public void setSquares(Map<Position, Square> squares) {
		this.squares = squares;

		return;
	}

	/**
	 * Set the Map of Positions to Squares of this CHessBoard.
	 * 
	 * @squares
	 */
	public void setSquares(Square[] squares) {
		if (squares.length == 64) {
			if (this.squares == null) {
				this.squares = new Hashtable<Position, Square>();
			}
			for (int i = 0; i < squares.length; i++) {
				this.squares.put(squares[i].getPosition(), squares[i]);
			}
		} else {
			log.error(String.format("Invalid number of squares:  %d",
					squares.length));
		}

		return;
	}

	/**
	 * Return the Square at Position 'pose.'
	 * 
	 * @param pose
	 */
	public Square getSquare(Position pose) {
		return this.squares.get(pose);
	}

	/**
	 * Return the ray for the specified Position, and Direction.
	 * 
	 * @param position
	 * @param direction
	 */
	public List<Position> getRay(Position position, Direction direction) {
		Map<Direction, List<Position>> rays = this.rays.get(position);

		return rays.get(direction);
	}

	/**
	 * Return the GamePiece at the specified Position, or null if there's no
	 * GamePiece at that Position.
	 * 
	 * @param pose
	 */
	public GamePiece getGamePiece(Position pose) {
		GamePiece gp = null;
		Set<GamePieceSAN> keys = this.pieces.keySet();

		for (GamePieceSAN key : keys) {
			if (key.getPosition() == pose) {
				gp = this.pieces.get(key);
				break;
			}
		}

		return gp;
	}

	/**
	 * Calculates whether or not a player is in check
	 */
	public boolean isPlayerInCheck(GamePieceColor color) {
		King king = null;

		for (GamePieceSAN gps : this.pieces.keySet()) {
			GamePiece gp = this.pieces.get(gps);
			if (gp.getColor() == color && gp instanceof King)
				king = (King) gp;
		}

		if (king != null) {
			Square kingSquare = getSquare(king.getPosition());

			for (GamePieceSAN gps : this.pieces.keySet()) {
				GamePiece gp = this.pieces.get(gps);
				if (gp.getPosition() != Position.NONE && gp.getColor() != color
						&& gp.hasInSight(this, kingSquare))
					return true;
			}
		}

		return false;
	}

	/**
	 * Return all the GamePieces of this ChessBoard.
	 */
	public GamePiece[] getGamePiecesArray() {
		return this.pieces.values().toArray(new GamePiece[0]);
	}

	/**
	 * Return all the GamePieces of this ChessBoard.
	 */
	public Map<GamePieceSAN, GamePiece> getGamePieces() {
		return this.pieces;
	}

	/**
	 * Set all the GamePieces of this ChessBoard.
	 * 
	 * @param pieces
	 */
	public void setGamePieces(GamePiece[] pieces) {
		for (int i = 0; i < pieces.length; i++) {
			GamePieceSAN san = pieces[i].getSAN();
			this.pieces.put(san, pieces[i]);
			Square sq = this.squares.get(pieces[i].getPosition());
			sq.setPiece(pieces[i]);
		}

		return;
	}

	public void peek(UndoableCommand command) {
		if (this.commands == null) {
			this.commands = new ArrayDeque<UndoableCommand>();
		}

		this.commands.push(command);

		if (command instanceof MoveCommand) {
			MoveCommand mc = (MoveCommand) command;
			GamePiece gp = mc.getGamePiece();
			Position newPose = mc.getNewPosition();
			Position oldPose = mc.getOldPosition();
			Square newSquare = this.squares.get(newPose);
			Square oldSquare = this.squares.get(oldPose);
			GamePiece cgp = newSquare.getPiece();
			mc.execute();
			gp.clearFlags();
			// check if this moved resulted in a capture
			if (cgp != null) {
				gp.setCapture();
				mc.setCapturedPiece(cgp);
				cgp.clearFlags();
				cgp.setPosition(Position.NONE, false);
				// store captured GamePiece
				if (cgp.getColor() == GamePieceColor.Black) {
					this.whiteCaptured.add(cgp);
				} else {
					this.blackCaptured.add(cgp);
				}
			}
			// update the Squares
			newSquare.setPiece(gp);
			oldSquare.setPiece(null);
		}

		return;
	}

	/**
	 * Undo the last UndoableCommand.
	 */
	public void peekUndo() {
		if (this.commands.size() > 0) {
			UndoableCommand cmd = this.commands.pop();
			cmd.undo();

			if (cmd instanceof MoveCommand) {
				MoveCommand mc = (MoveCommand) cmd;
				GamePiece gp = mc.getGamePiece();
				GamePiece cgp = mc.getCapturedPiece();
				gp.clearFlags();
				if (cgp != null) {
					cgp.clearFlags();
					if (cgp.getColor() == GamePieceColor.Black) {
						this.whiteCaptured.remove(cgp);
					} else {
						this.blackCaptured.remove(cgp);
					}
				}
				Position newPose = mc.getNewPosition();
				Position oldPose = mc.getOldPosition();
				Square newSquare = this.squares.get(newPose);
				Square oldSquare = this.squares.get(oldPose);
				// update the Squares
				newSquare.setPiece(cgp);
				oldSquare.setPiece(gp);
			} else if (cmd instanceof PromoteCommand) {
			}
		} else {
			log.error("There are no more commands to undo!");
		}

		return;
	}

	/**
	 * Make a move.
	 * 
	 * @param command
	 */
	public void move(UndoableCommand command) {
		if (this.commands == null) {
			this.commands = new ArrayDeque<UndoableCommand>();
		}

		this.commands.push(command);

		if (command instanceof CastleCommand) {
			System.err.println("Inside castle command of chess board move");
			MoveCommand rmc = ((CastleCommand)command).getRookMoveCommand();
			System.err.println(rmc.toString());
			GamePiece rook = rmc.getGamePiece();
			Position oPos = rmc.getOldPosition();
			Position nPos = rmc.getNewPosition();
			Square oSquare = this.squares.get(oPos);
			Square nSquare = this.squares.get(nPos);
			DrawListener newListener = this.drawListeners.get(nPos);
			DrawListener oldListener = this.drawListeners.get(oPos);
			rmc.execute();
			nSquare.setPiece(rook);
			oSquare.setPiece(null);
			newListener.draw();
			oldListener.draw();
			log.debug("rook = " + rook);
		} else {
			log.error("NOT A CASTLECOMMAND mc = " + command.toString());
		}
		if (command instanceof MoveCommand) {
			MoveCommand mc = (MoveCommand) command;
			GamePiece gp = mc.getGamePiece();
			Position newPose = mc.getNewPosition();
			Position oldPose = mc.getOldPosition();
			Square newSquare = this.squares.get(newPose);
			Square oldSquare = this.squares.get(oldPose);
			GamePiece cgp = newSquare.getPiece();
			DrawListener newListener = this.drawListeners.get(newPose);
			DrawListener oldListener = this.drawListeners.get(oldPose);
			mc.execute();
			gp.clearFlags();
			// check if this moved resulted in a capture
			if (cgp != null) {
				gp.setCapture();
				mc.setCapturedPiece(cgp);
				cgp.clearFlags();
				cgp.setPosition(Position.NONE, false);
				// store captured GamePiece
				if (cgp.getColor() == GamePieceColor.Black) {
					this.whiteCaptured.add(cgp);
				} else {
					this.blackCaptured.add(cgp);
				}
				whiteCaptureListener.draw();
				blackCaptureListener.draw();

			}
			// update the Squares
			newSquare.setPiece(gp);
			oldSquare.setPiece(null);
			// repaint the 2 Squares
			if (newListener != null) {
				newListener.draw();
			}
			if (oldListener != null) {
				oldListener.draw();
			}
		}

		return;
	}

	/**
	 * Undo the last UndoableCommand.
	 */
	public void undo() {
		if (this.commands.size() > 0) {
			UndoableCommand cmd = this.commands.pop();
			cmd.undo();

			if (cmd instanceof MoveCommand) {
				MoveCommand mc = (MoveCommand) cmd;
				GamePiece gp = mc.getGamePiece();
				GamePiece cgp = mc.getCapturedPiece();
				gp.clearFlags();
				if (cgp != null) {
					cgp.clearFlags();
					if (cgp.getColor() == GamePieceColor.Black) {
						this.whiteCaptured.remove(cgp);
					} else {
						this.blackCaptured.remove(cgp);
					}
				}
				Position newPose = mc.getNewPosition();
				Position oldPose = mc.getOldPosition();
				Square newSquare = this.squares.get(newPose);
				Square oldSquare = this.squares.get(oldPose);
				DrawListener newListener = this.drawListeners.get(newPose);
				DrawListener oldListener = this.drawListeners.get(oldPose);
				// update the Squares
				newSquare.setPiece(cgp);
				oldSquare.setPiece(gp);
				// repaint the 2 Squares
				if (newListener != null) {
					newListener.draw();
				}
				if (oldListener != null) {
					oldListener.draw();
				}
				whiteCaptureListener.draw();
				blackCaptureListener.draw();
			} else if (cmd instanceof PromoteCommand) {
			}
		} else {
			log.error("There are no more commands to undo!");
		}

		return;
	}

	/**
	 * Return the a Hit.
	 */
	public Hit getHit() {
		Iterator<UndoableCommand> it = this.commands.iterator();
		MoveCommand bMove = (it.hasNext() ? (MoveCommand) it.next() : null);
		MoveCommand wMove = (it.hasNext() ? (MoveCommand) it.next() : null);

		return new Hit((wMove != null ? wMove.getGamePiece().toString() : null),
				(bMove != null ? bMove.getGamePiece().toString() : null));
	}

	/**
	 * Add a DrawListener for the specified Square.
	 * 
	 * @param pose
	 * @param listener
	 */
	public void addDrawListener(Position pose, DrawListener listener) {
		this.drawListeners.put(pose, listener);

		return;
	}

	/**
	 * Remove a DrawListener for the specified Square.
	 * 
	 * @param pose
	 */
	public void removeDrawListener(Position pose) {
		this.drawListeners.remove(pose);

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();

		//
		// Note: this should probably return this.currState.toString();
		// but, fow now, it's used for debugging
		//

		sb.append(this.printBoard());

		return sb.toString();
	}

	/**
	 * Print the ChessBoard.
	 */
	private String printBoard() {
		StringBuilder sb = new StringBuilder();

		for (Position p : EnumSet.range(Position.A8, Position.H8)) {
			sb.append(this.squares.get(p));
		}
		sb.append("\n");
		for (Position p : EnumSet.range(Position.A7, Position.H7)) {
			sb.append(this.squares.get(p));
		}
		sb.append("\n");
		for (Position p : EnumSet.range(Position.A6, Position.H6)) {
			sb.append(this.squares.get(p));
		}
		sb.append("\n");
		for (Position p : EnumSet.range(Position.A5, Position.H5)) {
			sb.append(this.squares.get(p));
		}
		sb.append("\n");
		for (Position p : EnumSet.range(Position.A4, Position.H4)) {
			sb.append(this.squares.get(p));
		}
		sb.append("\n");
		for (Position p : EnumSet.range(Position.A3, Position.H3)) {
			sb.append(this.squares.get(p));
		}
		sb.append("\n");
		for (Position p : EnumSet.range(Position.A2, Position.H2)) {
			sb.append(this.squares.get(p));
		}
		sb.append("\n");
		for (Position p : EnumSet.range(Position.A1, Position.H1)) {
			sb.append(this.squares.get(p));
		}
		sb.append("\n");

		return sb.toString();
	}

	/**
	 * Populate the rays Map.
	 */
	private void populateRays() {
		EnumSet<Direction> directions = EnumSet.of(Direction.N, Direction.NE,
				Direction.E, Direction.SE, Direction.S, Direction.SW,
				Direction.W, Direction.NW);

		for (Position p : EnumSet.range(Position.A1, Position.H8)) {
			Map<Direction, List<Position>> rays = new Hashtable<Direction, List<Position>>();
			for (Direction d : directions) {
				List<Position> ray = p.getRay(d);
				rays.put(d, ray);
			}
			this.rays.put(p, rays);
		}

		return;
	}

	/**
	 * Returns the list containing all captured white pieces
	 * 
	 * @return
	 */
	public List<GamePiece> getWhiteCaptured() {
		return whiteCaptured;
	}

	/**
	 * Returns the list containing all captured black pieces
	 * 
	 * @return
	 */
	public List<GamePiece> getBlackCaptured() {
		return blackCaptured;
	}

	public void setWhiteCaptureListener(DrawListener white) {
		this.whiteCaptureListener = white;
	}

	public void setBlackCaptureListener(DrawListener black) {
		this.blackCaptureListener = black;
	}

}
