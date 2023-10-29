package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlingExample {
    public static void main(String[] args) throws AWTException {
    	int pos =2;
        // Create a new instance of the Chrome driver
    	ChromeDriver driver = new ChromeDriver();

        // Navigate to the main page
    	driver.get("https://www.google.com");
    By googlesearchL=By.linkText("Gmail");
    WebElement gmail = driver.findElement(googlesearchL);
    	Actions action = new Actions(driver);
    	
    	action.contextClick(gmail).build().perform();
    	Robot robo = new Robot();
    	for(int i=0; i<=pos;i++) {
    	
    	robo.keyPress(KeyEvent.VK_DOWN);	
    robo.keyRelease(KeyEvent.VK_DOWN);
    	}
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.keyRelease(KeyEvent.VK_ENTER);
    	
        // Get the window handles
        Set<String> handles = driver.getWindowHandles();
         System.out.println(handles);
        // Switch to the new window
        for (String handle : handles) {
            if (!handle.equals(driver.getWindowHandle())) {
                driver.switchTo().window(handle);
                break;
            }
            System.out.println(handle);
        }
    	 }
}