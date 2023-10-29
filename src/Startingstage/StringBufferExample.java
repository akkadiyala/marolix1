package Startingstage;

public class StringBufferExample {
    public static void main(String[] args) {
        // Create a new StringBuffer object
        StringBuffer stringBuffer = new StringBuffer();

        // Append strings to the StringBuffer
        stringBuffer.append("Hello ");
        stringBuffer.append("Welcome ");
        stringBuffer.append("World!");

        // Print the contents of the StringBuffer
        System.out.println("Contents of the StringBuffer: " + stringBuffer);

        // Get the length of the StringBuffer
        int length = stringBuffer.length();
        System.out.println("Length of the StringBuffer: " + length);

        // Insert a string at a specific position
        stringBuffer.insert(14, "Anil kumar ");
        System.out.println("Updated StringBuffer: " + stringBuffer);

        // Reverse the contents of the StringBuffer
        stringBuffer.reverse();
     System.out.println("Reversed StringBuffer: " + stringBuffer);

      // Delete a portion of the StringBuffer
        stringBuffer.delete(0, 5);
        System.out.println("Updated StringBuffer after deletion: " + stringBuffer);
        
    }
}