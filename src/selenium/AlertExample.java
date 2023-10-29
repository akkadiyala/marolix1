package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertExample {
	WebDriver driver;
	Alert alert;
public AlertExample(WebDriver driver) {
	this.driver=driver;
	
}
public void clickonelement(String locatorValue)
{
	By elementL=By.xpath("//*[contains(text(),'"+locatorValue+"')]");
	WebElement elementE=driver.findElement(elementL);
	elementE.click();
}
public Alert switchtoalert() {
	Alert alert=driver.switchTo().alert();
	return alert;

}
public void alertaction(String text)
{
if (text.equals("ok"))
{
	alert.accept();
}
else if (text.equals("cancel"))
{
	alert.dismiss();
}
else {
	
}
	alert.sendKeys("welcome anil kumar");
}}
