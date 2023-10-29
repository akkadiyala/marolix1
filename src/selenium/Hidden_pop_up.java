package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hidden_pop_up {
	public static void main(String[] args) throws InterruptedException {
		
	
	ChromeDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/");
	  
	  driver.manage().window().maximize();
//	WebElement sign=driver.findElement(By.linkText("Sign in")) ;
	/*
	 Actions action = new Actions(driver);
	action.moveToElement(sign).build().perform();
	sign.click();
	*/
	 
	 
driver.findElement(By.xpath("//a[text()='Create new account']")).click();
Thread.sleep(2000);
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0 , 500)");
driver.findElement(By.name("firstname")).sendKeys("anil");
driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("kumar");
driver.findElement(By.name("websubmit")).click();

	
//By firstname=	By.xpath("//input[name()='firstname']");
//WebElement firstnameE =driver.findElement(firstname);
//firstnameE.sendKeys("anilkumar");
	/*
	  Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='inputtext 58mg 5dba _2ph-'])[2]")).sendKeys("Kamble");
	 Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='inputtext 58mg 5dba _2ph-'])[3]")).sendKeys("abhishek@marolix.com");
	 Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='inputtext 58mg 5dba _2ph-'])[5]")).sendKeys("Pass@123");
	*/
	
	//input[@id='password_step_input']
	  
	  //Thread.sleep(3000);
	  
	// driver.quit();
}
}