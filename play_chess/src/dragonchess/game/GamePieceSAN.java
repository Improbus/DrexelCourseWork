package dragonchess.game;

import org.apache.log4j.Logger;

import dragonchess.pgn.Flag;

/**
 * An enumeration of all the DrogonChess game pieces.
 *
 * <p>
 * pawn = P, knight = N, bishop = B, rook = R, queen = Q and king = K<br>
 * white upper-case letters ("PNBRQK")<br>
 * black lower-case letters ("pnbrqk")<br>
 * </p>
 *
 * @author Group 4
 */
public enum GamePieceSAN {

	QR('R', Position.A1),
	QN('N', Position.B1),
	QB('B', Position.C1),
	Q('Q', Position.D1),
	K('K', Position.E1),
	KB('B', Position.F1),
	KN('N', Position.G1),
	KR('R', Position.H1),
	AP('P', Position.A2),
	BP('P', Position.B2),
	CP('P', Position.C2),
	DP('P', Position.D2),
	EP('P', Position.E2),
	FP('P', Position.F2),
	GP('P', Position.G2),
	HP('P', Position.H2),
	ap('p', Position.A7),
	bp('p', Position.B7),
	cp('p', Position.C7),
	dp('p', Position.D7),
	ep('p', Position.E7),
	fp('p', Position.F7),
	gp('p', Position.G7),
	hp('p', Position.H7),
	qr('r', Position.A8),
	qn('n', Position.B8),
	qb('b', Position.C8),
	q('q', Position.D8),
	k('k', Position.E8),
	kb('b', Position.F8),
	kn('n', Position.G8),
	kr('r', Position.H8);

	private static final Logger log = Logger.getLogger(GamePieceSAN.class);

	/** FEN representation of this GamePiece.  */
	private char fen;
	/** The Position of this GamePiece. */
	private Position pose;
	/** A flag for a capture move. */
	private Flag capture;
	/** A flag for a promote move. */
	private Flag promote;
	/** A flag for a check/check mate move. */
	private Flag check;
	/** A flag for a castle move. */
	private Flag castle;

	/**
	 * Create a new GamePiece with the specified 'fen' value,
	 * and start Position.
	 *
	 * @param fen
	 * @param pose
	 */
	private GamePieceSAN(char fen, Position pose) {
		this.fen     = fen;
		this.pose    = pose;

		this.clearFlags();

		return;
	}

	/**
	 * Return the FEN value of this GamePiece(s).
	 */
	public char getFEN() {
		return this.fen;
	}

	/**
	 * Return the SAN of this GamePiece.
	 */
	public String getSAN() {
		return this.toString();
	}

	/**
	 * Return the Position of this GamePiece.
	 */
	public Position getPosition() {
		return this.pose;
	}

	/**
	 * Set the Position of this GamePiece.
	 *
	 * @param pose
	 */
	public void setPosition(Position pose) {
		this.pose = pose;

		return;
	}
	
	public GamePieceSAN validPiece(GamePieceType gpt, Position p)
	{
		switch(gpt)
		{
			case Knight:
				
			default:
				if(this.fen == 'P' || this.fen == 'p')
				{
					if(this.pose.getFile() == p.getFile())
						return this;
				}
				break;
		}
		return null;
	}

	/**
	 * Set the capture Flag for this GamePiece.
	 */
	public void setCapture() {
		this.capture = Flag.CAPTURE;

		return;
	}

	/**
	 * Set the promote Flag for this GamePiece.
	 */
	public void setPromote() {
		this.promote = Flag.PROMOTE;

		return;
	}

	/**
	 * Set the check Flag for this GamePiece.
	 */
	public void setCheck() {
		this.check = Flag.CHECK;

		return;
	}

	/**
	 * Set the check mate Flag for this GamePiece.
	 */
	public void setCheckMate() {
		this.check = Flag.CHECKMATE;

		return;
	}

	/**
	 * Set the king-side castle Flag for this GamePiece.
	 */
	public void setShortCastle() {
		this.castle = Flag.KCASTLE;

		return;
	}

	/**
	 * Set the queen-side castle Flag for this GamePiece.
	 */
	public void setLongCastle() {
		this.castle = Flag.QCASTLE;

		return;
	}
	
	public Flag getCastle(){
		return this.castle;
	}

	/**
	 * Clean all the PgnFlags for this GamePiece.
	 */
	public void clearFlags() {
		this.capture = null;
		this.promote = null;
		this.check   = null;
		this.castle  = null;

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		if (this.castle != null) {
			sb.append(this.castle);
		} else {
			if (this.promote != null) {
				sb.append(this.promote);
			}
			if (!(this.fen == 'p' || this.fen == 'P')) {
				sb.append(this.fen);
			}
			if (this.capture != null) {
				sb.append(this.capture);
			}
			sb.append(this.pose);
			if (this.check != null) {
				sb.append(this.check);
			}
		}

		return sb.toString();
	}

}
