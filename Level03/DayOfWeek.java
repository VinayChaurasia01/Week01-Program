import java.util.Scanner;

class DayOfWeek {
    public static void main(String[] args) {
        // Creating the Scanner object for user input.
        Scanner scan = new Scanner(System.in);

        // Taking input for the month.
        System.out.print("Enter the Month: ");
        int month = scan.nextInt();

        // Taking input for the day.
        System.out.print("Enter the Day: ");
        int day = scan.nextInt();

        // Taking input for the year.
        System.out.print("Enter the Year: ");
        int year = scan.nextInt();

        // Calculating the day of the week using the Gregorian calendar formula.
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;

        // Using a switch-case to print the day name corresponding to the day code (0-6).
        switch (d0) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Something went wrong");
                break;
        }

	}
}