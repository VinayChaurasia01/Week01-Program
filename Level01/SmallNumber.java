/*Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest? ____
*/

import java.util.*;
public class SmallNumber{
	public static void main(String args[]){
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number1 :");
		int number1 = scan.nextInt();
		
		System.out.println("Enter number2 :");
		int number2 = scan.nextInt();
		
		
		System.out.println("Enter number3 :");
		int number3 = scan.nextInt();
		
		
		int smallest =Math.min(number1,Math.min(number2,number3));
		
		boolean isFirstNumber = false;
		
		if(smallest==number1){
			isFirstNumber = true;
			System.out.println("Is the first number the smallest? "+isFirstNumber);
			
		}else{
			System.out.println("Is the first number the smallest? "+isFirstNumber);
		}
	}
}