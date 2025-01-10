/*
Create a program to convert the distance of 10.8 kilometers to miles.
Hint: 1 km = 1.6 miles
I/P => NONE
O/P => The distance  ___ km in miles is ___
*/
class KilometersToMiles {
	public static void main(String [] args){
		// create a double variable kilometer and assign value 10.8
		double kilometers = 10.8;
		
		// Convert the distance from kilometers to miles using the conversion factor (1 km = 0.6 miles)
		double miles = kilometers * 0.6;
		
		// Print the converted distance in miles
		System.out.println("The distance " + kilometers + "km in miles is " + miles );
	}
}