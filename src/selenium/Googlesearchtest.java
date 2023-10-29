package selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class Googlesearchtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver =Commonmethods.launchbrowser("Chrome");
Commonmethods.openurl("https://www.google.com");
Googlepagesearch obj = new Googlepagesearch(driver);
System.out.println("List of search names below :");
obj.googlesettext("MS DHONI" ,5);


//obj.selectlistoption(5);

	}

}
