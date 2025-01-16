/*
Write a program to demonstrate StringIndexOutOfBoundsException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. This will generate a runtime 
exception and abruptly stop the program.
Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. Then
write try catch block for Exception while accessing the String method
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/

import java.util.Scanner;

public class StringIndexOutOfBounds {

    // Method for generating StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String text) {
        // Attempt to access an index beyond the string length
        int invalidIndex = text.length(); // Valid indices go from 0 to text.length() - 1
        System.out.println("Attempting to access character at index " + invalidIndex + ": " + text.charAt(invalidIndex)); // This will throw the exception
    }

    // Method for handling StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String text) {
        try {
            // Attempt to access an index beyond the string length
            int invalidIndex = text.length();
            System.out.println("Attempting to access character at index " + invalidIndex + ": " + text.charAt(invalidIndex));
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the exception and display an error message
            System.out.println("A StringIndexOutOfBoundsException occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String userInputString = sc.next();

        // Calling the method that generates the exception
        System.out.println("\nDemonstrating StringIndexOutOfBoundsException generation:");
        try {
            generateStringIndexOutOfBoundsException(userInputString);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("\nCaught exception in main: " + e.getMessage());
        }

        // Calling the method that handles the exception
        System.out.println("\nDemonstrating StringIndexOutOfBoundsException handling:");
        handleStringIndexOutOfBoundsException(userInputString);

        sc.close();
    }
}