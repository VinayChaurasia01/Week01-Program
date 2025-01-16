import java.util.Scanner;

public class UniqueCharacterFinder {

    // Method to calculate the length of a string manually (without using built-in length() method)
    public static int calculateLength(String text) {
        int length = 0;
        // Loop through each character in the string
        for (char c : text.toCharArray()) {
            length++;  // Increment the length for each character
        }
        return length;  // Return the calculated length
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        // Calculate the length of the input string
        int length = calculateLength(text);
        // Create an array to store unique characters
        char[] uniqueChars = new char[length];
        int uniqueIndex = 0;

        // Loop through each character in the string
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the current character has already been added to the uniqueChars array
            for (int j = 0; j < uniqueIndex; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;  // If it is a duplicate, set isUnique to false
                    break;  // Exit the loop as we already know it's a duplicate
                }
            }

            // If the character is unique, add it to the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueIndex++] = currentChar;
            }
        }

        // Create a result array with the exact number of unique characters
        char[] result = new char[uniqueIndex];
        // Copy the unique characters from uniqueChars array to the result array
        System.arraycopy(uniqueChars, 0, result, 0, uniqueIndex);
        return result;  // Return the array of unique characters
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        // Read the string input from the user
        String text = scanner.nextLine();

        // Call the method to find unique characters in the input string
        char[] uniqueCharacters = findUniqueCharacters(text);
        // Print the unique characters in the string
        System.out.println("Unique characters in the string:");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");  // Print each unique character with a space
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}