package readWriteExcel;

import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadWriteUserNamePassword 
{
	@Test
	public static void readWriteExcel()
	{
		File excel= new File("/Users/sagarpatel/eclipse-workspace/readwrite.xlsx");
		
		FileInputStream fis;
		XSSFWorkbook wb;
		
		try {
			fis = new FileInputStream(excel);
		 //load file
		
			wb= new XSSFWorkbook(fis); //load workbook
		
			XSSFSheet sh1=  wb.getSheetAt(0); //load sheet
			
			for (int i=1; i<10; i++)
			{
			System.out.println("Username on row " + i+ " is "+ sh1.getRow(i).getCell(0).getStringCellValue());
			System.out.println("Password on row "+ i+ " is "+ sh1.getRow(i).getCell(1).getStringCellValue());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}	

}
