package StepDefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

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
			log.debug("not open browser");
		}
	}
	
	@After
	public void TearDownTest()
	{
		try {
			sleep();
			driverclose();
		} catch (IOException e) {
			
		}
	}
}
