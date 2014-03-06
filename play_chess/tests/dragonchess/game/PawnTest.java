package dragonchess.game;

import junit.framework.TestCase;
import java.util.Collection;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PawnTest</code> contains tests for the class <code>{@link Pawn}</code>.
 *
 * @generatedBy CodePro at 3/19/09 10:36 PM
 * @author Owner
 * @version $Revision: 1.0 $
 */
public class PawnTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	private Pawn fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	private Pawn fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	private Pawn fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	private Pawn fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	private Pawn fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	private Pawn fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	private Pawn fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	private Pawn fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	private Pawn fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	private Pawn fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	private Pawn fixture11;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	private Pawn fixture12;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	private Pawn fixture13;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	public Pawn getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new Pawn();
			fixture1.setEnPassant(EnPassant.Left);
			fixture1.setPassed(false);
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	public Pawn getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new Pawn();
			fixture2.setEnPassant(EnPassant.Left);
			fixture2.setPassed(true);
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	public Pawn getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new Pawn();
			fixture3.setEnPassant(EnPassant.None);
			fixture3.setPassed(false);
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	public Pawn getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new Pawn();
			fixture4.setEnPassant(EnPassant.None);
			fixture4.setPassed(true);
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	public Pawn getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new Pawn();
			fixture5.setEnPassant(EnPassant.Right);
			fixture5.setPassed(false);
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	public Pawn getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new Pawn();
			fixture6.setEnPassant(EnPassant.Right);
			fixture6.setPassed(true);
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	public Pawn getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new Pawn(GamePieceColor.Black);
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	public Pawn getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new Pawn(GamePieceColor.Black);
			fixture8.setEnPassant(EnPassant.Left);
			fixture8.setPassed(false);
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	public Pawn getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new Pawn(GamePieceColor.Black);
			fixture9.setEnPassant(EnPassant.Left);
			fixture9.setPassed(true);
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	public Pawn getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new Pawn(GamePieceColor.Black);
			fixture10.setEnPassant(EnPassant.None);
			fixture10.setPassed(false);
		}
		return fixture10;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	public Pawn getFixture11()
		throws Exception {
		if (fixture11 == null) {
			fixture11 = new Pawn(GamePieceColor.Black);
			fixture11.setEnPassant(EnPassant.None);
			fixture11.setPassed(true);
		}
		return fixture11;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	public Pawn getFixture12()
		throws Exception {
		if (fixture12 == null) {
			fixture12 = new Pawn(GamePieceColor.Black);
			fixture12.setEnPassant(EnPassant.Right);
			fixture12.setPassed(false);
		}
		return fixture12;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Pawn
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	public Pawn getFixture13()
		throws Exception {
		if (fixture13 == null) {
			fixture13 = new Pawn(GamePieceColor.Black);
			fixture13.setEnPassant(EnPassant.Right);
			fixture13.setPassed(true);
		}
		return fixture13;
	}

	/**
	 * Run the Pawn() constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPawn_1()
		throws Exception {

		Pawn result = new Pawn();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isPassed());
		assertEquals("d6", result.toString());
		assertEquals(null, result.getLongCastle());
	}

	/**
	 * Run the Pawn(GamePieceColor) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPawn_2()
		throws Exception {
		GamePieceColor color = GamePieceColor.Black;

		Pawn result = new Pawn(color);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isPassed());
		assertEquals("=d2", result.toString());
		assertEquals(null, result.getLongCastle());
	}

	/**
	 * Run the Pawn(GamePieceColor) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPawn_3()
		throws Exception {
		GamePieceColor color = GamePieceColor.NULL;

		Pawn result = new Pawn(color);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isPassed());
		assertEquals("=d2", result.toString());
		assertEquals(null, result.getLongCastle());
	}

	/**
	 * Run the Pawn(GamePieceColor) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPawn_4()
		throws Exception {
		GamePieceColor color = GamePieceColor.White;

		Pawn result = new Pawn(color);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isPassed());
		assertEquals("=d6", result.toString());
		assertEquals(null, result.getLongCastle());
	}

	/**
	 * Run the void demote() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testDemote_fixture1_1()
		throws Exception {
		Pawn fixture = getFixture1();

		fixture.demote();

		// add additional test code here
	}

	/**
	 * Run the void demote() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testDemote_fixture2_1()
		throws Exception {
		Pawn fixture = getFixture2();

		fixture.demote();

		// add additional test code here
	}

	/**
	 * Run the void demote() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testDemote_fixture3_1()
		throws Exception {
		Pawn fixture = getFixture3();

		fixture.demote();

		// add additional test code here
	}

	/**
	 * Run the void demote() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testDemote_fixture4_1()
		throws Exception {
		Pawn fixture = getFixture4();

		fixture.demote();

		// add additional test code here
	}

	/**
	 * Run the void demote() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testDemote_fixture5_1()
		throws Exception {
		Pawn fixture = getFixture5();

		fixture.demote();

		// add additional test code here
	}

	/**
	 * Run the void demote() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testDemote_fixture6_1()
		throws Exception {
		Pawn fixture = getFixture6();

		fixture.demote();

		// add additional test code here
	}

	/**
	 * Run the void demote() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testDemote_fixture7_1()
		throws Exception {
		Pawn fixture = getFixture7();

		fixture.demote();

		// add additional test code here
	}

	/**
	 * Run the void demote() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testDemote_fixture8_1()
		throws Exception {
		Pawn fixture = getFixture8();

		fixture.demote();

		// add additional test code here
	}

	/**
	 * Run the void demote() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testDemote_fixture9_1()
		throws Exception {
		Pawn fixture = getFixture9();

		fixture.demote();

		// add additional test code here
	}

	/**
	 * Run the void demote() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testDemote_fixture10_1()
		throws Exception {
		Pawn fixture = getFixture10();

		fixture.demote();

		// add additional test code here
	}

	/**
	 * Run the void demote() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testDemote_fixture11_1()
		throws Exception {
		Pawn fixture = getFixture11();

		fixture.demote();

		// add additional test code here
	}

	/**
	 * Run the void demote() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testDemote_fixture12_1()
		throws Exception {
		Pawn fixture = getFixture12();

		fixture.demote();

		// add additional test code here
	}

	/**
	 * Run the void demote() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testDemote_fixture13_1()
		throws Exception {
		Pawn fixture = getFixture13();

		fixture.demote();

		// add additional test code here
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture1_1()
		throws Exception {
		Pawn fixture = getFixture1();
		ChessBoard board = new ChessBoard();

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture2_1()
		throws Exception {
		Pawn fixture = getFixture2();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.Pawn.getPotentialMoves(Pawn.java:215)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture3_1()
		throws Exception {
		Pawn fixture = getFixture3();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.Pawn.getPotentialMoves(Pawn.java:215)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture4_1()
		throws Exception {
		Pawn fixture = getFixture4();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.Pawn.getPotentialMoves(Pawn.java:215)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture5_1()
		throws Exception {
		Pawn fixture = getFixture5();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.Pawn.getPotentialMoves(Pawn.java:215)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture6_1()
		throws Exception {
		Pawn fixture = getFixture6();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.Pawn.getPotentialMoves(Pawn.java:215)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture7_1()
		throws Exception {
		Pawn fixture = getFixture7();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.get(Unknown Source)
		//       at dragonchess.game.ChessBoard.getSquare(ChessBoard.java:114)
		//       at dragonchess.game.Pawn.getPotentialMoves(Pawn.java:207)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture8_1()
		throws Exception {
		Pawn fixture = getFixture8();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.get(Unknown Source)
		//       at dragonchess.game.ChessBoard.getSquare(ChessBoard.java:114)
		//       at dragonchess.game.Pawn.getPotentialMoves(Pawn.java:207)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture9_1()
		throws Exception {
		Pawn fixture = getFixture9();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.get(Unknown Source)
		//       at dragonchess.game.ChessBoard.getSquare(ChessBoard.java:114)
		//       at dragonchess.game.Pawn.getPotentialMoves(Pawn.java:207)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture10_1()
		throws Exception {
		Pawn fixture = getFixture10();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.get(Unknown Source)
		//       at dragonchess.game.ChessBoard.getSquare(ChessBoard.java:114)
		//       at dragonchess.game.Pawn.getPotentialMoves(Pawn.java:207)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture11_1()
		throws Exception {
		Pawn fixture = getFixture11();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.get(Unknown Source)
		//       at dragonchess.game.ChessBoard.getSquare(ChessBoard.java:114)
		//       at dragonchess.game.Pawn.getPotentialMoves(Pawn.java:207)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture12_1()
		throws Exception {
		Pawn fixture = getFixture12();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.get(Unknown Source)
		//       at dragonchess.game.ChessBoard.getSquare(ChessBoard.java:114)
		//       at dragonchess.game.Pawn.getPotentialMoves(Pawn.java:207)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture13_1()
		throws Exception {
		Pawn fixture = getFixture13();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.get(Unknown Source)
		//       at dragonchess.game.ChessBoard.getSquare(ChessBoard.java:114)
		//       at dragonchess.game.Pawn.getPotentialMoves(Pawn.java:207)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture2_2()
		throws Exception {
		Pawn fixture = getFixture2();
		ChessBoard board = new ChessBoard();

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture3_2()
		throws Exception {
		Pawn fixture = getFixture3();
		ChessBoard board = new ChessBoard();

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture4_2()
		throws Exception {
		Pawn fixture = getFixture4();
		ChessBoard board = new ChessBoard();

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture5_2()
		throws Exception {
		Pawn fixture = getFixture5();
		ChessBoard board = new ChessBoard();

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture6_2()
		throws Exception {
		Pawn fixture = getFixture6();
		ChessBoard board = new ChessBoard();

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture7_2()
		throws Exception {
		Pawn fixture = getFixture7();
		ChessBoard board = new ChessBoard();

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.get(Unknown Source)
		//       at dragonchess.game.ChessBoard.getSquare(ChessBoard.java:114)
		//       at dragonchess.game.Pawn.getPotentialMoves(Pawn.java:207)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture8_2()
		throws Exception {
		Pawn fixture = getFixture8();
		ChessBoard board = new ChessBoard();

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.get(Unknown Source)
		//       at dragonchess.game.ChessBoard.getSquare(ChessBoard.java:114)
		//       at dragonchess.game.Pawn.getPotentialMoves(Pawn.java:207)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture9_2()
		throws Exception {
		Pawn fixture = getFixture9();
		ChessBoard board = new ChessBoard();

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.get(Unknown Source)
		//       at dragonchess.game.ChessBoard.getSquare(ChessBoard.java:114)
		//       at dragonchess.game.Pawn.getPotentialMoves(Pawn.java:207)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture10_2()
		throws Exception {
		Pawn fixture = getFixture10();
		ChessBoard board = new ChessBoard();

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.get(Unknown Source)
		//       at dragonchess.game.ChessBoard.getSquare(ChessBoard.java:114)
		//       at dragonchess.game.Pawn.getPotentialMoves(Pawn.java:207)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture11_2()
		throws Exception {
		Pawn fixture = getFixture11();
		ChessBoard board = new ChessBoard();

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.get(Unknown Source)
		//       at dragonchess.game.ChessBoard.getSquare(ChessBoard.java:114)
		//       at dragonchess.game.Pawn.getPotentialMoves(Pawn.java:207)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture12_2()
		throws Exception {
		Pawn fixture = getFixture12();
		ChessBoard board = new ChessBoard();

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.get(Unknown Source)
		//       at dragonchess.game.ChessBoard.getSquare(ChessBoard.java:114)
		//       at dragonchess.game.Pawn.getPotentialMoves(Pawn.java:207)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture13_2()
		throws Exception {
		Pawn fixture = getFixture13();
		ChessBoard board = new ChessBoard();

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.Hashtable.get(Unknown Source)
		//       at dragonchess.game.ChessBoard.getSquare(ChessBoard.java:114)
		//       at dragonchess.game.Pawn.getPotentialMoves(Pawn.java:207)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture1_2()
		throws Exception {
		Pawn fixture = getFixture1();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.Pawn.getPotentialMoves(Pawn.java:215)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isPassed() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsPassed_fixture1_1()
		throws Exception {
		Pawn fixture = getFixture1();

		boolean result = fixture.isPassed();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPassed() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsPassed_fixture2_1()
		throws Exception {
		Pawn fixture = getFixture2();

		boolean result = fixture.isPassed();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPassed() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsPassed_fixture3_1()
		throws Exception {
		Pawn fixture = getFixture3();

		boolean result = fixture.isPassed();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPassed() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsPassed_fixture4_1()
		throws Exception {
		Pawn fixture = getFixture4();

		boolean result = fixture.isPassed();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPassed() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsPassed_fixture5_1()
		throws Exception {
		Pawn fixture = getFixture5();

		boolean result = fixture.isPassed();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPassed() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsPassed_fixture6_1()
		throws Exception {
		Pawn fixture = getFixture6();

		boolean result = fixture.isPassed();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPassed() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsPassed_fixture7_1()
		throws Exception {
		Pawn fixture = getFixture7();

		boolean result = fixture.isPassed();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPassed() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsPassed_fixture8_1()
		throws Exception {
		Pawn fixture = getFixture8();

		boolean result = fixture.isPassed();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPassed() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsPassed_fixture9_1()
		throws Exception {
		Pawn fixture = getFixture9();

		boolean result = fixture.isPassed();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPassed() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsPassed_fixture10_1()
		throws Exception {
		Pawn fixture = getFixture10();

		boolean result = fixture.isPassed();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPassed() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsPassed_fixture11_1()
		throws Exception {
		Pawn fixture = getFixture11();

		boolean result = fixture.isPassed();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPassed() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsPassed_fixture12_1()
		throws Exception {
		Pawn fixture = getFixture12();

		boolean result = fixture.isPassed();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPassed() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsPassed_fixture13_1()
		throws Exception {
		Pawn fixture = getFixture13();

		boolean result = fixture.isPassed();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture1_1()
		throws Exception {
		Pawn fixture = getFixture1();
		ChessBoard board = new ChessBoard();
		Square toSquare = new Square(Position.A1);

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture2_1()
		throws Exception {
		Pawn fixture = getFixture2();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A1, new Bishop());

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture4_1()
		throws Exception {
		Pawn fixture = getFixture4();
		ChessBoard board = new ChessBoard();
		Square toSquare = new Square(Position.A2, new Bishop(GamePieceColor.Black));

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture5_1()
		throws Exception {
		Pawn fixture = getFixture5();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A2, new Bishop(GamePieceColor.Black));

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture6_1()
		throws Exception {
		Pawn fixture = getFixture6();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A2, new Bishop(GamePieceColor.Black));

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture7_1()
		throws Exception {
		Pawn fixture = getFixture7();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A2, new Bishop(GamePieceColor.Black));

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture8_1()
		throws Exception {
		Pawn fixture = getFixture8();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A2, new Bishop(GamePieceColor.Black));

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture9_1()
		throws Exception {
		Pawn fixture = getFixture9();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A2, new Bishop(GamePieceColor.Black));

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture10_1()
		throws Exception {
		Pawn fixture = getFixture10();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A2, new Bishop(GamePieceColor.Black));

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture11_1()
		throws Exception {
		Pawn fixture = getFixture11();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A2, new Bishop(GamePieceColor.Black));

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture12_1()
		throws Exception {
		Pawn fixture = getFixture12();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A2, new Bishop(GamePieceColor.Black));

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture13_1()
		throws Exception {
		Pawn fixture = getFixture13();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A2, new Bishop(GamePieceColor.Black));

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture1_2()
		throws Exception {
		Pawn fixture = getFixture1();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A2, new Bishop(GamePieceColor.Black));

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture3_1()
		throws Exception {
		Pawn fixture = getFixture3();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A1);

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture5_2()
		throws Exception {
		Pawn fixture = getFixture5();
		ChessBoard board = new ChessBoard();
		Square toSquare = new Square(Position.A1, new Bishop());

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture6_2()
		throws Exception {
		Pawn fixture = getFixture6();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A1, new Bishop());

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture7_2()
		throws Exception {
		Pawn fixture = getFixture7();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A1, new Bishop());

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture8_2()
		throws Exception {
		Pawn fixture = getFixture8();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A1, new Bishop());

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture9_2()
		throws Exception {
		Pawn fixture = getFixture9();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A1, new Bishop());

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture10_2()
		throws Exception {
		Pawn fixture = getFixture10();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A1, new Bishop());

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture11_2()
		throws Exception {
		Pawn fixture = getFixture11();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A1, new Bishop());

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture12_2()
		throws Exception {
		Pawn fixture = getFixture12();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A1, new Bishop());

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture13_2()
		throws Exception {
		Pawn fixture = getFixture13();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A1, new Bishop());

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture1_3()
		throws Exception {
		Pawn fixture = getFixture1();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A1, new Bishop());

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture2_2()
		throws Exception {
		Pawn fixture = getFixture2();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A2, new Bishop(GamePieceColor.Black));

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture4_2()
		throws Exception {
		Pawn fixture = getFixture4();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});
		Square toSquare = new Square(Position.A1);

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture6_3()
		throws Exception {
		Pawn fixture = getFixture6();
		ChessBoard board = new ChessBoard();
		Square toSquare = new Square(Position.A1, new Bishop());

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture8_3()
		throws Exception {
		Pawn fixture = getFixture8();
		ChessBoard board = new ChessBoard();
		Square toSquare = new Square(Position.A1);

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture9_3()
		throws Exception {
		Pawn fixture = getFixture9();
		ChessBoard board = new ChessBoard();
		Square toSquare = new Square(Position.A1);

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isValidMove(ChessBoard,Square) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testIsValidMove_fixture10_3()
		throws Exception {
		Pawn fixture = getFixture10();
		ChessBoard board = new ChessBoard();
		Square toSquare = new Square(Position.A1);

		boolean result = fixture.isValidMove(board, toSquare);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture1_1()
		throws Exception {
		Pawn fixture = getFixture1();
		GamePieceType toType = GamePieceType.Bishop;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture2_1()
		throws Exception {
		Pawn fixture = getFixture2();
		GamePieceType toType = GamePieceType.Empty;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture3_1()
		throws Exception {
		Pawn fixture = getFixture3();
		GamePieceType toType = GamePieceType.King;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture4_1()
		throws Exception {
		Pawn fixture = getFixture4();
		GamePieceType toType = GamePieceType.Knight;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture5_1()
		throws Exception {
		Pawn fixture = getFixture5();
		GamePieceType toType = GamePieceType.Pawn;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture6_1()
		throws Exception {
		Pawn fixture = getFixture6();
		GamePieceType toType = GamePieceType.Queen;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture7_1()
		throws Exception {
		Pawn fixture = getFixture7();
		GamePieceType toType = GamePieceType.Rook;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture8_1()
		throws Exception {
		Pawn fixture = getFixture8();
		GamePieceType toType = GamePieceType.Rook;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture9_1()
		throws Exception {
		Pawn fixture = getFixture9();
		GamePieceType toType = GamePieceType.Rook;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture10_1()
		throws Exception {
		Pawn fixture = getFixture10();
		GamePieceType toType = GamePieceType.Rook;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture11_1()
		throws Exception {
		Pawn fixture = getFixture11();
		GamePieceType toType = GamePieceType.Rook;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture12_1()
		throws Exception {
		Pawn fixture = getFixture12();
		GamePieceType toType = GamePieceType.Rook;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture13_1()
		throws Exception {
		Pawn fixture = getFixture13();
		GamePieceType toType = GamePieceType.Rook;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture2_2()
		throws Exception {
		Pawn fixture = getFixture2();
		GamePieceType toType = GamePieceType.Bishop;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture3_2()
		throws Exception {
		Pawn fixture = getFixture3();
		GamePieceType toType = GamePieceType.Empty;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture4_2()
		throws Exception {
		Pawn fixture = getFixture4();
		GamePieceType toType = GamePieceType.King;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture5_2()
		throws Exception {
		Pawn fixture = getFixture5();
		GamePieceType toType = GamePieceType.Knight;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture6_2()
		throws Exception {
		Pawn fixture = getFixture6();
		GamePieceType toType = GamePieceType.Pawn;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture7_2()
		throws Exception {
		Pawn fixture = getFixture7();
		GamePieceType toType = GamePieceType.Queen;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture8_2()
		throws Exception {
		Pawn fixture = getFixture8();
		GamePieceType toType = GamePieceType.Queen;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture9_2()
		throws Exception {
		Pawn fixture = getFixture9();
		GamePieceType toType = GamePieceType.Queen;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture10_2()
		throws Exception {
		Pawn fixture = getFixture10();
		GamePieceType toType = GamePieceType.Queen;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture11_2()
		throws Exception {
		Pawn fixture = getFixture11();
		GamePieceType toType = GamePieceType.Queen;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture12_2()
		throws Exception {
		Pawn fixture = getFixture12();
		GamePieceType toType = GamePieceType.Queen;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture13_2()
		throws Exception {
		Pawn fixture = getFixture13();
		GamePieceType toType = GamePieceType.Queen;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture1_2()
		throws Exception {
		Pawn fixture = getFixture1();
		GamePieceType toType = GamePieceType.Rook;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture3_3()
		throws Exception {
		Pawn fixture = getFixture3();
		GamePieceType toType = GamePieceType.Bishop;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture4_3()
		throws Exception {
		Pawn fixture = getFixture4();
		GamePieceType toType = GamePieceType.Empty;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture5_3()
		throws Exception {
		Pawn fixture = getFixture5();
		GamePieceType toType = GamePieceType.King;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void promote(GamePieceType) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testPromote_fixture6_3()
		throws Exception {
		Pawn fixture = getFixture6();
		GamePieceType toType = GamePieceType.Knight;

		fixture.promote(toType);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture1_1()
		throws Exception {
		Pawn fixture = getFixture1();
		EnPassant enPassant = EnPassant.Left;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture2_1()
		throws Exception {
		Pawn fixture = getFixture2();
		EnPassant enPassant = EnPassant.None;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture3_1()
		throws Exception {
		Pawn fixture = getFixture3();
		EnPassant enPassant = EnPassant.Right;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture4_1()
		throws Exception {
		Pawn fixture = getFixture4();
		EnPassant enPassant = EnPassant.Right;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture5_1()
		throws Exception {
		Pawn fixture = getFixture5();
		EnPassant enPassant = EnPassant.Right;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture6_1()
		throws Exception {
		Pawn fixture = getFixture6();
		EnPassant enPassant = EnPassant.Right;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture7_1()
		throws Exception {
		Pawn fixture = getFixture7();
		EnPassant enPassant = EnPassant.Right;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture8_1()
		throws Exception {
		Pawn fixture = getFixture8();
		EnPassant enPassant = EnPassant.Right;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture9_1()
		throws Exception {
		Pawn fixture = getFixture9();
		EnPassant enPassant = EnPassant.Right;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture10_1()
		throws Exception {
		Pawn fixture = getFixture10();
		EnPassant enPassant = EnPassant.Right;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture11_1()
		throws Exception {
		Pawn fixture = getFixture11();
		EnPassant enPassant = EnPassant.Right;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture12_1()
		throws Exception {
		Pawn fixture = getFixture12();
		EnPassant enPassant = EnPassant.Right;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture13_1()
		throws Exception {
		Pawn fixture = getFixture13();
		EnPassant enPassant = EnPassant.Right;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture2_2()
		throws Exception {
		Pawn fixture = getFixture2();
		EnPassant enPassant = EnPassant.Left;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture3_2()
		throws Exception {
		Pawn fixture = getFixture3();
		EnPassant enPassant = EnPassant.None;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture4_2()
		throws Exception {
		Pawn fixture = getFixture4();
		EnPassant enPassant = EnPassant.None;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture5_2()
		throws Exception {
		Pawn fixture = getFixture5();
		EnPassant enPassant = EnPassant.None;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture6_2()
		throws Exception {
		Pawn fixture = getFixture6();
		EnPassant enPassant = EnPassant.None;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture7_2()
		throws Exception {
		Pawn fixture = getFixture7();
		EnPassant enPassant = EnPassant.None;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture8_2()
		throws Exception {
		Pawn fixture = getFixture8();
		EnPassant enPassant = EnPassant.None;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture9_2()
		throws Exception {
		Pawn fixture = getFixture9();
		EnPassant enPassant = EnPassant.None;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture10_2()
		throws Exception {
		Pawn fixture = getFixture10();
		EnPassant enPassant = EnPassant.None;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture11_2()
		throws Exception {
		Pawn fixture = getFixture11();
		EnPassant enPassant = EnPassant.None;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture12_2()
		throws Exception {
		Pawn fixture = getFixture12();
		EnPassant enPassant = EnPassant.None;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture13_2()
		throws Exception {
		Pawn fixture = getFixture13();
		EnPassant enPassant = EnPassant.None;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture1_2()
		throws Exception {
		Pawn fixture = getFixture1();
		EnPassant enPassant = EnPassant.Right;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture3_3()
		throws Exception {
		Pawn fixture = getFixture3();
		EnPassant enPassant = EnPassant.Left;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture4_3()
		throws Exception {
		Pawn fixture = getFixture4();
		EnPassant enPassant = EnPassant.Left;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture5_3()
		throws Exception {
		Pawn fixture = getFixture5();
		EnPassant enPassant = EnPassant.Left;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setEnPassant(EnPassant) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetEnPassant_fixture6_3()
		throws Exception {
		Pawn fixture = getFixture6();
		EnPassant enPassant = EnPassant.Left;

		fixture.setEnPassant(enPassant);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture1_1()
		throws Exception {
		Pawn fixture = getFixture1();
		boolean passed = false;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture2_1()
		throws Exception {
		Pawn fixture = getFixture2();
		boolean passed = true;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture3_1()
		throws Exception {
		Pawn fixture = getFixture3();
		boolean passed = true;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture4_1()
		throws Exception {
		Pawn fixture = getFixture4();
		boolean passed = true;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture5_1()
		throws Exception {
		Pawn fixture = getFixture5();
		boolean passed = true;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture6_1()
		throws Exception {
		Pawn fixture = getFixture6();
		boolean passed = true;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture7_1()
		throws Exception {
		Pawn fixture = getFixture7();
		boolean passed = true;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture8_1()
		throws Exception {
		Pawn fixture = getFixture8();
		boolean passed = true;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture9_1()
		throws Exception {
		Pawn fixture = getFixture9();
		boolean passed = true;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture10_1()
		throws Exception {
		Pawn fixture = getFixture10();
		boolean passed = true;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture11_1()
		throws Exception {
		Pawn fixture = getFixture11();
		boolean passed = true;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture12_1()
		throws Exception {
		Pawn fixture = getFixture12();
		boolean passed = true;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture13_1()
		throws Exception {
		Pawn fixture = getFixture13();
		boolean passed = true;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture2_2()
		throws Exception {
		Pawn fixture = getFixture2();
		boolean passed = false;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture3_2()
		throws Exception {
		Pawn fixture = getFixture3();
		boolean passed = false;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture4_2()
		throws Exception {
		Pawn fixture = getFixture4();
		boolean passed = false;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture5_2()
		throws Exception {
		Pawn fixture = getFixture5();
		boolean passed = false;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture6_2()
		throws Exception {
		Pawn fixture = getFixture6();
		boolean passed = false;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture7_2()
		throws Exception {
		Pawn fixture = getFixture7();
		boolean passed = false;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture8_2()
		throws Exception {
		Pawn fixture = getFixture8();
		boolean passed = false;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture9_2()
		throws Exception {
		Pawn fixture = getFixture9();
		boolean passed = false;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture10_2()
		throws Exception {
		Pawn fixture = getFixture10();
		boolean passed = false;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture11_2()
		throws Exception {
		Pawn fixture = getFixture11();
		boolean passed = false;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture12_2()
		throws Exception {
		Pawn fixture = getFixture12();
		boolean passed = false;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture13_2()
		throws Exception {
		Pawn fixture = getFixture13();
		boolean passed = false;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPassed(boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPassed_fixture1_2()
		throws Exception {
		Pawn fixture = getFixture1();
		boolean passed = true;

		fixture.setPassed(passed);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture1_1()
		throws Exception {
		Pawn fixture = getFixture1();
		Position pose = Position.A1;
		boolean undo = false;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture2_1()
		throws Exception {
		Pawn fixture = getFixture2();
		Position pose = Position.A2;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture3_1()
		throws Exception {
		Pawn fixture = getFixture3();
		Position pose = Position.A3;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture4_1()
		throws Exception {
		Pawn fixture = getFixture4();
		Position pose = Position.A4;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture5_1()
		throws Exception {
		Pawn fixture = getFixture5();
		Position pose = Position.A5;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture6_1()
		throws Exception {
		Pawn fixture = getFixture6();
		Position pose = Position.A6;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture7_1()
		throws Exception {
		Pawn fixture = getFixture7();
		Position pose = Position.A7;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture8_1()
		throws Exception {
		Pawn fixture = getFixture8();
		Position pose = Position.A8;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture9_1()
		throws Exception {
		Pawn fixture = getFixture9();
		Position pose = Position.B1;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture10_1()
		throws Exception {
		Pawn fixture = getFixture10();
		Position pose = Position.B2;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture11_1()
		throws Exception {
		Pawn fixture = getFixture11();
		Position pose = Position.B3;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture12_1()
		throws Exception {
		Pawn fixture = getFixture12();
		Position pose = Position.B4;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture13_1()
		throws Exception {
		Pawn fixture = getFixture13();
		Position pose = Position.B5;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture1_2()
		throws Exception {
		Pawn fixture = getFixture1();
		Position pose = Position.B6;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture2_2()
		throws Exception {
		Pawn fixture = getFixture2();
		Position pose = Position.B7;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture3_2()
		throws Exception {
		Pawn fixture = getFixture3();
		Position pose = Position.B8;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture4_2()
		throws Exception {
		Pawn fixture = getFixture4();
		Position pose = Position.C1;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture5_2()
		throws Exception {
		Pawn fixture = getFixture5();
		Position pose = Position.C2;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture6_2()
		throws Exception {
		Pawn fixture = getFixture6();
		Position pose = Position.C3;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture7_2()
		throws Exception {
		Pawn fixture = getFixture7();
		Position pose = Position.C4;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture8_2()
		throws Exception {
		Pawn fixture = getFixture8();
		Position pose = Position.C5;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture9_2()
		throws Exception {
		Pawn fixture = getFixture9();
		Position pose = Position.C6;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture10_2()
		throws Exception {
		Pawn fixture = getFixture10();
		Position pose = Position.C7;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture11_2()
		throws Exception {
		Pawn fixture = getFixture11();
		Position pose = Position.C8;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture12_2()
		throws Exception {
		Pawn fixture = getFixture12();
		Position pose = Position.D1;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture13_2()
		throws Exception {
		Pawn fixture = getFixture13();
		Position pose = Position.D2;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture1_3()
		throws Exception {
		Pawn fixture = getFixture1();
		Position pose = Position.D3;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture2_3()
		throws Exception {
		Pawn fixture = getFixture2();
		Position pose = Position.D4;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture3_3()
		throws Exception {
		Pawn fixture = getFixture3();
		Position pose = Position.D5;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testSetPosition_fixture4_3()
		throws Exception {
		Pawn fixture = getFixture4();
		Position pose = Position.D6;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
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
	 * @generatedBy CodePro at 3/19/09 10:36 PM
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
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PawnTest.class);
	}
}
