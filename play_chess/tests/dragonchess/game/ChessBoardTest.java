package dragonchess.game;

import junit.framework.TestCase;
import java.awt.Color;
import java.util.List;
import dragonchess.game.listeners.DrawListener;
import dragonchess.gui.ChessBoardSquare;
import dragonchess.game.commands.CastleCommand;
import dragonchess.Main;
import dragonchess.gui.DragonChessMW;
import dragonchess.gui.CapturedPanel;
import dragonchess.pgn.Hit;
import java.util.Map;
import org.junit.*;
import dragonchess.game.commands.MoveCommand;
import static org.junit.Assert.*;

/**
 * The class <code>ChessBoardTest</code> contains tests for the class <code>{@link ChessBoard}</code>.
 *
 * @generatedBy CodePro at 3/19/09 10:20 PM
 * @author Owner
 * @version $Revision: 1.0 $
 */
public class ChessBoardTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see ChessBoard
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	private ChessBoard fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ChessBoard
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	public ChessBoard getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		}
		return fixture;
	}

	/**
	 * Run the ChessBoard() constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testChessBoard_1()
		throws Exception {

		ChessBoard result = new ChessBoard();

		// add additional test code here
		assertNotNull(result);
		assertEquals("a8[     ]b8[     ]c8[     ]d8[     ]e8[     ]f8[     ]g8[     ]h8[     ]\na7[     ]b7[     ]c7[     ]d7[     ]e7[     ]f7[     ]g7[     ]h7[     ]\na6[     ]b6[     ]c6[     ]d6[     ]e6[     ]f6[     ]g6[     ]h6[     ]\na5[     ]b5[     ]c5[     ]d5[     ]e5[     ]f5[     ]g5[     ]h5[     ]\na4[     ]b4[     ]c4[     ]d4[     ]e4[     ]f4[     ]g4[     ]h4[     ]\na3[     ]b3[     ]c3[     ]d3[     ]e3[     ]f3[     ]g3[     ]h3[     ]\na2[     ]b2[     ]c2[     ]d2[     ]e2[     ]f2[     ]g2[     ]h2[     ]\na1[     ]b1[     ]c1[     ]d1[     ]e1[     ]f1[     ]g1[     ]h1[     ]\n", result.toString());
	}

	/**
	 * Run the ChessBoard(Square[]) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testChessBoard_2()
		throws Exception {
		Square[] squares = new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null};

		ChessBoard result = new ChessBoard(squares);

		// add additional test code here
		assertNotNull(result);
		assertEquals("nullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\n", result.toString());
	}

	/**
	 * Run the ChessBoard(Square[]) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testChessBoard_3()
		throws Exception {
		Square[] squares = new Square[] {new Square(Position.A1)};

		ChessBoard result = new ChessBoard(squares);

		// add additional test code here
		assertNotNull(result);
		assertEquals("nullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\n", result.toString());
	}

	/**
	 * Run the ChessBoard(Square[]) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testChessBoard_4()
		throws Exception {
		Square[] squares = new Square[] {new Square(Position.A1, new Bishop())};

		ChessBoard result = new ChessBoard(squares);

		// add additional test code here
		assertNotNull(result);
		assertEquals("nullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\n", result.toString());
	}

	/**
	 * Run the ChessBoard(Square[]) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testChessBoard_5()
		throws Exception {
		Square[] squares = new Square[] {new Square(Position.A2, new Bishop(GamePieceColor.Black))};

		ChessBoard result = new ChessBoard(squares);

		// add additional test code here
		assertNotNull(result);
		assertEquals("nullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\n", result.toString());
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_1()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A1;
		DrawListener listener = new CapturedPanel(new DragonChessMW(new Main()), GamePieceColor.Black);

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_2()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A2;
		DrawListener listener = new CapturedPanel((DragonChessMW) null, GamePieceColor.NULL);

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.gui.CapturedPanel.updatePieces(CapturedPanel.java:44)
		//       at dragonchess.gui.CapturedPanel.<init>(CapturedPanel.java:31)
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_3()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A3;
		DrawListener listener = new ChessBoardSquare(Color.BLACK, new Square(Position.A1));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_4()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A4;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_5()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A5;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_6()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A6;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_7()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A7;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_8()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A8;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_9()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B1;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_10()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B2;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_11()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B3;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_12()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B4;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_13()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B5;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_14()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B6;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_15()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B7;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_16()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B8;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_17()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C1;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_18()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C2;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_19()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C3;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_20()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C4;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_21()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C5;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_22()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C6;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_23()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C7;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_24()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C8;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_25()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D1;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_26()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D2;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_27()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D3;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_28()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D4;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_29()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D5;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the void addDrawListener(Position,DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testAddDrawListener_fixture_30()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D6;
		DrawListener listener = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.addDrawListener(pose, listener);

		// add additional test code here
	}

	/**
	 * Run the List<GamePiece> getBlackCaptured() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetBlackCaptured_fixture_1()
		throws Exception {
		ChessBoard fixture2 = getFixture();

		List<GamePiece> result = fixture2.getBlackCaptured();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_1()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A1;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_2()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A2;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_3()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A3;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_4()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A4;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_5()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A5;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_6()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A6;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_7()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A7;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_8()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A8;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_9()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B1;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_10()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B2;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_11()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B3;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_12()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B4;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_13()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B5;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_14()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B6;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_15()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B7;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_16()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B8;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_17()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C1;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_18()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C2;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_19()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C3;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_20()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C4;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_21()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C5;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_22()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C6;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_23()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C7;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_24()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C8;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_25()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D1;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_26()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D2;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_27()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D3;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_28()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D4;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_29()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D5;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GamePiece getGamePiece(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiece_fixture_30()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D6;

		GamePiece result = fixture2.getGamePiece(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Map<GamePieceSAN, GamePiece> getGamePieces() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePieces_fixture_1()
		throws Exception {
		ChessBoard fixture2 = getFixture();

		Map<GamePieceSAN, GamePiece> result = fixture2.getGamePieces();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the GamePiece[] getGamePiecesArray() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetGamePiecesArray_fixture_1()
		throws Exception {
		ChessBoard fixture2 = getFixture();

		GamePiece[] result = fixture2.getGamePiecesArray();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the Hit getHit() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetHit_fixture_1()
		throws Exception {
		ChessBoard fixture2 = getFixture();

		Hit result = fixture2.getHit();

		// add additional test code here
		assertNotNull(result);
		assertEquals("  4. null null", result.toString());
		assertEquals(4, result.getNumber());
		assertEquals(null, result.getWhiteMove());
		assertEquals(null, result.getBlackMove());
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_1()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.A1;
		Direction direction = Direction.E;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.size());
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_2()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.A2;
		Direction direction = Direction.ENE;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_3()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.A3;
		Direction direction = Direction.ESE;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_4()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.A4;
		Direction direction = Direction.N;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.size());
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_5()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.A5;
		Direction direction = Direction.NE;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_6()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.A6;
		Direction direction = Direction.NNE;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_7()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.A7;
		Direction direction = Direction.NNW;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_8()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.A8;
		Direction direction = Direction.NW;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_9()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.B1;
		Direction direction = Direction.S;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_10()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.B2;
		Direction direction = Direction.SE;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_11()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.B3;
		Direction direction = Direction.SSE;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_12()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.B4;
		Direction direction = Direction.SSW;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_13()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.B5;
		Direction direction = Direction.SW;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_14()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.B6;
		Direction direction = Direction.W;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_15()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.B7;
		Direction direction = Direction.WNW;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_16()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.B8;
		Direction direction = Direction.WSW;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_17()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.C1;
		Direction direction = Direction.WSW;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_18()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.C2;
		Direction direction = Direction.WSW;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_19()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.C3;
		Direction direction = Direction.WSW;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_20()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.C4;
		Direction direction = Direction.WSW;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_21()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.C5;
		Direction direction = Direction.WSW;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_22()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.C6;
		Direction direction = Direction.WSW;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_23()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.C7;
		Direction direction = Direction.WSW;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_24()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.C8;
		Direction direction = Direction.WSW;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_25()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.D1;
		Direction direction = Direction.WSW;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_26()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.D2;
		Direction direction = Direction.WSW;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_27()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.D3;
		Direction direction = Direction.WSW;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_28()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.D4;
		Direction direction = Direction.WSW;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_29()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.D5;
		Direction direction = Direction.WSW;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Position> getRay(Position,Direction) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetRay_fixture_30()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position position = Position.D6;
		Direction direction = Direction.WSW;

		List<Position> result = fixture2.getRay(position, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_1()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A1;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_2()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A2;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_3()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A3;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_4()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A4;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_5()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A5;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_6()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A6;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_7()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A7;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_8()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A8;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_9()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B1;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_10()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B2;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_11()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B3;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_12()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B4;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_13()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B5;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_14()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B6;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_15()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B7;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_16()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B8;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_17()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C1;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_18()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C2;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_19()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C3;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_20()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C4;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_21()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C5;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_22()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C6;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_23()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C7;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_24()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C8;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_25()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D1;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_26()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D2;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_27()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D3;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_28()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D4;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_29()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D5;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Square getSquare(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquare_fixture_30()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D6;

		Square result = fixture2.getSquare(pose);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Map<Position, Square> getSquares() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetSquares_fixture_1()
		throws Exception {
		ChessBoard fixture2 = getFixture();

		Map<Position, Square> result = fixture2.getSquares();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<GamePiece> getWhiteCaptured() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testGetWhiteCaptured_fixture_1()
		throws Exception {
		ChessBoard fixture2 = getFixture();

		List<GamePiece> result = fixture2.getWhiteCaptured();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the boolean isPlayerInCheck(GamePieceColor) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testIsPlayerInCheck_fixture_1()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		GamePieceColor color = GamePieceColor.Black;

		boolean result = fixture2.isPlayerInCheck(color);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPlayerInCheck(GamePieceColor) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testIsPlayerInCheck_fixture_2()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		GamePieceColor color = GamePieceColor.NULL;

		boolean result = fixture2.isPlayerInCheck(color);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPlayerInCheck(GamePieceColor) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testIsPlayerInCheck_fixture_3()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		GamePieceColor color = GamePieceColor.White;

		boolean result = fixture2.isPlayerInCheck(color);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void move(UndoableCommand) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testMove_fixture_1()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		UndoableCommand command = new CastleCommand(new King(), Position.A1, new MoveCommand(new Bishop(), Position.A1));

		fixture2.move(command);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.getPosition(GamePiece.java:55)
		//       at dragonchess.game.commands.MoveCommand.<init>(MoveCommand.java:32)
	}

	/**
	 * Run the void move(UndoableCommand) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testMove_fixture_2()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		UndoableCommand command = new CastleCommand(new King(GamePieceColor.Black), Position.A2, new MoveCommand(new Bishop(GamePieceColor.Black), Position.A2));

		fixture2.move(command);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.getPosition(GamePiece.java:55)
		//       at dragonchess.game.commands.MoveCommand.<init>(MoveCommand.java:32)
	}

	/**
	 * Run the void move(UndoableCommand) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testMove_fixture_3()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		UndoableCommand command = new CastleCommand((King) null, Position.A3, (MoveCommand) null);

		fixture2.move(command);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.commands.MoveCommand.<init>(MoveCommand.java:32)
		//       at dragonchess.game.commands.CastleCommand.<init>(CastleCommand.java:19)
	}

	/**
	 * Run the void move(UndoableCommand) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testMove_fixture_4()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		UndoableCommand command = new MoveCommand(new Bishop(), Position.A1);

		fixture2.move(command);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.getPosition(GamePiece.java:55)
		//       at dragonchess.game.commands.MoveCommand.<init>(MoveCommand.java:32)
	}

	/**
	 * Run the void move(UndoableCommand) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testMove_fixture_5()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		UndoableCommand command = new MoveCommand(new Bishop(GamePieceColor.Black), Position.A2);

		fixture2.move(command);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.getPosition(GamePiece.java:55)
		//       at dragonchess.game.commands.MoveCommand.<init>(MoveCommand.java:32)
	}

	/**
	 * Run the void peek(UndoableCommand) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testPeek_fixture_1()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		UndoableCommand command = new CastleCommand(new King(), Position.A1, new MoveCommand(new Bishop(), Position.A1));

		fixture2.peek(command);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.getPosition(GamePiece.java:55)
		//       at dragonchess.game.commands.MoveCommand.<init>(MoveCommand.java:32)
	}

	/**
	 * Run the void peek(UndoableCommand) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testPeek_fixture_2()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		UndoableCommand command = new CastleCommand(new King(GamePieceColor.Black), Position.A2, new MoveCommand(new Bishop(GamePieceColor.Black), Position.A2));

		fixture2.peek(command);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.getPosition(GamePiece.java:55)
		//       at dragonchess.game.commands.MoveCommand.<init>(MoveCommand.java:32)
	}

	/**
	 * Run the void peek(UndoableCommand) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testPeek_fixture_3()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		UndoableCommand command = new CastleCommand((King) null, Position.A3, (MoveCommand) null);

		fixture2.peek(command);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.commands.MoveCommand.<init>(MoveCommand.java:32)
		//       at dragonchess.game.commands.CastleCommand.<init>(CastleCommand.java:19)
	}

	/**
	 * Run the void peek(UndoableCommand) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testPeek_fixture_4()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		UndoableCommand command = new MoveCommand(new Bishop(), Position.A1);

		fixture2.peek(command);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.getPosition(GamePiece.java:55)
		//       at dragonchess.game.commands.MoveCommand.<init>(MoveCommand.java:32)
	}

	/**
	 * Run the void peek(UndoableCommand) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testPeek_fixture_5()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		UndoableCommand command = new MoveCommand(new Bishop(GamePieceColor.Black), Position.A2);

		fixture2.peek(command);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.getPosition(GamePiece.java:55)
		//       at dragonchess.game.commands.MoveCommand.<init>(MoveCommand.java:32)
	}

	/**
	 * Run the void peekUndo() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testPeekUndo_fixture_1()
		throws Exception {
		ChessBoard fixture2 = getFixture();

		fixture2.peekUndo();

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_1()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A1;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_2()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A2;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_3()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A3;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_4()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A4;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_5()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A5;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_6()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A6;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_7()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A7;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_8()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.A8;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_9()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B1;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_10()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B2;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_11()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B3;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_12()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B4;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_13()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B5;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_14()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B6;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_15()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B7;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_16()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.B8;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_17()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C1;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_18()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C2;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_19()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C3;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_20()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C4;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_21()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C5;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_22()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C6;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_23()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C7;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_24()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.C8;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_25()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D1;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_26()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D2;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_27()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D3;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_28()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D4;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_29()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D5;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void removeDrawListener(Position) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testRemoveDrawListener_fixture_30()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Position pose = Position.D6;

		fixture2.removeDrawListener(pose);

		// add additional test code here
	}

	/**
	 * Run the void setBlackCaptureListener(DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetBlackCaptureListener_fixture_1()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		DrawListener black = new CapturedPanel(new DragonChessMW(new Main()), GamePieceColor.Black);

		fixture2.setBlackCaptureListener(black);

		// add additional test code here
	}

	/**
	 * Run the void setBlackCaptureListener(DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetBlackCaptureListener_fixture_2()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		DrawListener black = new CapturedPanel((DragonChessMW) null, GamePieceColor.NULL);

		fixture2.setBlackCaptureListener(black);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.gui.CapturedPanel.updatePieces(CapturedPanel.java:44)
		//       at dragonchess.gui.CapturedPanel.<init>(CapturedPanel.java:31)
	}

	/**
	 * Run the void setBlackCaptureListener(DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetBlackCaptureListener_fixture_3()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		DrawListener black = new ChessBoardSquare(Color.BLACK, new Square(Position.A1));

		fixture2.setBlackCaptureListener(black);

		// add additional test code here
	}

	/**
	 * Run the void setBlackCaptureListener(DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetBlackCaptureListener_fixture_4()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		DrawListener black = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.setBlackCaptureListener(black);

		// add additional test code here
	}

	/**
	 * Run the void setGamePieces(GamePiece[]) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetGamePieces_fixture_1()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		GamePiece[] pieces = new GamePiece[] {new Bishop(), new Bishop(GamePieceColor.Black), new King(), new King(GamePieceColor.Black), new Knight(), new Knight(GamePieceColor.Black), new Pawn(), new Pawn(GamePieceColor.Black), new Queen(), new Queen(GamePieceColor.Black)};

		fixture2.setGamePieces(pieces);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.put(Unknown Source)
		//       at dragonchess.game.ChessBoard.setGamePieces(ChessBoard.java:197)
	}

	/**
	 * Run the void setGamePieces(GamePiece[]) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetGamePieces_fixture_2()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		GamePiece[] pieces = new GamePiece[] {new Bishop()};

		fixture2.setGamePieces(pieces);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.put(Unknown Source)
		//       at dragonchess.game.ChessBoard.setGamePieces(ChessBoard.java:197)
	}

	/**
	 * Run the void setGamePieces(GamePiece[]) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetGamePieces_fixture_3()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		GamePiece[] pieces = new GamePiece[] {new Bishop(GamePieceColor.Black)};

		fixture2.setGamePieces(pieces);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.put(Unknown Source)
		//       at dragonchess.game.ChessBoard.setGamePieces(ChessBoard.java:197)
	}

	/**
	 * Run the void setGamePieces(GamePiece[]) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetGamePieces_fixture_4()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		GamePiece[] pieces = new GamePiece[] {new King()};

		fixture2.setGamePieces(pieces);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.put(Unknown Source)
		//       at dragonchess.game.ChessBoard.setGamePieces(ChessBoard.java:197)
	}

	/**
	 * Run the void setGamePieces(GamePiece[]) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetGamePieces_fixture_5()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		GamePiece[] pieces = new GamePiece[] {new King(GamePieceColor.Black)};

		fixture2.setGamePieces(pieces);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.put(Unknown Source)
		//       at dragonchess.game.ChessBoard.setGamePieces(ChessBoard.java:197)
	}

	/**
	 * Run the void setGamePieces(GamePiece[]) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetGamePieces_fixture_6()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		GamePiece[] pieces = new GamePiece[] {new Knight()};

		fixture2.setGamePieces(pieces);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.put(Unknown Source)
		//       at dragonchess.game.ChessBoard.setGamePieces(ChessBoard.java:197)
	}

	/**
	 * Run the void setGamePieces(GamePiece[]) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetGamePieces_fixture_7()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		GamePiece[] pieces = new GamePiece[] {new Knight(GamePieceColor.Black)};

		fixture2.setGamePieces(pieces);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.put(Unknown Source)
		//       at dragonchess.game.ChessBoard.setGamePieces(ChessBoard.java:197)
	}

	/**
	 * Run the void setGamePieces(GamePiece[]) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetGamePieces_fixture_8()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		GamePiece[] pieces = new GamePiece[] {new Pawn()};

		fixture2.setGamePieces(pieces);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.ChessBoard.setGamePieces(ChessBoard.java:199)
	}

	/**
	 * Run the void setGamePieces(GamePiece[]) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetGamePieces_fixture_9()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		GamePiece[] pieces = new GamePiece[] {new Pawn(GamePieceColor.Black)};

		fixture2.setGamePieces(pieces);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.ChessBoard.setGamePieces(ChessBoard.java:199)
	}

	/**
	 * Run the void setGamePieces(GamePiece[]) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetGamePieces_fixture_10()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		GamePiece[] pieces = new GamePiece[] {new Queen()};

		fixture2.setGamePieces(pieces);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.put(Unknown Source)
		//       at dragonchess.game.ChessBoard.setGamePieces(ChessBoard.java:197)
	}

	/**
	 * Run the void setGamePieces(GamePiece[]) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetGamePieces_fixture_11()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		GamePiece[] pieces = new GamePiece[] {new Queen(GamePieceColor.Black)};

		fixture2.setGamePieces(pieces);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.put(Unknown Source)
		//       at dragonchess.game.ChessBoard.setGamePieces(ChessBoard.java:197)
	}

	/**
	 * Run the void setSquares(Map<Position,Square>) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetSquares_fixture_1()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Map<Position, Square> squares = null;

		fixture2.setSquares(squares);

		// add additional test code here
	}

	/**
	 * Run the void setSquares(Square[]) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetSquares_fixture_2()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Square[] squares = new Square[] {new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1), new Square(Position.A1)};

		fixture2.setSquares(squares);

		// add additional test code here
	}

	/**
	 * Run the void setSquares(Square[]) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetSquares_fixture_3()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		Square[] squares = new Square[] {};

		fixture2.setSquares(squares);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteCaptureListener(DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetWhiteCaptureListener_fixture_1()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		DrawListener white = new CapturedPanel(new DragonChessMW(new Main()), GamePieceColor.Black);

		fixture2.setWhiteCaptureListener(white);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteCaptureListener(DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetWhiteCaptureListener_fixture_2()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		DrawListener white = new CapturedPanel((DragonChessMW) null, GamePieceColor.NULL);

		fixture2.setWhiteCaptureListener(white);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.gui.CapturedPanel.updatePieces(CapturedPanel.java:44)
		//       at dragonchess.gui.CapturedPanel.<init>(CapturedPanel.java:31)
	}

	/**
	 * Run the void setWhiteCaptureListener(DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetWhiteCaptureListener_fixture_3()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		DrawListener white = new ChessBoardSquare(Color.BLACK, new Square(Position.A1));

		fixture2.setWhiteCaptureListener(white);

		// add additional test code here
	}

	/**
	 * Run the void setWhiteCaptureListener(DrawListener) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testSetWhiteCaptureListener_fixture_4()
		throws Exception {
		ChessBoard fixture2 = getFixture();
		DrawListener white = new ChessBoardSquare(Color.BLUE, new Square(Position.A1, new Bishop()));

		fixture2.setWhiteCaptureListener(white);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testToString_fixture_1()
		throws Exception {
		ChessBoard fixture2 = getFixture();

		String result = fixture2.toString();

		// add additional test code here
		assertEquals("nullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\nnullnullnullnullnullnullnullnull\n", result);
	}

	/**
	 * Run the void undo() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Test
	public void testUndo_fixture_1()
		throws Exception {
		ChessBoard fixture2 = getFixture();

		fixture2.undo();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/19/09 10:20 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ChessBoardTest.class);
	}
}
