/*
Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => 
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
*/

import java.util.Scanner;'

class SimpleInterest{
	
	//create a method for calculating simple interest
	public static double CalculateSimpleInterest(double principal , double rate , double time){
		//Calculating with the formula principal*rate*time / 100
		//return calculated data
		return principal*rate*time / 100.0;
	}
	public static void main(String [] args){
		//create an scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		//input principal
		System.out.print("Enter principal :");
		double principal = scan.nextDouble();
		
		//input rate
		System.out.print("Enter Rate :");
		double rate = scan.nextDouble();
		
		//input time
		System.out.print("Enter time :");
		double time = scan.nextDouble();
		
		//call CalculateSimpleInterest method and store it value in a variable result
		double result = CalculateSimpleInterest(principal , rate , time);
		
		System.out.println("The Simple Interest is " + result + " for Principal " + principal + ", Rate of Interest " + 
		rate + " and Time " + time );
	}
}