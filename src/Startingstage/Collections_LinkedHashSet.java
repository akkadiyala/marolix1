package Startingstage;

import java.util.LinkedHashSet;

public class Collections_LinkedHashSet {
	 public static void main(String[] args) {
	        // Create a new LinkedHashSet
	        LinkedHashSet<String> set = new LinkedHashSet<>();

	        // Add elements to the set
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Orange");
	        set.add("Mango");
	        set.add("Apple"); // Adding a duplicate element

	        // Print the elements of the LinkedHashSet
	        System.out.println("Elements of the LinkedHashSet: " + set);

	        // Get the size of the LinkedHashSet
	        int size = set.size();
	        System.out.println("Size of the LinkedHashSet: " + size);

	        // Remove an element from the LinkedHashSet
	        set.remove("Orange");
	        System.out.println("LinkedHashSet after removing 'Orange': " + set);

	        // Check if an element exists in the LinkedHashSet
	        boolean containsBanana = set.contains("Banana");
	        System.out.println("Does the LinkedHashSet contain 'Banana'? " + containsBanana);

	        // Iterate over the LinkedHashSet
	        System.out.println("Iterating over the LinkedHashSet:");
	        for (String element : set) {
	            System.out.println(element);
	        }

	        // Clear the LinkedHashSet
	        set.clear();
	        System.out.println("LinkedHashSet after clearing: " + set);
	    }
	}

