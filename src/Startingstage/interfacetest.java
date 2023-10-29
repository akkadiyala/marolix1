package Startingstage;

import java.util.Scanner;

public class interfacetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("enter browser name");
String Browsername= scan.next();
interface1 object;
if(Browsername.equals("chorme"))
{
object = new interfacechild1();
	}
	else {
		object = new interfacechild2();
	}
object.get();
object.click();
}}