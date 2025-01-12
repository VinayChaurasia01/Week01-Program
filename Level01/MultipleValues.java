/*
Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. 
Show all the numbers as well as the sum of all numbers 
Hint => 
Create a variable to store an array of 10 elements of type double as well as a variable to store the total of type double 
initializes to 0.0. Also, the index variable is initialized to 0 for the array
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop 
Also, break from the loop if the index has a value of 10 as the array size is limited to 10.
If the user entered a number other than 0 or a negative number inside the while loop then assign the number to the array element and increment the index value
Take another for loop to get the values of each element and add it to the total 
Finally display the total value
*/

import java.util.Scanner;

class MultipleValues{
	public static void main(String [] args){
		
		//create scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		//define a array of length 10
		double arr[] = new double[10];
		
		//a variable for index
		int i = 0;
		
		System.out.print("Enter the elements of array :");
		//for loop for taking input elements in array
		while(true){
			if(i < 10){
			arr[i] = scan.nextDouble();
			if(arr[i] <= 0){
				break;
			}else{
				i++;
			}}else{
				break;
			}
		}
		
		System.out.print("Elements of array :");
		
		//loop for printing the element of array
		for(int j=0;j<arr.length;j++){
			if(arr[j] > 0){
				System.out.print(" " + arr[j]);
			}else if(j==0){
				System.out.print("No elements in array");
				break;
			}else{
				break;
			}
		}
	}
}
		