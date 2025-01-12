import java.util.Scanner;

public class FootballTeamStats {

    // Method to calculate the sum of all elements in the array
    public static int calculateSum(int[] heights) {
        int totalSum = 0;
        for (int height : heights) {
            totalSum += height;
        }
        return totalSum;
    }

    // Method to calculate the mean (average) of all elements in the array
    public static int calculateMean(int[] heights) {
        int totalSum = calculateSum(heights); 
        return totalSum / heights.length;    
    }

    // Method to find the shortest player's height
    public static int findShortest(int[] heights) {
        int shortestHeight = Integer.MAX_VALUE; 
        for (int height : heights) {
            if (height < shortestHeight) {
                shortestHeight = height; 
            }
        }
        return shortestHeight;
    }

    // Method to find the tallest player's height
    public static int findTallest(int[] heights) {
        int tallestHeight = Integer.MIN_VALUE; 
        for (int height : heights) {
            if (height > tallestHeight) {
                tallestHeight = height; 
            }
        }
        return tallestHeight;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] playerHeights = new int[11]; 

        // Input heights of all players
        System.out.println("Enter the heights of all the players:");
        for (int i = 0; i < playerHeights.length; i++) {
            playerHeights[i] = scan.nextInt();
        }

        // Calculate and store the results
        int totalHeight = calculateSum(playerHeights);          
        int averageHeight = calculateMean(playerHeights);       
        int shortestPlayer = findShortest(playerHeights);       
        int tallestPlayer = findTallest(playerHeights);         

        // Display the results
        System.out.println("Sum of all heights: " + totalHeight);
        System.out.println("Mean height: " + averageHeight);
        System.out.println("Shortest player's height: " + shortestPlayer);
        System.out.println("Tallest player's height: " + tallestPlayer);

        scan.close();
    }
}
