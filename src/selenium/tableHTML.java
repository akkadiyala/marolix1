package selenium;



import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableHTML {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium videos\\chromedriver\\Drivers\\chromedriver.exe");	
ChromeDriver driver=new ChromeDriver();


driver.get("https://www.w3schools.com/html/html_tables.asp");
driver.manage().window().maximize();
List<WebElement> row=driver.findElements(By.xpath("//table[@id='customers']//tr"));
int noofWebElements=row.size();
System.out.println(noofWebElements);



for(int i=0;i<row.size();i++) {
	
	String data=row.get(i).getText();
	System.out.println(data);
	
}
}
}
//table[@id='customers']//tr[2]//td"))