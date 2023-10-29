package Startingstage;

import java.util.Hashtable;
import java.util.Map;

public class Collections_hash_table {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Hashtable<Character,String>map=new Hashtable<Character,String>();
		 
		 map.put('!',"abhi");
		 map.put('1',"abhishek");
		 map.put('2',"Rajesh");
		 map.put('3',"salman");
		 map.put('4',"Aamir");
		 map.put('5',"Venky");
		// map.put(null, null);
		 for(Map.Entry<Character,String> e:map.entrySet()) {
			 System.out.println("Keys= "+ e.getKey()+" value= " + e.getValue());
			 
		 }
	}

}

