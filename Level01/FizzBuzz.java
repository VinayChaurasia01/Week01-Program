/*
Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, 
but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". 
Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
Hint => 
Create a String Array to save the results and 
Finally, loop again to show the results of the array based on the index position
*/

import java.util.Scanner;

class FizzBuzz{
	public static void main(String [] args){
		//create an scanner for user input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int number = scan.nextInt();
		
		if(number > 0){
		//create a string array
		String[] results = new String[number + 1];

        // Loop from 0 to the input number
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
				// Multiples of both 3 and 5
                results[i] = "FizzBuzz"; 
            } else if (i % 3 == 0) {
				// Multiples of 3
                results[i] = "Fizz"; 
            } else if (i % 5 == 0) {
				// Multiples of 5
                results[i] = "Buzz"; 
            } else {
                results[i] = String.valueOf(i); 
            }
        }

        // Display the results
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
		}else{
			System.out.println("The number is not valid ");
		}
	}
}
		
		
