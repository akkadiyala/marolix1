package selenium;

import java.util.Scanner;

public class ReverseArrayUsingForLoop 
{
	public static void main(String[] args) {
		/*
		 scan no.of values in array
		 allocate memory --> datatype arrayname[] = new datatype[size];
		 scan values and store in array
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no.of Elements");
		
		int size=scan.nextInt();
		
	//datatype name= new datatype[size];
		int marks[] = new int[size];
		
		System.out.println("Enter values : ");
		for(int i=0;i<size;i++)
		{
			marks[i]=scan.nextInt();
		}
		
		System.out.println("Array values : ");  
	    for(int i =0 ;i<marks.length;i++)
	    {
	    	System.out.print(marks[i]+" ");
	    }
	    System.out.println();
	    System.out.println("reverse of number ");
	    for(int i=size-1;i>=0;i--)  //5 4
	    {
	    	System.out.print(marks[i]+" "); //4
}
	}
}
