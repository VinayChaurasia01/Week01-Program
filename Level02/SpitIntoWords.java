/*
Write a program to split the text into words, compare the result with the split() method and display the result 
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to find the length of the String without using the built-in length() method. 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result
*/

import java.util.Scanner;

class SpitIntoWords {
	//method to split a sentence into words
    public static String[] performCustomSplit(String sentence) {
        int wordCount = 0, lastSpaceIndex = -1;

        // Count the number of spaces in the sentence 
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] wordsArray = new String[wordCount + 1];
        int arrayIndex = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' || i == sentence.length() - 1) {
                wordsArray[arrayIndex++] = sentence.substring(lastSpaceIndex + 1, i == sentence.length() - 1 ? i + 1 : i);
                lastSpaceIndex = i;
            }
        }

        return wordsArray; // Return the array containing the extracted words
    }

    // Method to compare two string arrays for equality
    public static boolean areArraysEqual(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false; 
        }

        // Compare each element of the arrays
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false; 
            }
        }

        return true; // Arrays are equal if all elements match
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String[] customSplitResult = performCustomSplit(inputSentence);

        String[] builtInSplitResult = inputSentence.split(" ");

        // Display the results of both splitting methods
        System.out.println("Custom Split Result: " + String.join(", ", customSplitResult));
        System.out.println("Built-in Split Result: " + String.join(", ", builtInSplitResult));

        // Compare the results of both splitting methods and display whether they are equal
        System.out.println("Are both results identical? " + areArraysEqual(customSplitResult, builtInSplitResult));
    }
}
