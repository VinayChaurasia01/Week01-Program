/*
Create a program to find all the multiple of a number taken as user input below 100.
Hint => 
Get input value for a variable named number.
Run a for loop backward: from i = 100 to i = 1.
Inside the loop, check if i perfectly divide the number.
If true, print the number and continue the loop
*/

import java.util.Scanner;

class FindMultiplication{
	public static void main(String [] args){
		
		//create scanner object for user input 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int number = scan.nextInt();
		
		System.out.print("Multiple number is :");
		for(int i=1 ; i<=100;i++){
		if(number % i == 0){
			System.out.print(i + " " );
		}
		}
	}
}