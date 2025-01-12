/*
Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop 
*/

import java.util.Scanner;

class SumOfNaturalNumber{
	
	//create a method for calculating sum of n natural numbers 
	public static int sum(int n){
		int total = 0;
		for(int i=1;i<=n;i++){
			total += i;
		}
		return total;
			
	}
	public static void main(String [] args){
		//create scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a natural number :");
		int number = scan.nextInt();
		
		//Display the sum of n natural numbers
		System.out.println("The sum of " + number + " natural numbers is :" + sum(number)); 
	}
}