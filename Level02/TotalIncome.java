/*
Create a program to find the total income of a person by taking salary and bonus from user
Hint => 
Create a variable named salary and take user input.
Create another variable bonus and take user input.
Compute income by adding salary and bonus and print the result
I/P => salary, bonus
O/P => The salary is INR ___ and bonus is INR ___. Hence Total Income is INR ___
*/

import java.util.Scanner;

class TotalIncome{
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the salary of user :");
		double salary = scan.nextDouble();
		
		System.out.print("Enter the bonus of user :");
		double bonus = scan.nextDouble();
		
		//calculate total salary
		double totalSalary = salary + bonus;
		
		System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus +". Hence Total Income is INR " + totalSalary);
		
		
	}
}