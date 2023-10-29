package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NEXTGEN_alert {
	public static void main(String[] args) throws InterruptedException {
		
	
ChromeDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://nxtgenaiacademy.com/alertandpopup/");
Thread.sleep(6000);
By Demo = By.linkText("Demo Sites");
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0 , 500)");
driver.findElement(Demo).click();
//By Alertbox = By.xpath("//button[@name= 'alertbox']");
By Alertbox = By.name("alertbox");

WebElement AlertboxE = driver.findElement(Alertbox);
js.executeScript("arguments[0].click()", AlertboxE);
Alert alert = driver.switchTo().alert();
String text =alert.getText();
System.out.println(text);
alert.accept();
driver.close();

}
}