import java.util.Random;

public class EmployeeBonusCalculator {

    public static void main(String[] args) {
        int[][] employeeDetails = generateEmployeeDetails(); // Generate salary and years of service
        double[][] bonusDetails = calculateBonusAndNewSalary(employeeDetails); // Calculate bonuses and new salaries
        displayEmployeeSummary(employeeDetails, bonusDetails); // Display results in tabular format
    }

    // Method to generate employee salary and years of service using Math.random()
    private static int[][] generateEmployeeDetails() {
        int[][] details = new int[10][2]; // 2D array: [salary, years of service]
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            details[i][0] = 10000 + random.nextInt(90000); 
            details[i][1] = random.nextInt(11); 
        }
        return details;
    }

    // Method to calculate bonuses and new salaries
    private static double[][] calculateBonusAndNewSalary(int[][] employeeDetails) {
        double[][] bonusDetails = new double[10][2]; 

        for (int i = 0; i < 10; i++) {
            int salary = employeeDetails[i][0];
            int yearsWorked = employeeDetails[i][1];
            double bonusPercentage = (yearsWorked > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;

            bonusDetails[i][0] = bonus;
            bonusDetails[i][1] = newSalary;
        }
        return bonusDetails;
    }

    // Method to calculate and display the summary in tabular format
    private static void displayEmployeeSummary(int[][] employeeDetails, double[][] bonusDetails) {
        System.out.printf("%10s %15s %15s %15s %15s\n", "Employee", "Old Salary", "Years of Service", "Bonus", "New Salary");
        System.out.println("-----------------------------------------------------------------------------------");

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < 10; i++) {
            int salary = employeeDetails[i][0];
            int yearsWorked = employeeDetails[i][1];
            double bonus = bonusDetails[i][0];
            double newSalary = bonusDetails[i][1];

            totalOldSalary += salary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%10d %15d %15d %15.2f %15.2f\n", i + 1, salary, yearsWorked, bonus, newSalary);
        }

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%10s %15.2f %15s %15.2f %15.2f\n", "TOTAL", totalOldSalary, "", totalBonus, totalNewSalary);
    }
}
