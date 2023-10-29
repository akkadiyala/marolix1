package Startingstage;

import org.openqa.selenium.chrome.ChromeDriver;

public class interfacechild2 implements interface1{



	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("get method by Edge");
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("click method by Edge");
	}
	public void display()
	{
		System.out.println("welcome to Edge");
	}
public static void main(String[] args) {
	interfacechild2 object = new interfacechild2();
	object.display();
	object.get();
	object.click();

}
}
