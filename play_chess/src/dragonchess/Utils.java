package dragonchess;

import dragonchess.game.Bishop;
import dragonchess.game.GamePiece;
import dragonchess.game.GamePieceColor;
import dragonchess.game.GamePieceSAN;
import dragonchess.game.King;
import dragonchess.game.Knight;
import dragonchess.game.Pawn;
import dragonchess.game.Position;
import dragonchess.game.Queen;
import dragonchess.game.Rook;
import dragonchess.game.Square;

import java.awt.GridBagConstraints;
import java.awt.Insets;

/**
 * Utils contains all the common code for the dragonchess.gui package.
 * 
 * @author Group 4
 */
public class Utils {

	/** A PatternLayout for all Log4j messages. */
	public static final String LOG4J_PATTERN = "%d{yyyy-MMM-dd HH:mm:ss,SSS} [%t] %c %x%n %-5p %m%n";
	/** Configuration file for log4j. */
	public static final String LOG4J_CONFIG  = "./config/log4j.properties";

	public static final String DEFAULT_HOST_NAME = "localhost";
	public static final String DEFAULT_PORT_NUMBER_STR = "6677";
	public static final int DEFAULT_PORT_NUMBER = 6677;
	public static final int MIN_PORT = 1024;
	public static final int MAX_PORT = 65535;
	public static final String DEFAULT_TIME_STR = "120";
	public static final int DEFAULT_TIME = 120;
	public static final int MIN_MIN = 5;
	public static final int SERVER_TIME_OUT = 10000;
	public static final String SERVER_RB_CMD = "serverRb";
	public static final String CLIENT_RB_CMD = "clientRb";
	public static final String LOGIN_CMD = "login";
	public static final String MOVE_CMD = "Move";
	public static final int DCCB_MIN_WIDTH_HEIGHT = 500;
	public static final int DCCB_MIN_MOVES_WIDTH = 250;
	public static final int DCCP_MIN_WIDTH = 60;
	public static final int DCMSP_DIV_LOC = 635;
	public static final int DCMSP_MIN_WIDTH = 890;
	public static final int DCMSP_C_MIN_HEIGHT = 510;
	public static final int DCMSP_I_MIN_HEIGHT = 200;
	public static final int LOW_GUESS = 1;
	public static final int HIGH_GUESS = 100;
	public static final int SPLASH_PAUSE = 1000;
	public static final int RECEIVE_PAUSE = 1000;
	public static final String SPLASH_IMAGE = "./images/ubuntu-dragon.jpeg";
	public static final String[] W_IMAGES = {
		"./images/pawnw.gif",
		"./images/knightw.gif",
		"./images/bishopw.gif",
		"./images/rookw.gif",
		"./images/queenw.gif",
		"./images/kingw.gif"
	};
	public static final String[] B_IMAGES = {
		"./images/pawnb.gif",
		"./images/knightb.gif",
		"./images/bishopb.gif",
		"./images/rookb.gif",
		"./images/queenb.gif",
		"./images/kingb.gif"
	};
	public static final char A = 'a' - 'a';
	public static final char B = 'b' - 'a';
	public static final char C = 'c' - 'a';
	public static final char D = 'd' - 'a';
	public static final char E = 'e' - 'a';
	public static final char F = 'f' - 'a';
	public static final char G = 'g' - 'a';
	public static final char H = 'h' - 'a';
	public static final char[] BLACK_CHAR = { 'p', 'n', 'b', 'r', 'q', 'k' };
	public static final char[] WHITE_CHAR = { 'P', 'N', 'B', 'R', 'Q', 'K' };
	public static final Square[] CHESS_BOARD = new Square[] {
			new Square(Position.A1), new Square(Position.B1),
			new Square(Position.C1), new Square(Position.D1),
			new Square(Position.E1), new Square(Position.F1),
			new Square(Position.G1), new Square(Position.H1),
			new Square(Position.A2), new Square(Position.B2),
			new Square(Position.C2), new Square(Position.D2),
			new Square(Position.E2), new Square(Position.F2),
			new Square(Position.G2), new Square(Position.H2),
			new Square(Position.A3), new Square(Position.B3),
			new Square(Position.C3), new Square(Position.D3),
			new Square(Position.E3), new Square(Position.F3),
			new Square(Position.G3), new Square(Position.H3),
			new Square(Position.A4), new Square(Position.B4),
			new Square(Position.C4), new Square(Position.D4),
			new Square(Position.E4), new Square(Position.F4),
			new Square(Position.G4), new Square(Position.H4),
			new Square(Position.A5), new Square(Position.B5),
			new Square(Position.C5), new Square(Position.D5),
			new Square(Position.E5), new Square(Position.F5),
			new Square(Position.G5), new Square(Position.H5),
			new Square(Position.A6), new Square(Position.B6),
			new Square(Position.C6), new Square(Position.D6),
			new Square(Position.E6), new Square(Position.F6),
			new Square(Position.G6), new Square(Position.H6),
			new Square(Position.A7), new Square(Position.B7),
			new Square(Position.C7), new Square(Position.D7),
			new Square(Position.E7), new Square(Position.F7),
			new Square(Position.G7), new Square(Position.H7),
			new Square(Position.A8), new Square(Position.B8),
			new Square(Position.C8), new Square(Position.D8),
			new Square(Position.E8), new Square(Position.F8),
			new Square(Position.G8), new Square(Position.H8), };
	public static final GamePiece[] DEFAULT_PIECES = new GamePiece[] {
			new Rook(GamePieceColor.White, GamePieceSAN.QR),
			new Knight(GamePieceColor.White, GamePieceSAN.QN),
			new Bishop(GamePieceColor.White, GamePieceSAN.QB),
			new Queen(GamePieceColor.White, GamePieceSAN.Q),
			new King(GamePieceColor.White, GamePieceSAN.K),
			new Bishop(GamePieceColor.White, GamePieceSAN.KB),
			new Knight(GamePieceColor.White, GamePieceSAN.KN),
			new Rook(GamePieceColor.White, GamePieceSAN.KR),
			new Pawn(GamePieceColor.White, GamePieceSAN.AP),
			new Pawn(GamePieceColor.White, GamePieceSAN.BP),
			new Pawn(GamePieceColor.White, GamePieceSAN.CP),
			new Pawn(GamePieceColor.White, GamePieceSAN.DP),
			new Pawn(GamePieceColor.White, GamePieceSAN.EP),
			new Pawn(GamePieceColor.White, GamePieceSAN.FP),
			new Pawn(GamePieceColor.White, GamePieceSAN.GP),
			new Pawn(GamePieceColor.White, GamePieceSAN.HP),
			new Pawn(GamePieceColor.Black, GamePieceSAN.ap),
			new Pawn(GamePieceColor.Black, GamePieceSAN.bp),
			new Pawn(GamePieceColor.Black, GamePieceSAN.cp),
			new Pawn(GamePieceColor.Black, GamePieceSAN.dp),
			new Pawn(GamePieceColor.Black, GamePieceSAN.ep),
			new Pawn(GamePieceColor.Black, GamePieceSAN.fp),
			new Pawn(GamePieceColor.Black, GamePieceSAN.gp),
			new Pawn(GamePieceColor.Black, GamePieceSAN.hp),
			new Rook(GamePieceColor.Black, GamePieceSAN.qr),
			new Knight(GamePieceColor.Black, GamePieceSAN.qn),
			new Bishop(GamePieceColor.Black, GamePieceSAN.qb),
			new Queen(GamePieceColor.Black, GamePieceSAN.q),
			new King(GamePieceColor.Black, GamePieceSAN.k),
			new Bishop(GamePieceColor.Black, GamePieceSAN.kb),
			new Knight(GamePieceColor.Black, GamePieceSAN.kn),
			new Rook(GamePieceColor.Black, GamePieceSAN.kr) };

	/**
	 * Default constructor
	 */
	private Utils() {
		return;
	}

	/**
	 * Helper method used by the different GUI components to set the
	 * GridBagConstraints for a GridBagLayout.
	 * 
	 * @param gc
	 * @param gridy
	 * @param gridx
	 * @param gridwidth
	 * @param gridheight
	 * @param align
	 * @param insets
	 */
	public static void setConstraints(GridBagConstraints gc, int gridy,
			int gridx, int gridwidth, int gridheight, int align, Insets insets) {
		gc.gridx = gridx;
		gc.gridy = gridy;
		gc.gridwidth = gridwidth;
		gc.gridheight = gridheight;
		gc.anchor = align;
		gc.insets = insets;
		return;
	}

}
