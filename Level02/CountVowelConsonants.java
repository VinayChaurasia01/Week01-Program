/*
Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string
Hint => 
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to Method to find vowels and consonants in a string using charAt() method and finally return the count of vowels and 
consonants in an array
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/

import java.util.Scanner;

class VowelConsonantCounter {

    // Method to convert a string to lowercase without using built-in methods
    public static String toLowerCase(String inputString) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            int asciiValue = currentChar;

            // Check if the character is an uppercase letter
            if (asciiValue >= 65 && asciiValue <= 90) {
                asciiValue += 32; // Convert to lowercase
                currentChar = (char) asciiValue;
            }

            result.append(currentChar);
        }

        return result.toString();
    }

    // Method to count vowels in a string
    public static int countVowels(String inputString) {
        int vowelCount = 0;
        
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            
            // Check if the character is a vowel
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    // Method to count consonants in a string
    public static int countConsonants(String inputString) {
        int consonantCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            // Check if the character is a consonant
            if ((currentChar >= 'a' && currentChar <= 'z') &&
                !(currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u')) {
                consonantCount++;
            }
        }

        return consonantCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Convert the string to lowercase
        String lowercaseString = toLowerCase(userInput);
        System.out.println("Converted string in lowercase: " + lowercaseString);

        // Count vowels in the string
        int vowelCount = countVowels(lowercaseString);
        System.out.println("Number of vowels in the given string: " + vowelCount);

        // Count consonants in the string
        int consonantCount = countConsonants(lowercaseString);
        System.out.println("Number of consonants in the given string: " + consonantCount);

        // Optionally calculate and display the number of non-letter characters
        int nonLetterCount = userInput.length() - (vowelCount + consonantCount);
        System.out.println("Number of non-letter characters in the given string: " + nonLetterCount);
    }
}