package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Googlepagesearch {
	WebDriver driver;
	WebElement GooglesearchE;
	String Expectedresult;
	public Googlepagesearch(WebDriver driver)
	{
		this.driver=driver;
		
	}
public void googlesettext(String text , int position) throws InterruptedException
{
	By googlesearchL = By.xpath("//textarea[@title='Search']");
	WebElement GooglesearchE = driver.findElement(googlesearchL);
	GooglesearchE.sendKeys(text);
	for(int i=1;i<=position;i++ )
	{
		
		GooglesearchE.sendKeys(Keys.ARROW_DOWN);
		String Expectedresult = GooglesearchE.getAttribute("value");
		System.out.println(Expectedresult);
		//GooglesearchE.sendKeys(Keys.ENTER);
	}
	
	
	//GooglesearchE
	
	
}
/*public void selectlistoption(int position) throws InterruptedException {
	for(int i=1;i<=position;i++ )
	{
		Thread.sleep(3000);
		GooglesearchE.sendKeys(Keys.ARROW_DOWN);
	}
	Thread.sleep(3000);
	GooglesearchE.sendKeys(Keys.ENTER);
}
*/
}
