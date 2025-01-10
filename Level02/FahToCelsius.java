/*
Write a TemperaturConversion program, given the temperature in Fahrenheit as input outputs the temperature in Celsius
Hint => 
Create a fahrenheit variable and take the user's input
User the formulae to convert Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C and assign the result to celsiusResult  and print the result
I/P => fahrenheit
O/P => The ____ fahrenheit is _____ celsius
*/

import java.util.Scanner;

class FehToCelsius{
	public static void main(String [] args){
		
		//create scanner object to take input from user
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter temperature in Fahrenheit :");
		double fahrenheit = scan.nextDouble();
		
		//Calculate celcius to fahrenheit
		double celsius = (fahrenheit - 32) * (5.0 / 9.0) ;
		
		System.out.println("The " + fahrenheit + " celcius is " + celsius + " fahrenheit");
	}
}