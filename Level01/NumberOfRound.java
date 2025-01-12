/*
An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, 
then how many rounds must the athlete complete
Hint => 
Take user input for 3 sides of a triangle 
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run
*/

import java.util.Scanner;

class NumberOfRound{
	
	//create a method park
	public static double park(double side1,double side2, double side3){
		//compute perimeter of park
		double perimeter = side1+side2+side3;
		
		//compute number of rounds and return 
		return 5000.0/perimeter;
	}
	public static void main(String [] args){
		//create a scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter side 1 of triangular park in meter :");
		double side1 = scan.nextDouble();
		
		System.out.print("Enter side 2 of triangular park in meter:");
		double side2 = scan.nextDouble();
		
		System.out.print("Enter side 3 of triangular park in meter:");
		double side3 = scan.nextDouble();
		
		//create a double variable result to assign method value
		double result = park(side1,side2,side3);
		
		System.out.println("The number of rounds user needs to do to complete 5 km run " + result);
	}
}