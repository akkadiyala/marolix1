package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excel {
	public static void main(String[] args) throws EncryptedDocumentException, Exception, IOException {
		
	
	String path="C:\\Users\\Dell\\Downloads\\file_example_XLS_100.xls";
	FileInputStream file=new FileInputStream(path);
		
	
	Workbook book= WorkbookFactory.create(file);
	String value= book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	System.out.println(value);
	
/*	
	double num=book.getSheet("Sheet1").getRow(4).getCell(1).getNumericCellValue();
	System.out.println(num);
	
	
	Date date=book.getSheet("Sheet1").getRow(5).getCell(1).getDateCellValue();
	System.out.println(date);
	
}
}
