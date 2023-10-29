package selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {
	public static void main(String[] args) throws InterruptedException {
		
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
			
	List<WebElement>links=driver.findElements(By.tagName("a"));
	
	// Loop through each link and check if its a broken Url
	System.out.println("size is "+links.size());
	for(WebElement link: links) {
		String url=link.getAttribute("href");
//System.out.println(url);
		if(url!=null && !url.isEmpty())
		{
			
			try {
				HttpURLConnection connection=(HttpURLConnection)new URL(url).openConnection();
				connection.setRequestMethod("HEAD");
				
				connection.connect();
				int responseCode=connection.getResponseCode();
				
				if(responseCode>=400) {
					System.out.println("Broken URL:"+url);
				}
			}catch (Exception e) {
				System.out.println("Exception occured while checking URL:"+url);
			
		System.out.println();
			}

		}
		}
	}
		
	}

