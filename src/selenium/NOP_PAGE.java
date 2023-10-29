package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class NOP_PAGE  extends Commonmethods{
//private WebDriver driver;

private WebElement getemailtextbox()
{
	By gmailL =By.id("Email");
WebElement GmailE=	driver.findElement(gmailL);
return GmailE;

}
private WebElement getpasswordtextbox()
{
	By passwordL =By.id("Password");
WebElement PasswordE=	driver.findElement(passwordL);
return PasswordE;
}
private void cleartextbox(WebElement textbox)

{
	textbox.clear();
}
private void clickonlogin() {
	By loginL=By.xpath("//button[text()='Log in']");
WebElement loginE=	driver.findElement(loginL);
loginE.click();
}
public String geterrormsg()
{
	By ErrormsgL =By.id("Email-error");
WebElement ErrormsgE=	driver.findElement(ErrormsgL);
String Actualerrormsg=ErrormsgE.getText();
System.out.println(Actualerrormsg);
return Actualerrormsg;
}

public void vefityloginwithemptybox() {
WebElement emailtextbox=	this.getemailtextbox();
this.cleartextbox(emailtextbox);
this.clickonlogin();
this.geterrormsg();
}
}

