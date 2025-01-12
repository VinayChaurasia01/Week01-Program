import java.util.Scanner;

class Multiplication {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner scan = new Scanner(System.in);

        // Get the number for which the table is to be printed
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        // Print multiplication tables from 6 to 9
        System.out.println("Multiplication table for " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
