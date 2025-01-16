/*
Write a program to find and return the length of a string without using the length() method 
Hint => 
Take user input using the Scanner next() method 
Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the
infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return 
the count
The main function calls the user-defined method as well as the built-in length() method and displays the result
*/

import java.util.Scanner;

class FindLengthOfString {

    // Method to find the length of a string 
    public static int calculateLength(String inputString) {
        int lengthCounter = 0;

        // Loop through each character of the string until an exception occurs
        while (true) {
            try {
                char currentChar = inputString.charAt(lengthCounter);
                lengthCounter++; // Increment the counter
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        return lengthCounter; // Return the final count as the string length
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        // Calculate and display the length of the entered string
        System.out.println("Length of the given string is: " + calculateLength(userInput));
    }
}
