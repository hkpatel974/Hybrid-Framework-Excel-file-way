package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 
{
	public static String[][] getData(String fileName, String sheetName) throws IOException
	{
		File file = new File(fileName);
		
		FileInputStream ips = new FileInputStream(file);
		
		Workbook wb = new XSSFWorkbook(ips);
		
		Sheet Sh = wb.getSheet(sheetName);
		
		int rowNum = Sh.getLastRowNum() + 1;
		
		int colNum = Sh.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowNum][colNum];
		
		Cell cell;
		
		for(int i=0; i<rowNum; i++)
		{
			Row row = Sh.getRow(i);
			
			for(int j=0; j<colNum; j++)
			{
				try
				{
					cell = row.getCell(j);
					
					String value = cellToString(cell);
					
					value = new DataFormatter().formatCellValue(cell);
					
					data[i][j] = value;
					
				}catch(Exception e)
				{
					//System.out.println(e.toString());
				}								
					
				}
			}
		return data;
		}

	private static String cellToString(Cell cell) 
	{
		int type;
		
		Object result;
		
		type = cell.getCellType();
		
		switch(type)
		{
		case 0:
			
			result = cell.getNumericCellValue();
			break;
			
		case 1:
			
			result = cell.getStringCellValue();
			break;
			
		default:
			throw new RuntimeException("Cell type not supported");
			
		}
		
		return result.toString();
	}
}
		
		
