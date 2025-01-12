//Q.06 Level02

import java.util.Scanner;

class FindBMI{
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner scan = new Scanner(System.in);
	  
	  // number of person 
	  System.out.print("Enter a Number : ");
	  int numPersons = scan.nextInt();
	  
	  // creating arrays of person details
      double weight[] = new double[numPersons];
      double height[] = new double[numPersons];
      double bmi[] = new double[numPersons];
	  String weightStatus[] = new String[numPersons];
	  
	  
	  for(int i =0;i<numPersons;i++){
		  
	   System.out.print("Enter details for person "+(i+1) + "\n"); 
		  
	  System.out.print("Enter the weight in kg : ");
	  
	  // Take weight as input 
	   weight[i] = scan.nextDouble();
	  
	   System.out.print("Enter the height in cm : ");
	  
	  // Take height as input from user
	   height[i] = scan.nextDouble();
	  
	  height[i] /=100;
	   bmi[i] = weight[i]/(height[i]*height[i]);
	  
	   if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } 
		else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } 
		else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            }
		else {
                weightStatus[i] = "Obese";
            }
	  }
	  System.out.println("\n Details of each person : ");
	    for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Height (cm) " + height[i]);
            System.out.println("Weight (kg) " + weight[i]);
            System.out.println("BMI " + bmi[i]);
            System.out.println("Weight status " + weightStatus[i]);
        }
	}
}