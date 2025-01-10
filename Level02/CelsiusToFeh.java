/*
Write a TemperaturConversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit
Hint => 
Create a celsius variable and take the temperature as user input
Use the Formulae Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F and assign to farenheitResult  and print the result
I/P => celcius
O/P =>  The ____ celsius is _____ fahrenheit
*/

import java.util.Scanner;

class CelsiusToFeh{
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter temperature in celcius :");
		double celcius = scan.nextDouble();
		
		//Calculate celcius to fahrenheit
		double fahrenheit = (celcius * (9.0/5.0)) + 32 ;
		
		System.out.println("The " + celcius + " celcius is " + fahrenheit + " fahrenheit");
	}
}