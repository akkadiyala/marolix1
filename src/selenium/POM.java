package selenium;

public class POM {
	
		
		// Globlly we declare object with access Specifier Private 
			@FindBy (xpath="//input[@id='username']")
			private WebElement Username;
			
			@FindBy (xpath="//input[@name='pwd']")
			private WebElement Password;
			
			@FindBy(xpath="//input[@id='keepLoggedInCheckBox']")
			private WebElement KeepLoggedIn;
			
			@FindBy (xpath="//a[@id='loginButton']")
			private WebElement Loginbutton;
			
			private WebDriver driver;
			private Actions act;
			private JavascriptExecutor js;
			public LoginPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
				
				this.driver=driver;
				
				act=new Actions(driver);
				js=(JavascriptExecutor)driver;
			}
			
			public void SendUsername() {
				username.sendkeys("bharath@marolix.com");
			}
			
			public void SendPassword() {
				Password.sendKeys("QyuQH@@N");
			}
			
			public void ClickOnKeepMeSignIn() {
				KeepLoggedIn.click();
			}
			
			public void ClickLoginButton() {
				Loginbutton.click();
			}
	}

