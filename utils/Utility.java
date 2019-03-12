package utils;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Utility
{
	public static void captureScreenshot(WebDriver driver, String screenshotName)
	{
        try 
        {
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(srcFile, new File("./ScreenShot/" + screenshotName + ".png"));
			
			System.out.println("Screenshot was taken");
		} 
        catch (Exception e) 
        {
			System.out.println("Exception while taking Screenshot " + e.getMessage());
		}
	}

}
