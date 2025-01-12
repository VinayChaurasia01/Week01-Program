/*
Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero
*/

import java.util.Scanner;

class CheckNumber{
	//create a method for check number 
	public static int checkNum(int number){
		if(number > 0){
			return 1;
		}else if (number < 0){
			return -1;
		}else {
			return 0;
		}
	}
	
	public static void main(String [] args){
		//create scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int number = scan.nextInt();
		
		//print type of number
		System.out.println(checkNum(number));
	}
}