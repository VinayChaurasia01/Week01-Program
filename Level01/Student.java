/*
Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending 
on his/her age is greater or equal to 18.
Hint => 
Define an array of 10 integer elements and take user input for the student's age. 
Loop through the array using the length property and for the element of the array check If the age is a negative number print 
an invalid age and if 18 or above, print The student with the age ___ can vote. Otherwise, print The student with the 
age ___ cannot vote. 
*/

import java.util.Scanner;

class Student{
	public static void main(String [] args){
		
		//create scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		//Declare a array of size 10
		int student[] = new int[10];
		
		//for loop to take input all 10 student age 
		System.out.print("Enter 10 students age :");
		for(int i=0;i<student.length;i++){
			student[i] = scan.nextInt();
		}
		
		for(int i=0;i<student.length;i++){
			//check student age above or equals to 18
			if(student[i] >= 18){
				System.out.println("The student with the age " + student[i] + " can vote");
			}else if(student[i] < 0){ //check student age is under 0 or negative 
				System.out.println("An invalid age ");
			}else{ // check student age is between 0 to 18
				System.out.println("The student with the age " + student[i] + " cannot vote");
			}
		}
	}
}
			
			