import java.util.*;

class CalendarGenerator {

    // Method to get the name of the month
    public static String getMonthName(int monthNumber) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[monthNumber - 1];
    }

    // Method to get the number of days in a given month
    public static int getNumberOfDaysInMonth(int monthNumber, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (monthNumber == 2 && isLeapYear(year)) {
            return 29; // Adjust February for leap years
        }
        return daysInMonth[monthNumber - 1];
    }

    // Method to check if the given year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the first day of the given month
    public static int getFirstDayOfTheMonth(int monthNumber, int year) {
        int dayOfMonth = 1; // Day of the month (always 1)
        int adjustedYear = year - (14 - monthNumber) / 12;
        int adjustment = adjustedYear + adjustedYear / 4 - adjustedYear / 100 + adjustedYear / 400;
        int adjustedMonth = monthNumber + 12 * ((14 - monthNumber) / 12) - 2;
        return (dayOfMonth + adjustment + (31 * adjustedMonth) / 12) % 7; // 0 = Sunday, 1 = Monday, ..., 6 = Saturday
    }

    // Method to display the calendar for the given month and year
    public static void displayCalendar(int monthNumber, int year) {
        System.out.println("\n  " + getMonthName(monthNumber) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDayOfMonth = getFirstDayOfTheMonth(monthNumber, year);
        int totalDaysInMonth = getNumberOfDaysInMonth(monthNumber, year);

        // Print indentation for the first day of the month
        for (int i = 0; i < firstDayOfMonth; i++) {
            System.out.print("    ");
        }

        // Print all the days of the month
        for (int day = 1; day <= totalDaysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDayOfMonth) % 7 == 0) {
                System.out.println(); // Move to the next line after Saturday
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get the month and year from the user
        System.out.print("Enter the month (1-12): ");
        int monthNumber = scan.nextInt();
        System.out.print("Enter the year: ");
        int year = scan.nextInt();

        // Display the calendar
        displayCalendar(monthNumber, year);

        // Close the scanner
        scan.close();
    }
}
