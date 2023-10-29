package Startingstage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();
By googlesearchL=By.name("q");
WebElement googleE=driver.findElement(googlesearchL);
googleE.sendKeys("anilkumar kadiyala chowdary");
googleE.click();
	}

}
