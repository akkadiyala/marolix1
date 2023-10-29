package Startingstage;

import java.util.HashSet;
import java.util.Iterator;

public class Collections_Hashset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Creating Hashset and Adding the element
		
		
		//syntax
		
		HashSet<String>set=new HashSet<String>();
		
		
		set.add("Rahul");
		set.add("Abhishek");
		set.add("Rajesh");
		set.add("Rajesh");
		set.add("");
		set.add("");
		set.add("Anil");
		set.add("Vaibhav");
		System.out.println(set);
		 for (String element : set) {
			 
	            System.out.println(element);
	/*	Iterator<String>itr=set.iterator();
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
	}

}
}

