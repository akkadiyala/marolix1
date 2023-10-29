package selenium;

import org.testng.Assert;

public class NOPPAGEtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NOP_PAGE obj = new NOP_PAGE();
		obj.launchbrowser("Chrome");
		obj.openurl("https://admin-demo.nopcommerce.com/login");
		
		obj.vefityloginwithemptybox();
		String Actualerrormsg=obj.geterrormsg();
		Assert.assertEquals(Actualerrormsg, "Please enter your email");
	    obj.closebrowser();
		
	}

}
