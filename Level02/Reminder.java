/*
Write a program to take 2 numbers and print their quotient and reminder
Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___
*/

import java.util.Scanner;

class Reminder{
	public static void main(String []  args){
		
		//create a scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number1 :");
		int number1 = scan.nextInt();
		
		System.out.print("Enter number2 :");
		int number2 = scan.nextInt();
		
		//perform division operation
		int quotient = number1/number2 ;
		
		//perform modulo opertion for calculating reminder
		int reminder = number1%number2;
		
		System.out.println("The Quotient is " + quotient + " and Reminder is " + reminder + " of two number " + number1 + " and " + number2);
	}
}
		