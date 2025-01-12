import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        double heightInMeters = height / 100;  // Convert cm to meters
        return weight / (heightInMeters * heightInMeters);  // BMI formula
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 2D array to store weight, height, and BMI for 10 persons
        double[][] personData = new double[10][3];

        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            personData[i][0] = scan.nextDouble(); // Store weight in the first column

            System.out.print("Height (cm): ");
            personData[i][1] = scan.nextDouble(); // Store height in the second column

            // Calculate BMI and store it in the third column
            personData[i][2] = calculateBMI(personData[i][0], personData[i][1]);
        }

        // Display the height, weight, BMI, and BMI status for each person
        System.out.println("\nDetails for each person:");
        for (int i = 0; i < 10; i++) {
            double bmi = personData[i][2];
            String status = getBMIStatus(bmi);
            System.out.printf("Person %d: Weight = %.2f kg, Height = %.2f cm, BMI = %.2f, Status = %s\n",
                    (i + 1), personData[i][0], personData[i][1], bmi, status);
        }

        // Close the scanner
        scan.close();
    }
}
