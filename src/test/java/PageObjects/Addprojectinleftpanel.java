package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addprojectinleftpanel {

	public WebDriver driver;
	
	 public Addprojectinleftpanel(WebDriver driver) {
		this.driver = driver;
		
	 }
	 
		 By settingicon=By.xpath("//*[@id=\"kt_quick_panel_toggler_btn\"]/i");
		 By displayprojectlist=By.xpath("//*[@id=\"kt_quick_panel_tab_notifications\"]/div[1]/a[3]/div[2]/div/span");
		 By closewindow=By.xpath("//*[@id=\"kt_quick_panel_close_btn\"]"); 
		 By checkbox=By.xpath("//label[contains(text(),'Aftest')]");
		 
		
				 //     "//*[@id=\"projectname\"]/input[text()='AF4']"); 
		 By savebutton=By.xpath("//*[@id=\"jsondata\"]");
		By forallchechbox=By.xpath("//*[@id='projectdisplaylist']/tbody/tr/td/div/label/span");
		 //By ok=By.xpath("/html/body/div[25]/div/div[3]/button[1]");
		 
		 
			public WebElement clickonsettingicon() {
				return driver.findElement(settingicon);	
	 }
			
			public WebElement clickonprojectdisplaylist() {
				return driver.findElement(displayprojectlist);	
	 }
			
			public WebElement closewindowclick() {
				return driver.findElement(closewindow);	
	 }
			
			public WebElement clickcheckbox() {
				return driver.findElement(checkbox);	
	 }
			
			public WebElement clickonsavebutton() {
				return driver.findElement(savebutton);	
	 }
			public WebElement checkallcheckbox() {
				return (WebElement) driver.findElements(forallchechbox);
						//driver.findElement(forallchechbox);	
	 }
			
			//public WebElement clickonok() {
				//return (WebElement) driver.findElements(ok);
						//driver.findElement(forallchechbox);	
	// }
}
