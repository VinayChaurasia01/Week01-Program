import java.util.Scanner;

public class NumberAnalyzer4 {

    // Method to check if a number is Prime
    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false; // Prime numbers are greater than 1
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { // Check up to the square root of the number
            if (number % i == 0) {
                return false; // Not a prime number
            }
        }
        return true; // Prime number
    }

    // Method to check if a number is Neon
    public static boolean checkNeon(int number) {
        int squareOfNumber = number * number;
        int sumOfDigits = 0;

        // Calculate the sum of the digits of the square
        while (squareOfNumber != 0) {
            int digit = squareOfNumber % 10;
            sumOfDigits += digit;
            squareOfNumber /= 10;
        }
        return number == sumOfDigits;
    }

    // Method to check if a number is Spy
    public static boolean checkSpy(int number) {
        int sumOfDigits = 0;
        int productOfDigits = 1;

        // Calculate the sum and product of the digits
        while (number != 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            number /= 10;
        }
        return sumOfDigits == productOfDigits;
    }

    // Method to check if a number is Automorphic
    public static boolean checkAutomorphic(int number) {
        int squareOfNumber = number * number;

        // Check if the last digits of the square match the original number
        return squareOfNumber % (int) Math.pow(10, String.valueOf(number).length()) == number;
    }

    // Method to check if a number is Buzz
    public static boolean checkBuzz(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.println("Enter the number:");
        int number = scan.nextInt();

        // Call methods to check the properties of the number
        boolean isPrime = checkPrime(number);
        boolean isNeon = checkNeon(number);
        boolean isSpy = checkSpy(number);
        boolean isAutomorphic = checkAutomorphic(number);
        boolean isBuzz = checkBuzz(number);

        // Display results
        System.out.println("Is the number Prime? " + isPrime);
        System.out.println("Is the number Neon? " + isNeon);
        System.out.println("Is the number Spy? " + isSpy);
        System.out.println("Is the number Automorphic? " + isAutomorphic);
        System.out.println("Is the number Buzz? " + isBuzz);

        scan.close(); // Close the scanner
    }
}
