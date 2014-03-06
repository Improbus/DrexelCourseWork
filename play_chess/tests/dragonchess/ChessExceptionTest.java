package dragonchess;

import junit.framework.TestCase;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ChessExceptionTest</code> contains tests for the class <code>{@link ChessException}</code>.
 *
 * @generatedBy CodePro at 3/19/09 10:29 PM
 * @author Owner
 * @version $Revision: 1.0 $
 */
public class ChessExceptionTest extends TestCase {
	/**
	 * Run the ChessException() constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	@Test
	public void testChessException_1()
		throws Exception {

		ChessException result = new ChessException();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("dragonchess.ChessException", result.toString());
		assertEquals(null, result.getMessage());
		assertEquals(null, result.getLocalizedMessage());
	}

	/**
	 * Run the ChessException(String) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	@Test
	public void testChessException_2()
		throws Exception {
		String message = "";

		ChessException result = new ChessException(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("dragonchess.ChessException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the ChessException(String) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	@Test
	public void testChessException_3()
		throws Exception {
		String message = "0123456789";

		ChessException result = new ChessException(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("dragonchess.ChessException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/19/09 10:29 PM
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
	 * @generatedBy CodePro at 3/19/09 10:29 PM
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
	 * @generatedBy CodePro at 3/19/09 10:29 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ChessExceptionTest.class);
	}
}
