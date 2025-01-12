/*
Create a program to find the power of a number.
Hint => 
Get integer input for two variables named number and power.
Create a result variable with an initial value of 1.
Run a for loop from i = 1 to i <= power.
In each iteration of the loop, multiply the result with the number and assign the value to the result.
Finally, print the result
*/

import java.util.Scanner;

class Power{
	public static void main(String [] args){
		
		//create a scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number :");
		int number = scan.nextInt();
		
		System.out.print("Enter power :");
		int power = scan.nextInt();
		
		int result = 1;

        // Loop from i = 1 to i <= power to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply the result by the number in each iteration
        }

        // Display the result
        System.out.println(number + " raised to the power " + power + " is: " + result);
	}
}
