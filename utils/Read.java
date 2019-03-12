package utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
	
	public static void main(String[] args) throws Exception
	{
	File src = new File("C:\\Users\\Hemant Patel\\Documents\\TestForReadingExcel.xlsx");
	
	FileInputStream fis = new FileInputStream(src);		
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sheet = wb.getSheetAt(0);
	
	String text = sheet.getRow(0).getCell(0).getStringCellValue();
	
	System.out.println(text);
	}

}
