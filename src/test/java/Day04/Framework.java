package Day04;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Framework {
	
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	
	
	public static void browser(String browserValue)
	{
		try {
			switch(browserValue) 
			{
			case "Chrome":
				driver = new ChromeDriver();
				test.log(LogStatus.INFO,"Open Chrome Browser");
				break;
			case "FireFox":
				driver = new FirefoxDriver();
				test.log(LogStatus.INFO,"Open Firefox Browser");
				break;
			case "IE":
				driver = new InternetExplorerDriver();
				test.log(LogStatus.INFO,"Open IE Browser");
				break;
			case "Edge":
				driver = new EdgeDriver();
				test.log(LogStatus.INFO,"Open EDGE Browser");
				break;
			
			}
		} catch (Exception e) 
		{
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}	
	public static void application(String url)
	{
		try 
		{
			driver.get(url);
			test.log(LogStatus.INFO,"Open Application URL : "+ url);
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void typeIn(String xpathValue,String dataValue,String fieldName)
	{
		try {
			driver.findElement(By.xpath(xpathValue)).sendKeys(dataValue);
			test.log(LogStatus.INFO, "User Entered value in "+fieldName+" as "+dataValue);
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void clickIn(String xpathValue,String fieldName)
	{
		try {
			driver.findElement(By.xpath(xpathValue)).click();
			test.log(LogStatus.INFO, "User clicked " +fieldName);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void clearAll(String xpathValue,String fieldName)
	{
		try {
			driver.findElement(By.xpath(xpathValue)).clear();
			test.log(LogStatus.INFO, "User Cleared in "+fieldName);
		} catch (Exception e) {
			
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void selectDropDownByValue(String xpathValue,String dataValue,String fieldName)
	{
		try {
			Select dropdown = new Select(driver.findElement(By.xpath(xpathValue)));
			dropdown.selectByValue(dataValue);
			test.log(LogStatus.INFO, "User Select Dropdown in "+fieldName+" as "+dataValue);
		} catch (Exception e) {
			
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void selectDropDownByText(String xpathValue,String dataValue,String fieldName)
	{
		try {
			Select dropdown = new Select(driver.findElement(By.xpath(xpathValue)));
			dropdown.selectByVisibleText(dataValue);
			test.log(LogStatus.INFO, "User Select Dropdown in "+fieldName+" as "+dataValue);
		} catch (Exception e) {
			
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void selectDropDownByIndex(String xpathValue,int dataValue,String fieldName)
	{
		try {
			Select dropdown = new Select(driver.findElement(By.xpath(xpathValue)));
			dropdown.selectByIndex(dataValue);
			test.log(LogStatus.INFO, "User Select Dropdown in "+fieldName+" as "+dataValue);
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
		
	public static void alertok()
	{
		try {
			driver.switchTo().alert().accept();
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void alertCancel() 
	{
		try {
			driver.switchTo().alert().dismiss();
		} catch (Exception e) {
			
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void alertTypeIn(String dataValue)
	{
		try {
			driver.switchTo().alert().sendKeys(dataValue);
		} catch (Exception e) {
			
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void switchToframe(String frameIdName)
	{
		try {
			driver.switchTo().frame(frameIdName);
		} catch (Exception e) {
			
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void switchBackFromframe()
	{
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void switchToWindow(String windowId)
	{
		try {
			driver.switchTo().window(windowId);
		} catch (Exception e) {
			
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static String getCurrentWindowID()
	{
		try {
			return driver.getWindowHandle();
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
			return null;
		}
			
	}
	
	public static Set<String> getAllWindowID()
	{
		
			try {
				return driver.getWindowHandles();
			} catch (Exception e) {
				
				e.printStackTrace();
				test.log(LogStatus.ERROR, e.getMessage());
				return null;
			}
		
	}
	
	public static void windowMax()
	{
		try 
		{
			driver.manage().window().maximize();
			test.log(LogStatus.INFO, "User Maximize Window");
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void windowMin()
	{
		try {
			driver.manage().window().minimize();
			test.log(LogStatus.INFO, "User Minimize Window");
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void windowFullScreen()
	{
		try 
		{
			driver.manage().window().fullscreen();
			test.log(LogStatus.INFO, "FullScreen Window");
		} catch (Exception e) {
			
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void browserClose()
	{
		try {
			driver.close();
			test.log(LogStatus.INFO, "User closes the browser");
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void browserQuit()
	{
		try {
			driver.quit();
			test.log(LogStatus.INFO, "User QUIT Window");
		} 
		catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void actionDoubleClick(String xpathValue)
	{
		try 
		{
			Actions action = new Actions(driver);
			WebElement element = driver.findElement(By.xpath(xpathValue));
			action.doubleClick(element).build().perform();
		} 
		
		catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void actionClick(String xpathValue)
	{
		try {
			Actions action = new Actions(driver);
			WebElement element = driver.findElement(By.xpath(xpathValue));
			action.doubleClick(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void actionRightClick(String xpathValue)
	{
		try {
			Actions action = new Actions(driver);
			WebElement element = driver.findElement(By.xpath(xpathValue));
			action.doubleClick(element).build().perform();
		} catch (Exception e) {
			
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void actionMouseHover(String xpathValue)
	{
		try {
			Actions action = new Actions(driver);
			WebElement element = driver.findElement(By.xpath(xpathValue));
			action.moveToElement(element).build().perform();
		} catch (Exception e) {
			
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void actionDragAndDrop(String srcXpathValue,String desXpathValue)
	{
		try {
			Actions action = new Actions(driver);
			WebElement srcElement = driver.findElement(By.xpath(srcXpathValue));
			WebElement desElement = driver.findElement(By.xpath(desXpathValue));		
			action.dragAndDrop(srcElement,desElement).build().perform();
		} catch (Exception e) {
			
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void screenShot(String fileName) throws Exception // taking screenshot
	{
		try {
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File des = new File(".\\src\\test\\resources\\screenshot\\"+fileName+".png");
			FileUtils.copyFile(src, des);
		} catch (WebDriverException e) {
			
		} catch (IOException e) {
			
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		}
	}
	
	public static void passScreenShot(String fileName)
	{
		try {
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File des = new File(".\\src\\test\\resources\\screenshot\\pass\\"+fileName+".png");
			FileUtils.copyFile(src, des);
			test.log(LogStatus.PASS, test.addScreenCapture(des.getAbsolutePath()));
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		} 
	}
	public static void failScreenShot(String fileName)
	{
		try {
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File des = new File(".\\src\\test\\resources\\screenshot\\fail\\"+fileName+".png");
			FileUtils.copyFile(src, des);
			test.log(LogStatus.FAIL, test.addScreenCapture(des.getAbsolutePath()));
		} catch (Exception e) {
			e.printStackTrace();
			test.log(LogStatus.ERROR, e.getMessage());
		} 
	}
	
	
	
	public static void reportStart(String fileName)
	{
		report = new ExtentReports(".\\src\\test\\resources\\report\\"+fileName+".html");
	}
	
	public static void reportEnd()
	{
		report.flush();
	}
	
	public static void testCaseStart(String testCaseId,String testDescription)
	{
		test = report.startTest(testCaseId,testDescription);
	}
	
	public static void testCaseEnd()
	{
		report.endTest(test);
	}
	
	
}
