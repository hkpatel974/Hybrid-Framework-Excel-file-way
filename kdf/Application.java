package kdf;
import java.io.IOException;
import org.testng.annotations.Test;
import utils.ReadExcel;
public class Application {
	
	@Test
	public void testApp() throws IOException
	{
		String[][] data = ReadExcel.getData("TestData.xlsx", "Sheet1");
		
		for(int i=1; i<data.length; i++)
		{
			
			switch(data[i][3])
			{
			
			case "openBrowser": //i=1
			    Methods.openBrowser();
			    break;
			
			case "navigateTo": //i=2
				Methods.navigateTo(data[i][6]);
				break;
				
			case "enterUsername": //i=3
				Methods.enterUsername(data[i][4], data[i][5], data[i][6]);
				break;
				
			case "enterPassword": //i=4
				Methods.enterPassword(data[i][4], data[i][5], data[i][6]);
				break;
				
			case "clickSubmit": //i=5
				Methods.submit(data[i][4], data[i][5]);
				break;
				
			case "verifyMessage": //i=6
				Methods.verrifyMessage(data[i][5], data[i][6]);
				break;
				
			case "closeBrowser": //i=7
				Methods.closeBrowser();
				break;			
			
			}			
		}
	}

}
