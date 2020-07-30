package StepDefinition;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import PageObjects.AddAppPrjTSTCDS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import mars.ConvergesolAutomation.MarsBase;

@RunWith(Cucumber.class)
public class StepdefinitionAddAppPrjTSTCDS extends MarsBase {
	AddAppPrjTSTCDS add = new AddAppPrjTSTCDS(driver);

	@Given("^login successfully$")
	public void login_successfully() throws Throwable {
	}

	@And("^mouseover on application from menu$")
	public void mouseover_on_application_from_menu() throws Throwable {
		try {
			mouseover(add.applicationmenu());
		}catch (Exception e) {
			log.error("not mouse over on application");
		}
		
	}

	@Then("^click on list option$")
	public void click_on_list_option() throws Throwable {
		try {
			click(add.applicationlist());
			loader(add.addbutton());
			//Recursive();
		}catch (Exception e) {
			log.error("not click on list of application");
		}		
	}

	@And("^click on add button$")
	public void click_on_add_button() throws Throwable {
		try {
			click(add.addbutton());
		}catch (Exception e) {
			log.error("not click ok add button of application");
		}
		
	}

	@Then("^enter name description version and select extra requirement$")
	public void enter_name_somethingdescription_something_and_version_something() throws Throwable {
		try {
		//}
		Sendkey(add.name(), value);
		Sendkey(add.desc(), value);
		Sendkey(add.version(), "1.1.1");
		add.extrareq().click();
		Thread.sleep(1000);		
	  WebElement requirementdropdown = driver.findElement(By.xpath("//*[@id=\"select2-sDrpExtraReq-results\"]/li/ul"));
	  List<WebElement> reqlist =requirementdropdown.findElements(By.tagName("li")); 
	  for (WebElement li : reqlist) 
	  {
		  if (li.getText().equals("Infragistics_V_14"))
		  {
			  li.click(); 
			  }
		  }
	}catch (StaleElementReferenceException e) {		
	}		 
	}
	@And("^click on save button$")
	public void click_on_save_button() throws Throwable {
		try {
			click(add.savebtn());
			wait(add.okbtn());
		}
		catch (Exception e) {
			log.error("not click on save button of application");
		}
		}

	@And("^click on ok button$")
	public void click_on_ok_button() throws Throwable {
		try {
			click(add.okbtn());
		}catch (Exception e) {
			log.error("not click on ok button of add application");
		}
		
	}

	@Given("^mouseover on project option$")
	public void mouseover_on_project_option() throws Throwable {
		try {
			mouseover(add.projectoption());
		}catch (Exception e) {
			log.error("not mouseover on project");
		}
	}

	@Then("^click on list option of project$")
	public void click_on_list_option_of_project() throws Throwable {
		try {
			click(add.projectlist());
			loader(add.addprjbtn());
		}catch (Exception e) {
			log.error("not click on list of project");
		}
		 
	}

	@And("^click on add project button$")
	public void click_on_add_project_button() throws Throwable {
		try {
			
			 click(add.addprjbtn());
		}catch (Exception e) {
			log.error("not click on add project button");
		}
		
	}

	@Then("^enter name description and select application$")
	public void enter_name_something_description_something_and_select_application() throws Throwable {
		try {
		Sendkey(add.prjname(), value);
		Sendkey(add.prjdese(), value);
		click(add.prjappfld());
		Thread.sleep(2000);

		WebElement appdropdown = driver.findElement(By.xpath("//*[@id=\"select2-sDrpApplication-results\"]/li/ul"));
		List<WebElement> applist = appdropdown.findElements(By.tagName("li"));
		for (WebElement li : applist) {
			if (li.getText().equals(value)) {
				li.click();
			}
		}
	}catch (StaleElementReferenceException e) {
	}
	}
	
	@And("^click on save button of project$")
	public void click_on_save_button_of_project() throws Throwable {
		try {
			click(add.savebtnproject());
			wait(add.mouseoverontestsuiteoption());
		}catch (Exception e) {
			log.error("not click on ave button of project");
		}
	}

	@Then("^mouseover on test suite option$")
	public void mouseover_on_test_suite_option() throws Throwable {
		try {
			mouseover(add.mouseoverontestsuiteoption());
		}catch (Exception e) {
			log.error("not mouseover on test suite");
		}
		
	}

	@And("^click on list option of test suite$")
	public void click_on_list_option_of_test_suite() throws Throwable {
		try {
			click(add.clickonlistoftestsuite());
			loader(add.clickonaddbuttonoftestsuite());
		}
		catch (Exception e) {
			log.error("not click on list of test suite");
		}
	}

	@Then("^click on add new button of test suite$")
	public void click_on_add_new_button_of_test_suite() throws Throwable {
        try {
        	click(add.clickonaddbuttonoftestsuite());
        }catch (Exception e) {
			log.error("not click on add new button of test suite");
		}
		
	}

	@And("^enter name descript select application for test suite$")
	public void enter_name_descript_select_application_and_select_project() throws Throwable {
		try {
			
		Sendkey(add.entertestsuitename(), value);
		Sendkey(add.entertestsuitedescription(), value);
		click(add.selectapplicationoftessuite());
		Thread.sleep(2000);
					
		WebElement appdropdown = driver.findElement(By.xpath("//*[@id=\"select2-stDrpApplication-results\"]/li/ul"));
		List<WebElement> applist = appdropdown.findElements(By.tagName("li"));
		for (WebElement li : applist) {
			if (li.getText().equals(value)) {
				li.click();
			}
		}
		
		}
		catch (StaleElementReferenceException e) {
		}
		
	}

	@And("^select project$")
	public void select_project() throws Throwable {
		try {
			click(add.clickonprojectfield());	
			 WebElement prjdropdown = driver.findElement(By.xpath("//*[@id=\"select2-DrpProject-results\"]/li[2]/ul"));
				List<WebElement> prjlist = prjdropdown.findElements(By.tagName("li"));
				for (WebElement li : prjlist) {
					if (li.getText().equals(value)) {
						li.click();
					}
				}
		}catch (StaleElementReferenceException e) {
			
		}		
	}
	
	@Then("^click on save button of test suite$")
	public void click_on_save_button_of_test_suite() throws Throwable {
		try {
			click(add.clickonsavebuttonoftestsuite());
			wait(add.mouseoverontestcaseoption());
		}catch (Exception e) {
			log.error("not click on save button of test suite");
		}		
	}
	
	  @Then("^mouseover on test case option$")
	    public void mouseover_on_test_case_option() throws Throwable {
		  try {
			  mouseover(add.mouseoverontestcaseoption());
		  }catch (Exception e) {
			log.error("not mouseover on test case");
		}
	    }

	  @And("^click on list option of test case$")
	    public void click_on_list_option_of_test_case() throws Throwable {
		  try {
			  click(add.clickontestcaselistoption());
			 loader(add.clickonnewbtnoftestcase());
		  }catch (Exception e) {
			log.error("not click on list of test case");
		}
	    }
	  
	    @Then("^click on add new button of test case$")
	    public void click_on_add_new_button_of_test_case() throws Throwable {
	    	try {
	    		click(add.clickonnewbtnoftestcase());
	    	}catch (Exception e) {
				log.error("not click on add new button of test case");
			}
	    }

	  
	    @And("^enter name descript select application$")
	    public void enter_name_descript_select_application_and_select_test_suite() throws Throwable {
	    	try {
	    			
	       Sendkey(add.enterTCname(),value);
	       Sendkey(add.enterTCdesc(), value);
	       click(add.clickonapptextbox());
	       Thread.sleep(2000);
	       
	   		WebElement appdropdown = driver.findElement(By.xpath("//*[@id=\"select2-DrpApplication-results\"]/li/ul"));
	   		List<WebElement> applist = appdropdown.findElements(By.tagName("li"));
	   		for (WebElement li : applist) {
	   			if (li.getText().equals(value)) {
	   				li.click();
	   			}
	   		}
	   		
	   		
	   		}
	    	catch (StaleElementReferenceException e) {
	   		}

	    }
	    
	    @And("^select test suite$")
	    public void select_test_suite() throws Throwable {
	    	try {
	    		click(add.clickontestsuitefield());
	    		
	    		WebElement TSdropdown = driver.findElement(By.xpath("//*[@id=\"select2-DrpTestSuite-results\"]/li/ul"));
		   		List<WebElement> TSlist = TSdropdown.findElements(By.tagName("li"));
		   		for (WebElement li : TSlist) {
		   			if (li.getText().equals(value)) {
		   				li.click();
		   			}
		   		}
	    		
	    	}catch (StaleElementReferenceException e) {
				
			}
	       
	    }
	    
	    @Then("^click on save button of test case$")
	    public void click_on_save_button_of_test_case() throws Throwable {
	    	try {
	    		 click(add.clickonsavebtnofTC());
	    		 wait(add.okbtn());
	    	
	    	}catch (Exception e) {
				log.error("not click on save button of test case");
			}
	       
	    }

}
