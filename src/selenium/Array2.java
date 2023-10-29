package selenium;

import java.util.Scanner;

public class Array2 {

	
public static void main(String[] args) {
			/*
			 scan no.of values in array
			 allocate memory --> datatype arrayname[] = new datatype[size];
			 scan values and store in array
			 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter no.of Elements");
			int size=scan.nextInt();
			
			int marks[] = new int[size];
			
			System.out.println("Enter values : ");
			for(int i=0;i<marks.length;i++)
			{
				marks[i]=scan.nextInt();
			}
			
			System.out.println("Array values : ");  
		    for(int i =0 ;i<marks.length;i++)
		    {
		    	System.out.print(marks[i]+" ");
		   
		    }
	}


}
