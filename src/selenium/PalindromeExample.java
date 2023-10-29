package selenium;

public class PalindromeExample {
	  public static void main(String[] args) {
	        String word = "madam"; // Change this to test different words

	        if (isPalindrome(word)) {
	            System.out.println(word + " is a palindrome.");
	        } else {
	            System.out.println(word + " is not a palindrome.");
	        }
	    }

	    public static boolean isPalindrome(String word) {
	        // Remove any non-alphanumeric characters and convert to lowercase
	        String cleanWord = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        // Compare the characters from both ends of the word
	        int left = 0;
	        int right = cleanWord.length() - 1;
	        while (left < right) {
	            if (cleanWord.charAt(left) != cleanWord.charAt(right)) {
	                return false; // Characters don't match, not a palindrome
	            }
	            left++;
	            right--;
	        }

	        return true; // All characters matched, it's a palindrome
	    }
	}

