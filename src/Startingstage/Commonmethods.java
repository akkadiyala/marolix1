package Startingstage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Commonmethods {
private static WebDriver driver;
public static void launchbrowser(String Browsername) {
	if(Browsername.equals("Chrome"))
		driver = new ChromeDriver();

else 

	driver = new EdgeDriver(); 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
