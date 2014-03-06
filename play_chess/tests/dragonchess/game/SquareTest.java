package dragonchess.game;

import junit.framework.TestCase;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SquareTest</code> contains tests for the class <code>{@link Square}</code>.
 *
 * @generatedBy CodePro at 3/19/09 10:15 PM
 * @author Owner
 * @version $Revision: 1.0 $
 */
public class SquareTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see Square
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	private Square fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Square
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	private Square fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Square
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	private Square fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Square
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	private Square fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Square
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	private Square fixture5;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Square
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	public Square getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new Square(Position.A1);
			fixture1.setPiece(new Bishop());
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Square
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	public Square getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new Square(Position.A1);
			fixture2.setPiece(new King());
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Square
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	public Square getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new Square(Position.A1);
			fixture3.setPiece(new Knight());
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Square
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	public Square getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new Square(Position.A1, new Bishop());
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Square
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	public Square getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new Square(Position.A2, new King());
		}
		return fixture5;
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_1()
		throws Exception {
		Position position = Position.A1;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("a1[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_2()
		throws Exception {
		Position position = Position.A2;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("a2[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_3()
		throws Exception {
		Position position = Position.A3;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("a3[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_4()
		throws Exception {
		Position position = Position.A4;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("a4[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_5()
		throws Exception {
		Position position = Position.A5;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("a5[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_6()
		throws Exception {
		Position position = Position.A6;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("a6[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_7()
		throws Exception {
		Position position = Position.A7;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("a7[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_8()
		throws Exception {
		Position position = Position.A8;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("a8[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_9()
		throws Exception {
		Position position = Position.B1;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("b1[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_10()
		throws Exception {
		Position position = Position.B2;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("b2[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_11()
		throws Exception {
		Position position = Position.B3;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("b3[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_12()
		throws Exception {
		Position position = Position.B4;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("b4[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_13()
		throws Exception {
		Position position = Position.B5;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("b5[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_14()
		throws Exception {
		Position position = Position.B6;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("b6[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_15()
		throws Exception {
		Position position = Position.B7;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("b7[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_16()
		throws Exception {
		Position position = Position.B8;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("b8[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_17()
		throws Exception {
		Position position = Position.C1;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("c1[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_18()
		throws Exception {
		Position position = Position.C2;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("c2[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_19()
		throws Exception {
		Position position = Position.C3;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("c3[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_20()
		throws Exception {
		Position position = Position.C4;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("c4[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_21()
		throws Exception {
		Position position = Position.C5;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("c5[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_22()
		throws Exception {
		Position position = Position.C6;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("c6[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_23()
		throws Exception {
		Position position = Position.C7;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("c7[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_24()
		throws Exception {
		Position position = Position.C8;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("c8[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_25()
		throws Exception {
		Position position = Position.D1;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("d1[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_26()
		throws Exception {
		Position position = Position.D2;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("d2[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_27()
		throws Exception {
		Position position = Position.D3;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("d3[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_28()
		throws Exception {
		Position position = Position.D4;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("d4[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_29()
		throws Exception {
		Position position = Position.D5;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("d5[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_30()
		throws Exception {
		Position position = Position.D6;

		Square result = new Square(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals("d6[     ]", result.toString());
		assertEquals(true, result.isEmpty());
		assertEquals(null, result.getPiece());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_31()
		throws Exception {
		Position position = Position.A1;
		GamePiece piece = new Bishop();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_32()
		throws Exception {
		Position position = Position.A2;
		GamePiece piece = new King();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_33()
		throws Exception {
		Position position = Position.A3;
		GamePiece piece = new Knight();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_34()
		throws Exception {
		Position position = Position.A4;
		GamePiece piece = new Pawn();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals("a4[   a2]", result.toString());
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_35()
		throws Exception {
		Position position = Position.A5;
		GamePiece piece = new Queen();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_36()
		throws Exception {
		Position position = Position.A6;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_37()
		throws Exception {
		Position position = Position.A7;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_38()
		throws Exception {
		Position position = Position.A8;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_39()
		throws Exception {
		Position position = Position.B1;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_40()
		throws Exception {
		Position position = Position.B2;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_41()
		throws Exception {
		Position position = Position.B3;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_42()
		throws Exception {
		Position position = Position.B4;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_43()
		throws Exception {
		Position position = Position.B5;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_44()
		throws Exception {
		Position position = Position.B6;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_45()
		throws Exception {
		Position position = Position.B7;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_46()
		throws Exception {
		Position position = Position.B8;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_47()
		throws Exception {
		Position position = Position.C1;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_48()
		throws Exception {
		Position position = Position.C2;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_49()
		throws Exception {
		Position position = Position.C3;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_50()
		throws Exception {
		Position position = Position.C4;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_51()
		throws Exception {
		Position position = Position.C5;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_52()
		throws Exception {
		Position position = Position.C6;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_53()
		throws Exception {
		Position position = Position.C7;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_54()
		throws Exception {
		Position position = Position.C8;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_55()
		throws Exception {
		Position position = Position.D1;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_56()
		throws Exception {
		Position position = Position.D2;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_57()
		throws Exception {
		Position position = Position.D3;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_58()
		throws Exception {
		Position position = Position.D4;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_59()
		throws Exception {
		Position position = Position.D5;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the Square(Position,GamePiece) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSquare_60()
		throws Exception {
		Position position = Position.D6;
		GamePiece piece = new Rook();

		Square result = new Square(position, piece);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEmpty());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture1_1()
		throws Exception {
		Square fixture = getFixture1();
		Object other = new Square(Position.A1);

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture2_1()
		throws Exception {
		Square fixture = getFixture2();
		Object other = new Square(Position.A1, new Bishop());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture3_1()
		throws Exception {
		Square fixture = getFixture3();
		Object other = new Square(Position.A2, new King());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture4_1()
		throws Exception {
		Square fixture = getFixture4();
		Square other = new Square(Position.A1);
		other.setPiece(new Bishop());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture5_1()
		throws Exception {
		Square fixture = getFixture5();
		Square other = new Square(Position.A1);
		other.setPiece(new King());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture1_2()
		throws Exception {
		Square fixture = getFixture1();
		Square other = new Square(Position.A1);
		other.setPiece(new Knight());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture2_2()
		throws Exception {
		Square fixture = getFixture2();
		Object other = new Square(Position.A1, new Bishop());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture3_2()
		throws Exception {
		Square fixture = getFixture3();
		Object other = new Square(Position.A2, new King());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture5_2()
		throws Exception {
		Square fixture = getFixture5();
		Object other = new Square(Position.A1);

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture1_3()
		throws Exception {
		Square fixture = getFixture1();
		Object other = new Square(Position.A1, new Bishop());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture2_3()
		throws Exception {
		Square fixture = getFixture2();
		Object other = new Square(Position.A2, new King());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture3_3()
		throws Exception {
		Square fixture = getFixture3();
		Square other = new Square(Position.A1);
		other.setPiece(new Bishop());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture4_2()
		throws Exception {
		Square fixture = getFixture4();
		Square other = new Square(Position.A1);
		other.setPiece(new King());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture5_3()
		throws Exception {
		Square fixture = getFixture5();
		Square other = new Square(Position.A1);
		other.setPiece(new Knight());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture1_4()
		throws Exception {
		Square fixture = getFixture1();
		Object other = new Square(Position.A1, new Bishop());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture2_4()
		throws Exception {
		Square fixture = getFixture2();
		Object other = new Square(Position.A2, new King());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture4_3()
		throws Exception {
		Square fixture = getFixture4();
		Object other = new Square(Position.A1);

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture5_4()
		throws Exception {
		Square fixture = getFixture5();
		Object other = new Square(Position.A1, new Bishop());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture1_5()
		throws Exception {
		Square fixture = getFixture1();
		Object other = new Square(Position.A2, new King());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture2_5()
		throws Exception {
		Square fixture = getFixture2();
		Square other = new Square(Position.A1);
		other.setPiece(new Bishop());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture3_4()
		throws Exception {
		Square fixture = getFixture3();
		Square other = new Square(Position.A1);
		other.setPiece(new King());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture4_4()
		throws Exception {
		Square fixture = getFixture4();
		Square other = new Square(Position.A1);
		other.setPiece(new Knight());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture5_5()
		throws Exception {
		Square fixture = getFixture5();
		Object other = new Square(Position.A1, new Bishop());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture1_6()
		throws Exception {
		Square fixture = getFixture1();
		Object other = new Square(Position.A2, new King());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture3_5()
		throws Exception {
		Square fixture = getFixture3();
		Object other = new Square(Position.A1);

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture4_5()
		throws Exception {
		Square fixture = getFixture4();
		Object other = new Square(Position.A1, new Bishop());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture5_6()
		throws Exception {
		Square fixture = getFixture5();
		Object other = new Square(Position.A2, new King());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture1_7()
		throws Exception {
		Square fixture = getFixture1();
		Square other = new Square(Position.A1);
		other.setPiece(new Bishop());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture2_6()
		throws Exception {
		Square fixture = getFixture2();
		Square other = new Square(Position.A1);
		other.setPiece(new King());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testEquals_fixture3_6()
		throws Exception {
		Square fixture = getFixture3();
		Square other = new Square(Position.A1);
		other.setPiece(new Knight());

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the GamePiece getPiece() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testGetPiece_fixture1_1()
		throws Exception {
		Square fixture = getFixture1();

		GamePiece result = fixture.getPiece();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSAN());
	}

	/**
	 * Run the GamePiece getPiece() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testGetPiece_fixture2_1()
		throws Exception {
		Square fixture = getFixture2();

		GamePiece result = fixture.getPiece();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSAN());
	}

	/**
	 * Run the GamePiece getPiece() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testGetPiece_fixture3_1()
		throws Exception {
		Square fixture = getFixture3();

		GamePiece result = fixture.getPiece();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSAN());
	}

	/**
	 * Run the GamePiece getPiece() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testGetPiece_fixture4_1()
		throws Exception {
		Square fixture = getFixture4();

		GamePiece result = fixture.getPiece();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSAN());
	}

	/**
	 * Run the GamePiece getPiece() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testGetPiece_fixture5_1()
		throws Exception {
		Square fixture = getFixture5();

		GamePiece result = fixture.getPiece();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSAN());
	}

	/**
	 * Run the Position getPosition() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testGetPosition_fixture1_1()
		throws Exception {
		Square fixture = getFixture1();

		Position result = fixture.getPosition();

		// add additional test code here
		assertNotNull(result);
		assertEquals("a1", result.toString());
		assertEquals('a', result.getFile());
		assertEquals(1, result.getRank());
		assertEquals(false, result.isStartPosition());
		assertEquals("A1", result.name());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the Position getPosition() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testGetPosition_fixture2_1()
		throws Exception {
		Square fixture = getFixture2();

		Position result = fixture.getPosition();

		// add additional test code here
		assertNotNull(result);
		assertEquals("a1", result.toString());
		assertEquals('a', result.getFile());
		assertEquals(1, result.getRank());
		assertEquals(false, result.isStartPosition());
		assertEquals("A1", result.name());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the Position getPosition() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testGetPosition_fixture3_1()
		throws Exception {
		Square fixture = getFixture3();

		Position result = fixture.getPosition();

		// add additional test code here
		assertNotNull(result);
		assertEquals("a1", result.toString());
		assertEquals('a', result.getFile());
		assertEquals(1, result.getRank());
		assertEquals(false, result.isStartPosition());
		assertEquals("A1", result.name());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the Position getPosition() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testGetPosition_fixture4_1()
		throws Exception {
		Square fixture = getFixture4();

		Position result = fixture.getPosition();

		// add additional test code here
		assertNotNull(result);
		assertEquals("a1", result.toString());
		assertEquals('a', result.getFile());
		assertEquals(1, result.getRank());
		assertEquals(false, result.isStartPosition());
		assertEquals("A1", result.name());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the Position getPosition() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testGetPosition_fixture5_1()
		throws Exception {
		Square fixture = getFixture5();

		Position result = fixture.getPosition();

		// add additional test code here
		assertNotNull(result);
		assertEquals("a2", result.toString());
		assertEquals('a', result.getFile());
		assertEquals(2, result.getRank());
		assertEquals(false, result.isStartPosition());
		assertEquals("A2", result.name());
		assertEquals(8, result.ordinal());
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testIsEmpty_fixture1_1()
		throws Exception {
		Square fixture = getFixture1();

		boolean result = fixture.isEmpty();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testIsEmpty_fixture2_1()
		throws Exception {
		Square fixture = getFixture2();

		boolean result = fixture.isEmpty();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testIsEmpty_fixture3_1()
		throws Exception {
		Square fixture = getFixture3();

		boolean result = fixture.isEmpty();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testIsEmpty_fixture4_1()
		throws Exception {
		Square fixture = getFixture4();

		boolean result = fixture.isEmpty();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testIsEmpty_fixture5_1()
		throws Exception {
		Square fixture = getFixture5();

		boolean result = fixture.isEmpty();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setPiece(GamePiece) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSetPiece_fixture1_1()
		throws Exception {
		Square fixture = getFixture1();
		GamePiece newPiece = null;

		fixture.setPiece(newPiece);

		// add additional test code here
	}

	/**
	 * Run the void setPiece(GamePiece) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSetPiece_fixture2_1()
		throws Exception {
		Square fixture = getFixture2();
		GamePiece newPiece = null;

		fixture.setPiece(newPiece);

		// add additional test code here
	}

	/**
	 * Run the void setPiece(GamePiece) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSetPiece_fixture3_1()
		throws Exception {
		Square fixture = getFixture3();
		GamePiece newPiece = null;

		fixture.setPiece(newPiece);

		// add additional test code here
	}

	/**
	 * Run the void setPiece(GamePiece) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSetPiece_fixture4_1()
		throws Exception {
		Square fixture = getFixture4();
		GamePiece newPiece = null;

		fixture.setPiece(newPiece);

		// add additional test code here
	}

	/**
	 * Run the void setPiece(GamePiece) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSetPiece_fixture5_1()
		throws Exception {
		Square fixture = getFixture5();
		GamePiece newPiece = null;

		fixture.setPiece(newPiece);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testToString_fixture1_1()
		throws Exception {
		Square fixture = getFixture1();

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.toString(GamePiece.java:246)
		//       at dragonchess.game.Square.toString(Square.java:102)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testToString_fixture2_1()
		throws Exception {
		Square fixture = getFixture2();

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.toString(GamePiece.java:246)
		//       at dragonchess.game.Square.toString(Square.java:102)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testToString_fixture3_1()
		throws Exception {
		Square fixture = getFixture3();

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.toString(GamePiece.java:246)
		//       at dragonchess.game.Square.toString(Square.java:102)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testToString_fixture4_1()
		throws Exception {
		Square fixture = getFixture4();

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.toString(GamePiece.java:246)
		//       at dragonchess.game.Square.toString(Square.java:102)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testToString_fixture5_1()
		throws Exception {
		Square fixture = getFixture5();

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NullPointerException
		//       at dragonchess.game.GamePiece.toString(GamePiece.java:246)
		//       at dragonchess.game.Square.toString(Square.java:102)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
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
	 * @generatedBy CodePro at 3/19/09 10:15 PM
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
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SquareTest.class);
	}
}
