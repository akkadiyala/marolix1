package selenium;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;





public class Screenshot1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;//
		//File f=ts.getScreenshotAs(OutputType.FILE);
	File source=ts.getScreenshotAs(OutputType.FILE);// It is used to take the ScreenShot
//		// After taking screenShot it will Store in random location
		//date and Time
	/*	
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy--MM--dd--HH--mm--ss");
		Date date=new Date();
		String dateTime=sdf.format(date);
		
		
		String Destination="D:\\Screenshot";
		File dest=new File(Destination,"imag_"+ dateTime +".jpg");
		System.out.println("Destination : "+dest.getAbsolutePath());
		
		
//		File dest=new File("D:\\Screenshot\\FlipkartLoginpage.jpg");// give path for storing the screenShot
//		
		FileHandler.copy(source, dest);  
		
		
		
		// date and time	
	*/	
	}

}
	}

}
