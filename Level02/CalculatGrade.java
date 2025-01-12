/*Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 

Hint => 
Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks
*/

import java.util.*;  

public class CalculatGrade {
    

    public static void main(String args[]) {
        
        // Create a Scanner object scan to input from the user
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter physics number :");
        int physics = scan.nextInt();  
        
        System.out.print("Enter chemistry number :");
        int chemistry = scan.nextInt();  
        
        System.out.print("Enter maths number :");
        int maths = scan.nextInt();  
        
        // Calculating the percentage by averaging the marks of all three subjects
        double percentage = (double)(maths + physics + chemistry) / 3.0;
        
        // Calculating the average marks (casting the percentage to an integer, which truncates decimals)
        double averageMarks = (int)percentage;
        
        // Printing the average marks (note that averageMarks will be an integer value)
        System.out.print("Average Mark " + averageMarks);
        
        // Using if-else statements to determine the grade and level based on percentage
        if (percentage >= 80) {
            System.out.println("Level 4, above agency-normalized standards");  // Excellent performance
        } else if (percentage >= 70 && percentage <= 79) {
            System.out.println("Level 3, at agency-normalized standards");  // Very good performance
        } else if (percentage >= 60 && percentage <= 69) {
            System.out.println("Level 2, below, but approaching agency-normalized standards");  // Good performance
        } else if (percentage >= 50 && percentage <= 59) {
            System.out.println("Level 1, well below agency-normalized standards");  // Satisfactory performance
        } else if (percentage >= 40 && percentage <= 49) {
            System.out.println("Level 1, too below agency-normalized standards");  // Below average performance
        } else {
            System.out.println("Remedial standards");  // Needs improvement
        }
    }
}