package StepDefinition;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import PageObjects.AddAppPrjTSTCDS;
import PageObjects.SaveAsMove;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import mars.ConvergesolAutomation.MarsBase;

@RunWith(Cucumber.class)
public class StepdefinitionSaveAsMove extends MarsBase {
	SaveAsMove savemove = new SaveAsMove(driver);
	AddAppPrjTSTCDS ok = new AddAppPrjTSTCDS(driver);

	@Then("^click on new added project$")
	public void click_on_new_added_project() throws Throwable {
		
		WebElement table = driver.findElement(By.id("leftProjectList"));
		List<WebElement> tablelist = table.findElements(By.tagName("li"));
		System.out.println(tablelist);
		log.debug(tablelist.size());
		int count = tablelist.size();
		log.debug(count);
	for (int i = 1; i < count; i++) {
			WebElement project = table.findElement(By.xpath("//body[@class='kt-quick-panel--right kt-demo-panel--right kt-offcanvas-panel--right kt-header--fixed kt-header-mobile--fixed kt-subheader--enabled kt-subheader--fixed kt-subheader--solid kt-aside--enabled kt-aside--fixed']/div[@id='mainbody']/div[@class='kt-grid__item kt-grid__item--fluid kt-grid kt-grid--ver kt-page']/div[@id='kt_aside']/div[@id='kt_aside_menu_wrapper']/div[@id='kt_aside_menu']/ul[@id='leftProjectList']/li["+ i + "]/a[1]"));
			// *[@id="lProjectName"]/div/ul/li[2]/a/span[2]
			//WebElement project1=table.findElement(By.xpath("//ul[@id='leftProjectList')/li["+i+"]/span[1]"));
			//String prjvalue1=project1.getText();
			String prjvalue =project.getText();
			log.debug(prjvalue);
			//log.debug(prjvalue1);
			//WebElement w=driver.findElement(By.xpath("//body[@class='kt-quick-panel--right kt-demo-panel--right kt-offcanvas-panel--right kt-header--fixed kt-header-mobile--fixed kt-subheader--enabled kt-subheader--fixed kt-subheader--solid kt-aside--enabled kt-aside--fixed']/div[@id='mainbody']/div[@class='kt-grid__item kt-grid__item--fluid kt-grid kt-grid--ver kt-page']/div[@id='kt_aside']/div[@id='kt_aside_menu_wrapper']/div[@id='kt_aside_menu']/ul[@id='leftProjectList']/li[1]/a[1]"));
			//click(w);

			if (prjvalue.equals(value)) {

				Thread.sleep(2000);
				// checkbox.click();
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", project);
				WebElement strb = driver.findElement(By.xpath("//ul[@id='leftProjectList']/li["+i+"]/div/ul/li[2]/a"));
				rclick(strb);

				break;
			} else {
			}
		}
	}


	@And("^rightclick on storyboard$")
	public void rightclick_on_storyboard() throws Throwable {
	}

	@Then("^click on add storyboard$")
	public void click_on_add_storyboard() throws Throwable {

    click(savemove.rclickonstoryboard());
	}

	@And("^enter name and description$")
	public void enter_name_and_description() throws Throwable {
		
		 
		 Sendkey(savemove.entername(), value);
		 Sendkey(savemove.enterdesc(), value);
		 
           
	}

	@Then("^click on save button of add storyboard$")
	public void click_on_save_button_of_add_storyboard() throws Throwable {
		 WebElement savebtn=driver.findElement(By.id("savestoryboardcontext"));
		 click(savebtn);
	}

	 @Then("^click on new added project for saveAs TS$")
	    public void click_on_new_added_project_for_saveAs_TS() throws Throwable {
		 WebElement table = driver.findElement(By.id("leftProjectList"));
			List<WebElement> tablelist = table.findElements(By.tagName("li"));

					int count = tablelist.size();
			
			for (int i = 1; i < count; i++) {
				WebElement project = table.findElement(By.xpath("//body[@class='kt-quick-panel--right kt-demo-panel--right kt-offcanvas-panel--right kt-header--fixed kt-header-mobile--fixed kt-subheader--enabled kt-subheader--fixed kt-subheader--solid kt-aside--enabled kt-aside--fixed']/div[@id='mainbody']/div[@class='kt-grid__item kt-grid__item--fluid kt-grid kt-grid--ver kt-page']/div[@id='kt_aside']/div[@id='kt_aside_menu_wrapper']/div[@id='kt_aside_menu']/ul[@id='leftProjectList']/li["+ i + "]/a[1]"));
				String prjvalue = table.findElement(By.xpath(
						"//body[@class='kt-quick-panel--right kt-demo-panel--right kt-offcanvas-panel--right kt-header--fixed kt-header-mobile--fixed kt-subheader--enabled kt-subheader--fixed kt-subheader--solid kt-aside--enabled kt-aside--fixed']/div[@id='mainbody']/div[@class='kt-grid__item kt-grid__item--fluid kt-grid kt-grid--ver kt-page']/div[@id='kt_aside']/div[@id='kt_aside_menu_wrapper']/div[@id='kt_aside_menu']/ul[@id='leftProjectList']/li["+ i + "]/a[1]/span[2]")).getText();

				if (prjvalue.equals(value)) {

					Thread.sleep(2000);
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].click();", project);
					WebElement TS = project.findElement(By.xpath("//ul[@id='leftProjectList']/li["+i+"]/div/ul/li[3]/a"));
					click(TS);
					WebElement Testsuite = project.findElement(By.xpath("//ul[@id='leftProjectList']/li["+i+"]/div/ul/li[3]/div/ul/li/a"));
					click(Testsuite);
					WebElement testcase = project.findElement(By.xpath("//ul[@id='leftProjectList']/li["+i+"]/div/ul/li[3]/div/ul/li/div/ul"));
					rclick(testcase);

					break;
				} else {
				}
			}
	    }
	
	@Then("^click on Test Suite option$")
	public void click_on_test_suite_option() throws Throwable {	
			}

	@And("^click on any test suite which contain test cases$")
	public void click_on_any_test_suite_which_contain_test_cases() throws Throwable {
	}

	@Then("^right click on test case$")
	public void right_click_on_test_case() throws Throwable {
		
	}

	@And("^click on save as test case option$")
	public void click_on_save_as_test_case_option() throws Throwable {
		try {
			click(savemove.clickonsaveAstescase());
		} catch (Exception e) {
			log.error("not click on save as test caseoption");
		}
	}

	@Then("^remove name description and enter new name description$")
	public void remove_name_description_and_enter_new_name_description() throws Throwable {
		try {
			savemove.namefield().clear();
			savemove.descriptionfield().clear();

			Sendkey(savemove.namefield(), date());
			Sendkey(savemove.descriptionfield(), date());
		} catch (Exception e) {
			log.error("not remove name description or enter name description");
		}
	}

	@And("^click on save button of saveas option$")
	public void click_on_save_button_of_saveas_option() throws Throwable {
		try {
			click(savemove.clickonsaveofsaveas());
			wait(savemove.clickonstoryboardoption());
		} catch (Exception e) {
			log.error("not click on save button of save as option");
		}
	}

	 @And("^click on new added project for saveAs storyboard$")
	    public void click_on_new_added_project_for_saveas_storyboard() throws Throwable {
	       
		 WebElement table = driver.findElement(By.id("leftProjectList"));
			List<WebElement> tablelist = table.findElements(By.tagName("li"));
			
			int count = tablelist.size();
			for (int i = 1; i < count; i++) {
				WebElement project = table.findElement(By.xpath("//body[@class='kt-quick-panel--right kt-demo-panel--right kt-offcanvas-panel--right kt-header--fixed kt-header-mobile--fixed kt-subheader--enabled kt-subheader--fixed kt-subheader--solid kt-aside--enabled kt-aside--fixed']/div[@id='mainbody']/div[@class='kt-grid__item kt-grid__item--fluid kt-grid kt-grid--ver kt-page']/div[@id='kt_aside']/div[@id='kt_aside_menu_wrapper']/div[@id='kt_aside_menu']/ul[@id='leftProjectList']/li["+ i + "]/a[1]"));
				// *[@id="lProjectName"]/div/ul/li[2]/a/span[2]
				String prjvalue = table.findElement(By.xpath(
						"//body[@class='kt-quick-panel--right kt-demo-panel--right kt-offcanvas-panel--right kt-header--fixed kt-header-mobile--fixed kt-subheader--enabled kt-subheader--fixed kt-subheader--solid kt-aside--enabled kt-aside--fixed']/div[@id='mainbody']/div[@class='kt-grid__item kt-grid__item--fluid kt-grid kt-grid--ver kt-page']/div[@id='kt_aside']/div[@id='kt_aside_menu_wrapper']/div[@id='kt_aside_menu']/ul[@id='leftProjectList']/li["+ i + "]/a[1]/span[2]")).getText();
				// log.debug(prjvalue);

				if (prjvalue.equals(value)) {

					Thread.sleep(2000);
					// checkbox.click();
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].click();", project);
					WebElement strb = driver.findElement(By.xpath("//ul[@id='leftProjectList']/li["+i+"]/div/ul/li[2]/a"));
					click(strb);

					break;
				} else {
				}
			}
	    }
	@Then("^click on storyboard option$")
	public void click_on_storyboard_option() throws Throwable {
	}

	@And("^right click on storyboard$")
	public void right_click_on_storyboard() throws Throwable {
		try {
			Actions action = new Actions(driver);
			action.contextClick(savemove.rightclickonstoryboard()).perform();
		} catch (Exception e) {
			log.error("not right click on storyboard");
		}
	}

	@Then("^click on saveAs storyboard$")
	public void click_on_saveas_storyboard() throws Throwable {
		try {
			click(savemove.clickonsaveasstrboption());
		} catch (Exception e) {
			log.error("not click on saveAs storyboard");
		}
	}

	@And("^remove name description and enter name description$")
	public void remove_name_description_and_enter_name_description() throws Throwable {
		try {
			savemove.storyboardname().clear();
			savemove.storyboarddescription().clear();

			Sendkey(savemove.storyboardname(), date());
			Sendkey(savemove.storyboarddescription(), date());
		} catch (Exception e) {
			log.error("not remove name description or enter name description");
		}
	}

	@Then("^click on save button of storyboard$")
	public void click_on_save_button_of_storyboard() throws Throwable {
		try {
			click(savemove.storyboardsave());
			wait(savemove.moveoptionofstrb());
		} catch (Exception e) {
			log.error("not click on save button of storyboard");
		}
	}

	@And("^click on move testcase option$")
	public void click_on_move_testcase_option() throws Throwable {
		try {
			WebElement table = driver.findElement(By.id("leftProjectList"));
			List<WebElement> tablelist = table.findElements(By.tagName("li"));

					int count = tablelist.size();
			
			for (int i = 1; i < count; i++) {
				WebElement project = table.findElement(By.xpath("//body[@class='kt-quick-panel--right kt-demo-panel--right kt-offcanvas-panel--right kt-header--fixed kt-header-mobile--fixed kt-subheader--enabled kt-subheader--fixed kt-subheader--solid kt-aside--enabled kt-aside--fixed']/div[@id='mainbody']/div[@class='kt-grid__item kt-grid__item--fluid kt-grid kt-grid--ver kt-page']/div[@id='kt_aside']/div[@id='kt_aside_menu_wrapper']/div[@id='kt_aside_menu']/ul[@id='leftProjectList']/li["+ i + "]/a[1]"));
				String prjvalue = table.findElement(By.xpath(
						"//body[@class='kt-quick-panel--right kt-demo-panel--right kt-offcanvas-panel--right kt-header--fixed kt-header-mobile--fixed kt-subheader--enabled kt-subheader--fixed kt-subheader--solid kt-aside--enabled kt-aside--fixed']/div[@id='mainbody']/div[@class='kt-grid__item kt-grid__item--fluid kt-grid kt-grid--ver kt-page']/div[@id='kt_aside']/div[@id='kt_aside_menu_wrapper']/div[@id='kt_aside_menu']/ul[@id='leftProjectList']/li["+ i + "]/a[1]/span[2]")).getText();

				if (prjvalue.equals(value)) {

					Thread.sleep(2000);
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].click();", project);
					WebElement TS = project.findElement(By.xpath("//ul[@id='leftProjectList']/li["+i+"]/div/ul/li[3]/a"));
					click(TS);
					WebElement Testsuite = project.findElement(By.xpath("//ul[@id='leftProjectList']/li["+i+"]/div/ul/li[3]/div/ul/li/a"));
					click(Testsuite);
					WebElement testcase = project.findElement(By.xpath("//ul[@id='leftProjectList']/li["+i+"]/div/ul/li[3]/div/ul/li/div/ul"));
					rclick(testcase);

					break;
				} else {
				}
			}
			
			click(savemove.moveoptionofstrb());
			Thread.sleep(2000);
		} catch (Exception e) {
			log.error("not click on move test case option");
		}
	}

	@Then("^select testsuite from dropdown to move$")
	public void select_testsuite_from_dropdown_to_move() throws Throwable {
		try {
			WebElement element1 = driver.findElement(By.xpath("//*[@id=\"clsTSTC\"]/span/span[1]/span/span[2]"));
			click(element1);

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
		} catch (Exception e) {
			log.error("not select test suite from dropdown to move");
		}
	}

	@And("^click on save button of move$")
	public void click_on_save_button_of_move() throws Throwable {
		try {
			click(savemove.savemovetestsuite());
			wait(ok.okbtn());
		} catch (Exception e) {
			log.error("not click on save button f move");
		}
	}
	
}


