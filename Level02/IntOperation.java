/*
Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
Hint => 
Create variables a, b, c of int data type.
Take user input for a, b, and c.
Compute 3 integer operations and assign result to a variable
Finally print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are —-, -—, and —-
*/

import java.util.Scanner;

class IntOperation{
	public static void main(String [] args){
		//create a scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter three numbers : "); 
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		//calculate first operation first b*c and then a+(b*c)
		int result1 = a + b * c;
		
		//calculate operations
		int result2 = a * b + c;
		
		//calculate operations
		int result3 = c+a/b;
		
		//calculate operations
		int result4 = a%b+c;
		
		System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + " and " + result4);
	}
}
		