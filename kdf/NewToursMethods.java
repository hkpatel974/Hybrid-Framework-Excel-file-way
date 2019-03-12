package kdf;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;

public class NewToursMethods extends StaticVariables {

	static WebDriver driver;

	public void openBrowser(String param)
	{		
		
		if(param.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		if(param.equalsIgnoreCase("Chrome"))
		{
			// Launch the chrome browser
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Hemant Patel\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
						
		}
		if(param.equalsIgnoreCase("IE"))
		{
			
			// Launch the IE browser
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Hemant Patel\\Desktop\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}

	public void navigateTo(String baseUrl)
	{
		driver.get(baseUrl);
	}
	public void enterUsername(String locators, String value, String param) 
	{
		if(locators.equals("id"))
		{
			driver.findElement(By.id(value)).sendKeys(param);
		}
		if(locators.equals("name"))
		{
			driver.findElement(By.name(value)).sendKeys(param);
		}
		if(locators.equals("cssSelector"))
		{
			driver.findElement(By.cssSelector(value)).sendKeys(param);
		}
	    if(locators.equals("xpath"))
		{
			driver.findElement(By.xpath(value)).sendKeys("param");
		}
		
	}
	public void enterPassword(String locators, String value, String param)
	{
		if(locators.equals("id"))
		{
			driver.findElement(By.id(value)).sendKeys(param);
		}
		if(locators.equals("name"))
		{
			driver.findElement(By.name(value)).sendKeys(param);
		}
		if(locators.equals("cssSelector"))
		{
			driver.findElement(By.cssSelector(value)).sendKeys(param);
		}
		if(locators.equals("xpath"))
		{
			driver.findElement(By.xpath(value)).sendKeys("param");
		}
		
	}
	
	public void enterText(String locators, String value, String param) 
	{
		if(locators.equals("id"))
		{
			driver.findElement(By.id(value)).sendKeys(param);
		}
		if(locators.equals("name"))
		{
			driver.findElement(By.name(value)).sendKeys(param);
		}
		if(locators.equals("cssSelector"))
		{
			driver.findElement(By.cssSelector(value)).sendKeys(param);
		}
		if(locators.equals("xpath"))
		{
			driver.findElement(By.xpath(value)).sendKeys("param");
		}
	}
	
	public void clearText(String locators, String value)
	{
		if(locators.equals("id"))
		{
		driver.findElement(By.id(value)).clear();
		}
		if(locators.equals("name"))
		{
			driver.findElement(By.name(value)).clear();
		}
		if(locators.equals("cssSelector"))
		{
			driver.findElement(By.cssSelector(value)).clear();
		}
		if(locators.equals("xpath"))
		{
			driver.findElement(By.xpath(value)).clear();
		}
	}


	/************************ Click By Locater **************************/
	
	
	public void ClickByLocators(String locators, String value)
	{
		if(locators.equals("id"))
		{
			driver.findElement(By.id(value)).click();
		}
		if(locators.equals("name"))
		{
			driver.findElement(By.name(value)).click();
		}
		if(locators.equals("xpath"))
		{
			driver.findElement(By.xpath(value)).click();
		}
		if(locators.equals("cssSelector"))
		{
			driver.findElement(By.cssSelector(value)).click();
		}
		if(locators.equals("linkText"))
		{
			driver.findElement(By.linkText(value)).click();
		}
				
	}

	/************************ DropDown Function *****************/

	
	public void DropdownByVisibleText(String locators, String value, String param)
	{
		if(locators.equals("id"))
		{
			new Select(driver.findElement(By.id(value))).selectByVisibleText(param);
		}
		if(locators.equals("name"))
		{
			new Select(driver.findElement(By.name(value))).selectByVisibleText(param);
		}
		if(locators.equals("xpath"))
		{
			new Select(driver.findElement(By.xpath(value))).selectByVisibleText(param);
		}
		if(locators.equals("cssSelector"))
		{
			new Select(driver.findElement(By.cssSelector(value))).selectByVisibleText(param);
			
		}
		if(locators.equals("linkText"))
		{
			new Select(driver.findElement(By.linkText(value))).selectByVisibleText(param);
			
		}
	}
	public void DropdownByValue(String locators, String value, String param)
	{
		if(locators.equals("id"))
		{
			new Select(driver.findElement(By.id(value))).selectByValue(param);
		}
		if(locators.equals("name"))
		{
			new Select(driver.findElement(By.name(value))).selectByValue(param);
		}
		if(locators.equals("xpath"))
		{
			new Select(driver.findElement(By.xpath(value))).selectByValue(param);
		}
		if(locators.equals("cssSelector"))
		{
			new Select(driver.findElement(By.cssSelector(value))).selectByValue(param);
		}
		if(locators.equals("linkText"))
		{
			new Select(driver.findElement(By.linkText(value))).selectByValue(param);
		}
	}
	public void DropdownByIndex(String locators, String value, int param)
	{
		if(locators.equals("id"))
		{
			new Select(driver.findElement(By.id(value))).selectByIndex(param);
		}
		if(locators.equals("name"))
		{
			new Select(driver.findElement(By.name(value))).selectByIndex(param);
		}
		if(locators.equals("xpath"))
		{
			new Select(driver.findElement(By.xpath(value))).selectByIndex(param);
		}
		if(locators.equals("cssSelector"))
		{
			new Select(driver.findElement(By.cssSelector(value))).selectByIndex(param);
		}
		if(locators.equals("linkText"))
		{
			new Select(driver.findElement(By.linkText(value))).selectByIndex(param);
		}
	}

	/****************** To Take Screen shot on Failure **************/
	/*public void takeScreenshot(String Name) throws IOException, Exception 
	{
		String filepath = StaticVariables.ScreenshotsPath;

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(scrFile, new File(filepath + "FlightSearch\\" + Name + TimeStampasString() + ".png"));
			System.out.println("***Placed screen shot in " + filepath + " ***");
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}

	public String TimeStampasString() 
	{
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		
		return timeStamp;
	}*/
	
	public void onTestFailure(ITestResult result) 
	{
		if (ITestResult.FAILURE == result.getStatus())
		{
			Utility.captureScreenshot(driver, result.getName());
		}
	}

	
	public void quitBrowser()
	{
		driver.quit();
	}

}
