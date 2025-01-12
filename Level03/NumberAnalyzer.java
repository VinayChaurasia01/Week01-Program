import java.util.*;

public class NumberAnalyzer {

    // Method to count the number of digits in a number
    public static int countDigits(int number) {
        int digitCount = 0;
        while (number != 0) {
            digitCount++;
            number = number / 10;
        }
        return digitCount;
    }

    // Method to extract digits of a number into an array
    public static int[] extractDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        int index = 0;

        while (number != 0) {
            digits[index] = number % 10; 
            number = number / 10;       
            index++;
        }
        return digits;
    }

    // Method to calculate the sum of the digits of a number
    public static int calculateDigitSum(int number) {
        int[] digits = extractDigits(number);
        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to calculate the sum of the squares of the digits of a number
    public static double calculateSquareDigitSum(int number) {
        int[] digits = extractDigits(number);
        double sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, 2); // Square each digit and add to sum
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int digitSum = calculateDigitSum(number);
        return number % digitSum == 0;
    }

    // Method to calculate the frequency of each digit in a number
    public static int[][] calculateDigitFrequency(int number) {
        int[][] digitFrequency = new int[10][2]; 

        // Initialize the digit values
        for (int i = 0; i < 10; i++) {
            digitFrequency[i][0] = i; // Store digit in the first column
        }

        // Calculate the frequency of each digit
        while (number != 0) {
            int digit = number % 10;
            digitFrequency[digit][1]++;
            number = number / 10;
        }
        return digitFrequency;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scan.nextInt();

        // Call methods to perform various calculations
        int digitCount = countDigits(number); // Count the digits
        int[] digits = extractDigits(number); // Extract digits
        int digitSum = calculateDigitSum(number); // Calculate digit sum
        double squareDigitSum = calculateSquareDigitSum(number); // Sum of squares of digits
        boolean isHarshad = isHarshadNumber(number); // Check if Harshad number
        int[][] digitFrequency = calculateDigitFrequency(number); // Calculate digit frequency

        System.out.println("Total digits: " + digitCount);

        System.out.print("Digits in the number: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Sum of digits: " + digitSum);
        System.out.println("Sum of squares of digits: " + squareDigitSum);
        System.out.println("Is the number a Harshad number? " + isHarshad);

        System.out.println("\nDigit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (digitFrequency[i][1] > 0) {
                System.out.println("Digit " + digitFrequency[i][0] + ": " + digitFrequency[i][1]);
            }
        }
    }
}
