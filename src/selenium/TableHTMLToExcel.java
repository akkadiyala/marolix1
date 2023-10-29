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

public class TableHTMLToExcel {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium videos\\chromedriver\\Drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();

        WebElement table = driver.findElement(By.id("customers"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        // Create a new Excel workbook and sheet
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Table Data");

        for (int i = 0; i < rows.size(); i++) {
            List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
            Row excelRow = sheet.createRow(i);
 
            for (int j = 0; j < cells.size(); j++) {
                Cell excelCell = excelRow.createCell(j);
                excelCell.setCellValue(cells.get(j).getText());
            }
        }

        // Save the Excel workbook to a file
        try (FileOutputStream outputStream = new FileOutputStream(new File("table_data.xlsx"))) {
            workbook.write(outputStream);
            System.out.println("Table data exported to Excel successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
