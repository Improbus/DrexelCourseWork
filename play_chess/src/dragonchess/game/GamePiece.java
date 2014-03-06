package dragonchess.game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.log4j.Logger;

import dragonchess.game.commands.MoveCommand;
import dragonchess.pgn.Flag;

/**
 * The base class for all DragonChess pieces.
 *
 * @author Group 4
 */
public abstract class GamePiece implements Serializable {

	private static final long serialVersionUID = 5L;
	private static final Logger log = Logger.getLogger(GamePiece.class);


	private GamePieceColor color;
	private GamePieceType type;
	private GamePieceSAN san;

	/**
	 * Create a new Bishop.
	 */
	public GamePiece() {
		this(GamePieceType.Empty, null, null);

		return;
	}

	/**
	 * Create a new GamePiece.
	 *
	 * @param type
	 * @param color
	 * @param san
	 */
	public GamePiece(GamePieceType type, GamePieceColor color, GamePieceSAN san) {
		this.type  = type;
		this.color = color;
		this.san   = san;

		return;
	}

	/**
	 * Return the Position of this GamePiece.
	 */
	public Position getPosition() {
		return this.san.getPosition();
	}

	/**
	 * Set the Position of this GamePiece.
	 *
	 * @param pose
	 */
	public void setPosition(Position pose, boolean undo) {
		this.san.setPosition(pose);

		return;
	}

	/**
	 * Set the capture Flag for this GamePiece.
	 */
	public void setCapture() {
		this.san.setCapture();

		return;
	}

	/**
	 * Set the promote Flag for this GamePiece.
	 */
	public void setPromote() {
		this.san.setPromote();

		return;
	}

	/**
	 * Set the check Flag for this GamePiece.
	 */
	public void setCheck() {
		this.san.setCheck();

		return;
	}

	/**
	 * Set the check mate Flag for this GamePiece.
	 */
	public void setCheckMate() {
		this.san.setCheckMate();

		return;
	}

	/**
	 * Set the king-side castle Flag for this GamePiece.
	 */
	public void setShortCastle() {
		this.san.setShortCastle();

		return;
	}

	/**
	 * Set the queen-side castle Flag for this GamePiece.
	 */
	public void setLongCastle() {
		this.san.setLongCastle();

		return;
	}
	
	public Flag getLongCastle() {
		return this.san.getCastle();

	}

	/**
	 * Clean all the PgnFlags for this GamePiece.
	 */
	public void clearFlags() {
		this.san.clearFlags();

		return;
	}

	/**
	 * Return the GamePieceSAN of this GamePiece.
	 */
	public GamePieceSAN getSAN() {
		return this.san;
	}

	/**
	 * Return the GamePieceType of this GamePiece.
	 */
	public GamePieceType getType() {
		return this.type;
	}

	/**
	 * Set the GamePieceType of this GamePiece.
	 *
	 * @param newType
	 */
	protected void setType(GamePieceType newType) {
		this.type = newType;
	}

	/**
	 * Return the GamePieceColor of this GamePiece.
	 */
	public GamePieceColor getColor() {
		return this.color;
	}

	/**
	 * Return all the possible moves this GamePiece can make from
	 * it current Square.
	 *
	 * @param board
	 */
  /* note: adds to the move stack the move, makes sure there is no check, then
   * pops move off stack */
	public Collection<Square> getMoves(ChessBoard board)
  {
    Collection<Square> potentialMoves = getPotentialMoves(board);
    Collection<Square> validMoves = new ArrayList<Square>();

    for(Square square : potentialMoves)
    {
      MoveCommand move = new MoveCommand(this, square.getPosition());
      board.peek(move);

      if(!board.isPlayerInCheck(color))
        validMoves.add(square);

      board.peekUndo();
    }

    return validMoves;
  }

  /**
   * Return true if a move is within "sight"
   *
   * @param board
   * @param toSquare
   */
  public boolean hasInSight(ChessBoard board, Square toSquare) 
  {
    return getPotentialMoves(board).contains(toSquare);
  }


	/**
	 * Return true if toSquare is a valid move for this GamePiece.
	 *
	 * @param board
	 * @param toSquare
	 */
  /* this does not actually "perform" the move, so that there's no recursion */
	public boolean isValidMove(ChessBoard board, Square toSquare) {
    return getMoves(board).contains(toSquare);
	}

  /**
   * Builds a list of potential possible moves for the piece
   *
   * @param board
   */
  protected abstract Collection<Square> getPotentialMoves(ChessBoard board);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object other) {
		boolean equal = false;

		if (other instanceof GamePiece) {
			GamePiece gp = (GamePiece)other;
			if (this.san != null) {
				equal = this.san == gp.getSAN();
			}
		}

		return equal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return this.san.toString();
	}

}
