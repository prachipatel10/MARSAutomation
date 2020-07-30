package StepDefinition;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.Addprojectinleftpanel;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import mars.ConvergesolAutomation.MarsBase;

@RunWith(Cucumber.class)
public class StepdefinitionAddprojectinleftpanel extends MarsBase {
	Addprojectinleftpanel leftpannel = new Addprojectinleftpanel(driver);

	@And("^click on setting icon$")
	public void click_on_setting_icon() throws Throwable {
		try {
			click(leftpannel.clickonsettingicon());
		}catch (Exception e) {
			log.error("not click on setting icon");
		}
	}

	@Then("^click on project display list option$")
	public void click_on_project_displat_list_option() throws Throwable {
		try {
			click(leftpannel.clickonprojectdisplaylist());
			WebDriverWait close = new WebDriverWait(driver, 15);
			close.until(ExpectedConditions.elementToBeClickable(leftpannel.closewindowclick()));
			click(leftpannel.closewindowclick());
		}catch (Exception e) {
			log.error("not click on project display list");
		}	
	}

	@And("^click on checkbox$")
	public void click_on_checkbox() throws Throwable {
		try {
			WebElement table = driver.findElement(By.id("projectdisplaylist"));
			List<WebElement> tablelist = table.findElements(By.tagName("tr"));

			//log.debug(tablelist.size());
			int count = tablelist.size();
			
			for (int i = 1; i < count; i++) {
				//if(textvalue==value) {
				WebElement checkbox = table.findElement(By.xpath("//*[@id='thing-1']["+i+"]/td/div/label/input"));
				String textvalue = table.findElement(By.xpath("//*[@id='thing-1']["+i+"]/td/div/label")).getText();
				//log.debug(textvalue);

				if ((!checkbox.isSelected()) && textvalue.equals(value)) {
					
						 Thread.sleep(2000);
							//checkbox.click();
							JavascriptExecutor executor = (JavascriptExecutor) driver;
							executor.executeScript("arguments[0].click();", checkbox);
							break;
				}
else {
				
				}

									} 
			}
		
	catch (Exception e) {
			log.error("not click on checkbox");
		}
			}

	@Then("^click on save button of display project list$")
	public void click_on_create_button() throws Throwable {
		try {
			click(leftpannel.clickonsavebutton());
		}catch (Exception e) {
			log.error("not click on save button of display project list");
		}
	}

}
