package Startingstage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverexamples {
	
	
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	String Currenturl = driver.getTitle();
	System.out.println(Currenturl);
	By gmaillinkL =By.linkText("Gmail"); //By = predefined //linktext is static method 
	WebElement gmailE =driver.findElement(gmaillinkL);
	gmailE.click();
}
}
