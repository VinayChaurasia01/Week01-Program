/*
Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/

import java.util.Scanner;

class AreaOfTriangle{
	public static void main(String [] args){

		// Create a Scanner object to take input from the user
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the value of base :");
		double base = scan.nextDouble();
		System.out.print("Enter the value of height :");
		double height = scan.nextDouble();
		
		//calculate area of triangle by using formula: 1/2 * base * height
		double area = (0.5 * base * height);
		
		// print area of triangle
		System.out.println("Area of the triangle is : " + area );
	}
}