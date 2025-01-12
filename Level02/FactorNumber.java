/*
Create a program to find the factors of a number taken as user input.
Hint => 
Get the input value for a variable named number.
Run a for loop from i = 1 to i < number.
In each iteration of the loop, check if number is perfectly divisible by i.
If true, print the value of i.
*/

import java.util.Scanner;

class FactorNumber{
	public static void main(String [] args){
		
		// create scanner object for user input''
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int number = scan.nextInt();
		
		System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i < number; i++) {
            // Check if i is a factor of the number
            if (number % i == 0) {
                System.out.print(i + " "); // Print the factor if it's divisible
            }
        }
	}
}