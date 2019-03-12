package kdf;

import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;



public class SortingByGroups 
{
	WebDriver driver;
	
	@Test(groups={"sanity-group","regression-group"})
	public void TestOne()
	{
		System.out.println("This is belongs to sanity and regression group");
	}
	
	@Test(groups={"sanity-group","regression-group","skip"})
	public void TestTwo()
	{
		System.out.println("This is belongs to sanity and regression group and skip");
		throw new SkipException("Skipping this exception");
	}
	
	@Test(groups={"regression-group"})
	public void TestThree()
	{
		System.out.println("This is belongs to regression group");
	}
			
}
