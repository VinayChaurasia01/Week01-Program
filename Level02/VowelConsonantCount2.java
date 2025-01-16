import java.util.Scanner;

public class VowelConsonantCount2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Count vowels and consonants in the input string
        int[] countResult = countVowelsAndConsonants(userInput);

        // Display the counts
        System.out.println("Vowels: " + countResult[0]);
        System.out.println("Consonants: " + countResult[1]);
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String inputString) {
        int vowelCount = 0, consonantCount = 0;

        // Iterate through each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            if (isVowel(currentChar)) {
                vowelCount++;
            } else if (Character.isLetter(currentChar)) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount}; // Return the counts as an array
    }

    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character); // Convert to lowercase
        return "aeiou".indexOf(character) != -1; // Check if the character is a vowel
    }
}