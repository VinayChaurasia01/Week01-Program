/*
Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
Hint => 
Take the input for a number
Find the count of digits in the number
Find the digits in the number and save them in an array
Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
Display the frequency of each digit in the number
*/

import java.util.Scanner;

class FrequencyCount{
	public static void main(String [] args){
		//create an scanner object user input
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        // Create an array to store the frequency of each digit 
        int[] frequency = new int[10];

        // Find the digits of the number and update the frequency array
        while (number > 0) {
            int digit = number % 10; 
            frequency[digit]++; 
            number /= 10; // Remove the last digit
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) { // Only display digits that occur in the number
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
	}
}