package selenium;

import java.util.ArrayList;
import java.util.List;

public final class ListExamples {
	public static void main(String[] args) {
		
List  info = new ArrayList();
		//List is a raw type. References to generic type List<E> should be parameterized
	    
		info.add(123);
		info.add("Suresh");
		info.add(99.9);
		
		System.out.println(info);
		System.out.println(info.get(1));
	System.out.println("List using for loop");
	for(int i=0;i<info.size();i++)
	{
		System.out.println(info.get(i));
	}

	Object name=info.get(1);//Type mismatch: cannot convert from Object to String
	System.out.println(name);

	System.out.println("using for each loop:");
	for(Object var : info)
	{
		System.out.println(var);
	}
		
	}
	
}
