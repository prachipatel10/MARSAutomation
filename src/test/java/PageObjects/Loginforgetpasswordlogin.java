package PageObjects;

import java.awt.List;
import java.util.ArrayList;

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
	
	/*public WebElement resetlink() {
		return driver.findElement(link);
	}*/

	
}
