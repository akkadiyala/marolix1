package selenium;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=Commonmethods.launchbrowser("Chrome");
    Commonmethods.openurl("https://www.sejda.com/word-to-pdf");
By uploadButtonL=By.cssSelector("input.fileupload");
WebElement uploadButton=driver.findElement(uploadButtonL);
Actions action=new Actions(driver);
action.click(uploadButton).build().perform();
Thread.sleep(3000);
Runtime.getRuntime().exec("");
}
/*
 1. tagname#id
 2. tagname.classname
 3. tagname[attribute='value']
 4. tagname.classname[attribute='value']
 */
}
