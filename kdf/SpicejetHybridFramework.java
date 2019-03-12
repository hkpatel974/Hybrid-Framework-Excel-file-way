package kdf;
import java.io.IOException;
import org.testng.annotations.Test;
import utils.ReadExcel;
public class SpicejetHybridFramework {
	
     SpicejetMethods cfn = new SpicejetMethods();
	
	@Test
	public void testApp() throws IOException, Exception
	{
		String[][] data = ReadExcel.getData("SpiceJetTestData.xlsx", "Sheet1");
		
		for(int i=1; i<data.length; i++)
		{
						
			switch(data[i][3])
			{
			
			case "openBrowser": //i=1
			    cfn.openBrowser(data[i][6]);
			    break;
			
			case "navigateTo": //i=2
				cfn.navigateTo(data[i][6]);
				break;
				
			case "ID_Oneway": //i=3
				cfn.ClickByID(data[i][5]);
				break;
				
			case "ID_FromStnDWnArrow": //i=4
				cfn.ClickByID(data[i][5]);
				break;
				
			case "LinkText_FromStnName": //i=5
				cfn.ClickByLinkText(data[i][5]);
				
				break;		
				
			case "ID_ToStnDWnArrow": //i=6
				cfn.ClickByID(data[i][5]);
				Thread.sleep(100);
				break;
				
			case "LinkText_ToStnName": //i=7
				Thread.sleep(100);
				cfn.ClickByLinkText(data[i][5]);
				Thread.sleep(100);
				break;
				
			case "Id_Calender": //i=8
				cfn.ClickByID(data[i][5]);
				break;
				
			case "Lt_Calender": //i=9
				cfn.ClickByLinkText(data[i][5]);
				break;
				
			case "ID_Adult"://i=10
				cfn.DropdownById(data[i][5], data[i][6]);
				break;
				
			case "ID_Child"://i=11
				cfn.DropdownById(data[i][5], data[i][6]);
				break;
				
			case "ID_Infant"://i=12
				cfn.DropdownById(data[i][5], data[i][6]);
				break;
				
			case "ID_Currency"://i=13
			    cfn.DropdownById(data[i][5], data[i][6]);
			    break;
			    
			case "ID_FindFlights"://i=14
			    cfn.ClickByID(data[i][5]);
			    break; 
			    
			case "closeBrowser": //i=15
			    SpicejetMethods.closeBrowser();
			    break;
			
				
			}			
		}
	}

}
