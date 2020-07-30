package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SaveAsMove {
	public WebDriver driver;
	
	 public SaveAsMove(WebDriver driver) {
		this.driver = driver;
	 }
	 
	 By project=By.xpath("//body[@class='kt-quick-panel--right kt-demo-panel--right kt-offcanvas-panel--right kt-header--fixed kt-header-mobile--fixed kt-subheader--enabled kt-subheader--fixed kt-subheader--solid kt-aside--enabled kt-aside--fixed']/div[@id='mainbody']/div[@class='kt-grid__item kt-grid__item--fluid kt-grid kt-grid--ver kt-page']/div[@id='kt_aside']/div[@id='kt_aside_menu_wrapper']/div[@id='kt_aside_menu']/ul[@id='leftProjectList']/li[1]/a[1]"); 
	 By Testsuiteoption=By.xpath("//span[contains(text(),'Test Suites')]");
	 By testsuite=By.xpath("//ul[contains(@class,'kt-menu__subnav')]//ul[1]//li[1]//a[1]");
	 By testcase=By.xpath("//*[@id=\"lProjectName\"]/div/ul/li[3]/div/ul/li/div/ul[1]/li/a");
	 By saveastestcase=By.xpath("//span[contains(text(),'Save As Test Case')]");
	 By name=By.xpath("//input[@id='TestCaseName']");
	 By description=By.xpath("//textarea[@id='TestCaseDesc']");
	 By save=By.xpath("//button[@id='btnsaveastestcase']");
	 By storyboardoption=By.xpath("//*[@id=\"lProjectName\"]/div/ul/li[2]/a");
	 By storyboard=By.xpath("//*[@id=\"lProjectName\"]/div/ul/li[2]/div/ul[1]/li/a");
	 By saveasstrb=By.xpath("//*[@id=\"RightStoryboard\"]/ul/li[2]/a/span[2]");
	 By strbname=By.xpath("//*[@id=\"Storyboardname\"]");
	 By strbdescription=By.xpath("//*[@id=\"StoryboardDesc\"]");
	 By strbsave=By.xpath("//*[@id=\"savestoryboard\"]");
	 By moveoption=By.xpath("//*[@id=\"RightTestCase\"]/ul/li[5]/a");
	 By testsuitemove=By.xpath("//*[@id=\"drpTs\"]");
	 By movesave=By.xpath("//*[@id=\"moveTestCassePopup\"]/div/div/div[3]/button[1]");
	 By storyboardopt=By.xpath("//span[@class=\"kt-menu__link-text\"]");
	 By rstoryboard=By.xpath("//span[contains(text(),'Add Storyboard')]");
	 By nm=By.id("contextStoryboardname");
	 By desc=By.id("contextStoryboardDesc");
	//*[@id="lProjectName"]/div/ul/li[2]/a/span[2]
	 By rTC=By.xpath("//span[contains(text(),'Save As Test Case')]");
	
	
	 
	 
	 public WebElement clickonproject() {
			return driver.findElement(project);	
}
	 public WebElement clickonTestsuiteoption() {
			return driver.findElement(Testsuiteoption);	
}
	 public WebElement clickontestsuite() {
			return driver.findElement(testsuite);	
}
	 public WebElement rightclickontestcase() {
			return driver.findElement(testcase);	
}

	 public WebElement clickonsaveastestcseoption() {
			return driver.findElement(saveastestcase);	
}
	 
	 public WebElement namefield() {
			return driver.findElement(name);	
}
	 public WebElement descriptionfield() {
			return driver.findElement(description);	
}
	 public WebElement clickonsaveofsaveas() {
			return driver.findElement(save);	
}
	 
	 public WebElement clickonstoryboardoption() {
			return driver.findElement(storyboardoption);	
}
	
	 public WebElement rightclickonstoryboard() {
			return driver.findElement(storyboard);	
}
	 
	 public WebElement clickonsaveasstrboption() {
			return driver.findElement(saveasstrb);	
}
	 
	 public WebElement storyboardname() {
			return driver.findElement(strbname);	
}
	 
	 public WebElement storyboarddescription() {
			return driver.findElement(strbdescription);	
}
	 
	 public WebElement storyboardsave() {
			return driver.findElement(strbsave);	
}
	 
	 public WebElement moveoptionofstrb() {
			return driver.findElement(moveoption);	
}
	 
	 public WebElement selecttestsuite() {
			return driver.findElement(testsuitemove);	
}
	 
	 public WebElement savemovetestsuite() {
			return driver.findElement(movesave);	
}
	 
	 public WebElement clickonstoryboardopt() {
			return driver.findElement(storyboardopt);	
}
	 
	 public WebElement rclickonstoryboard() {
			return driver.findElement(rstoryboard);	
}
	 
	 public WebElement entername() {
			return driver.findElement(nm);	
}
	 
	 public WebElement enterdesc() {
			return driver.findElement(desc);	
}
	
	 public WebElement clickonsaveAstescase() {
			return driver.findElement(rTC);	
}
	
	
}
