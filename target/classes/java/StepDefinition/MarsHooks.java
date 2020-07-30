package StepDefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cucumber.runtime.StepDefinition;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import mars.ConvergesolAutomation.MarsBase;

public class MarsHooks extends MarsBase{
	public static Logger log = LogManager.getLogger(StepDefinition.class.getName());

	@Before
	public void setup()
	{
		try {
			getDriver();
			getURL();
			log.debug("open browser successfully");
		} catch (IOException e) {
			log.error("not open browser");
		}
	}
	
	@After
	public void TearDownTest()
	{
		try {
			sleep();
			driverclose();
		} catch (Exception e) {
			log.error("not close browser");
		}
	}
}
