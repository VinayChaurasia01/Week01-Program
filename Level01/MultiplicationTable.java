/*
Create a program to print a multiplication table of a number.
Hint => 
Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 10
Run a loop from 1 to 10 and store the results in the multiplication table array
Finally, display the result from the array in the format number * i = ___
*/

import java.util.Scanner;

class MultiplicationTable{
	public static void main(String args[]){
		
		//create scanner object for taking user input 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		//take input a number
		int number = scan.nextInt();
		
		//define a array of length 10
		int multi[] = new int[10];
		
		//loop for store multiplication of number
		for(int i=0;i<multi.length;i++){
			multi[i] = number * (i+1);
		}
		
		//loop for print table
		for(int i=0;i<multi.length;i++){
			System.out.println(number + " * " + (i+1) + " = " + multi[i]);
		}
	}
}
		
		
		