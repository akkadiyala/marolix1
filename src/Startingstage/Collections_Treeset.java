package Startingstage;

import java.util.Iterator;
import java.util.TreeSet;

public class Collections_Treeset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		TreeSet<String>set=new TreeSet<String>();
		set.add("vaibhav");
		set.add("Rahul");
		set.add("Sachin");
		set.add("Abhi");
		set.add("Rahul");
		
		Iterator<String>itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		 
	}

}


