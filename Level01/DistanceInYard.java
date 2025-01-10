/*
Write a program the find the distance in yards and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/

import java.util.Scanner;

class DistanceInYard{
  public static void main(String [] args){
    // Create a Scanner object to take input from the user
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter distance in feet :");
    double feet = scan.nextDouble();

    //convert feet to yards
    double yard = feet/3.0;

    //convert yards to miles
    double miles = yard / 1760.0;

    //print distance in feet , yards and miles 
    System.out.println("Distance in feet is " + feet + " and in yards is " + yard + " and in miles is " + miles );
  }
}