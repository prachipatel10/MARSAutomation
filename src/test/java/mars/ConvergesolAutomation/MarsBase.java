package mars.ConvergesolAutomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import PageObjects.AddAppPrjTSTCDS;
import PageObjects.Loginforgetpasswordlogin;
import cucumber.runtime.StepDefinition;

public class MarsBase {

	public static WebDriver driver;
	public static Properties prop;
	
	Loginforgetpasswordlogin login=new Loginforgetpasswordlogin(driver);
	
	public static Logger log = LogManager.getLogger(StepDefinition.class.getName());
	
	public static WebDriver getDriver() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\ConvergesolAutomation\\src\\test\\java\\mars\\ConvergesolAutomation\\MARSGLOBAL.properties");
		prop.load(fis);
		String browser = prop.getProperty("browserName");
		String browserPath = prop.getProperty("browserPath");

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", browserPath);
			driver = new ChromeDriver();

		} else if (browser.equals("FF")) {
			System.setProperty("webdriver.geckodriver.driver", browserPath);
			driver = new FirefoxDriver();

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static void getURL() {
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void getemailURL() {
			driver.get(prop.getProperty("emailurl"));
			driver.manage().window().maximize();
	}
	
   public static void sleep() {
	   try {
		Thread.sleep(5000);
	} catch (Exception e) {
		log.debug(e);
		
	}
   }
   
   public static void Sendkey(WebElement element, String text1)throws IOException {
		element.sendKeys(text1);
	}
   public static void click(WebElement ele) {
		ele.click();
	}
   
   public static void dclick(WebElement ele) {
	   Actions actions = new Actions(driver);
	   Loginforgetpasswordlogin login=new Loginforgetpasswordlogin(driver);
			   actions.doubleClick(ele).perform();
   }
   
   public static WebDriver driverclose() throws IOException {
		driver.close();
		return driver;
	}  
   
   public static void mouseoverapp()
   {
	   AddAppPrjTSTCDS pm=new AddAppPrjTSTCDS(driver);
	   Actions actions = new Actions(driver);
       //Retrieve WebElement 'Music' to perform mouse hover 
   //	WebElement menuOption = driver.findElement(By.xpath(".//div[contains(text(),'Music')]"));
   	//Mouse hover menuOption 'Music'
   	actions.moveToElement(pm.applicationmenu()).perform();
   }
   
   /*public static void extrarequire() {
	   AddAppPrjTSTCDS p=new AddAppPrjTSTCDS(driver);
   Select option = new Select(p.extrareq());
	option.selectByIndex(2);
   }*/
   public static void mouseoverprj()
   {
	   AddAppPrjTSTCDS pm=new AddAppPrjTSTCDS(driver);
	   Actions actions = new Actions(driver);
   	actions.moveToElement(pm.projectoption()).perform();
  
   }
   
  /* public static void appli() {
	   AddAppPrjTSTCDS pm=new AddAppPrjTSTCDS(driver);
   Select option = new Select(pm.application());
	option.selectByIndex(1);
   
   }*/
   
   public static String date()
   {
	   DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("HH-mm-ss a");
	   LocalTime localTime = LocalTime.now();
	   String localTimeString = FOMATTER.format(localTime);
	   
	  	return localTimeString;
   }
   public static void Recursive()
   {
	   AddAppPrjTSTCDS pm=new AddAppPrjTSTCDS(driver);
	   String loader=pm.loaderpage().getAttribute("style");
	   if(loader == "display: block;")
	   {
		   sleep();
		   Recursive();
	   }
   }
  /* public static void application() {
	   AddAppPrjTSTCDS pr=new AddAppPrjTSTCDS(driver);
	   Select app=new Select();
	   app.selectByIndex(2);
   }*/
   
   
   
}