package StepDefinition;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.AddVariablekeywordobject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import mars.ConvergesolAutomation.MarsBase;

@RunWith(Cucumber.class)
public class StepdefinitionAddVarkeywobj extends MarsBase {
     AddVariablekeywordobject Varkeywobj=new AddVariablekeywordobject(driver);
     
     @And("^mouseover on variable option$")
     public void mouseover_on_variable_option() throws Throwable {
    	 try {
    		 mouseover(Varkeywobj.variable());
    	 }catch (Exception e) {
			log.error("not mouseover on variable");
		}    
     }

     @Then("^click on list of variable option$")
     public void click_on_list_of_variable_option() throws Throwable {
    	 try {
    		 click(Varkeywobj.clickonlistofvariable());
    		 loader(Varkeywobj.clickonnewvariable());
    	 }catch (Exception e) {
			log.error("not click on list of variable");
		}
     }
     
     @And("^click on new variable button$")
     public void click_on_new_variable_button() throws Throwable {
    	 try {
    		 click(Varkeywobj.clickonnewvariable());
    	 }catch (Exception e) {
			log.error("not click on new button of variable");
		}         
     }

     @Then("^enter name value and select type$")
     public void enter_name_value_and_select_type() throws Throwable {
    	 try {
    		 
        Sendkey(Varkeywobj.entername(), value);
        Sendkey(Varkeywobj.entervalue(), value);
        click(Varkeywobj.clickontypefield());
                Thread.sleep(2000);
        WebElement typedropdown= driver.findElement(By.xpath("//*[@id=\"select2-DrpType-results\"]"));
        List<WebElement> typelist=typedropdown.findElements(By.tagName("li"));
        for (WebElement li : typelist) {
        if (li.getText().equals("MODAL_VAR")) {
             li.click();
           }
        }
        }catch (StaleElementReferenceException e) {
		}
             }

     @And("^click on save button of variable$")
     public void click_on_save_button_of_variable() throws Throwable {
    	 try {
    		 click(Varkeywobj.clickonsavebutton());
    		 wait(Varkeywobj.keyword());
    	 }catch (Exception e) {
			log.error("not click on save button of add new variable ");
		}
          }
     
     @And("^mouseover on keyword option$")
     public void mouseover_on_keyword_option() throws Throwable {
    	 try {
    		 mouseover(Varkeywobj.keyword());
    	 }catch (Exception e) {
			log.error("not mouseover on keyword");
		}       
     }

     @Then("^click on list of keyword option$")
     public void click_on_list_of_keyword_option() throws Throwable {
    	
    		 click(Varkeywobj.clickonlistofkeyword());
    		loader(Varkeywobj.clickonnewkeyword());
    	          
     }

     @And("^click on new keyword button$")
     public void click_on_new_keyword_button() throws Throwable {
    	//Thread.sleep(5000);
    	 
    WebDriverWait wait= new WebDriverWait(driver,10);
    wait.until(ExpectedConditions.elementToBeClickable(Varkeywobj.clickonnewkeyword()));
    		click(Varkeywobj.clickonnewkeyword());
    	
         
     }
     
    /* @Then("^enter name and select control type$")
     public void enter_name_and_select_control_type() throws Throwable {
    	 try {
         Sendkey(Varkeywobj.enternameofkeyword(), value);
         //Thread.sleep(2000);
         click(Varkeywobj.clickoncontroltypefield());
         Thread.sleep(1000);
        	 WebElement controltypedropdown= driver.findElement(By.xpath("//*[@id=\"select2-sDrpControlType-results\"]/li/ul"));
             List<WebElement> typelist=controltypedropdown.findElements(By.tagName("li"));
             for (WebElement li : typelist) {
             if (li.getText().equals("None")) {
                  li.click();
                  	 
         }
             }
         }
             catch (StaleElementReferenceException e) {
		}
         
     }

     @And("^click on save button of keyword$")
     public void click_on_save_button_of_keyword() throws Throwable {
    	 try {
    		 click(Varkeywobj.clickonsavebuttonofkeyword());
    		 wait(Varkeywobj.clickonobjectoption());
    	 }catch (Exception e) {
			log.error("not click on save of keyword");
		}
        
     }
     
     @And("^mouseover on object option$")
     public void mouseover_on_object_option() throws Throwable {
    	 try {
    		 mouseover(Varkeywobj.clickonobjectoption());
    	 }catch (Exception e) {
			log.error("not mouseover on object");
		}
        
     }

     @Then("^click on list of object option$")
     public void click_on_list_of_object_option() throws Throwable {
    	 try {
    		 click(Varkeywobj.clickonlistofobject());
    		 loader(Varkeywobj.clickonnewpegwindowbutton());
             //Thread.sleep(3000);
    	 }catch (Exception e) {
			log.error("not click on list of object");
		}        
     }
    

    /* @And("^click on insert pegwondow object button$")
     public void click_on_insert_pegwondow_object_button() throws Throwable {
    	 try {
    		 click(Varkeywobj.clickonnewpegwindowbutton());
    		 Thread.sleep(2000);
    	 }catch (Exception e) {
			log.error("not click on insert pegwindow of object");
		} 
        
     }

     @Then("^enter name select application enter internal access$")
     public void enter_name_select_application_enter_internal_access() throws Throwable {
    	 try {
    		 Sendkey(Varkeywobj.enterpegobjectname(), value);
             //click(Varkeywobj.clickonappfield());
             Select opt=new Select(Varkeywobj.clickonappfield());
             opt.selectByVisibleText("Opics4.2");
             //Thread.sleep(2000);
             Sendkey(Varkeywobj.enterinternalaccess(), value);
            // Thread.sleep(2000);
    	 }catch (Exception e) {
			log.error("not add name or application or internal access of new pegwinow object");
		}  
     }
     
     @And("^click on insert peg button of insert peg$")
     public void click_on_insert_peg_button() throws Throwable {
    	 try {
             click(Varkeywobj.clickonpegbuttoninsert());
    	 }catch (Exception e) {
			log.error("not click on insert pegbutton of pegwindow object");
		} 
     }

     @And("^click on new object button$")
     public void click_on_new_object_button() throws Throwable {
    	 try {
             click(Varkeywobj.clickonnewobjbutton());
    	 }catch (Exception e) {
			log.error("not click on new object of  object");
		} 
     }

     @Then("^enter name select object type select application select pegwindow and enter internal access$")
     public void enter_name_select_object_type_select_application_select_pegwindow_and_enter_internal_access() throws Throwable {
    	 try {
    		 Sendkey(Varkeywobj.enterobjname(), value);
             Select objtype=new Select(Varkeywobj.selectobjtype());
             objtype.selectByVisibleText("None");
             Thread.sleep(2000);
             Select app=new Select(Varkeywobj.selectapp());
             app.selectByVisibleText("Opics4.2");
             Thread.sleep(2000);
             Select peg=new Select(Varkeywobj.selectpegwindow());
             peg.selectByVisibleText("ASSET_IMPLY");
            // Thread.sleep(2000);
             Sendkey(Varkeywobj.enterquickaccess(), value);
    	 }catch (Exception e) {
			log.error("not add name or object type or application or pegwindow or internal access");
		}
        
     }
     
     @And("^click on save button of object$")
     public void click_on_save_button_of_object() throws Throwable {
    	 try {
             click(Varkeywobj.saveobject());

    	 }catch (Exception e) {
			log.error("not click on save button of object");
		}
     }*/
     
    /* @Then("^click on usename for signout$")
     public void click_on_usename_for_signout() throws Throwable {
         click(Varkeywobj.clickonusername());
     }

     @And("^click on signout option$")
     public void click_on_signout_option() throws Throwable {
         click(Varkeywobj.clickonsignout());
     } */
}
