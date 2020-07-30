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
	MarsLogin ml=new MarsLogin(driver);
	
	 @Given("^Launch the browser and enter the URL1$")
	    public void launch_the_browser_and_enter_the_url() throws Throwable {
	       
	    }

	 @When("^user enteres login ID1 \"([^\"]*)\" and Password1 \"([^\"]*)\"$")
	    public void user_enteres_login_id1_something_and_password1_something(String strArg1, String strArg2) throws Throwable {
		 try {
			 Sendkey(ml.Username(),strArg1);
	         Thread.sleep(2000);
				Sendkey(ml.Password(), strArg2);
				
		 }catch (Exception e) {
			log.error("not add username or password");
		}		 
	    }

	    @Then("^users click on login button1$")
	    public void users_click_on_login_button() throws Throwable {
	    	try {
		    	 click(ml.Loginbutton());
		         //Thread.sleep(2000);
	    	}catch (Exception e) {
				log.error("not click on sign in button");
			}  	
	    	 
	    }
	  }
