/*
Write a program that takes a year as input and outputs the Year is a Leap Year or not 
Hint => 
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. 
Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
Write a method to check for Leap Year using the conditions a and b
*/

import java.util.Scanner;

class LeapYear{
	
	//create a method for calculate leap year
	public static boolean leapYear(int year){
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			return true;
		}else{
			return false;
		}			
	}
	public static void main(String [] args){
		//create scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a year for checking leap year (>= 1582) :");
		int year = scan.nextInt();
		
		//check year is above 1582
		if(year < 1582){
			System.out.println("Please Enter a valid year ");
			return;
		}
		System.out.print(leapYear(year));
	}
}