package Startingstage;

public class HDFC  extends Bank_abstract {
	

	@Override
	public void getfdintrestrate() {
		// TODO Auto-generated method stub
		System.out.println("HDFC FD rate is 5.5%");
	}
public static void main(String[] args) {
	HDFC object = new HDFC();
	object.display();
	object.getfdintrestrate();
}
}
