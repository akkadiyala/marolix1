package selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHandlingTest {
public static void main(String[] args) throws Exception {
	WebDriver driver=Commonmethods.launchbrowser("chrome");
    Commonmethods.openurl("https://www.tripodeal.com/airline/indigo");
	WindowHandle obj = new WindowHandle(driver);
	obj.rightClick();
	obj.selectOption(1);
	String currentWinId=obj.getCurrentWindowId();
	System.out.println(currentWinId);
	Set<String> allWindowsID=obj.getAllWindowIdS();
	System.out.println(allWindowsID);
	obj.shiftControlToChildWindows(currentWinId, allWindowsID);
	obj.switchToWindow(currentWinId);
	//Commonmethods.closebrowser();

	

}
}