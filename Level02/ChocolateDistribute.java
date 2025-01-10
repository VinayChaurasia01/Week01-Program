/*
Create a program to divide N number of chocolates among M children.
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Find the number of chocolates each child gets and number of remaining chocolates
Display the results
I/P => numberOfchocolates, numberOfChildren
O/P => The number of chocolates each child gets is ___ and the number of remaining chocolates are ___
*/

import java.util.Scanner;

class ChocolateDistribution{
	public static void main(String [] args){
		
		//create scanner object to take input from user
		Scanner scan = new Scanner(System.in);
		
		//number of chocolates take input from user 
	    System.out.print("Enter the number of chocolates : ");
		int chocolates = scan.nextInt();
		
		//number of children take input from user 
		System.out.print("Enter the number of children : ");
		int children = scan.nextInt();
		
		//calculate the number of chocolates that have children
		int resultChoco = chocolates / children;
		
		//calculate the number of chocolates which is remaining
		int remain = chocolates % children;
		
		System.out.println("The number of chocolates each child gets is " + resultChoco + " and the number of remaining chocolates are " + remain );
		
	}
}