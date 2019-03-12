package kdf;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Methods {
	
	static WebDriver driver;
	
	public static void openBrowser()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public static void  navigateTo(String baseUrl)
	{
		driver.get(baseUrl);
	}
	public static void enterUsername(String locators, String value, String param)
	{
		if(locators.equals("id"))
		{
		driver.findElement(By.id(value)).sendKeys(param);
		}
		else
		{
		driver.findElement(By.name(value)).sendKeys(param);
		}
	}
	public static void enterPassword(String locators, String value, String param)
	{
		if(locators.equals("id"))
		{
		driver.findElement(By.id(value)).sendKeys(param);
		}
		else
		{
		driver.findElement(By.name(value)).sendKeys(param);
		}
		
	}
	public static void submit(String locators, String value)
	{
		if(locators.equals("id"))
		{
		driver.findElement(By.id(value)).click();
		}
		else if(locators.equals("name"))
		{
		driver.findElement(By.name(value)).click();
		}
		else
		{
		driver.findElement(By.xpath(value)).click();
		}
	}
	public static void verrifyMessage(String value, String param)
	{
		String expectedMessage = param;
		String actualMessage = driver.findElement(By.xpath(value)).getText();
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	public static void closeBrowser()
	{
		driver.close();
	}

}
