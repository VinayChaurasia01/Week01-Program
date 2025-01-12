import java.util.Scanner;

class Bonus {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner scan = new Scanner(System.in);

        // Get salary and years of service as input
        System.out.print("Enter the employee's salary: ");
        double salary = scan.nextDouble();
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = scan.nextInt();

        // Check if the years of service are greater than 5
        if (yearsOfService > 5) {
            double bonus = 0.05 * salary;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus for employees with 5 or fewer years of service.");
        }
    }
}
