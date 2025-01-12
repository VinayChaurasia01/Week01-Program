

 import java.util.Scanner;

class CalculatePercentage2D {
    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int student = scan.nextInt();

        // Creating a 2D array to store marks of Physics, Chemistry, and Maths
        int[][] marks = new int[student][3];
		
		// Arrays to store percentage and grades of students
        double[] percentages = new double[student];
        String[] grades = new String[student];

        for (int i = 0; i < student; i++) {
            System.out.println("Enter marks for student " + (i + 1));
 
                System.out.print("Enter Physics marks of student " + (i+1)+ " : ");
                marks[i][0] = scan.nextInt();
           
                System.out.print("Enter Chemistry marks of student " + (i+1) + " : ");
                marks[i][1] = scan.nextInt();    

                System.out.print("Enter Maths marks of student " + (i+1) + " : ");
                marks[i][2] = scan.nextInt();
                
            // Calculate percentage
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Display results for each student
        System.out.println("Details of each student:");
        for (int i = 0; i < student; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics Marks " + marks[i][0]);
            System.out.println("Chemistry Marks " + marks[i][1]);
            System.out.println("Maths Marks " + marks[i][2]);
            System.out.println("Percentage " + percentages[i] + "%");
            System.out.println("Grade " + grades[i]);

            // Display remarks based on grade
            switch (grades[i]) {
                case "A":
                    System.out.println("Remarks: Level 4, Above agency-normalized standards");
                    break;
                case "B":
                    System.out.println("Remarks: Level 3, At agency-normalized standards");
                    break;
                case "C":
                    System.out.println("Remarks: Level 2, Below, but agency-normalized standards");
                    break;
                case "D":
                    System.out.println("Remarks: Level 1, Well below agency-normalized standards");
                    break;
                case "E":
                    System.out.println("Remarks: Level 1-, Too below agency-normalized standards");
                    break;
                case "R":
                    System.out.println("Remarks: Remedial standards");
                    break;
            }
        }
    }
}