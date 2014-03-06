package dragonchess.game;

import junit.framework.TestCase;
import java.util.Collection;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RookTest</code> contains tests for the class <code>{@link Rook}</code>.
 *
 * @generatedBy CodePro at 3/19/09 10:14 PM
 * @author Owner
 * @version $Revision: 1.0 $
 */
public class RookTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see Rook
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	private Rook fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Rook
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	private Rook fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Rook
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	public Rook getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new Rook();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Rook
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	public Rook getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new Rook(GamePieceColor.Black);
		}
		return fixture2;
	}

	/**
	 * Run the Rook() constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testRook_1()
		throws Exception {

		Rook result = new Rook();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.hasNotMoved());
		assertEquals(null, result.getSAN());
	}

	/**
	 * Run the Rook(GamePieceColor) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testRook_2()
		throws Exception {
		GamePieceColor color = GamePieceColor.Black;

		Rook result = new Rook(color);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.hasNotMoved());
		assertEquals(null, result.getSAN());
	}

	/**
	 * Run the Rook(GamePieceColor) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testRook_3()
		throws Exception {
		GamePieceColor color = GamePieceColor.NULL;

		Rook result = new Rook(color);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.hasNotMoved());
		assertEquals(null, result.getSAN());
	}

	/**
	 * Run the Rook(GamePieceColor) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testRook_4()
		throws Exception {
		GamePieceColor color = GamePieceColor.White;

		Rook result = new Rook(color);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.hasNotMoved());
		assertEquals(null, result.getSAN());
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture1_1()
		throws Exception {
		Rook fixture = getFixture1();
		ChessBoard board = new ChessBoard();

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.getPosition(GamePiece.java:55)
		//       at dragonchess.game.Rook.getPotentialMoves(Rook.java:76)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture2_1()
		throws Exception {
		Rook fixture = getFixture2();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.getPosition(GamePiece.java:55)
		//       at dragonchess.game.Rook.getPotentialMoves(Rook.java:76)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture2_2()
		throws Exception {
		Rook fixture = getFixture2();
		ChessBoard board = new ChessBoard();

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.getPosition(GamePiece.java:55)
		//       at dragonchess.game.Rook.getPotentialMoves(Rook.java:76)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Square> getPotentialMoves(ChessBoard) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testGetPotentialMoves_fixture1_2()
		throws Exception {
		Rook fixture = getFixture1();
		ChessBoard board = new ChessBoard(new Square[] {new Square(Position.A1), new Square(Position.A1, new Bishop()), new Square(Position.A2, new Bishop(GamePieceColor.Black)), null});

		Collection<Square> result = fixture.getPotentialMoves(board);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.getPosition(GamePiece.java:55)
		//       at dragonchess.game.Rook.getPotentialMoves(Rook.java:76)
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasNotMoved() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testHasNotMoved_fixture1_1()
		throws Exception {
		Rook fixture = getFixture1();

		boolean result = fixture.hasNotMoved();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasNotMoved() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testHasNotMoved_fixture2_1()
		throws Exception {
		Rook fixture = getFixture2();

		boolean result = fixture.hasNotMoved();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture1_1()
		throws Exception {
		Rook fixture = getFixture1();
		Position pose = Position.A1;
		boolean undo = false;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture2_1()
		throws Exception {
		Rook fixture = getFixture2();
		Position pose = Position.A2;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture1_2()
		throws Exception {
		Rook fixture = getFixture1();
		Position pose = Position.A3;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture2_2()
		throws Exception {
		Rook fixture = getFixture2();
		Position pose = Position.A4;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture1_3()
		throws Exception {
		Rook fixture = getFixture1();
		Position pose = Position.A5;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture2_3()
		throws Exception {
		Rook fixture = getFixture2();
		Position pose = Position.A6;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture1_4()
		throws Exception {
		Rook fixture = getFixture1();
		Position pose = Position.A7;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture2_4()
		throws Exception {
		Rook fixture = getFixture2();
		Position pose = Position.A8;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture1_5()
		throws Exception {
		Rook fixture = getFixture1();
		Position pose = Position.B1;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture2_5()
		throws Exception {
		Rook fixture = getFixture2();
		Position pose = Position.B2;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture1_6()
		throws Exception {
		Rook fixture = getFixture1();
		Position pose = Position.B3;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture2_6()
		throws Exception {
		Rook fixture = getFixture2();
		Position pose = Position.B4;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture1_7()
		throws Exception {
		Rook fixture = getFixture1();
		Position pose = Position.B5;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture2_7()
		throws Exception {
		Rook fixture = getFixture2();
		Position pose = Position.B6;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture1_8()
		throws Exception {
		Rook fixture = getFixture1();
		Position pose = Position.B7;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture2_8()
		throws Exception {
		Rook fixture = getFixture2();
		Position pose = Position.B8;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture1_9()
		throws Exception {
		Rook fixture = getFixture1();
		Position pose = Position.C1;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture2_9()
		throws Exception {
		Rook fixture = getFixture2();
		Position pose = Position.C2;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture1_10()
		throws Exception {
		Rook fixture = getFixture1();
		Position pose = Position.C3;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture2_10()
		throws Exception {
		Rook fixture = getFixture2();
		Position pose = Position.C4;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture1_11()
		throws Exception {
		Rook fixture = getFixture1();
		Position pose = Position.C5;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture2_11()
		throws Exception {
		Rook fixture = getFixture2();
		Position pose = Position.C6;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture1_12()
		throws Exception {
		Rook fixture = getFixture1();
		Position pose = Position.C7;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture2_12()
		throws Exception {
		Rook fixture = getFixture2();
		Position pose = Position.C8;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture1_13()
		throws Exception {
		Rook fixture = getFixture1();
		Position pose = Position.D1;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture2_13()
		throws Exception {
		Rook fixture = getFixture2();
		Position pose = Position.D2;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture1_14()
		throws Exception {
		Rook fixture = getFixture1();
		Position pose = Position.D3;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture2_14()
		throws Exception {
		Rook fixture = getFixture2();
		Position pose = Position.D4;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture1_15()
		throws Exception {
		Rook fixture = getFixture1();
		Position pose = Position.D5;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Run the void setPosition(Position,boolean) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	@Test
	public void testSetPosition_fixture2_15()
		throws Exception {
		Rook fixture = getFixture2();
		Position pose = Position.D6;
		boolean undo = true;

		fixture.setPosition(pose, undo);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.setPosition(GamePiece.java:64)
		//       at dragonchess.game.Rook.setPosition(Rook.java:64)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/19/09 10:14 PM
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
	 * @generatedBy CodePro at 3/19/09 10:14 PM
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
	 * @generatedBy CodePro at 3/19/09 10:14 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RookTest.class);
	}
}
