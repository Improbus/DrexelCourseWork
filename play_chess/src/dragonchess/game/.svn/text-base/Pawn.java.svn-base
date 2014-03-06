package dragonchess.game;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.log4j.Logger;

/**
 * Each player starts with eighth pawns.
 * <p>
 * Starting squares:
 * <ul>
 * <li>White:  a2 b2 c2 d2 e2 f2 g2 h2</li>
 * <li>Black:  a7 b7 c7 d7 e7 f7 g7 h7</li>
 * </ul>
 * </p>
 * <p>
 * Movement: only forward; each time one square--except for the initial
 * move which could be two squares (jumping pieces is not allowed).
 * </p>
 * <p>
 * Capture:  Unlike all other GamePieces, pawns capture diagonally -
 * both to the left or to the right - one square forward.<br>
 * <strong>En Passant</strong>: occurs when one player moves a pawn two
 * squares forward in order to avoid being captured; the capture is made
 * as if the player had moved only one square.
 * </p>
 *
 * @author Group 4
 */
public class Pawn extends GamePiece implements Promoteable {

	private static final long serialVersionUID = 25L;
	private static final Logger log = Logger.getLogger(Pawn.class);

	private int numMoves;
	private EnPassant enPassant;
	private boolean passed;

	/**
	 * Create a new Pawn.
	 */
	public Pawn() {
		this(GamePieceColor.White, GamePieceSAN.AP);

		return;
	}

	/**
	 * Create a new Pawn.
	 *
	 * @param color
	 */
	public Pawn(GamePieceColor color) {
		this(color, 
			(color == GamePieceColor.White ? GamePieceSAN.AP : GamePieceSAN.ap));

		return;
	}

	/**
	 * Create a new Pawn.
	 *
	 * @param color
	 * @param san
	 */
	public Pawn(GamePieceColor color, GamePieceSAN san) {
		super(GamePieceType.Pawn, color, san);

		this.numMoves  = 0;
		this.enPassant = EnPassant.None;
		this.passed    = false;

		return;
	}

	/**
	 * Enable/disable en passant.
	 *
	 * @param enPassant
	 */
	public void setEnPassant(EnPassant enPassant) {
		this.enPassant = enPassant;
	}

	/**
	 * Returns true is this Pawn is a passed Pawn.
	 * <p>
	 * A passed pawn is a pawn with no opposing pawns to prevent it from
	 * advancing to the eighth rank (i.e. there are no opposing pawns in
	 * front of it on the same file nor on an adjacent file).
	 * <p>
	 */
	public boolean isPassed() {
		return this.passed;
	}

	/**
	 * Set/un-set this Pawn a passed.
	 *
	 * @param passed
	 */
	public void setPassed(boolean passed) {
		this.passed = passed;

		return;
	}

	/**
	 * {@inheritDoc}
	 */
/*	@Override
	public Collection<Square> getMoves(ChessBoard board) {
		List<Square> moves = new ArrayList<Square>();

		//
		//TODO: change this code to use the Rays array/linkedlist;
		// also, Utils.CHESS_BOARD is a 1D array, now.
		//
		Position currPose  = super.getCurrentSquare().getPosition();
		GamePieceColor color  = super.getColor();

		int f = currPose.getFile();
		int r = currPose.getRank();
		Square sq = board.getSquare((color == GamePieceColor.White ?
			Utils.CHESS_BOARD[++r][f] : Utils.CHESS_BOARD[--r][f]));
		if (sq.isEmpty()) { // there is a empty Square in front of me
			moves.add(sq);
			if (this.numMoves == 0) { // this is my first move...
				sq = board.getSquare((color == GamePieceColor.White ?
					Utils.CHESS_BOARD[++r][f] : Utils.CHESS_BOARD[--r][f]));
				if (sq.isEmpty()) { // ...so add 2 Squares to move
					moves.add(sq);
				}
			} else { // check for en passant
				if (color == GamePieceColor.White) {
					if (f == 'a' && this.enPassant == EnPassant.Right) {
						moves.add(board.getSquare(Utils.CHESS_BOARD[5][Utils.B]));
					} else if (f == 'h' && this.enPassant == EnPassant.Left) {
						moves.add(board.getSquare(Utils.CHESS_BOARD[5][Utils.G]));
					} else {
						switch (this.enPassant) {
						case Left:
							moves.add(board.getSquare(Utils.CHESS_BOARD[5][--f]));
							break;
						case Right:
							moves.add(board.getSquare(Utils.CHESS_BOARD[5][++f]));
							break;
						}
					}
				} else {
					if (f == 'a' && this.enPassant == EnPassant.Left) {
						moves.add(board.getSquare(Utils.CHESS_BOARD[3][Utils.B]));
					} else if (f == 'h' && this.enPassant == EnPassant.Right) {
						moves.add(board.getSquare(Utils.CHESS_BOARD[3][Utils.G]));
					} else {
						switch (this.enPassant) {
						case Left:
							moves.add(board.getSquare(Utils.CHESS_BOARD[3][++f]));
							break;
						case Right:
							moves.add(board.getSquare(Utils.CHESS_BOARD[3][--f]));
							break;
						}
					}
				}
			}
		}

		return moves;
	}*/

  public void setPosition(Position pose, boolean undo)
  {
    super.setPosition(pose, undo);

    if(!undo)
      numMoves++;
    else
      numMoves--;
  }

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Collection<Square> getPotentialMoves(ChessBoard board) {
		ArrayList<Square> potentialMoves = new ArrayList<Square>();

    Position myPose = super.getPosition();
    Direction dir, c1, c2;

    if( getColor() == GamePieceColor.White )
    {
      dir = Direction.N;
      c1 = Direction.NW;
      c2 = Direction.NE;
    }
    else
    {
      dir = Direction.S;
      c1 = Direction.SW;
      c2 = Direction.SE;
    }

    Square front = board.getSquare( myPose.nextPosition( dir ) );
    Square two = board.getSquare(myPose.nextPosition(dir).nextPosition(dir));
    Square diag1 = null, diag2 = null;

    if( myPose.nextPosition( c1 ) != null )
      diag1 = board.getSquare( myPose.nextPosition( c1 ) );
    if( myPose.nextPosition( c2 ) != null )
      diag2 = board.getSquare( myPose.nextPosition( c2 ) );

    if( front.isEmpty() )
    {
      potentialMoves.add( front );

      if( two.isEmpty() && numMoves == 0 )
        potentialMoves.add( two );
    }

    if( diag1 != null && 
        !diag1.isEmpty() && diag1.getPiece().getColor() != getColor() )
      potentialMoves.add(diag1);
    if( diag2 != null && 
        !diag2.isEmpty() && diag2.getPiece().getColor() != getColor() )
      potentialMoves.add(diag2);

    return potentialMoves;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isValidMove(ChessBoard board, Square toSquare) {
		return false;
	}

	//
	// implement Promoteable
	//

	/**
	 * {@inheritDoc}
	 */
	public void promote(GamePieceType toType) {
		super.setType(toType);
		super.setPromote();

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	public void demote() {
		super.setType(GamePieceType.Pawn);
		super.clearFlags();

		return;
	}

}
