package mars.ConvergesolAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {

	public static WebDriver driver;
	public static Properties prop;
	public static String reportlocation = "C:\\ConvergesolAutomation\\src\\test\\java";

	public static WebDriver getDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\ConvergesolAutomation\\src\\test\\java\\Perfleek\\ConvergesolAutomation\\Global.properties");
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

	public static WebDriver CloseDriver() throws IOException {
		driver.close();
		return driver;

	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void Sendkey(WebElement element, String text1) {
		element.sendKeys(text1);
	}

	public static void MouseOver(WebElement element) {
		Actions actObj = new Actions(driver);
		actObj.moveToElement(element).build().perform();
	}

	public static String fn_GetTimeStamp() {
		DateFormat DF = DateFormat.getDateTimeInstance();
		Date dte = new Date();
		String DateValue = DF.format(dte);
		DateValue = DateValue.replaceAll(":", "_");
		DateValue = DateValue.replaceAll(",", "");
		return DateValue;
	}

	public static String fn_TakeSnapshot(WebDriver driver, String DestFilePath) throws IOException {
		String TS = fn_GetTimeStamp();
		TakesScreenshot tss = (TakesScreenshot) driver;
		File srcfileObj = tss.getScreenshotAs(OutputType.FILE);
		DestFilePath = DestFilePath + TS + ".png";
		File DestFileObj = new File(DestFilePath);
		FileUtils.copyFile(srcfileObj, DestFileObj);
		return DestFilePath;
	}

	public static void fn_SelectVS(WebElement element, String VisibleText) {
		Select selObj = new Select(element);
		selObj.selectByVisibleText(VisibleText);
	}

	public static void fn_SelectIV(WebElement element, int IndexValue) {
		Select selObj = new Select(element);
		selObj.selectByIndex(IndexValue);
	}

	public static void fn_SelectVV(WebElement element, String Value) {
		Select selObj = new Select(element);
		selObj.selectByValue(Value);
	}

	public void Sendkey(WebElement element, Keys enter) {
		element.sendKeys(enter);

	}

	public static void JavascriptClick(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	
	}

	public static void JavascriptSendKeys(WebElement element,String text1) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].value= '4242424242424242';", element);
		
	}

}
