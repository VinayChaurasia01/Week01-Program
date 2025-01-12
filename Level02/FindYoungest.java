/*
Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on 
their heights
Hint => 
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
Finally display the youngest and tallest of the 3 friends
*/

import java.util.Scanner;

class FindYoungest{
	public static void main(String [] args){
		//create scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		//create two for storing ages and height
		double age[] = new double[3];
		double height[] = new double[3];
		
		System.out.print("Enter age of amar :");
		age[0] = scan.nextDouble();
		
		System.out.print("Enter height of amar :");
		height[0] = scan.nextDouble();
		
		System.out.print("Enter age of akbar :");
		age[1] = scan.nextDouble();
		
		System.out.print("Enter height of akbar :");
		height[1] = scan.nextDouble();
		
		System.out.print("Enter age of anthony :");
		age[2] = scan.nextDouble();
		
		System.out.print("Enter height of anthony :");
		height[2] = scan.nextDouble();
		
		//check max age and height
		double tempHeight = height[0];
		double tempAge = age[0];
		
		//max age and height
		int youngest = 0;
		int tallest = 0;
		
		for(int i=1;i<3;i++){
			if(tempAge < age[i]){
				youngest = i;
			}
			if(tempHeight < height[i]){
				tallest = i;
			}
		}
		
		if (youngest == 0){
			System.out.println("Youngest friend is Amar");
		}else if (youngest == 1){
			System.out.println("Youngest friend is Akbar");
		}else{
			System.out.println("Youngest friend is Anthony");
		}
		
		if(tallest == 0){
			System.out.println("Tallest friend is Amar");
		}else if(tallest == 1){
			System.out.println("Tallest friend is Akbar");
		}else{
			System.out.println("Tallest friend is Anthony");
		}
	}
}	
				
		