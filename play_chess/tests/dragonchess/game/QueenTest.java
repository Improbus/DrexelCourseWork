package dragonchess.game;

import junit.framework.TestCase;
import java.util.Collection;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>QueenTest</code> contains tests for the class <code>{@link Queen}</code>.
 *
 * @generatedBy CodePro at 3/19/09 10:27 PM
 * @author Owner
 * @version $Revision: 1.0 $
 */
public class QueenTest extends TestCase {
	/**
	 * Run the Queen() constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:27 PM
	 */
	@Test
	public void testQueen_1()
		throws Exception {

		Queen result = new Queen();

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class dragonchess.game.Queen
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/19/09 10:27 PM
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
	 * @generatedBy CodePro at 3/19/09 10:27 PM
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
	 * @generatedBy CodePro at 3/19/09 10:27 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(QueenTest.class);
	}
}
