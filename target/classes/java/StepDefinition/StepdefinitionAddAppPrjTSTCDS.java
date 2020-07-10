package StepDefinition;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.joda.time.DateTime;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import PageObjects.AddAppPrjTSTCDS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.it.Date;
import io.cucumber.junit.Cucumber;
import mars.ConvergesolAutomation.MarsBase;

@RunWith(Cucumber.class)
public class StepdefinitionAddAppPrjTSTCDS extends MarsBase{
       AddAppPrjTSTCDS add = new AddAppPrjTSTCDS(driver);

@Given("^mouseover on application from menu$")
public void mouseover_on_application_from_menu() throws Throwable {
    mouseoverapp();
}

@Then("^click on list option$")
public void click_on_list_option() throws Throwable {
	click(add.applicationlist());
	Recursive();
}

@And("^click on add button$")
public void click_on_add_button() throws Throwable {
	click(add.addbutton());
    }

@Then("^enter name description and version$")
public void enter_name_somethingdescription_something_and_version_something() throws Throwable {
	//DateTime date = new DateTime();  
   // SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
    //String strDate = formatter.format(date);  
	Sendkey(add.name(), date());
	   Sendkey(add.desc(),date());
	   Sendkey(add.version(), "1.1.1");
	  // AddAppPrjTSTCDS pr=new AddAppPrjTSTCDS(driver);
	   Select app=new Select(add.extrareq());
	   app.selectByValue("Infragistics_V_11");
	  // click(add.requ());
	   //extrarequire();
}

@And("^click on save button$")
public void click_on_save_button() throws Throwable {
    click(add.savebtn());
}
@And("^click on ok button$")
public void click_on_ok_button() throws Throwable {
   click(add.okbtn());
}
@Given("^mouseover on project option$")
public void mouseover_on_project_option() throws Throwable {
    mouseoverprj();
    
}
@Then("^click on list option of project$")
public void click_on_list_option_of_project() throws Throwable {
	click(add.projectlist());
	
}

@And("^click on add project button$")
public void click_on_add_project_button() throws Throwable {
	Recursive();
   click(add.addprjbtn());
}

@Then("^enter name description and select application$")
public void enter_name_something_description_something_and_select_application() throws Throwable {
   Sendkey(add.prjname(), date());
   Sendkey(add.prjdese(), date());
  // click(add.prjappfld());
   AddAppPrjTSTCDS pr=new AddAppPrjTSTCDS(driver);
   Select app=new Select(add.prjapplication());
   app.selectByIndex(2);
   //application();
}
}
