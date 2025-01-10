/*
Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
Hint => 
Create a variable named fee and take user input for fee.
Create another variable discountPercent and take user input.
Compute the discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
I/P => fee, discountPrecent
O/P => The discount amount is INR ___ and final discounted fee is INR ___
*/

import java.util.Scanner;
class StudentFee{
	public static void main(String [] args){
		// Create a Scanner object to take input from the user
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter university fee: ");
		int fee = scan.nextInt();
		
		System.out.print("Enter the percentage of discount: ");
		double discountPercent = scan.nextDouble();
		
		// Calculate the discount amount using the formula: discount = fee * discountPercent / 100
		double discount = fee * discountPercent / 100;
		
		// Calculate and display the final discounted fee
		System.out.println("The discount is INR " + discount + " and final discounted fee is INR " + (fee - discount));
    }
}	