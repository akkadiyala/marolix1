package Startingstage;

import java.util.Scanner;

public class Switch_statement {

	public static void main(String[] args) {    
	    //Specifying month number  
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the required month number");
	    int month=scan.nextInt();    
	   // String monthString="";  
	    //Switch statement  
	    switch(month){    
	    //case statements within the switch block  
	    case 1: System.out.println("Name of month " + month +" is January");
	  
	  //  break;    
	    case 2:System.out.println("Name of month " + month +" is February");
	   // break;    
	    case 3: System.out.println("Name of month " + month +" is march");
	  //  break;    
	    case 4: System.out.println("Name of month " + month +" is April"); 
	  //  break;    
	    case 5:System.out.println("Name of month " + month +" is may"); 
	   // break;    
	    case 6:System.out.println("Name of month " + month +" is june"); 
	    break;    
	    case 7:System.out.println("Name of month " + month +" is july");  
	    break;    
	    case 8: System.out.println("Name of month " + month +" is august");  
	    break;    
	    case 9: System.out.println("Name of month " + month +" is September");  
	    break;    
	    case 10: System.out.println("Name of month " + month +" is October"); 
	    break;    
	    case 11:System.out.println("Name of month " + month +" is November"); 
	   // break;    
	    case 12: System.out.println("Name of month " + month +" is December");  
	//    break;    
	    default:System.out.println("Invalid Month!");    
	    break;
	    }    
}
	
}
