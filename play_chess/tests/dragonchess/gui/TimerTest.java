package dragonchess.gui;

import junit.framework.TestCase;
import org.junit.*;
import dragonchess.Main;
import dragonchess.MatchState;
import static org.junit.Assert.*;

/**
 * The class <code>TimerTest</code> contains tests for the class <code>{@link Timer}</code>.
 *
 * @generatedBy CodePro at 3/19/09 10:08 PM
 * @author Owner
 * @version $Revision: 1.0 $
 */
public class TimerTest extends TestCase{
	/**
	 * Run the Timer(int,Main) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:08 PM
	 */
	@Test
	public void testTimer_1()
		throws Exception {
		int maxTime = 0;
		Main parent = new Main();

		Timer result = new Timer(maxTime, parent);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class dragonchess.Main
		assertNotNull(result);
	}

	/**
	 * Run the Timer(int,Main) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:08 PM
	 */
	@Test
	public void testTimer_2()
		throws Exception {
		int maxTime = 1;
		Main parent = new Main(MatchState.BlackConnected);

		Timer result = new Timer(maxTime, parent);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class dragonchess.Main
		assertNotNull(result);
	}

	/**
	 * Run the Timer(int,Main) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:08 PM
	 */
	@Test
	public void testTimer_3()
		throws Exception {
		int maxTime = 7;
		Main parent = new Main(MatchState.BlackConnected);

		Timer result = new Timer(maxTime, parent);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class dragonchess.Main
		assertNotNull(result);
	}

	/**
	 * Run the Timer(int,Main) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:08 PM
	 */
	@Test
	public void testTimer_4()
		throws Exception {
		int maxTime = 1;
		Main parent = new Main();

		Timer result = new Timer(maxTime, parent);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class dragonchess.Main
		assertNotNull(result);
	}

	/**
	 * Run the Timer(int,Main) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:08 PM
	 */
	@Test
	public void testTimer_5()
		throws Exception {
		int maxTime = 7;
		Main parent = new Main();

		Timer result = new Timer(maxTime, parent);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class dragonchess.Main
		assertNotNull(result);
	}

	/**
	 * Run the Timer(int,Main) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:08 PM
	 */
	@Test
	public void testTimer_6()
		throws Exception {
		int maxTime = 0;
		Main parent = new Main(MatchState.BlackConnected);

		Timer result = new Timer(maxTime, parent);

		// add additional test code here
		// An unexpected exception was thrown while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class dragonchess.Main
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/19/09 10:08 PM
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
	 * @generatedBy CodePro at 3/19/09 10:08 PM
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
	 * @generatedBy CodePro at 3/19/09 10:08 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TimerTest.class);
	}
}
