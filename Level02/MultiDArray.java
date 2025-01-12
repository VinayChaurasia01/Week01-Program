/*
Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
Hint => 
Take input for a number of persons
Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
       double[][] personData = new double[number][3];
       String[] weightStatus = new String[number];
Take input for weight and height of the persons and for negative values, ask the user to enter positive values
Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
Display the height, weight, BMI and status of each person
*/

import java.util.Scanner;

class MultiDArray{
	public static void main(String [] args){
	  // Creating Scanner object to take input from user
	  Scanner scan = new Scanner(System.in);
	  
	    System.out.print("Enter the number of persons: ");
        int person = scan.nextInt();

        // Creating a 2D array to store weight, height, and BMI 
        double[][] data = new double[person][3]; 
        String[] weight = new String[person];
	  
	  
	  for (int i = 0; i < person; i++) {
            System.out.println("Enter details for person " + (i + 1));
			
                System.out.print("Enter the weight in kg : ");
                data[i][0] = scan.nextDouble();
                
                System.out.print("Enter the height in cm : ");
                data[i][1] = scan.nextDouble();
              

            // Convert height cm to meters
            double heightInM = data[i][1] / 100;

            // Calculate BMI and store it 
            data[i][2] = data[i][0] / (heightInM * heightInM);

            // Determine weight status and store it
            if (data[i][2] < 18.5) {
                weight[i] = "Underweight";
            } else if (data[i][2] >= 18.5 && data[i][2] <= 24.9) {
                weight[i] = "Normal";
            } else if (data[i][2] >= 25.0 && data[i][2] <= 39.9) {
                weight[i] = "Overweight";
            } else {
                weight[i] = "Obese";
            }
        }

        // Display the results for each person
        System.out.println("Details of each person:");
        for (int i = 0; i < person; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height (m): " + data[i][1] / 100);  // Convert back to meters for display
            System.out.println("Weight (kg): " + data[i][0]);
            System.out.println("BMI: " + data[i][2]);
            System.out.println("Weight Status: " + weight[i]);
        }
	}
}
