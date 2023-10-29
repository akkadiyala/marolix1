package Startingstage;

public class ReverseString {

    public static void main(String[] args) {
        String input = "Hello, World!";
        StringBuilder stringBuilder = new StringBuilder(input); // Create a StringBuilder object
        String reversed = stringBuilder.reverse().toString();
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    
}}
