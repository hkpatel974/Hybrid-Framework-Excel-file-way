package kdf;
import java.io.IOException;
import org.testng.annotations.Test;
import utils.ReadExcel;
public class HybridFacebookWordPress {
	
	@Test
	public void testApp() throws IOException
	{
		String[][] data2 = ReadExcel.getData("TestData.xlsx", "Sheet1");
		String[][] data1 = ReadExcel.getData("TestData.xlsx", "Sheet2");
		
		for(int k=1; k<data1.length; k++)
		{
		for(int i=1; i<data2.length; i++)
		{
			
			switch(data2[i][3])
			{
			
			case "openBrowser": //i=1
			    Methods.openBrowser();
			    break;
			
			case "navigateTo": //i=2
				Methods.navigateTo(data2[i][6]);
				break;
				
			case "enterUsername": //i=3
				Methods.enterUsername(data2[i][4], data2[i][5], data1[k][0]);
				break;
				
			case "enterPassword": //i=4
				Methods.enterPassword(data2[i][4], data2[i][5], data1[k][1]);
				break;
				
			case "clickSubmit": //i=5
				Methods.submit(data2[i][4], data2[i][5]);
				break;
				
			case "verifyMessage": //i=6
				Methods.verrifyMessage(data2[i][5], data2[i][6]);
				break;
				
			case "closeBrowser": //i=7
				Methods.closeBrowser();
				break;			
			
			}			
		}
	}
 }

}
