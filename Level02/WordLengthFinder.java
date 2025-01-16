import java.util.Scanner;

public class WordLengthFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        // Split the sentence into words
        String[] wordsArray = splitSentence(inputSentence);

        // Find the shortest and longest word lengths
        int[] lengthResult = findShortestAndLongestWordLengths(wordsArray);

        // Display the results
        System.out.println("Shortest Word Length: " + lengthResult[0]);
        System.out.println("Longest Word Length: " + lengthResult[1]);
    }

    // Method to split a sentence into words
    public static String[] splitSentence(String sentence) {
        return sentence.split(" "); // Split by spaces
    }

    // Method to find the shortest and longest word lengths in an array of words
    public static int[] findShortestAndLongestWordLengths(String[] words) {
        int shortestLength = Integer.MAX_VALUE;
        int longestLength = 0;

        // Traverse through the words to calculate their lengths
        for (String word : words) {
            int wordLength = calculateWordLength(word);
            if (wordLength < shortestLength) {
                shortestLength = wordLength;
            }
            if (wordLength > longestLength) {
                longestLength = wordLength;
            }
        }

        return new int[]{shortestLength, longestLength}; // Return the lengths as an array
    }

    // Method to calculate the length of a word without using length()
    public static int calculateWordLength(String word) {
        int lengthCounter = 0;

        try {
            while (true) {
                word.charAt(lengthCounter++); // Access each character until an exception occurs
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Do nothing, as the exception indicates the end of the word
        }

        return lengthCounter; // Return the calculated length
    }
}