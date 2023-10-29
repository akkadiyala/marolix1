package Startingstage;

public class EvenNumbers {
	 
 
	public static void main(String args[])   
	{  
	int number=100;  
	System.out.println("List of Even numbers from 1 to "+number);  
	for (int i=1; i<=number; i++)   
	{  
	//logic to check if the number is Even or not  
	//if i%2 is not equal to zero, the number is Even  
	if (i%2==0)   
	{  
		
	System.out.println(i);
	}  
	}  
	} 
}
