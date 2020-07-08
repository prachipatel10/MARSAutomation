package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MarsLogin {
	public WebDriver driver;
	
	public MarsLogin(WebDriver driver) {
		this.driver = driver;
	}
	By unm=By.id("email");
	By pwd=By.id("password");
	By login=By.id("kt_login_signin_submit_In");
	
	public WebElement Username() {
		return driver.findElement(unm);
	}

	public WebElement Password() {
		return driver.findElement(pwd);
	}

	public WebElement Loginbutton() {
		return driver.findElement(login);
	}
	

}
