import java.util.Random;
import java.util.Scanner;

// Making a class for calculating student scores
class StudentScores {

    // Method to generate random scores for students
    public static int[][] generateStudentScores(int numberOfStudents) {
        Random rand = new Random();
        int[][] studentScores = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            studentScores[i][0] = 30 + rand.nextInt(71);  // Random marks for Physics (between 30 and 100)
            studentScores[i][1] = 30 + rand.nextInt(71);  // Random marks for Chemistry (between 30 and 100)
            studentScores[i][2] = 30 + rand.nextInt(71);  // Random marks for Maths (between 30 and 100)
        }
        return studentScores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateStudentResults(int[][] studentScores) {
        double[][] results = new double[studentScores.length][4];  // Total, Average, Percentage

        for (int i = 0; i < studentScores.length; i++) {
            int totalScore = studentScores[i][0] + studentScores[i][1] + studentScores[i][2];
            double averageScore = totalScore / 3.0;
            double percentageScore = (totalScore / 300.0) * 100;

            results[i][0] = totalScore;
            results[i][1] = Math.round(averageScore * 100.0) / 100.0;  // Rounding to 2 decimals
            results[i][2] = Math.round(percentageScore * 100.0) / 100.0;  // Rounding to 2 decimals
        }
        return results;
    }

    // Method to display the student scorecard in a tabular format
    public static void displayStudentScorecard(int[][] studentScores, double[][] results) {
        System.out.println("Student Scorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < studentScores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%.2f\t%.2f\n",
                i + 1, studentScores[i][0], studentScores[i][1], studentScores[i][2],
                results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scan.nextInt();

        int[][] studentScores = generateStudentScores(numberOfStudents);
        double[][] studentResults = calculateStudentResults(studentScores);
        displayStudentScorecard(studentScores, studentResults);
    }
}
