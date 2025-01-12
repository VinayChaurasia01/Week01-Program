

 import java.util.Scanner;

class CalculatePercentage {
    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int student = scan.nextInt();

        // Create arrays for all sub and grades
        int physics[] = new int[student];
        int chemistry[] = new int[student];
        int maths[] = new int[student];
        double percentages[] = new double[student];
        String grades[] = new String[student];

        for (int i = 0; i < student; i++) {
            System.out.println("Enter marks for student " + (i + 1));
 
                System.out.print("Enter Physics marks of student " + (i+1)+ " : ");
                physics[i] = scan.nextInt();
           
                System.out.print("Enter Chemistry marks of student " + (i+1) + " : ");
                chemistry[i] = scan.nextInt();    

                System.out.print("Enter Maths marks of student " + (i+1) + " : ");
                maths[i] = scan.nextInt();
                

            // Calculate percentage
            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

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

        // results for each student according subject marks
        System.out.println("Detail of all students :");
        for (int i = 0; i < student; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics Marks " + physics[i]);
            System.out.println("Chemistry Marks: " + chemistry[i]);
            System.out.println("Maths Marks " + maths[i]);
            System.out.println("Percentage " + percentages[i] + "%");
            System.out.println("Grade " + grades[i]);

            // remarks based on grade
            switch (grades[i]) {
                case "A":
                    System.out.println("Remarks Level 4, Above agency-normalized standards");
                    break;
                case "B":
                    System.out.println("Remarks Level 3, At agency-normalized standards");
                    break;
                case "C":
                    System.out.println("Remarks Level 2, Below, but agency-normalized standards");
                    break;
                case "D":
                    System.out.println("Remarks Level 1, Well below agency-normalized standards");
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