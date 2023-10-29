package selenium;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImage1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        
    	ChromeDriver driver = new ChromeDriver();

        
        driver.get("https://www.Amazon.in");
driver.manage().window().maximize();
        

List<WebElement> images = driver.findElements(By.tagName("img"));
int size =images.size();
System.out.println("Names of all images:");
for (WebElement image : images) {
    String altText = image.getAttribute("alt");
    System.out.println(altText);
}
System.out.println("Images found in site :"+size);
driver.quit();
}
}

