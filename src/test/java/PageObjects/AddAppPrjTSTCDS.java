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
		By req=By.xpath("//*[@id=\"frmapplication\"]/div[4]/span/span[1]/span/ul/li/input");
		By requi=By.xpath("//ul[@class='select2-results__options select2-results__options--nested']");
		By save=By.xpath("//*[@id=\"addedapplication\"]");
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
			return driver.findElement(requi);
		}
		public WebElement savebtn()
		{
			return driver.findElement(save);
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
}
