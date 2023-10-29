package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActiosclass {
	
	static WebDriver driver = new ChromeDriver();

	public  WebElement getElement(String Xpath)
	{
		By elementL=By.xpath(Xpath);
		WebElement element = driver.findElement(elementL);
		return element;
	}
	public  void  Actionmethod() {

	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/droppable/");
WebElement example=this.getElement("//h2[text()='Examples']");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", example);
	driver.switchTo().frame(0);
	WebElement source =this.getElement("//p[text()='Drag me to my target']");
	WebElement Target =this.getElement("//p[text()='Drop here']");
	Actions action = new Actions(driver);
	action.dragAndDrop(source, Target).build().perform();

}

	public static void main(String[] args) {
		
		
		DragAndDropActiosclass obj = new DragAndDropActiosclass();
	obj.Actionmethod();
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