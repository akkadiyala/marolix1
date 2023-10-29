package Startingstage;

public class SBI  extends Bank_abstract {
	

	@Override
	public void getfdintrestrate() {
		// TODO Auto-generated method stub
		System.out.println("SBI FD rate is 6.5%");
	}
public static void main(String[] args) {
	SBI object = new SBI();
	object.display();
	object.getfdintrestrate();
}
}
