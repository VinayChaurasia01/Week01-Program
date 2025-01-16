/*
Write a program to demonstrate NullPointerException. 
Hint => 
Write a Method to generate the Exception. Here define the variable text and initialize it to null. Then call one of the String
 Method to generate the exception
Write the Method to demonstrate NullPointerException. Here define the variable text and initialize it to null. Then write try
 catch block for handling the Exception while accessing one of the String method
From the main Firstly call the method to generate the Exception then refactor the code to call the method to handle the RuntimeException
*/

public class NullPointer{

	// Method to generate NullPointerException
	public static void selfGeneratedNullPointerException() {
			// Initializing the variable to null
			String text = null;
		 
		 
			// generating a NullPointerException
			System.out.println(text.length());
	}

	// Method to handle NullPointerException
	public static void handleNullPointerException() {
			// Initialize the variable to null
			String text = null;

			try {
				 
					// Trying to call a method on the null variable
					System.out.println(text.length());
			} catch (NullPointerException e) {
					// Handling the exception and displaying the error message
					System.out.println("A NullPointerException occurred: " + e.getMessage());
			} catch (RuntimeException runtimeException) {
					System.out.println("RuntimeException caught: An unexpected error occurred.");
			}
	}

	public static void main(String[] args) {
			System.out.println("NullPointerException generation:");

			try {
				 
					// Calling the method that generates the exception
					selfGeneratedNullPointerException();
			} catch (NullPointerException e) {
					System.out.println("Caught exception in selfGeneratedNullPointerException : " + e.getMessage());
			}

			// Calling the method that handles the exception
			System.out.println("\nNullPointerException handling :");
			handleNullPointerException();
	}
}