package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class Excel_4 {
	    private static final int NUMERIC = 0;

		public static void main(String[] args) throws IOException {
			File f=new File("C:\\Users\\Dell\\Downloads\\workbook.xls");
			FileInputStream fs =new FileInputStream(f);
			
			HSSFWorkbook workbook=new HSSFWorkbook(fs);
			HSSFSheet sheet=workbook.getSheetAt(0);
			
			
			int rowCount=sheet.getPhysicalNumberOfRows();
			for(int i=0;i<rowCount;i++) 
			{
				HSSFRow row=sheet.getRow(i);
		 int cellCount =row.getPhysicalNumberOfCells();
		 for(int j=0;j<cellCount;j++) {
			 HSSFCell cell=row.getCell(j);
			 String CellValue=getCellValue(cell);
			 System.out.print(" " +CellValue+ " ");
		 }
		 
		 System.out.println();
		 
			}
			workbook.close();
			fs.close();
		}
		
		public static String getCellValue(HSSFCell cell) {

			switch(cell.getCellTypeEnum()) {
			case NUMERIC:
				return String.valueOf(cell.getNumericCellValue());
		
			case BOOLEAN:
				return String.valueOf(cell.getBooleanCellValue());
			case STRING:
				return cell.getStringCellValue();
				default:
					return cell.getStringCellValue();
			}
			
	}
	}