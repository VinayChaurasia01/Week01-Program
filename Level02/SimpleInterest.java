/*
Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => Simple Interest = Principal * Rate * Time / 100
I/P => principal, rate, time
O/P => The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___
*/

import java.util.Scanner;

class SimpleInterest{
	public static void main(String [] args){
		//create scanner object to take input from user
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter principal :");
		double principal = scan.nextDouble();
		
		System.out.print("Enter rate of interest :");
		double rate = scan.nextInt();
		
		System.out.print("Enter time in years :");
		double time = scan.nextInt();
		
		//calculate simple interest by using formula: principal*rate*time/100
		
		double interest = principal * rate * time / 100;
		
		System.out.println("The Simple Interest is " + interest + " for Principal " + principal + " Rate of Interest " + rate + " and time " + time );
	}
}