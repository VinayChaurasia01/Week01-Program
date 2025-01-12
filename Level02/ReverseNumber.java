/*
Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the
 array in reverse order
Hint => 
Take user input for a number. 
Find the count of digits in the number. 
Find the digits in the number and save them in an array
Create an array to store the elements of the digits array in reverse order
Finally, display the elements of the array in reverse order  
*/

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
		//create scanner object for user input
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        // Determine the number of digits in the number
        int temp = number;
        int digitCount = 0;

        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }

        // Create an array to store the digits of the number
        int[] digits = new int[digitCount];
        int index = 0;

        while (number > 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        // Display the digits in reverse order
        System.out.print("The reversed number is: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}