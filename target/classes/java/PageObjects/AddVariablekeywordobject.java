package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddVariablekeywordobject {
	
	public WebDriver driver;
	
	 public AddVariablekeywordobject(WebDriver driver) {
		this.driver = driver;
	 }

	 By variableoption=By.xpath("//*[@id=\"kt_header_menu\"]/ul/li[6]/a/span");
	 By listoptionofvariable=By.xpath("//*[@id=\"kt_header_menu\"]/ul/li[6]/div/ul/li[1]/a/span[2]");
	 By newvariable=By.linkText("New Variable");
	 By variablename=By.id("fieldname");
	 By variablevalue=By.id("displayname");
	 By typefield=By.xpath("//*[@id=\"select2-DrpType-container\"]");
	 By savebutton=By.cssSelector("#addeditvariable");
	 
	 By keywordoption=By.xpath("//span[contains(text(),'Keyword')]");
	 By listoptionofkeyword=By.xpath("//*[@id=\"kt_header_menu\"]/ul/li[7]/div/ul/li/a/span[2]");
	 
	 By newkeyword=By.xpath("//button[@class='btn btn-brand btn-elevate btn-icon-sm']");
	 By keywordname=By.id("keywordname");
	 By keywordcontroltype=By.xpath("//*[@id=\"frmkeyword\"]/div[2]/span/span[1]/span/ul/li/input");
	 By keywordsavebutton=By.id("addedkeyword");
	 
	 
	 By objectoption=By.xpath("//*[@id=\"kt_header_menu\"]/ul/li[8]/a/span");
	 By listoptionofobject=By.xpath("//*[@id=\"kt_header_menu\"]/ul/li[8]/div/ul/li[1]/a/span[2]");
	 By insertpegwindowbutton=By.xpath("//*[@id=\"kt_content\"]/div[2]/div[1]/div[2]/div/div/a[2]");
	 By pegobjectname=By.xpath("//*[@id=\"pegobjecthappyname\"]");
	 By appfield=By.id("pegapp");
	 By internalaccess=By.id("pegquickaccess");
	 By savepeg=By.id("peginsert");
	 By newobjectbutton=By.xpath("//*[@id=\"kt_content\"]/div[2]/div[1]/div[2]/div/div/a[1]");
	 By objname=By.id("objecthappyname");
	 By objtype=By.id("drpObjecttype");
	 By application=By.id("app");
	 By pegwindow=By.id("DrpPeg");
	 By quickaccess=By.id("quickaccess");
	 By saveobj=By.id("saveobject");
	 By username=By.xpath("//*[@id=\"dropdownbox\"]/div");
	 By signout=By.xpath("//*[@id=\"UserHeaderDropdown\"]/div/div/a");
	 
	 public WebElement variable() {
		return driver.findElement(variableoption);
	 }
	 
	 public WebElement clickonlistofvariable() {
			return driver.findElement(listoptionofvariable);
		 }
	 
	 public WebElement clickonnewvariable() {
			return driver.findElement(newvariable);
		 }
	 
	 public WebElement entername() {
			return driver.findElement(variablename);
		 }
	 
	 public WebElement entervalue() {
			return driver.findElement(variablevalue);
		 }
	 
	 public WebElement clickontypefield() {
			return driver.findElement(typefield);
		 }
	 
	 public WebElement clickonsavebutton() {
			return driver.findElement(savebutton);
		 }
	 
	 
	 public WebElement keyword() {
			return driver.findElement(keywordoption);
		 }
		 
		 public WebElement clickonlistofkeyword() {
				return driver.findElement(listoptionofkeyword);
			 }
		 
		 public WebElement clickonnewkeyword() {
				return driver.findElement(newkeyword);
			 }
		 
		 public WebElement enternameofkeyword() {
				return driver.findElement(keywordname);
			 }
		 
		
		 public WebElement clickoncontroltypefield() {
				return driver.findElement(keywordcontroltype);
			 }
		 
		 public WebElement clickonsavebuttonofkeyword() {
				return driver.findElement(keywordsavebutton);
			 }
		 
		 public WebElement clickonobjectoption() {
				return driver.findElement(objectoption);
			 }
		 
		 public WebElement clickonlistofobject() {
				return driver.findElement(listoptionofobject);
			 }
		 
		 public WebElement clickonnewpegwindowbutton() {
				return driver.findElement(insertpegwindowbutton);
			 }
		 
		 public WebElement enterpegobjectname() {
				return driver.findElement(pegobjectname);
			 }
	 
		 public WebElement clickonappfield() {
				return driver.findElement(appfield);
			 }
		 
		 public WebElement enterinternalaccess() {
				return driver.findElement(internalaccess);
			 }
		 
		 public WebElement clickonpegbuttoninsert() {
				return driver.findElement(savepeg);
			 }
		 
		 public WebElement clickonnewobjbutton() {
				return driver.findElement(newobjectbutton);
			 }
		 
		 public WebElement enterobjname() {
				return driver.findElement(objname);
			 }
		 
		 public WebElement selectobjtype() {
				return driver.findElement(objtype);
			 }
		 
		 public WebElement selectapp() {
				return driver.findElement(application);
			 }
		 
		 public WebElement selectpegwindow() {
				return driver.findElement(pegwindow);
			 }
		 
		 public WebElement enterquickaccess() {
				return driver.findElement(quickaccess);
			 }
		 
		 public WebElement saveobject() {
				return driver.findElement(saveobj);
			 }
		 
		 public WebElement clickonusername() {
				return driver.findElement(username);
			 }
		 
		 public WebElement clickonsignout() {
				return driver.findElement(signout);
			 }
	 
		
	 
}
