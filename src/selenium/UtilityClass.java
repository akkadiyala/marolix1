package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.collect.Table.Cell;

public class UtilityClass // Resuablity process 
	{

	static	WebDriver driver = new ChromeDriver();
		public static void capture(WebDriver driver,int testid ) throws IOException {
			
			
			// Get current system date and time
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM--dd--HH--mm--ss");		
			Date date=new Date();
			
			String dateTime=sdf.format(date);
			
			
			//Create a filename 
			String Screenshot=dateTime+"_"+testid;
			// Take ScreenShot
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			//save Screenshot to file 
			File dest=new File(".\\Screenshots\\testid.png");
		    FileHandler.copy(source, dest);	
			
		}
		
		private static final String File_Name="src\\main\\resources\\testdata\\Batchno4.xlsx";
	public static String FetchData(String sheetName,int row ,int cell) {
		String data=null;
		FileInputStream file=null;
		Workbook workbook=null;
		
		try {
			file=new FileInputStream(File_Name);
			  Workbook book = new HSSFWorkbook();
			Sheet sheet=workbook.getSheet(sheetName);
			Row rowObj=sheet.getRow(row);
	//	HSSFCell cellObj=	rowObj.getCell(cell);
		
			data=rowObj.getCell(cell).getStringCellValue();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(data!=null) {
					file.close();
				}
				if(workbook!=null) {
					file.close();
				}
				if(file!=null) {
					file.close();
				}
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		return data;
	}
public static void main(String[] args) throws IOException {
	//UtilityClass obj = new UtilityClass();
	UtilityClass.capture(driver, 1);
	UtilityClass.FetchData("anilkumar", 1, 1);
	}
	}
