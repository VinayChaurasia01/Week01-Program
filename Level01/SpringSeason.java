/*
Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false 
*/

import java.util.Scanner;

class SpringSeason{
	
	//create a method for check spring season
	public static boolean checkSpring(int month , int day){
		if((month >= 3 && day >= 20) || (month <= 6 && day <= 20)){
			return true;
		}else{
			return false;
		}
	}		
	public static void main(String [] args){
		//create an scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of month :");
		int month = scan.nextInt();
		
		//check month is valid 
		if(month > 12 || month < 1){
			System.out.print("Please Enter a valid month number ");
			return;
		}
	
		System.out.print("Enter the number of Day :");
		int day = scan.nextInt();
		
		//check day is valid
		if(day > 31 || day < 1){
			System.out.print("Please enter a valid day number ");
			return ;
		}
		
		//Display the answer
		System.out.println(checkSpring(month,day));
		
	}
}