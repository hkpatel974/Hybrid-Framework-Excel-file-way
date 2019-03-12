package ddf;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDrivenReadData 
{
	
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Hemant Patel\\Documents\\Hello.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("script");
		
		XSSFRow row = sh.getRow(2);
		
		XSSFCell cell = row.getCell(2);
		
		String value = cell.getStringCellValue();
		
		System.out.println(value);
		
		
	}

}
	

	