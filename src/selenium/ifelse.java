package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ifelse {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
if(url.equals("https://www.google.com")&& title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
				{
				System.out.println("pass");
				}
				

	}

}

