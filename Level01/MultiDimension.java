/*
Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
Hint => 
Take user input for rows and columns, create a 2D array (Matrix), and take the user input 
Copy the elements of the matrix to a 1D array. For this create a 1D array of size rows*columns as in int[] array = new int[rows * columns];
Define the index variable and Loop through the 2D array. Copy every element of the 2D array into the 1D array and increment the index
Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for rows, and the inner for loops to access each element
*/

import java.util.Scanner;

class MultiDimension{
	public static void main(String [] args){
		//create scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of row :");
		//user input row and col 
		int row =scan.nextInt();
		System.out.print("Enter the number of columns :");
		int col = scan.nextInt();
		
		//create an 2D array
		int multi[][] = new int[row][col];
		
		//first loop for row 
		for(int i=0;i<row;i++){
			//second loop for col 
			System.out.print("Enter " + (i+1) + " row elements :");
			for(int j=0;j<col;j++){
				multi[i][j] = scan.nextInt();
			}
			System.out.println();
		}
		
		//create a 1D array of length row*col
		int array[] = new int[row*col];
		
		//index for 1D array
		int index = 0;
		
		System.out.print("Elements of 1D array : ");
		//for loop for copy the elements from 2D array to 1D array
		for(int i=0;i<row;i++){
			//second loop for col 
			for(int j=0;j<col;j++){
				array[index] = multi[i][j];
				System.out.print(array[index] + " ");
				index++;
			}
		}
	}
}
		
		