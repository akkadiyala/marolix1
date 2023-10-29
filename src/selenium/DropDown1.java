package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();

	driver.get("https:www.amazon.in");
	driver.manage().window().maximize();
	WebElement list=driver.findElement(By.xpath("//select[@title = 'Search in']")) ;
	Select select = new Select(list);
	List<WebElement> alloptions =select.getOptions();
int size =	alloptions.size();
	for(WebElement ele : alloptions) {
		String data =ele.getText();
			System.out.println(data);
			
	
		
	
	
}
	System.out.println(size);
} 
}
/*
	private void selectValueByIndex(Select select, int index) {
		select.selectByIndex(index);
	}

	public void selectValueByOptionTagValue(Select select, String value) {
		select.selectByValue(value);
	}

	private void selectOptionWhichIsVisibleOnUI(Select select, String option) {
		select.selectByVisibleText(option);
	}
	
	private void displayAllOptions(Select select)
	{
		List<WebElement> allOptions=select.getOptions();
		for (WebElement ele : allOptions) {
			String data=ele.getText();
			System.out.println(data);
			if(data.equals("Musical Instruments"))
			select.selectByVisibleText(data);
		}
	}
	

	public void handleSingleSelectionDropDown() throws Exception {
		Select select = this.initiateDropDown();
		this.selectValueByIndex(select, 10);
		this.selectValueByOptionTagValue(select, "search-alias=amazon-pharmacy");
		this.selectOptionWhichIsVisibleOnUI(select, "Deals");
		this.displayAllOptions(select);
	}

}
}

/*
 * In how many ways we can select values from dropdown: 3 methods: 1.
 * selectByIndex(int ) int means index values 2. selectByValue(String) String is
 * option tag "value" attribute value 3. selectByVisible(String ) here String is
 * a option which is display on UI
 *
 * 
 * nature: non static access: by object name class: Select constructor: with
 * parameter parameter: WebElement (A dropDown) package:
 * org.openqa.selenium.support.ui.Select
 * 
 *  1. getOptions() all WebElements of Dropdown
 *  2. getAllSelectedOptions() it will return all selected Options
 * 
 * 
 */

