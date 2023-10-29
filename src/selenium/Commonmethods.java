package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Commonmethods {
	public static WebDriver driver;
	public static WebDriver launchbrowser(String Browsername) {
		
		if(Browsername.equals("Chrome"))
			
		
		driver = new ChromeDriver();
		
		else 
			driver = new EdgeDriver();
		
	return driver;    // here we need to return the driver for the NOP pages or googlepagetest in case we not use inheritance i e extends keyword.
	}
	public static void openurl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void closebrowser() {
		driver.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}