package StepDefinition;

import org.junit.runner.RunWith;
import PageObjects.MarsLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import mars.ConvergesolAutomation.MarsBase;

@RunWith(Cucumber.class)
public class StepdefinitionLogin extends MarsBase {
	//public static Logger log = LogManager.getLogger(StepdefinitionCommonSteps.class.getName());
	MarsLogin ml=new MarsLogin(driver);
	
	 @Given("^Launch the browser and enter the URL1$")
	    public void launch_the_browser_and_enter_the_url() throws Throwable {
	       
	    }

	 @When("^user enteres login ID1 \"([^\"]*)\" and Password1 \"([^\"]*)\"$")
	    public void user_enteres_login_id1_something_and_password1_something(String strArg1, String strArg2) throws Throwable {
		 Sendkey(ml.Username(),strArg1);
			sleep();
			Sendkey(ml.Password(), strArg2);
	    }

	    @Then("^users click on login button1$")
	    public void users_click_on_login_button() throws Throwable {
	    	 ml=new MarsLogin(driver);
	    	 click(ml.Loginbutton());
	    	 
	    }
	  }
