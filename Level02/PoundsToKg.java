/*
Create a program to convert weight in pounds to kilograms.
Hint => 1 pound = 2.2 kg
I/P => weight
O/P => The weight of the person in pound is ___ and in kg is ___
*/

import java.util.Scanner;

class PoundToKg{
	public static void main(String [] args){
		
		//create scanner object to take input from user
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your weight in kilograms :");
		double weight = scan.nextDouble();
		
		//convert weight kilograms to pounds
		double pounds = weight / 2.2;
		
		System.out.println("The Weight of the person in pound is " + pounds + " and in kg is " + weight);
	}
}