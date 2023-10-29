package selenium;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelReaderMain {
	    public static void main(String[] args) throws IOException {
	        // Open the Excel file
	    	
	        FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\Dell\\Downloads\\workbook.xls"));

	        // Get the workbook instance for XLSX file
	        Workbook workbook = new HSSFWorkbook(inputStream);

	        // Get the first sheet from the workbook
	        Sheet sheet = workbook.getSheetAt(0);

	        // Iterate over all the rows and cells
	        int rowCount = sheet.getPhysicalNumberOfRows();
            for (int i = 0; i < rowCount; i++) {
        
               Row row= sheet.getRow(i);
                int cellCount = row.getPhysicalNumberOfCells();
                for (int j = 0; j < cellCount; j++) {
                  
                  Cell cell=  row.getCell(j);
	                // Print the cell value
                  String value= workbook.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
System.out.print(" "+ value +" ");
	            }
             
	            System.out.println();
	        }

	        // Close the workbook
	        workbook.close();
	    
			}	
}
