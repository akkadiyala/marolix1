package selenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitsexample {
	public static void main(String[] args) {
		
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");

	//driver.navigate().to("https://www.google.com");
	driver.manage().window().maximize();
	//driver.manage().window().

	By googlesearchL=By.name("q");
	WebElement googleE=driver.findElement(googlesearchL);
	

	
	
	
//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  // implictwait= only wait 
	
	WebDriverWait wait=new WebDriverWait(driver ,Duration.ofSeconds(30));//  explictwait= wait +conditon
	
//	WebElement firstname=wait.until(ExpectedConditions.visibilityOf(googleE));
	

//	fluentwait wait+ conditon + frequency ; frequency -- setting up repeat cycle with timeframe to verify / check the condition at regular interval of time

	FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);
	wait1.withTimeout(Duration.ofSeconds(30));
	wait1.pollingEvery(Duration.ofSeconds(1));
	wait1.ignoring(NoSuchElementException.class);
	wait1.until(ExpectedConditions.visibilityOf(googleE));
	googleE.sendKeys("anilkumar kadiyala chowdary");
	googleE.sendKeys(Keys.ENTER);
	}
}
