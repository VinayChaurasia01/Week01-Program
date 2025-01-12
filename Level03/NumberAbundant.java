
/*
Create a program to check if a number is an Abundant Number.
Hint => 
An abundant number is an integer in which the sum of all the divisors of the number is greater than the number itself. For example,
Divisor of 12: 1, 2, 3, 4, 6
Sum of divisor: 1 + 2 + 3 + 4 + 6 = 16 > 12
Get an integer input for the number variable.
Create an integer variable sum with initial value 0.
Run a for loop from i = 1 to i < number.
Inside the loop, check if number is divisible by i.
If true, add i to sum.
Outside the loop Check if sum is greater than number.
If the sum is greater than the number, print Abundant Number. Otherwise, print Not an Abundant Number.
*/

import java.util.Scanner;

class NumberAbundant {
    public static void main(String[] args) {
        // Creating the Scanner object.
        Scanner scan = new Scanner(System.in);

        // Taking input of the number to check if it is an abundant number.
        System.out.print("Enter Number: ");
        int number = scan.nextInt();

        // Variable to store the sum of proper divisors.
        int divisorSum = 0;

        // Loop to calculate the sum of proper divisors.
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if 'i' is a divisor of 'number'
                divisorSum += i;  // Add the divisor to the sum
            }
        }

        // Checking whether the number is abundant or not.
        if (divisorSum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }
	}
}