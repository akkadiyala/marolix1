package Startingstage;

public class Collections_Arraylist {
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.Vector;

	public static void main(String[] args) {
			// TODO Auto-generated method stub
	    
			ArrayList<String> v=new ArrayList<String>();
			
		v.add("Raju");
			v.add("rohit");
			v.add("Vaibhav");
		String name    =	v.get(1);
			v.add("Rahul");
			v.add(null);
			v.add(null);
			v.add("Raju");
	//		return "anil";
			System.out.println(v); 
			 for (String element : v) {
		            System.out.println(element);
		Iterator<String>itr=v.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		
		
}
}