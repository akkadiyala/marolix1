package selenium;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import java.util.List;

	public class TableHTML_2 {
	   
	    	    public static void main(String[] args) {
	    	    	ChromeDriver driver = new ChromeDriver();
	    	        driver.get("https://www.w3schools.com/html/html_tables.asp");
	    	        driver.manage().window().maximize();
WebElement data =driver.findElement(By.xpath("//table[@class='ws-table-all']"));
	    	   
	    	        List<WebElement> rows = data.findElements(By.tagName("tr"));
	    	       
						
				

	    	        int rowCount = rows.size();
	    	        int columnCount = getColumnCount(rows);

	    	        System.out.println("Row Count: " + rowCount);
	    	        System.out.println("Column Count: " + columnCount);

	    	        displayTableData(rows);

	    	        driver.quit();
	    	    }

	    	    public static int getColumnCount(List<WebElement> rows) {
	    	        int maxColumnCount = 0;
	    	        for (WebElement row : rows) {
	    	            List<WebElement> cells = row.findElements(By.tagName("td"));
	    	            maxColumnCount = Math.max(maxColumnCount, cells.size());
	    	        }
	    	        return maxColumnCount;
	    	    }

	    	    public static void displayTableData(List<WebElement> rows) {
	    	        for (WebElement row : rows) {
	    	            List<WebElement> cells = row.findElements(By.tagName("td"));
	    	            for (WebElement cell : cells) {
	    	                System.out.print(cell.getText() + "\t");
	    	            }
	    	            System.out.println();
	    	        }
	    	    }
	}
	    	

