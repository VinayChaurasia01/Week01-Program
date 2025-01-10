/*
The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the 
discounted amount and discounted price the student will pay for the course.
Hint => 
Create a variable named fee and assign 125000 to it.
Create another variable discountPercent and assign 10 to it.
Compute discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
O/P => The discount amount is INR ___ and final discounted fee is INR ___
*/
class Discount {
	public static void main(String [] args){
		
		//create a variable universityFee and assign the fee of particular course
		int universityFee = 125000;
		
		// create a variable discount and assign the discount percentage of particular course
		int discount = 10;
		
		// Calculate discounted amount of fees
		double discountedAmount = (double)universityFee * discount / 100;
		
		// calculate the remaining fee
		double discountedPrice = universityFee - discountedAmount;
		
		//print result
	System.out.println("The discount amount is INR " + discountedAmount + " and final discounted fee is INR " + discountedPrice);
	}
}