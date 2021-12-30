package triggerRules;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import model.RoyalityModel;

public class TriggerRuleEngineTest {

	private final static ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	PrintStream printStream = new PrintStream(outContent, true);

	public static Logger logger = Logger.getLogger("TriggerRuleEngineTest");

	@BeforeClass
	public static void setUpStreams() {
		System.setErr(new PrintStream(outContent));

	}

	@AfterClass
	public static void cleanUpStreams() {
		System.setErr(null);
	}

	// Test case to test Book Rule
	@Test
	public void executeRuleTestBook() throws Exception {
		String[] inputParams = { "Book" };
		TriggerRuleEngine.main(inputParams);
		Boolean checkCommision = outContent.toString().contains("commission has been set for the agent");
		Boolean isTrue = outContent.toString().contains("created a duplicate packing slip for the royalty department");
		assertEquals(true, isTrue && checkCommision);

	}

	// Test case to test Physical Product Rule
	@Test
	public void executeRuleTestPhysicalProduct() throws Exception {

		String[] inputParams = { "Physical Product" };
		TriggerRuleEngine.main(inputParams);
		Boolean checkCommision = outContent.toString().contains("commission has been set for the agent");
		Boolean isTrue = outContent.toString().contains("generate shipping slip for physical product");

		assertEquals(true, isTrue && checkCommision);

	}

	// Test case to test Membership Rule
	@Test
	public void executeRuleTestMembership() throws Exception {

		String[] inputParams = { "Membership" };
		TriggerRuleEngine.main(inputParams);
		Boolean checkEmail = outContent.toString().contains(" Sent email successfully....");
		Boolean isTrue = outContent.toString().contains("Activate that membership");

		assertEquals(true, isTrue && checkEmail);

	}

	// Test case to test Membership upgrade Rule
	@Test
	public void executeRuleTestUpgrade() throws Exception {

		String[] inputParams = { "Upgrade" };
		TriggerRuleEngine.main(inputParams);
		Boolean checkEmail = outContent.toString().contains(" Sent email successfully....");
		Boolean isTrue = outContent.toString().contains("Upgrade that membership");

		assertEquals(true, isTrue && checkEmail);

	}

	// Test case to test Video Rule
	@Test
	public void executeRuleTestVideo() throws Exception {

		String[] inputParams = { "Video" };
		TriggerRuleEngine.main(inputParams);
		Boolean isTrue = outContent.toString()
				.contains("add a free “First Aid” video to the packing slip (the result of a court decision in 1997)");

		assertEquals(true, isTrue);

	}

	@Test
	public void testexecuteRuleOneWithNoorInvalidInput() {
		try {
			TriggerRuleEngine.main(null);
		} catch (Exception e) {
			assertEquals(e.getLocalizedMessage(), "invalid input passed");
		}

	}

}
