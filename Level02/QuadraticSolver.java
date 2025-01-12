import java.util.Scanner;

public class QuadraticSolver {

    // Method to find the roots of a quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2}; // Return both roots
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            return new double[]{root}; // Return one root
        } else {
            // No real roots (delta is negative)
            return new double[0]; // Return an empty array indicating no real roots
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input for a, b, and c
        System.out.println("Enter the coefficients for the quadratic equation ax^2 + bx + c = 0");
        System.out.print("a: ");
        double a = scan.nextDouble();
        System.out.print("b: ");
        double b = scan.nextDouble();
        System.out.print("c: ");
        double c = scan.nextDouble();

        // Find the roots
        double[] roots = findRoots(a, b, c);

        // Display the result
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The equation has one real root: x = " + roots[0]);
        } else {
            System.out.println("The equation has two real roots: x1 = " + roots[0] + ", x2 = " + roots[1]);
        }

        // Close the scanner
        scan.close();
    }
}
