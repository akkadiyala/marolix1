package Startingstage;

import java.util.Scanner;

public class switchexample {  
public static void main(String[] args) {  
    //Declaring a variable for switch expression  
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the value");
    int number=scan.nextInt();
    //Switch expression  
    switch(number){  
    //Case statements  
    case 245: System.out.println("enter value is between 100-200" + number);  
    break;  
    case 201-300 : System.out.println("enter value is between 201-300" +number);  
    break;  
 //   case (301-401): System.out.println("enter value is between 301-400" +number);  
  //  break;  
    //Default case statement  
    default:System.out.println("Not in between 100 to 400");  
    }  
}  
	}


