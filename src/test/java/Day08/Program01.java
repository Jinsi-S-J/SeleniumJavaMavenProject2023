package Day08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program01
{
	public static void main(String[] args) throws Exception 
	{
		
	try {
		File src= new File(".\\src\\test\\resources\\DataSheet.xlsx");// fetch the file location
		FileInputStream ip= new FileInputStream(src);// conveting the file into input stream
		XSSFWorkbook wb= new XSSFWorkbook(ip);//converting the data into booklet format
		XSSFSheet sh = wb.getSheetAt(0);
		DataFormatter format = new DataFormatter();
		
		System.out.println(format.formatCellValue(sh.getRow(0).getCell(0)));
		System.out.println(format.formatCellValue(sh.getRow(0).getCell(1)));
		System.out.println(format.formatCellValue(sh.getRow(0).getCell(2)));
		System.out.println(format.formatCellValue(sh.getRow(0).getCell(3)));
		
		System.out.println(format.formatCellValue(sh.getRow(0).getCell(0)));
		System.out.println(format.formatCellValue(sh.getRow(1).getCell(0)));
		System.out.println(format.formatCellValue(sh.getRow(2).getCell(0)));
		System.out.println(format.formatCellValue(sh.getRow(3).getCell(0)));
		
		System.out.println(sh.getLastRowNum());//indexing from 0
		System.out.println(sh.getRow(0).getLastCellNum());//indexing from 1
		
		
	} 
	
	
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
