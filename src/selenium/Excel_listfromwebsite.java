package selenium;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.apache.poi.ss.usermodel.*;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import java.io.File;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.List;

	public class Excel_listfromwebsite {

	    public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "D:\\Selenium videos\\chromedriver\\Drivers\\chromedriver.exe");
	        ChromeDriver driver = new ChromeDriver();

	        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/"); // Replace with the URL of the webpage containing the list
	        driver.manage().window().maximize();
	        WebElement selectElement = driver.findElement(By.xpath("//select"));

	        // Locate all the <option> elements within the <select> element
	        List<WebElement> optionElements = selectElement.findElements(By.xpath("//select/option"));

	        // Print the text of each <option> element
	       

	        // Create a new Excel workbook and sheet
	        
	        Workbook workbook = new XSSFWorkbook();
	       
	        Sheet sheet = workbook.createSheet("List Data country");

	        for (int i = 0; i < optionElements.size(); i++) {
	            Cell excelCell = sheet.createRow(i).createCell(0);
	            excelCell.setCellValue(optionElements.get(i).getText());
	        }

	        // Save the Excel workbook to a file
	        try (FileOutputStream outputStream = new FileOutputStream(new File("list_data1.xlsx"))) {
	            workbook.write(outputStream);
	            System.out.println("List data exported to Excel successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        for (WebElement option : optionElements) {
	            
		          System.out.println("Text: " + option.getText());
		        }
	        driver.quit();
	    }
	}

