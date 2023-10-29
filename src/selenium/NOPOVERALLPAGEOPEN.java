package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class NOPOVERALLPAGEOPEN {
 public static void main(String[] args) throws IOException {
	

	ChromeDriver driver = new ChromeDriver();
	driver.get("https://admin-demo.nopcommerce.com/login");
	By loginL=By.xpath("//button[text()='Log in']");
	WebElement loginE=	driver.findElement(loginL);
	loginE.click();
	driver.manage().window().maximize();
	TakesScreenshot ts = (TakesScreenshot) driver;
    File f = ts.getScreenshotAs(OutputType.FILE);
    File dest=new File(".//Screenshots//NOPAGE1.jpg");
    

	 FileHandler.copy(f, dest);
	 driver.close();
}
}