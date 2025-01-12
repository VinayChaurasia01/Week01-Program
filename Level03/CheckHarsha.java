import java.util.Scanner;

class CheckHarshad {
    public static void main(String[] args) {
        // Creating the Scanner object.
        Scanner scan = new Scanner(System.in);

        // Taking input of the number on which checking will be performed.
        System.out.print("Enter Number: ");
        int number = scan.nextInt();

        // Variable to store the digit sum.
        int digitSum = 0;

        // Temporary variable to hold the original number for digit sum calculation.
        int temp = number;

        // Extracting and adding each digit to the sum.
        while (temp > 0) {
            int digit = temp % 10; // Extract the last digit
            digitSum += digit;    // Add it to the digit sum
            temp = temp / 10;     // Remove the last digit
        }

        // Checking the condition of a Harshad number.
        if (number % digitSum == 0) {
            System.out.println("Harshad number");
        } else {
            System.out.println("Not a Harshad number");
        }
    }
}