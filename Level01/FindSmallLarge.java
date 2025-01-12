/*
Write a program to find the smallest and the largest of the 3 numbers.
Hint => 
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers
public static int[] findSmallestAndLargest(int number1, int number2, int number3)
*/

import java.util.Scanner;
class FindSmallLarge{
	
	//create a method for finding smallest and largest number
	public static int[] smallestAndLargest(int number1, int number2, int number3){
	 
     	int smallest = Math.min(number1,Math.min(number2,number3)); 
		int largest = Math.max(number1,Math.max(number2,number3)); 
		
		return new int []{smallest,largest};
     
	}

	
	public static void main(String[] args){
		
		// Creating Scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Enter the number 1 :");
		int number1 = scan.nextInt();
		
		System.out.print("Enter the number 2 :");
		int number2 = scan.nextInt();
		
		System.out.print("Enter the number 3 :");
		int number3 = scan.nextInt();
		
		int smallestLargest[] = smallestAndLargest(number1,number2,number3);
		
		//display the output
		System.out.print("The smallest number is "+smallestLargest[0]+" and \nLargest number is "+smallestLargest[1]);
		
		
	}
}


