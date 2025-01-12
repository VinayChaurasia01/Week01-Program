import java.util.Random;

public class RandomNumberStats {

    // Method to create an array of random 4-digit numbers
    public static int[] generateRandomNumbers(int count) {
        Random randGenerator = new Random();
        int[] randomNumbers = new int[count];

        // Generate random 4-digit numbers
        for (int index = 0; index < count; index++) {
            randomNumbers[index] = 1000 + randGenerator.nextInt(9000); // Ensures numbers are between 1000 and 9999
        }

        return randomNumbers;
    }

    // Method to calculate the average, minimum, and maximum of the numbers in an array
    public static double[] calculateStats(int[] randomNumbers) {
        int totalSum = 0;
        int minValue = randomNumbers[0];
        int maxValue = randomNumbers[0];

        // Iterate through the array to compute sum, min, and max
        for (int number : randomNumbers) {
            totalSum += number;
            minValue = Math.min(minValue, number);
            maxValue = Math.max(maxValue, number);
        }

        // Compute average
        double averageValue = (double) totalSum / randomNumbers.length;

        // Return the calculated stats in an array
        return new double[]{averageValue, minValue, maxValue};
    }

    public static void main(String[] args) {
        int arraySize = 5;

        // Generate an array of random 4-digit numbers
        int[] numbersArray = generateRandomNumbers(arraySize);

        // Compute the average, minimum, and maximum values
        double[] stats = calculateStats(numbersArray);

        // Display the generated numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int number : numbersArray) {
            System.out.print(number + " ");
        }

        // Display the calculated stats
        System.out.println("\n\nAverage: " + stats[0]);
        System.out.println("Minimum: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
    }
}
