/*
Write a program to find the side of the square whose parameter you read from user 
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____
*/

import java.util.Scanner;

class PerimeterOfSquare{
	public static void main(String [] args){
    // Create a Scanner object to take input from the user
    Scanner scan = new Scanner(System.in);
     
	 System.out.print("Enter the value of perimeter:");
	 double perimeter = scan.nextDouble();
	 
	 //calculate side of a square
	 double side = perimeter/4.0;
	 
	 //print side and perimeter of square
	 System.out.println("The length of the side is " +  side + " whose perimeter is " + perimeter );
	 
    }
}	