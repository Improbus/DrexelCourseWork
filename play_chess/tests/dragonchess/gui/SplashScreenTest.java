package dragonchess.gui;

import junit.framework.TestCase;
import org.junit.*;
import dragonchess.Main;
import static org.junit.Assert.*;

/**
 * The class <code>SplashScreenTest</code> contains tests for the class <code>{@link SplashScreen}</code>.
 *
 * @generatedBy CodePro at 3/19/09 10:15 PM
 * @author Owner
 * @version $Revision: 1.0 $
 */
public class SplashScreenTest extends TestCase{
	/**
	 * Run the SplashScreen(DragonChessMW) constructor test.
	 *
	 * @generatedBy CodePro at 3/19/09 10:15 PM
	 */
	@Test
	public void testSplashScreen_1()
		throws Exception {
		DragonChessMW parent = new DragonChessMW(new Main());

		SplashScreen result = new SplashScreen(parent);

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
		new org.junit.runner.JUnitCore().run(SplashScreenTest.class);
	}
}
