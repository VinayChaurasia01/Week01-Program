/* Similarly, write the DoubleOpt program by taking double values and doing the same operations. */

import java.util.Scanner;

class DoubleOpt{
	public static void main(String [] args){
		//create a scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter three numbers : "); 
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		//calculate first operation first b*c and then a+(b*c)
		double result1 = a + b * c;
		
		//calculate operations
		double result2 = a * b + c;
		
		//calculate operations
		double result3 = c + a / b;
		
		//calculate operations
		double result4 = a % b + c;
		
		System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + " and " + result4);
	}
}