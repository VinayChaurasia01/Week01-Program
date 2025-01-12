/*
Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for number of students
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
*/

import java.util.Scanner;

class MaxhandShakes{
	
	//create a method for calculating maximum handshakes
	public static int maxHandShakes(int n){
		//calculate combination 
		// and return max handshakes
		return (n * (n - 1)) /2; 
	}
	public static void main(String [] args){
		//create scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of students :");
		int students = scan.nextInt();
		
		//create a ans variable for assign value of method and call method 
		int ans = maxHandShakes(students);
		
		System.out.println("Maximum handshakes is :" + ans);
	}
}