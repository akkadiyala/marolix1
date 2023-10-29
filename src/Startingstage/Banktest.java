package Startingstage;

import java.util.Scanner;

public class Banktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter bank name");
		String bankname = scan.next();
		Bank_abstract b;
		if(bankname.equals("HDFC"))
				{
			b = new HDFC();
				}
		else
		{
			b= new SBI();
		}
		b.display();
		b.getfdintrestrate();
	}

}
