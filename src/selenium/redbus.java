package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
	public static void main(String[] args) {
		
	}
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.abhibus.com/");

	  driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Hyderabad");
      Thread.sleep(2000);
      List<WebElement>row=driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
      
     //Advanced for loop
      for(WebElement t:row) 
      {
   	   if(t.getText().equals("Hyderabad Airport RGIA")) 
   	   {
   		   t.click();
   		   break;
   		  
   	   }
   	   
      }
      System.out.println("end");
      
      
  
       
       
       
	}

}
}
