package StepDefinition;

import java.util.ArrayList;

import org.junit.runner.RunWith;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.Loginforgetpasswordlogin;
import PageObjects.MarsLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import mars.ConvergesolAutomation.MarsBase;

@RunWith(Cucumber.class)
public class StepdefinitionLoginforgetpwdlogin extends MarsBase{
	Loginforgetpasswordlogin lfl=new Loginforgetpasswordlogin(driver);
	MarsLogin ml=new MarsLogin(driver);
	
	 @Given("^browser is open$")
	    public void browser_is_open() throws Throwable {
	        
	    }

	 @And("^click on forget password link$")
	    public void click_on_forget_password_link() throws Throwable {
		 try {
			 click(lfl.link());
		 }catch (Exception e) {
			log.error("not click on forget password link");
		 }	      
	    }
	  
	 @Then("^enter \"([^\"]*)\" email address$")
	    public void enter_something_email_address(String strArg1) throws Throwable {
		 try {
			 Sendkey(lfl.email(), strArg1);
			 
		 }catch (Exception e) {
			log.error("not enter email address");
		}		 
	    }
	 
	    @And("^click on request button$")
	    public void click_on_request_button() throws Throwable {
	    	 try {
	 	        click(lfl.btn());

			 }catch (Exception e) {
				log.error("not click on request button");
			}	   	     
	         }
	    
	    @Then("^open email login page$")
	    public void open_email_login_page() throws Throwable {
	    	 try {
	    		 getemailURL();	    	
		 }catch (Exception e) {
				log.error("not open email login page");
			}
	    }

	    @When("^enter email address$")
	    public void enter_email_address() throws Throwable {
             try {
            	 	Sendkey(lfl.roundecubemail(), "prachi.patel@convergesolution.com");
			 }catch (Exception e) {
				log.error("nt enter email address");
			}
	    }
	
	    @Then("^enter password$")
	    public void enter_password() throws Throwable {
 try {
     Sendkey(lfl.roundcubepwd(), "Pr@c#!1998#");
			 }catch (Exception e) {
				log.error("not enter password of email");
			}
	    }

	    @And("^click on signin button$")
	    public void click_on_signin_button() throws Throwable {
	    	try {
		        click(lfl.roundcubeloginbtn());
	    	}catch (Exception e) {
				log.error("not click on signin button");
			}
	    }
	    @Then("^open email$")
	    public void open_email() throws Throwable {
	    	try {
		        dclick(lfl.clickonemail());
	    	}catch (Exception e) {
				log.error("not open email");
			}
	    }
	    
	    @And("^click on reset password link$")
	    public void click_on_reset_password_link() throws Throwable {
	    	try {
	    		click(lfl.resetlink());
	 	       ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	 	       driver.switchTo().window(newTab.get(1));
	    	}catch (Exception e) {
				log.error("not click on reset password link");
			}	       
	    }
	    
	    @Then("^enter password \"([^\"]*)\" and confirm password \"([^\"]*)\"$")
	    public void enter_password_something_and_confirm_password_something(String password, String confirmpwd) throws Throwable {
	    	try {
	    		 Sendkey(lfl.rpassword(), password);
	  	       Sendkey(lfl.cnfpassword(), confirmpwd);
	    	}catch (Exception e) {
				log.error("not enter password or confirm password");
			}	      
	    }

	    @And("^click on reset button and click on ok button$")
	    public void click_on_reset_button() throws Throwable {
	    	try {
	    		 click(lfl.resetbtn());
	             Thread.sleep(2000);
	  	       click(lfl.okbrn());
	    	}catch (Exception e) {
				log.error("not click on reset button or ok button");
			}	      
	    }

	    @Given("^user enters login ID2 \"([^\"]*)\" and Password2 \"([^\"]*)\"$")
	    public void user_enters_login_id2_something_and_password2_something(String strArg1, String strArg2) throws Throwable {
	    	try {
	    		Sendkey(ml.Username(), strArg1);
	 	       Sendkey(ml.Password(), strArg2);
	    	}catch (Exception e) {
				log.error("not enter login ID or password");
			}	      
	    }
	    
	    @And("^users click on login button2$")
	    public void users_click_on_login_button1() throws Throwable {
	    	try {
		        click(ml.Loginbutton());
	        
		        WebDriverWait wait = new WebDriverWait(driver,30);
		        wait.until(ExpectedConditions.visibilityOf(lfl.check()));
	    	}catch (Exception e) {
				log.error("not clock on login button");
			}	    	
	    }
}
