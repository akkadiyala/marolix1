package Startingstage;

public class StringbuliderExample {
	 public static void main(String[] args) {
	        // Create a new StringBuilder object
	        StringBuilder stringBuilder = new StringBuilder();

	        // Append strings to the StringBuilder
	        stringBuilder.append("Hello");
	        stringBuilder.append("Anil kumar ");
	        stringBuilder.append("World!");

	        // Print the contents of the StringBuilder
	        System.out.println("Contents of the StringBuilder: " + stringBuilder);

	        // Get the length of the StringBuilder
	        int length = stringBuilder.length();
	        System.out.println("Length of the StringBuilder: " + length);

	        // Insert a string at a specific position
	        stringBuilder.insert(6, "Java ");
	        System.out.println("Updated StringBuilder: " + stringBuilder);

	        // Reverse the contents of the StringBuilder
	        stringBuilder.reverse();
	        System.out.println("Reversed StringBuilder: " + stringBuilder);

	        // Delete a portion of the StringBuilder
	        stringBuilder.delete(0, 5);
	        System.out.println("Updated StringBuilder after deletion: " + stringBuilder);
	    }
	}
	//This program creates a StringBuilder object and demonstrates various operations such as appending strings, getting the length, inserting a string at a specific position, reversing the contents, and deleting a portion of the StringBuilder. The output will display the results of each operation.

//	Note that StringBuilder is similar to StringBuffer, but unlike StringBuffer, it is not synchronized and therefore provides better performance in most cases. It is commonly used when there is a need for efficient string manipulation in a single-threaded environment.









