package dragonchess.game;

import junit.framework.TestCase;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ResultTest</code> contains tests for the class <code>{@link Result}</code>.
 *
 * @generatedBy CodePro at 3/19/09 10:36 PM
 * @author Owner
 * @version $Revision: 1.0 $
 */
public class ResultTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see Result
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	private Result fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Result
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	private Result fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Result
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	private Result fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Result
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	private Result fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Result
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	public Result getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = Result.BlackWon;
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Result
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	public Result getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = Result.Draw;
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Result
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	public Result getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = Result.Other;
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Result
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	public Result getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = Result.WhiteWon;
		}
		return fixture4;
	}

	/**
	 * Run the Result fromOrdinal(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testFromOrdinal_1()
		throws Exception {
		int ordinal = 0;

		Result result = Result.fromOrdinal(ordinal);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1-0", result.toString());
		assertEquals("WhiteWon", result.name());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the Result fromOrdinal(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testFromOrdinal_2()
		throws Exception {
		int ordinal = 1;

		Result result = Result.fromOrdinal(ordinal);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0-1", result.toString());
		assertEquals("BlackWon", result.name());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the Result fromOrdinal(int) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testFromOrdinal_3()
		throws Exception {
		int ordinal = 7;

		Result result = Result.fromOrdinal(ordinal);

		// add additional test code here
		assertNotNull(result);
		assertEquals("*", result.toString());
		assertEquals("Other", result.name());
		assertEquals(3, result.ordinal());
	}

	/**
	 * Run the Result fromString(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testFromString_1()
		throws Exception {
		String string = "";

		Result result = Result.fromString(string);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.IllegalArgumentException: No enum const class dragonchess.game.Result.
		//       at java.lang.Enum.valueOf(Unknown Source)
		//       at dragonchess.game.Result.valueOf(Result.java:1)
		//       at dragonchess.game.Result.fromString(Result.java:59)
		assertNotNull(result);
	}

	/**
	 * Run the Result fromString(String) method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testFromString_2()
		throws Exception {
		String string = "0123456789";

		Result result = Result.fromString(string);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.IllegalArgumentException: No enum const class dragonchess.game.Result.0123456789
		//       at java.lang.Enum.valueOf(Unknown Source)
		//       at dragonchess.game.Result.valueOf(Result.java:1)
		//       at dragonchess.game.Result.fromString(Result.java:59)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testToString_fixture1_1()
		throws Exception {
		Result fixture = getFixture1();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("0-1", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testToString_fixture2_1()
		throws Exception {
		Result fixture = getFixture2();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("1/2-1/2", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testToString_fixture3_1()
		throws Exception {
		Result fixture = getFixture3();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("*", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:36 PM
	 */
	@Test
	public void testToString_fixture4_1()
		throws Exception {
		Result fixture = getFixture4();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("1-0", result);
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
		new org.junit.runner.JUnitCore().run(ResultTest.class);
	}
}
