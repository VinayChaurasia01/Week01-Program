import java.util.Scanner;

public class NumberAnalyzer3 {

    // Method to count the number of digits in a number
    public static int countDigits(int number) {
        int digitCount = 0;
        while (number != 0) {
            digitCount++;
            number /= 10;
        }
        return digitCount;
    }

    // Method to extract the digits of a number into an array
    public static int[] extractDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        int index = 0;
        while (number != 0) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }
        return digits;
    }

    // Method to reverse the digits of a number
    public static int[] reverseDigits(int number) {
        int[] digits = extractDigits(number);
        int size = digits.length;
        int[] reversedDigits = new int[size];
        for (int i = 0; i < size; i++) {
            reversedDigits[i] = digits[size - i - 1];
        }
        return reversedDigits;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = extractDigits(number);
        int[] reversedDigits = reverseDigits(number);
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != reversedDigits[i]) {
                return false; // Not a palindrome
            }
        }
        return true; // It's a palindrome
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = extractDigits(number);
        for (int digit : digits) {
            if (digit == 0) {
                return false; // Contains zero, not a Duck number
            }
        }
        return true; // No zeroes, it's a Duck number
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.println("Enter a number:");
        int number = scan.nextInt();

        // Analyze the number
        int digitCount = countDigits(number);
        int[] digits = extractDigits(number);
        boolean isPalindrome = isPalindrome(number);
        boolean isDuck = isDuckNumber(number);

        // Display the results
        System.out.println("Number of digits: " + digitCount);

        System.out.println("Digits in the number:");
        for (int digit : digits) {
            System.out.println(digit);
        }

        System.out.println("Is the number a Duck number? " + isDuck);
        System.out.println("Is the number a Palindrome? " + isPalindrome);

        scan.close(); // Close the scanner
    }
}
