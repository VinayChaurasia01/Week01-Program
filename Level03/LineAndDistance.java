import java.util.*;

class LineAndDistance {
    // Method to calculate Euclidean distance
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the slope and y-intercept of a line
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - slope * x1;
        return new double[]{slope, yIntercept};
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input coordinates of two points
        System.out.print("Enter the x-coordinate of Point 1: ");
        double x1 = scan.nextDouble();
        System.out.print("Enter the y-coordinate of Point 1: ");
        double y1 = scan.nextDouble();
        System.out.print("Enter the x-coordinate of Point 2: ");
        double x2 = scan.nextDouble();
        System.out.print("Enter the y-coordinate of Point 2: ");
        double y2 = scan.nextDouble();

        // Calculate and display the Euclidean distance
        double euclideanDistance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance between the points: %.2f\n", euclideanDistance);

        // Calculate and display the line equation
        if (x1 != x2) { // Ensure the points do not form a vertical line
            double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
            System.out.printf("Equation of the line: y = %.2fx + %.2f\n", lineEquation[0], lineEquation[1]);
        } else {
            System.out.println("The line is vertical, equation: x = " + x1);
        }
    }
}
