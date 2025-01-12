/*
Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive 
numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, 
greater or less
Hint => 
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero. 
Finally compare the first and last element of the array and display if they equal, greater or less
*/

import java.util.Scanner;

class PosNegArr{
	public static void main(String [] args){
		
		//create scanner object for take user input
		Scanner scan = new Scanner(System.in);
		
		//Define a array of length 5
		int num[] = new int[5];
		
		System.out.println("Enter five element of array :" );
		//make a for loop for taking input element of array
		for(int i=0;i<num.length;i++){
			num[i] = scan.nextInt();
		}
		
		//loop for grap all element of array
		for(int i=0;i<num.length;i++){
			//check number is positive
			if(num[i] > 0){
				//check number is even of odd
				if(num[i]%2 == 0){
					System.out.println("The number " + num[i] + " is positive and Even");
				}else{
					System.out.println("The number " + num[i] + " is positive and Odd");
				}
				//check number is negative
			}else if(num[i] < 0){
				System.out.println("The number " + num[i] + " is negative");
			}else{//its for number 0
				System.out.println("The number " + num[i] + " is Zero");
			}
		}
	}
}