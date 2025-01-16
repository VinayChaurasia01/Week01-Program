import java.util.Scanner;

public class TrimSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String userInput = scanner.nextLine();

        // Trim spaces using the custom method
        String customTrimmed = trimSpaces(userInput);

        // Display results for both custom and built-in trim methods
        System.out.println("Custom Trimmed: '" + customTrimmed + "'");
        System.out.println("Built-in Trimmed: '" + userInput.trim() + "'");
    }

    // method to trim leading and trailing spaces
    public static String trimSpaces(String inputString) {
        int startIndex = 0, endIndex = inputString.length() - 1;

        // Trim leading spaces
        while (startIndex <= endIndex && inputString.charAt(startIndex) == ' ') {
            startIndex++;
        }

        // Trim trailing spaces
        while (endIndex >= startIndex && inputString.charAt(endIndex) == ' ') {
            endIndex--;
        }

        // Return the trimmed substring
        return inputString.substring(startIndex, endIndex + 1);
    }
}