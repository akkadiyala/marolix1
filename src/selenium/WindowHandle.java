package selenium;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle {
private WebDriver driver;
public WindowHandle(WebDriver driver)
{
	this.driver=driver;
	driver.manage().window().maximize();
}

public void rightClick()
{
	By flightL=By.xpath("//*[text()='FLIGHT']");
	WebElement flight=driver.findElement(flightL);
	Actions action=new Actions(driver);
	action.contextClick(flight).build().perform();	
}

public void rightClick(WebElement ele)
{
	Actions action=new Actions(driver);
	action.contextClick(ele).build().perform();	
}

public void selectOption(int pos) throws Exception
{
	Robot robo = new Robot();
	for(int i=1;i<=pos;i++) {
	robo.keyPress(KeyEvent.VK_DOWN);
	robo.keyRelease(KeyEvent.VK_DOWN);
	}
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
}

public String getCurrentWindowId()
{
	return driver.getWindowHandle();
}

public Set<String> getAllWindowIdS()
{
	return driver.getWindowHandles();
}

public void switchToWindow(String winname)
{
	driver.switchTo().window(winname);
}
public void shiftControlToChildWindows(String currentWindowId,Set<String> allWindowsId) throws Exception
{
	for (String win : allWindowsId) {
		if(!currentWindowId.equals(win))
		{
			switchToWindow(win);
			Thread.sleep(3000);
			driver.close();
		}
	}
}

public List<WebElement> getAllLinks()
{
	By link_L=By.tagName("a");
	List<WebElement> allLinks=driver.findElements(link_L);
	for (WebElement ele : allLinks) {
		System.out.println(ele.getText());
	}
	return allLinks;
}

public void handleMultipleLinks() throws Exception
{
	List<WebElement> allLinks=this.getAllLinks();
	String currentWinId=this.getCurrentWindowId();
	for (WebElement ele : allLinks) {
		if(ele.isDisplayed())
		{
			if(!(ele.getText().isBlank()||ele.getText().isEmpty()))
			{
				this.rightClick(ele);
				this.selectOption(1);
				Set<String> allWindowsID=this.getAllWindowIdS();
				this.shiftControlToChildWindows(currentWinId, allWindowsID);
			}
		}
		this.switchToWindow(currentWinId);
	}
}



}
/*
method: contextClick(WebElement)
*/