
import java.util.Scanner;
 class Calculator {
    public static void main(String[] args) {
         //Creating Scanner object for taking input from the user.
         Scanner scan = new Scanner(System.in);
         //taking input that how many times the calculator will run.
         System.out.print("Enter the number of times you want to execute the calculator : ");
         int number = scan.nextInt();
         //running a while loop till its greator than 0.
         while(number-->0){
            //Taking input as firstNumber and secondNumber.
            System.out.print("Enter first number : ");
            int firstNumber = scan.nextInt();
            System.out.print("Enter second number : ");
            int secondNumber = scan.nextInt();
            scan.nextLine();
            //Taking input for the operation of addition,subtraction,multiplication and division.
            System.out.print("Choose which operation you want to perform - (+,-,*,/) : ");
            String op = scan.next();
            //Using switch case statement to maintain and judge the program output flow.
            switch (op) {
                case "+":
                    System.out.println("Addition of these two numbers is " + (firstNumber+secondNumber));
                    break;
                case "-":
                    System.out.println("Subtraction of these two numbers is " + (firstNumber-secondNumber));
                    break;
                case "*":
                    System.out.println("Multiplication of these two numbers is " + (firstNumber*secondNumber));
                    break;
                case "/":
                    System.out.println("Division of these two numbers is " + (firstNumber/secondNumber));
                    break;   
            
                default:
                System.out.println("Invalid input found !!!");
                    break;
            }
         }
    }
}