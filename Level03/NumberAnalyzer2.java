import java.util.Scanner;

public class NumberAnalyzer2 {

    // Method to count the number of digits in a given number
    public static int countDigits(int number) {
        int digitCount = 0;
        while (number != 0) {
            digitCount++;
            number /= 10;
        }
        return digitCount;
    }

    // Method to extract digits of a number into an array
    public static int[] extractDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        int index = 0;
        while (number != 0) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }
        return digits;
    }

    // Method to check if a number is a Duck number (contains no zero)
    public static boolean isDuckNumber(int number) {
        int[] digits = extractDigits(number);

        for (int digit : digits) {
            if (digit == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = extractDigits(number);
        int sumOfCubes = 0;
        for (int digit : digits) {
            sumOfCubes += Math.pow(digit, 3); // Calculate cube and add
        }
        return sumOfCubes == number;
    }

    public static int[] findLargestAndSecondLargest(int number) {
        int[] digits = extractDigits(number);
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        // Find the largest digit
        for (int digit : digits) {
            if (digit > largest) {
                largest = digit;
            }
        }

        // Find the second largest digit
        for (int digit : digits) {
            if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest digits in a number
    public static int[] findSmallestAndSecondSmallest(int number) {
        int[] digits = extractDigits(number);
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                smallest = digit;
            }
        }

        // Find the second smallest digit
        for (int digit : digits) {
            if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input number from the user
        System.out.println("Enter a number:");
        int number = scan.nextInt();

        // Perform calculations
        int digitCount = countDigits(number);
        int[] digits = extractDigits(number);
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(number);
        int[] largestAndSecondLargest = findLargestAndSecondLargest(number);

        // Display results
        System.out.println("Number of digits: " + digitCount);

        System.out.println("Digits in the number:");
        for (int digit : digits) {
            System.out.println(digit);
        }

        System.out.println("Largest and second largest digits: " +
                largestAndSecondLargest[0] + " and " + largestAndSecondLargest[1]);

        System.out.println("Smallest and second smallest digits: " +
                smallestAndSecondSmallest[0] + " and " + smallestAndSecondSmallest[1]);

        scan.close();
    }
}
