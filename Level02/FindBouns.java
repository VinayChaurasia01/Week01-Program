/*
Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, 
along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Define a double array to save salary and years of service for each of the 10 employees
Also define a double array to save the new salary and the bonus amount as well as variables to save the total bonus, total old salary, and new salary
Define a loop to take input from the user. If salary or year of service is an invalid number then ask the use to enter again. Note in this case 
you will have to decrement the index counter
Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the array, compute the new salary, 
and save in the array. Also, the total bonus and total old and new salary can be calculated in the loop
Print the total bonus payout as well as the total old and new salary of all the employees
*/

import java.util.Scanner;

class FindBouns{
	public static void main(String [] args){
		//create a scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		// Define arrays and variables
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input loop for salary and years of service
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1));

            // Input validation for salary
            while (true) {
                System.out.print("Enter salary: ");
                salaries[i] = scan.nextDouble();
                if (salaries[i] > 0) {
                    break;
                } else {
                    System.out.println("Error: Please enter a valid positive salary.");
                }
            }

            // Input validation for years of service
            while (true) {
                System.out.print("Enter years of service: ");
                yearsOfService[i] = scan.nextDouble();
                if (yearsOfService[i] >= 0) {
                    break;
                } else {
                    System.out.println("Error: Please enter a valid non-negative number for years of service.");
                }
            }
        }

        // Calculate bonuses, new salaries, and totals
        for (int i = 0; i < 10; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Output results
        System.out.println("\nEmployee Details and Bonus Calculation:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n", 
                              i + 1, salaries[i], bonuses[i], newSalaries[i]);
        }

        System.out.println();
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);
	}
}