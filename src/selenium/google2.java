package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class google2 extends Commonmethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		google2.launchbrowser("Chrome");
		google2.openurl("https://www.google.com");
		By googlesearchL = By.xpath("//div[@aria-label='Search by voice']");
		WebElement GooglesearchE = driver.findElement(googlesearchL);
		GooglesearchE.click();	
	}

}
