package selenium;

import java.util.Scanner;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class LOOPScreenshot {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter name and position");
        int position = scan.nextInt();
        String name = scan.next();
        String imagename = scan.next();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        By googlesearchL = By.xpath("//textarea[@title='Search']");
        WebElement GooglesearchE = driver.findElement(googlesearchL);
        GooglesearchE.sendKeys(name);
        for (int i = 1; i <= position; i++) {
            GooglesearchE.sendKeys(Keys.ARROW_DOWN);
            String Expectedresult = GooglesearchE.getAttribute("value");
            System.out.println(Expectedresult);
           // GooglesearchE.sendKeys(Keys.ENTER);
            TakesScreenshot ts = (TakesScreenshot) driver;
            File f = ts.getScreenshotAs(OutputType.FILE);
            File dest=new File("D:\\programs(Abhishek in class)\\IMAGENAMEMSDHONI.jpg");
            FileHandler.copy(f, dest);
              //  FileUtils.copyFile(f, new File(".//screenshots//imagename" + ".png"));
            }
        
            
}
}