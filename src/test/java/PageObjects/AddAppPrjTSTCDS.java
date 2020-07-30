package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddAppPrjTSTCDS {
	public WebDriver driver;
	
	 public AddAppPrjTSTCDS(WebDriver driver) {
		this.driver = driver;
	 }
	 
	 By appopt=By.xpath("//*[@id=\"kt_header_menu\"]/ul/li[1]/a");
		By applist=By.xpath("//*[@id=\"kt_header_menu\"]/ul/li[1]/div/ul/li/a/span[2]");
		By addbtn=By.xpath("//*[@id=\"kt_content\"]/div[2]/div/div[1]/div[2]/div/div/button");
		By name=By.id("applicationname");
		By desc=By.id("applicationdesc");
		By ver=By.id("applicationversion");
		By clickreq=By.xpath("//input[@class='select2-search__field']"); 
		By requi=By.xpath("//*[@id=\"select2-sDrpExtraReq-results\"]/li/ul/li");
		//By savebtnofapplication=By.xpath("//*[@id=\"addedapplication\"]");
		By savebtnofapplication=By.id("addedapplication");
		By savebtnofproject=By.xpath("//*[@id=\"addedproject\"]");
		By ok=By.xpath("/html/body/div[25]/div/div[3]/button[1]");
		 By prjopt=By.xpath("//*[@id=\"kt_header_menu\"]/ul/li[2]/a/span");
		 By prjlist=By.xpath("//*[@id=\"kt_header_menu\"]/ul/li[2]/div/ul/li/a/span[2]");
		 By addprj=By.xpath("//button[contains(text(),'New Project')]");
		 By prjname=By.id("projectname");
		 By prjdesc=By.id("projectdesc");
		 By prjapp=By.xpath("//*[@id=\"select2-sDrpApplication-results\"]/li/ul");
		 By prjappfield=By.xpath("//*[@id=\"frmproject\"]/div[3]/span/span[1]/span/ul/li/input");
		 By app=By.xpath("//*[@id=\"select2-sDrpApplication-results\"]/li/ul");
		 By loader=By.xpath("/html/body/div[2]");	
		 By mouseoverontestsuite=By.xpath("//*[@id=\"kt_header_menu\"]/ul/li[3]/a/span");
		 By testsuitelistoption=By.xpath("//*[@id=\"kt_header_menu\"]/ul/li[3]/div/ul/li[1]/a/span[2]");
		 By addbuttonoftestsuite=By.xpath("//button[contains(text(),'New Test Suite')]");
		 By TSname=By.id("testsuitename");
		 By TSdescription=By.id("testsuitedesc");
		 By applicationoftestsuite=By.xpath("//*[@id=\"frmtestsuite\"]/div[3]/span/span[1]/span/ul/li/input");
		 By savebuttonoftestsuite=By.cssSelector("#addedittestsuite");
		 By testcaseoption=By.xpath("//*[@id=\"kt_header_menu\"]/ul/li[4]/a/span");
		 By testcaselistoption=By.xpath("//*[@id=\"kt_header_menu\"]/ul/li[4]/div/ul/li/a/span[2]");
		 By newtestcasebutton=By.xpath("//*[@id=\"kt_content\"]/div[2]/div/div[1]/div[2]/div/div/a");
		 By testcasename=By.id("testcasename");
		 By testcasedescription=By.id("testcasedesc");
		 By appfieldofTC=By.xpath("//*[@id=\"frmAddEditTestCase\"]/div[3]/span/span[1]/span/ul/li/input");
		 By savebtnofTC=By.id("addedittestcase");
		 By projectfield=By.xpath("//*[@id=\"frmtestsuite\"]/div[4]/span/span[1]/span/ul/li");
		 
		 By testsuitefield=By.xpath("//*[@id=\"clsTestSuite\"]/span/span[1]/span/span[2]");
		 
		 
		public WebElement applicationmenu() {
			return driver.findElement(appopt);
		}
		
		public WebElement applicationlist() {
			return driver.findElement(applist);
		}
		
		public WebElement addbutton()
		{
			return driver.findElement(addbtn);
		}
		
		public WebElement name()
		{
			return driver.findElement(name);
		}
		public WebElement desc()
		{
			return driver.findElement(desc);
		}
		public WebElement version()
		{
			return driver.findElement(ver);
		}
		
		public WebElement extrareq()
		{
			return driver.findElement(clickreq);
		}
		
		public WebElement selectrequirement()
		{
			return driver.findElement(requi);
		}
		
		public WebElement savebtn()
		{
			return driver.findElement(savebtnofapplication);
		}
		public WebElement okbtn()
		{
			return driver.findElement(ok);
		}
		public WebElement projectoption()
		{
			return driver.findElement(prjopt);
		}
		public WebElement projectlist()
		{
			return driver.findElement(prjlist);
		}
		public WebElement application()
		{
			return driver.findElement(app);
		}
		public WebElement loaderpage()
		{
			return driver.findElement(loader);
		}
		public WebElement addprjbtn()
		{
			return driver.findElement(addprj);
		}
		public WebElement prjname() {
			return driver.findElement(prjname);
		}
		public WebElement prjdese() {
			return driver.findElement(prjdesc);
		}
		public WebElement prjappfld() {
			return driver.findElement(prjappfield);
		}
		public WebElement prjapplication() {
			return driver.findElement(prjapp);
		}
		public WebElement savebtnproject()
		{
			return driver.findElement(savebtnofproject);
		}
		public WebElement mouseoverontestsuiteoption()
		{
			return driver.findElement(mouseoverontestsuite);
		}
		public WebElement clickonlistoftestsuite()
		{
			return driver.findElement(testsuitelistoption);
		}
		public WebElement clickonaddbuttonoftestsuite()
		{
			return driver.findElement(addbuttonoftestsuite);
		}
		
		public WebElement entertestsuitename()
		{
			return driver.findElement(TSname);
		}
		
		public WebElement entertestsuitedescription()
		{
			return driver.findElement(TSdescription);
		}
		
		public WebElement selectapplicationoftessuite()
		{
			return driver.findElement(applicationoftestsuite);
			
		}
		
		public WebElement clickonsavebuttonoftestsuite()
		{
			return driver.findElement(savebuttonoftestsuite);
			
		}
		
		public WebElement mouseoverontestcaseoption()
		{
			return driver.findElement(testcaseoption);
			
		}
		
		public WebElement clickontestcaselistoption()
		{
			return driver.findElement(testcaselistoption);
			
		}
		
		public WebElement clickonnewbtnoftestcase()
		{
			return driver.findElement(newtestcasebutton);
			
		}
		
		public WebElement enterTCname()
		{
			return driver.findElement(testcasename);
			
		}
		
		public WebElement enterTCdesc()
		{
			return driver.findElement(testcasedescription);
			
		}
		
		public WebElement clickonapptextbox()
		{
			return driver.findElement(appfieldofTC);
			
		}
		
		public WebElement clickonsavebtnofTC()
		{
			return driver.findElement(savebtnofTC);
			
		}
		public WebElement clickonprojectfield()
		{
			return driver.findElement(projectfield);
			
		}
		public WebElement clickontestsuitefield()
		{
			return driver.findElement(testsuitefield);
			
		}
}
