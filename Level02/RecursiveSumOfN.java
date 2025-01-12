/*
Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct. 
Hint => 
Take the user input number and check whether it's a Natural number, if not exit
Write a Method to find the sum of n natural numbers using recursion
Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
Compare the two results and print the result
*/

import java.util.Scanner;

class RecursiveSumOfN{
	
	//create a function for calculating sum by recursion
	public static int sumRecursive(int number){
		if(number <= 1){
			return number;
		}
		return number + sum(number-1); //call function itself
	}
	
	//create method for calculating sum by formulae
	public static int sum(int number){
		int total = number * (number+1) / 2;
		return total;
	}
	
	public static void main(String [] args){
		//create an scanner object for user input
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter a natural number :");
		int number = scan.nextInt();
		
		System.out.println("Sum of n natural number by using recursion is :" + sumRecursive(number));
		
		System.out.println("Sum of n natural number by using loop is :" + sum(number));
		
		//compare both computations same or different
		if(sumRecursive(number) == sum(number)){
			System.out.print("Both results is same :" + sum(number));
		}else{
			System.out.print("results are different ");
		}
		
	}
}
