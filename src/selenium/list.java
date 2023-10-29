package selenium;

public class list {
	public static void main(String[] args) {
		
	
	java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
	list.add(0);          // list: [0]
	list.add(1);          // list: [0, 1]
	list.add(2, 2);       // list: [0, 1, 2]
	list.addAll(list);    // list: [0, 1, 2, 0, 1, 2]
	list.addAll(4, list); // list: [0, 1, 2, 0, 0, 1, 2, 1, 2]
	list.remove(1);       // list: [0, 2, 0, 1, 2, 1, 2]
	list.remove(2);       // list: [0, 2, 1, 2, 1, 2]
	System.out.println(list.get(1));
}
}