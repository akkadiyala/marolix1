package Startingstage;

public class Charactercount {
	
    public static void countCharacters(String str) {
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive counting
        int[] count = new int[26]; // Array to store the count of each character

        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Check if the character is an alphabet
            if (Character.isLetter(c)) {
                int index = c - 'a'; // Calculate the index of the character in the count array
                count[index]++; // Increment the count of the character
            }
        }

        // Display the count of each character
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                char c = (char) (i + 'a'); // Convert the index back to a character
                System.out.println(c + ": " + count[i]);
            }
        }
    }
    public static void main(String[] args) {
        String a = "Hello World";
        countCharacters(a);
    }
}

