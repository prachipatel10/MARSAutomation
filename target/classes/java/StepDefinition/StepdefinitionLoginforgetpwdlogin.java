package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.Loginforgetpasswordlogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import mars.ConvergesolAutomation.MarsBase;

@RunWith(Cucumber.class)
public class StepdefinitionLoginforgetpwdlogin extends MarsBase{
	Loginforgetpasswordlogin lfl=new Loginforgetpasswordlogin(driver);

	 @Given("^browser is open$")
	    public void browser_is_open() throws Throwable {
	        
	    }

	 @And("^click on forget password link$")
	    public void click_on_forget_password_link() throws Throwable {
	       click(lfl.link());
	    }
	  
	 @Then("^enter \"([^\"]*)\" email address$")
	    public void enter_something_email_address(String strArg1) throws Throwable {
		 Sendkey(lfl.email(), strArg1);
	    }
	 
	    @And("^click on request button$")
	    public void click_on_request_button() throws Throwable {
	        click(lfl.btn());
	        WebDriverWait wait = new WebDriverWait(driver,20);
	        wait.until(ExpectedConditions.visibilityOf(lfl.forgetlinksend()));
	         }
	    
	    @Then("^open email login page$")
	    public void open_email_login_page() throws Throwable {
	    	 
	    	 getemailURL();
	    }

	    @When("^enter email address$")
	    public void enter_email_address() throws Throwable {
	    	Sendkey(lfl.roundecubemail(), "prachi.patel@convergesolution.com");
	    }
	
	    @Then("^enter password$")
	    public void enter_password() throws Throwable {
	        Sendkey(lfl.roundcubepwd(), "Prachi@123");
	    }

	    @And("^click on signin button$")
	    public void click_on_signin_button() throws Throwable {
	        click(lfl.roundcubeloginbtn());
	    }
	    @Then("^open email$")
	    public void open_email() throws Throwable {
	        dclick(lfl.clickonemail());
	    }


}
