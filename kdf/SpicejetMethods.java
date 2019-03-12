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

public class SpicejetMethods extends StaticVariables {

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
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemant Patel\\Desktop\\Selenium\\ChromeIEDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		if(param.equalsIgnoreCase("IE"))
		{
			// Launch the IE browser
			System.setProperty("webdriver.ie.driver", IeDriverPath);
			driver = new InternetExplorerDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void navigateTo(String baseUrl)
	{
		driver.get(baseUrl);
	}

	/************************ Click By Locater **************************/
	public void ClickByID(String LocaterName) 
	{
		driver.findElement(By.id(LocaterName)).click();
	}

	public void ClickByName(String LocaterName) 
	{
		driver.findElement(By.name(LocaterName)).click();
	}

	public void ClickByXpath(String LocaterName) 
	{
		driver.findElement(By.xpath(LocaterName)).click();
	}

	public void ClickBycssSelector(String LocaterName) 
	{
		driver.findElement(By.cssSelector(LocaterName)).click();
	}

	public void ClickByLinkText(String LocaterName) throws Exception
	{
		driver.findElement(By.linkText(LocaterName)).click();
		Thread.sleep(100);
	}

	/************************ DropDown Function *****************/

	public void DropdownById(String LocaterName, String OptionalValue)
	{
		new Select(driver.findElement(By.id(LocaterName))).selectByVisibleText(OptionalValue);
	}

	public void DropdownByName(String LocaterName, String OptionalValue)
	{
		new Select(driver.findElement(By.name(LocaterName))).selectByVisibleText(OptionalValue);
	}

	public void DropdownByXpath(String LocaterName, String OptionalValue) 
	{
		new Select(driver.findElement(By.xpath(LocaterName))).selectByVisibleText(OptionalValue);
	}

	/****************** To Take Screen shot **************/
	public void takeScreenshot(String Name) throws IOException, Exception 
	{
		String filepath = StaticVariables.ScreenshotsPath;

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(filepath + "FlightSearch\\" + Name + TimeStampasString() + ".png"));
			System.out.println("***Placed screen shot in " + filepath + " ***");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// TimeStampasString()
	}

	public String TimeStampasString() 
	{
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		return timeStamp;
	}

	/*************************** To call property file ************/

	/********* EnterText By Laocter *********************/

	public static void closeBrowser() 
	{
		driver.close();
	}

}
