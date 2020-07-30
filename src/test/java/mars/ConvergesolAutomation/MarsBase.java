package mars.ConvergesolAutomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

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
			/*ChromeOptions options = new ChromeOptions();
	        options.addArguments("headless");
	        options.addArguments("disable-gpu");
	        options.addArguments("window-size=1200,1100");
			driver = new ChromeDriver(options);*/
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
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
   
   
   public static void Sendkey(WebElement element, String text1)throws IOException {
		element.sendKeys(text1);
	}
   public static void click(WebElement ele) {
		ele.click();
	}
   
   public static void dclick(WebElement ele) {
	   Actions actions = new Actions(driver);
			   actions.doubleClick(ele).perform();
   }
   
   public static void rclick(WebElement re) {
	   Actions actions = new Actions(driver);
			   actions.contextClick(re).build().perform();
   }
   
   public static WebDriver driverclose() throws IOException {
		driver.quit();
		return driver;
	}  
   
   public static void mouseover(WebElement mouseover)
   {
	  
	   Actions actions = new Actions(driver);
         	actions.moveToElement(mouseover).perform();
   }
   
   /*public static void extrarequire() {
	   AddAppPrjTSTCDS p=new AddAppPrjTSTCDS(driver);
   Select option = new Select(p.extrareq());
	option.selectByIndex(2);
   }*/
  
   
   
  /* public static void appli() {
	   AddAppPrjTSTCDS pm=new AddAppPrjTSTCDS(driver);
   Select option = new Select(pm.application());
	option.selectByIndex(1);
   
   }*/
   
   public static String date()
   {
	   SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy HH_mm_ss");  
	    Date date = new Date();  
	    String datetime=formatter.format(date);

	  	return datetime;
   }
   public static String value=date();
  public static void wait(WebElement e) throws InterruptedException
   {
	  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(30, TimeUnit.SECONDS)
		       .pollingEvery(5, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);
		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return e;
		     }
		   });
   }
  
  public static void loader(WebElement el) throws InterruptedException
  {
	
	  WebDriverWait wait = new WebDriverWait(driver,30);
	  wait.until(ExpectedConditions.visibilityOf(el));
	  
	 /* AddAppPrjTSTCDS pm=new AddAppPrjTSTCDS(driver);
	  WebElement l= driver.findElement(By.xpath("/html/body/div[2]"));
	  
	  while(l.isDisplayed())
	  {
		  Thread.sleep(2000);
		  loader();
	  }*/
	   //String loader=pm.loaderpage().getAttribute("style");
	   //if(loader == "display: inline-block;")
	  // {
           // Thread.sleep(5000);		 
            //Recursive();
	  // }
	  
	 /* AddAppPrjTSTCDS pm=new AddAppPrjTSTCDS(driver);
	  for(int i=1;i<=100;i++)
	  {
		  if(pm.okbtn().isDisplayed()) {
			  click(pm.okbtn());
			  break;
		  }
		  else {
			 // Wait wait = new FluentWait<WebDriver>(driver)
					 // .withTimeout(50, TimeUnit.SECONDS)
					 // .pollingevery(3, TimeUnit.SECONDS)
					 // .ignoring(NoSuchElementException.class);
			  Thread.sleep(5000);
			  i++;
		  }
	  }*/
  }
  /* public static void application() {
	   AddAppPrjTSTCDS pr=new AddAppPrjTSTCDS(driver);
	   Select app=new Select();
	   app.selectByIndex(2);
   }*/
   
   
   
}