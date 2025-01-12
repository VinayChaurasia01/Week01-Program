/*Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___
*/


import java.util.Scanner;
public class Divisivility5{
	
	public static void main(String args[]){
		
		//create scanner object for user input
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter an number :");
		int number = scan.nextInt();
		boolean isDivisible = false;
		
		//Check divisibity 5
		if(number%5==0){
			isDivisible =true;
		}
		
		// if true then print
		if(isDivisible){
			System.out.println("Is the number "+number+" divisible by 5 "+isDivisible);
		}else{
			System.out.println("Is the number "+number+" divisible by 5 "+isDivisible);
		}
		
	}


}