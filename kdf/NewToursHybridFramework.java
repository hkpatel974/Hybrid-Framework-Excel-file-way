package kdf;
import java.io.IOException;
import org.testng.annotations.Test;
import utils.ReadExcel;
public class NewToursHybridFramework {
	
     NewToursMethods cfn = new NewToursMethods();
	
	@Test
	public void testApp() throws IOException, Exception
	{
		String[][] data = ReadExcel.getData("NewTours.xlsx", "Sheet1");
		
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
				
			case "Username": //i=3
				cfn.enterUsername(data[i][4], data[i][5], data[i][6]);
				break;
				
			case "Password": //i=4
				cfn.enterPassword(data[i][4], data[i][5], data[i][6]);
				break;
				
			case "SignIn": //i=5
				cfn.ClickByLocators(data[i][4], data[i][5]);
				break;
				
			case "RoundTrip": //i=6
				cfn.ClickByLocators(data[i][4],data[i][5]);
				break;
				
			case "PassengerCount": //i=7
				cfn.DropdownByValue(data[i][4],data[i][5], data[i][6]);
				break;
				
			case "DestinationFrom": //i=8
				cfn.DropdownByValue(data[i][4],data[i][5], data[i][6]);
				break;
				
			case "FromMonth": //i=9
				cfn.DropdownByValue(data[i][4], data[i][5], data[i][6]);
				break;
				
			case "FromDay": //i=10
				cfn.DropdownByValue(data[i][4], data[i][5], data[i][6]);
				break;
				
			case "ArriveIn": //i=11
				cfn.DropdownByValue(data[i][4], data[i][5], data[i][6]);
				break;
				
			case "ToMonth": //i=12
				cfn.DropdownByValue(data[i][4], data[i][5], data[i][6]);
				break;
				
			case "ToDay": //i=13
				cfn.DropdownByValue(data[i][4], data[i][5], data[i][6]);
				break;
				
			case "ServiceClass": //i=14
				cfn.ClickByLocators(data[i][4], data[i][5]);
				break;
				
			case "Airline": //i=15
				cfn.DropdownByVisibleText(data[i][4], data[i][5], data[i][6]);
				break;
				
			case "FindFlight": //i=16
				cfn.ClickByLocators(data[i][4], data[i][5]);
				break;
				
			case "DepartFlight": //i=17
				cfn.ClickByLocators(data[i][4], data[i][5]);
				break;
				
			case "ReturnFlight": //i=18
				cfn.ClickByLocators(data[i][4], data[i][5]);
				break;
				
			case "ReserveFlight": //i=19
				cfn.ClickByLocators(data[i][4], data[i][5]);
				break;
				
			case "FirstPassengerFirstName": //i=20
				cfn.enterText("name", data[i][5], data[i][6]);
				break;
				
			case "FirstPassengerLastName": //i=21
				cfn.enterText("name", data[i][5], data[i][6]);
				break;
				
			case "FirstPassengerMeal": //i=22
				cfn.DropdownByValue(data[i][4], data[i][5], data[i][6]);
				break;
				
			case "CardType"://i=23
				cfn.DropdownByValue(data[i][4], data[i][5], data[i][6]);
				break;
				
			case "CreditCardNumber"://i=24
				cfn.enterText("name", data[i][5], data[i][6]);
				break;
				
			case "ExpireMonth"://i=25
				cfn.DropdownByVisibleText(data[i][4],data[i][5], data[i][6]);
				break;
				
			case "ExpireYear"://i=26
				cfn.DropdownByValue(data[i][4], data[i][5], data[i][6]);
				break;
				
			case "CreditCardFirstName"://i=27
				cfn.enterText(data[i][4], data[i][5], data[i][6]);
				break;
				
			case "CreditCardMiddleName"://i=28
				cfn.enterText(data[i][4], data[i][5], data[i][6]);
				break;
				
			case "CreditCardLastName"://i=29
				cfn.enterText(data[i][4], data[i][5], data[i][6]);
				break;
				
			case "ClearBillAddress"://i=30
				cfn.clearText(data[i][4], data[i][5]);
				break;
				
			case "EnterBillAdress"://i=31
			     cfn.enterText(data[i][4], data[i][5], data[i][6]);
			     break;
			     
			case "ClearBillCity"://i=32
				cfn.clearText(data[i][4], data[i][5]);
				break;
				
			case "EnterBillCity"://i=33
			     cfn.enterText(data[i][4], data[i][5], data[i][6]);
			     break;
			     
			case "ClearBillState"://i=34
				cfn.clearText(data[i][4], data[i][5]);
				break;
				
			case "EnterBillState"://i=35
			     cfn.enterText(data[i][4], data[i][5], data[i][6]);
			     break;
			     
			case "ClearBillZip"://i=36
				cfn.clearText(data[i][4], data[i][5]);
				break;
				
			case "EnterBillZip"://i=37
			     cfn.enterText(data[i][4], data[i][5], data[i][6]);
			     break;
			     
			case "SelectBillCountry"://i=38
				cfn.DropdownByValue(data[i][4], data[i][5], data[i][6]);
				break;
				
			case "ClearDelAddress"://i=39
				cfn.clearText(data[i][4], data[i][5]);
				break;
				
			case "EnterDelAddress"://i=40
			     cfn.enterText(data[i][4], data[i][5], data[i][6]);
			     break;
			     
			case "ClearDelCity"://i=41
				cfn.clearText(data[i][4], data[i][5]);
				break;
				  
			case "EnterDelCity"://i=42
				cfn.enterText(data[i][4], data[i][5], data[i][6]);
			     break;
			     
			case "ClearDelState"://i=43
				cfn.clearText(data[i][4], data[i][5]);
				break;
				
			case "EnterDelState"://i=44
			     cfn.enterText(data[i][4], data[i][5], data[i][6]);
			     break;
			     
			case "ClearDelZip"://i=45
				cfn.clearText(data[i][4], data[i][5]);
				break;
				
			case "EnterDelZip"://i=46
			     cfn.enterText(data[i][4], data[i][5], data[i][6]);
			     break;
			     
			case "BuyFlights"://i=47
				  cfn.ClickByLocators(data[i][4], data[i][5]);
				  break;				
			}			
		}
	}

}
