package Startingstage;

import org.openqa.selenium.chrome.ChromeDriver;

public class interfacechild1 implements interface1{



	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("get method by chrome");
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("click method by chrome");
	}
	public void display()
	{
		System.out.println("welcome to chrome");
	}
public static void main(String[] args) {
	interfacechild1 object = new interfacechild1();
	object.display();
	object.get();
	object.click();

}
}
