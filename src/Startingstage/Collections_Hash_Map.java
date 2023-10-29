package Startingstage;

import java.util.HashMap;
import java.util.Map;

public class Collections_Hash_Map {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 HashMap<Character,String>map=new HashMap<Character,String>();
		 
		 map.put('!',"abhi");
		String name= map.get(1);
		 map.put('1',"abhishek");
		 map.put('2',"Rajesh");
		 map.put('3',"salman");
		 map.put('4',"Aamir");
		 map.put('5',"Venky");
		 //map.put(null, null);
		map.put(null, null);
		 
		 for(Map.Entry<Character,String> e:map.entrySet()) {
			 System.out.println("Keys= "+ e.getKey()+" value= " + e.getValue());
			 
		 }
		 
	}


}
