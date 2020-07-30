package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginforgetpasswordlogin {
	public WebDriver driver;
	
	 public Loginforgetpasswordlogin(WebDriver driver) {
		this.driver = driver;
	}
	By forgetlink=By.xpath("//a[@id='kt_login_forgot']");
	By requestbtn=By.xpath("//*[@id=\"kt_login_forgot_submit\"]");
	By emailadd=By.id("kt_email");
	By successmsg=By.xpath("//*[@id=\"kt_login\"]/div/div/div/div[2]/div[1]/div[1]");
	By roundcubewebmail=By.id("rcmloginuser");
	By roundcubewebpwd=By.id("rcmloginpwd");
	By roundcubelogin=By.id("rcmloginsubmit");
	By openemail=By.xpath("//*[@id=\"messagelist\"]/tbody/tr[1]/td[2]/a"); 
	By resetpwd=By.xpath("//*[@id=\"message-htmlpart1\"]/div/table/tbody/tr/td/table/tbody/tr[5]/td/span/a"); 	
	By pwd=By.id("Password");
	By confirmpwd=By.xpath("//*[@id=\"cpassword\"]");
	By resetbutton=By.xpath("//*[@id=\"btnreset\"]");
	By okbuttonofresetpassword=By.xpath("/html/body/div[2]/div/div[3]/button[1]");
	By checkelement=By.id("dropdownbox");
	
	public WebElement link() {
		return driver.findElement(forgetlink);
	}
	
	public WebElement email() {
		return driver.findElement(emailadd);
	}
	
	public WebElement btn() {
		return driver.findElement(requestbtn);
	}
	
	public WebElement forgetlinksend() {
		return driver.findElement(successmsg);
	}
	
	public WebElement roundecubemail() {
		return driver.findElement(roundcubewebmail);
	}
	
	public WebElement roundcubepwd() {
		return driver.findElement(roundcubewebpwd);
	}
	
	public WebElement roundcubeloginbtn() {
		return driver.findElement(roundcubelogin);
	}
	
	public WebElement clickonemail() {
		return driver.findElement(openemail);
	}
	
	public WebElement resetlink() {
		return driver.findElement(resetpwd);
	}
	
	public WebElement rpassword() {
		return driver.findElement(pwd);
	}
	
	public WebElement cnfpassword() {
		return driver.findElement(confirmpwd);
	}
	
	public WebElement resetbtn() {
		return driver.findElement(resetbutton);
	}
	
	public WebElement okbrn() {
		return driver.findElement(okbuttonofresetpassword);
	}
	
	public WebElement check() {
		return driver.findElement(checkelement);
	}

	
}
