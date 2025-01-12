/*
Rework the program 2, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to modify to Increase the size
 of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number 
Hint => 
In Hint f inside the loop if the index is equal to maxDigit, increase maxDigit and make digits array to store more elements. 
To do this, we need to create a new temp array of size maxDigit, copy from the current digits array the digits into the temp array, and assign 
the current digits array to the temp array
Now the digits array will be able to store all digits of the number in the array and then find the largest and second largest number
*/

import java.util.Scanner;

class MaxDigit2{
	public static void main(String [] args){
		//create scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int number = scan.nextInt();
		
		//create an array for store digits of number
		int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits from the number and store in the array
        while (number != 0) {
            if (index == maxDigit) {
                // Increase the size of the array
                maxDigit += 10; // Increment maxDigit by 10
                int[] temp = new int[maxDigit];

                // Copy elements from the old array to the new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp; // Assign the new array to digits
            }

            digits[index++] = number % 10; // Get the last digit and store it
            number /= 10; // Remove the last digit from the number
        }

        // Check if no digits were added
        if (index == 0) {
            System.out.println("No digits to process.");
            return;
        }

        // Find the largest and second-largest digits
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; 
                largest = digits[i]; 
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
	}
}