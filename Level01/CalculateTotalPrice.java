/*
Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___
*/

import java.util.Scanner;

class CalculateTotalPrice {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = scan.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        int quantity = scan.nextInt();

        // Calculate the total purchase price
        double totalPrice = unitPrice * quantity;

        // Display the result in the desired format
        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity " + quantity + 
                           " and unit price is INR " + unitPrice);
    }
}