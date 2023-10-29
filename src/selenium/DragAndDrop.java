package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
private WebDriver driver;
public DragAndDrop(WebDriver driver)
{
	this.driver=driver;
	driver.manage().window().maximize();
}

private WebElement getElement(String locatorValue)
{
	By elementL=By.xpath(locatorValue);
	WebElement element = driver.findElement(elementL);
	return element;
}
private void scroll(WebElement ele)
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", ele);
}

public void verifyDragAndDrop() throws Exception
{
	Thread.sleep(3000);
	String examplesL=ReadData.getLocator("MyAPP", "examples");
	
	WebElement examples=this.getElement(examplesL);
	this.scroll(examples);
	Thread.sleep(3000);
	driver.switchTo().frame(0);

	String sourceL=ReadData.getLocator("MyAPP", "source");
	WebElement source=this.getElement(sourceL);
	String targetL=ReadData.getLocator("MyAPP", "target");
	WebElement target=this.getElement(targetL);
	
	Actions action = new Actions(driver);
	action.dragAndDrop(source, target).build().perform();
	Thread.sleep(3000);

	
}



}

/*drag and drop
Methods: dragAndDrop(WebElement source, WebElement target)
Type: -+
nature: non static
access : by object
class:  Actions
constructor: with parameter (WebDriver object)
package: org.openqa.selenium.interactions
*/