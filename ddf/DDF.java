package ddf;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.ReadExcel;

public class DDF
{

	public static void main(String[] args) throws IOException, Exception
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		String[][] data = ReadExcel.getData("TestData.xlsx", "Sheet2");
		
		for(int i=1; i<data.length; i++)
		{
			String username = data[i][0];
			
			String password = data[i][1];
			
			driver.findElement(By.id("email")).sendKeys(username);
			
			Thread.sleep(10);
			
			driver.findElement(By.id("pass")).sendKeys(password);
			
			Thread.sleep(10);
			
			driver.findElement(By.id("loginbutton")).click();
			
			String Text = driver.findElement(By.xpath("//div[@class='_4rbf _53ij']")).getText();
			
			System.out.println(Text);
						
			driver.navigate().back();
			
		}
		
		driver.close();
	}

}
