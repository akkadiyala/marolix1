package selenium;


	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class JavaScriptExecutionExample {
	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

	        // Create a new instance of the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Open a web page
	        driver.get("https://example.com");

	        // Find an element by its CSS selector (you can use any valid selector)
	        WebElement elementToModify = driver.findElement(By.cssSelector("your-css-selector"));

	        // Create a JavaScriptExecutor instance
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

	        // Execute JavaScript code to change the background color of the element
	        String jsCode = "arguments[0].style.backgroundColor = 'yellow';";
	        jsExecutor.executeScript(jsCode, elementToModify);

	        // You can also execute JavaScript without specific elements, for example:
	        // jsExecutor.executeScript("document.body.style.backgroundColor = 'lightblue';");
	        //You can use JavaScript to scroll to a specific element on the page, ensuring it's in the viewport.
	        JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
	        WebElement elementToScrollTo = driver.findElement(By.id("elementId"));
	        jsExecutor1.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
//You can accept or dismiss JavaScript alerts, confirmations, and prompts using JavaScriptExecutor.
	        JavascriptExecutor jsExecutor2 = (JavascriptExecutor) driver;
	        jsExecutor2.executeScript("window.alert('This is an alert!');");
	        driver.switchTo().alert().accept(); // Accept the alert
	        //You can execute custom JavaScript functions defined on the page
	        JavascriptExecutor jsExecutor3 = (JavascriptExecutor) driver;
	        jsExecutor3.executeScript("function customFunction() { return 'Hello, World!'; }");
	        String result = (String) jsExecutor.executeScript("return customFunction();");
	        System.out.println("JavaScript Function Result: " + result);
//In some cases, you may need to click an element using JavaScript, which can help overcome issues with element visibility or interaction.
	        JavascriptExecutor jsExecutor4 = (JavascriptExecutor) driver;
	        WebElement elementToClick = driver.findElement(By.cssSelector("your-css-selector"));
	        jsExecutor4.executeScript("arguments[0].click();", elementToClick);
//You can use JavaScript to get or set attributes of elements
	        JavascriptExecutor jsExecutor5 = (JavascriptExecutor) driver;
	        WebElement element = driver.findElement(By.id("elementId"));

	        // Get an attribute value
	        String attributeValue = (String) jsExecutor5.executeScript("return arguments[0].getAttribute('attributeName');", element);

	        // Set an attribute value
	        jsExecutor5.executeScript("arguments[0].setAttribute('attributeName', 'attributeValue');", element);
	     // Use JavaScript Executor to change the display style to "block" (making it visible)
	        ((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'block';", hiddenInput);

	        // Now, you can interact with the element, e.g., get its value
	        // Close the WebDriver instance
	        driver.quit();
	    }
	}


