package dragonchess.game;

import junit.framework.TestCase;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GamePieceTypeTest</code> contains tests for the class <code>{@link GamePieceType}</code>.
 *
 * @generatedBy CodePro at 3/19/09 10:17 PM
 * @author Owner
 * @version $Revision: 1.0 $
 */
public class GamePieceTypeTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see GamePieceType
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	private GamePieceType fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GamePieceType
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	private GamePieceType fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GamePieceType
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	private GamePieceType fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GamePieceType
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	private GamePieceType fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GamePieceType
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	private GamePieceType fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GamePieceType
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	private GamePieceType fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GamePieceType
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	private GamePieceType fixture7;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GamePieceType
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	public GamePieceType getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = GamePieceType.Bishop;
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GamePieceType
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	public GamePieceType getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = GamePieceType.Empty;
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GamePieceType
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	public GamePieceType getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = GamePieceType.King;
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GamePieceType
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	public GamePieceType getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = GamePieceType.Knight;
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GamePieceType
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	public GamePieceType getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = GamePieceType.Pawn;
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GamePieceType
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	public GamePieceType getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = GamePieceType.Queen;
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GamePieceType
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	public GamePieceType getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = GamePieceType.Rook;
		}
		return fixture7;
	}

	/**
	 * Run the GamePieceType fromOrdinal(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testFromOrdinal_1()
		throws Exception {
		int ordinal = 0;

		GamePieceType result = GamePieceType.fromOrdinal(ordinal);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getValue());
		assertEquals("Pawn", result.name());
		assertEquals("Pawn", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the GamePieceType fromOrdinal(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testFromOrdinal_2()
		throws Exception {
		int ordinal = 1;

		GamePieceType result = GamePieceType.fromOrdinal(ordinal);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.getValue());
		assertEquals("Knight", result.name());
		assertEquals("Knight", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the GamePieceType fromOrdinal(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testFromOrdinal_3()
		throws Exception {
		int ordinal = 7;

		GamePieceType result = GamePieceType.fromOrdinal(ordinal);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getValue());
		assertEquals("Empty", result.name());
		assertEquals("Empty", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the GamePieceType fromString(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testFromString_1()
		throws Exception {
		String name = "";

		GamePieceType result = GamePieceType.fromString(name);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.IllegalArgumentException: No enum const class dragonchess.game.GamePieceType.
		//       at java.lang.Enum.valueOf(Unknown Source)
		//       at dragonchess.game.GamePieceType.valueOf(GamePieceType.java:1)
		//       at dragonchess.game.GamePieceType.fromString(GamePieceType.java:76)
		assertNotNull(result);
	}

	/**
	 * Run the GamePieceType fromString(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testFromString_2()
		throws Exception {
		String name = "0123456789";

		GamePieceType result = GamePieceType.fromString(name);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.IllegalArgumentException: No enum const class dragonchess.game.GamePieceType.0123456789
		//       at java.lang.Enum.valueOf(Unknown Source)
		//       at dragonchess.game.GamePieceType.valueOf(GamePieceType.java:1)
		//       at dragonchess.game.GamePieceType.fromString(GamePieceType.java:76)
		assertNotNull(result);
	}

	/**
	 * Run the int getValue() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testGetValue_fixture1_1()
		throws Exception {
		GamePieceType fixture = getFixture1();

		int result = fixture.getValue();

		// add additional test code here
		assertEquals(3, result);
	}

	/**
	 * Run the int getValue() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testGetValue_fixture2_1()
		throws Exception {
		GamePieceType fixture = getFixture2();

		int result = fixture.getValue();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getValue() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testGetValue_fixture3_1()
		throws Exception {
		GamePieceType fixture = getFixture3();

		int result = fixture.getValue();

		// add additional test code here
		assertEquals(Integer.MAX_VALUE, result);
	}

	/**
	 * Run the int getValue() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testGetValue_fixture4_1()
		throws Exception {
		GamePieceType fixture = getFixture4();

		int result = fixture.getValue();

		// add additional test code here
		assertEquals(3, result);
	}

	/**
	 * Run the int getValue() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testGetValue_fixture5_1()
		throws Exception {
		GamePieceType fixture = getFixture5();

		int result = fixture.getValue();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getValue() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testGetValue_fixture6_1()
		throws Exception {
		GamePieceType fixture = getFixture6();

		int result = fixture.getValue();

		// add additional test code here
		assertEquals(9, result);
	}

	/**
	 * Run the int getValue() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testGetValue_fixture7_1()
		throws Exception {
		GamePieceType fixture = getFixture7();

		int result = fixture.getValue();

		// add additional test code here
		assertEquals(5, result);
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testSetValue_fixture1_1()
		throws Exception {
		GamePieceType fixture = getFixture1();
		int newValue = 0;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testSetValue_fixture2_1()
		throws Exception {
		GamePieceType fixture = getFixture2();
		int newValue = 1;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testSetValue_fixture3_1()
		throws Exception {
		GamePieceType fixture = getFixture3();
		int newValue = 7;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testSetValue_fixture4_1()
		throws Exception {
		GamePieceType fixture = getFixture4();
		int newValue = 7;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testSetValue_fixture5_1()
		throws Exception {
		GamePieceType fixture = getFixture5();
		int newValue = 7;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testSetValue_fixture6_1()
		throws Exception {
		GamePieceType fixture = getFixture6();
		int newValue = 7;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testSetValue_fixture7_1()
		throws Exception {
		GamePieceType fixture = getFixture7();
		int newValue = 7;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testSetValue_fixture2_2()
		throws Exception {
		GamePieceType fixture = getFixture2();
		int newValue = 0;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testSetValue_fixture3_2()
		throws Exception {
		GamePieceType fixture = getFixture3();
		int newValue = 1;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testSetValue_fixture4_2()
		throws Exception {
		GamePieceType fixture = getFixture4();
		int newValue = 1;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testSetValue_fixture5_2()
		throws Exception {
		GamePieceType fixture = getFixture5();
		int newValue = 1;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testSetValue_fixture6_2()
		throws Exception {
		GamePieceType fixture = getFixture6();
		int newValue = 1;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testSetValue_fixture7_2()
		throws Exception {
		GamePieceType fixture = getFixture7();
		int newValue = 1;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testSetValue_fixture1_2()
		throws Exception {
		GamePieceType fixture = getFixture1();
		int newValue = 7;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testSetValue_fixture3_3()
		throws Exception {
		GamePieceType fixture = getFixture3();
		int newValue = 0;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testSetValue_fixture4_3()
		throws Exception {
		GamePieceType fixture = getFixture4();
		int newValue = 0;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testSetValue_fixture5_3()
		throws Exception {
		GamePieceType fixture = getFixture5();
		int newValue = 0;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testSetValue_fixture6_3()
		throws Exception {
		GamePieceType fixture = getFixture6();
		int newValue = 0;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testSetValue_fixture7_3()
		throws Exception {
		GamePieceType fixture = getFixture7();
		int newValue = 0;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testSetValue_fixture1_3()
		throws Exception {
		GamePieceType fixture = getFixture1();
		int newValue = 1;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	@Test
	public void testSetValue_fixture2_3()
		throws Exception {
		GamePieceType fixture = getFixture2();
		int newValue = 7;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/19/09 10:17 PM
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
	 * @generatedBy CodePro at 3/19/09 10:17 PM
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
	 * @generatedBy CodePro at 3/19/09 10:17 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GamePieceTypeTest.class);
	}
}
