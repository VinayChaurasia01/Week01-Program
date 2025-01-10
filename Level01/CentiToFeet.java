/*
Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/

import java.util.Scanner;

class CentiToFeet{
	public static void main(String [] args){
		// Create a Scanner object to take input from the user
		Scanner scan = new Scanner(System.in);
		
		double centi = scan.nextDouble();
		
		//convert centimeter to inches
		double inche = centi / 2.54;
		
		//convert inches to feet
		double feet = inche / 12;
		
		System.out.println("Your Height in cm is " + centi + " while in feet is "+ feet + " and inches is " + inche );
		
	}
}