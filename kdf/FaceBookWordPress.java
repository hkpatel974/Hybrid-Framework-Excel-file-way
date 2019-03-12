package kdf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FaceBookWordPress {

	@Test
	public void WebDriverTest() {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("1045xyz@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("12345");

		driver.findElement(By.id("loginbutton")).click();

		System.out.println(driver.findElement(By.xpath("//div[@class='_4rbf _53ij']")).getText());

	}

	@Test
	public void WebDriverTest1() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("usernameOrEmail")).sendKeys("1tty@gmail.com");

		driver.findElement(By.name("password")).sendKeys("password1");

		Thread.sleep(20);

		driver.findElement(By.xpath(".//*[@id='primary']/div/main/div/div[1]/div/form/div[1]/div[3]/button")).click();

		// System.out.println(driver.findElement(By.xpath(".//*[@id='primary']/div/main/div/div[1]/div/form/div[1]/div[1]/div[1]/span")).getText());

		System.out.println(driver
				.findElement(By.xpath(".//*[@id='primary']/div/main/div/div[1]/div/form/div[1]/div[1]/div[1]/span"))
				.getText());
	}

}
