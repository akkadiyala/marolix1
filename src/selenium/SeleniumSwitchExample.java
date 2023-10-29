package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSwitchExample {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        String pageTitle = driver.getTitle();
       String result = getResultBasedOnPageTitle(pageTitle);
        System.out.println("Result: " + result);

        driver.quit();
    }

    public static String getResultBasedOnPageTitle(String pageTitle) {
        switch (pageTitle) {
            case "Google":
                return "welcome to home page";
            case "About":
                return "Page title is About";
            case "Contact":
                return "Page title is Contact";
            default:
                return "Page title is not recognized";
        }
    }

}
