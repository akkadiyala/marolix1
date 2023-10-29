package selenium;

import org.openqa.selenium.WebDriver;

public class AlertExampletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =Commonmethods.launchbrowser("Chrome");
		Commonmethods.openurl("https://demo.automationtesting.in/Alerts.html");
		AlertExample obj = new AlertExample(driver);
		obj.clickonelement("Alert with Textbox");
		obj.clickonelement("click the button to demonstrate the prompt box");
		obj.switchtoalert(); 
		obj.alertaction("text");
		Assert.
		
		
	}

}
