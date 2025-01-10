/*
An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
I/P => side1, side2, side3
O/P => The total number of rounds the athlete will run is ___ to complete 5 km
*/

import java.util.Scanner;

class TriangularPark{
	public static void main(String [] args){
		
		//create scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		//take input from user of side1
		System.out.print("Enter the side1 of triangular park in meter:");
		double side1 = scan.nextDouble();
		
		//take input from user of side2
		System.out.print("Enter the side2 of triangular park in meter:");
		double side2 = scan.nextDouble();
		
		//take input from user of side3
		System.out.print("Enter the side3 of triangular park in meter:");
		double side3 = scan.nextDouble();
		
		//calculate perimeter of triangular park
		double perimeter = side1+ side2+ side3;
		
		double roundCount = 5000.0 / perimeter;
		
		System.out.println("The total number of rounds the athlete will run is " + roundCount + " to complete 5 km " );
	}
}