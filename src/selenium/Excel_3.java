package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Excel_3 {
    public static void main(String[] args) throws IOException {
        
            File file = new File("C:\\Users\\Dell\\Downloads\\file_example_XLS_100.xls");
            FileInputStream fis = new FileInputStream(file);

            HSSFWorkbook workbook = new HSSFWorkbook(fis);
            HSSFSheet sheet = workbook.getSheetAt(0);

            int rowCount = sheet.getPhysicalNumberOfRows();
            for (int i = 0; i < rowCount; i++) {
                HSSFRow row = sheet.getRow(i);
                int cellCount = row.getPhysicalNumberOfCells();
                for (int j = 0; j < cellCount; j++) {
                    HSSFCell cell = row.getCell(j);
                    if(value!= "")     {
                  String value= workbook.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
                    } else
                    {
            	   int number=(int) workbook.getSheet("Sheet1").getRow(i).getCell(j).getNumericCellValue();
                    }
                }
            }
            }
            System.out.println("total row count :"+rowCount);
          //  System.out.println("total cell count :"+ cellCount);
            static String value= workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
            System.out.println(value);
                
              
    }
    }
    
