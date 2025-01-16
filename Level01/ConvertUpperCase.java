import java.util.Scanner;

class ConvertUpperCase {
    
    // Method to convert string to uppercase using the toUpperCase method
    public static String upperCaseByMethod(String str) {
        return str.toUpperCase(); // Corrected to uppercase
    }

    // Method to convert string to uppercase by manipulating ASCII values
    public static String upperCaseByScratch(String str) {
        StringBuilder temp = new StringBuilder();
        
        // Convert each character to uppercase if it is a lowercase letter
        for (int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);
            if (ch >= 'a' && ch <= 'z') { // Check if the character is lowercase
                ch = (char) (ch - 32); // Convert to uppercase using ASCII values
            }
            temp.append(ch); // Append the character (converted or not)
        }
        
        return temp.toString();
    }
    
    // Method to compare two strings
    public static boolean compare(String str1, String str2) {
        return str1.equals(str2); // Simplified comparison
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Convert the string using both methods
        String result1 = upperCaseByMethod(str);
        String result2 = upperCaseByScratch(str);

        // Output the results
        System.out.println("String converted to uppercase using toUpperCase method: " + result1);
        System.out.println("String converted to uppercase using ASCII code manipulation: " + result2);

        // Compare both results
        boolean result = compare(result1, result2);

        if (result) {
            System.out.println("Both strings are the same.");
        } else {
            System.out.println("Both strings are different.");
        }

        input.close(); // Close the scanner to avoid resource leak
    }
}