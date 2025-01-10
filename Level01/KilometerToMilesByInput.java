/*
Create a program to convert distance in kilometers to miles.
Hint => 
Create a variable km and assign type as double as in double km;
Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
Use Scanner Object to take user input for km as in km = input.nextInt();
Use 1 mile = 1.6 km formulae to calculate miles and show the output
I/P => km
O/P => The total miles is ___ mile for the given ___ km
*/

import java.util.Scanner;

class KilometerToMilesByInput{
	public static void main(String [] args){
		// Create a Scanner object to take input from the user
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of kilometers: ");

		//take input from user
		int km = input.nextInt();
		
		// Convert the distance from kilometers to miles using the formula miles = km / 1.6
		double miles = (double) km / 1.6;
		
		// Display the converted distance in miles
		System.out.println("The total miles is " + miles + " miles for the given " + km + " km");
	}
}