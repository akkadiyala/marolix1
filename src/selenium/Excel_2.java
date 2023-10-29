package selenium;


	import java.io.FileNotFoundException;  
	import java.io.FileOutputStream;  
	import java.io.IOException;  
	import java.io.OutputStream;  
	import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
	import org.apache.poi.ss.usermodel.Sheet;  
	import org.apache.poi.ss.usermodel.Workbook;  
	public class Excel_2 {  
	    public static void main(String[] args) throws FileNotFoundException, IOException {  
	        Workbook book = new HSSFWorkbook();  
	        try  (OutputStream fileOut = new FileOutputStream("C:\\Users\\Dell\\Downloads\\anilkumar.xls")) {  
	            Sheet sheet1 = book.createSheet("First Sheet");  
	            Sheet sheet2 = book.createSheet("Second Sheet");  
	            book.write(fileOut); 
	            
	        }catch(Exception e) {  
	            System.out.println(e.getMessage());  
	        }  
	    }  
	}  

