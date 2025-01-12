import java.util.Scanner;

class QuotientRemainder{
	
	//create a method for finding remainder
	public static int[] findQuotientRemainder(int number, int divisor){
		
		int remainder = number%divisor;
		int quotient=number/divisor;
		return new int[] {remainder,quotient};
		
	}	
	
	public static void main(String[] args){
		
		// Creating Scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number :");
		int number = scan.nextInt();
		
		System.out.print("Enter the divisor :");
		int divisor = scan.nextInt();
		
		//methode calling
		int Quotient[] = findQuotientRemainder(number,divisor);
		
		System.out.println(" The Quotient is "+Quotient[1]+" and Reminder is "+Quotient[0]+" of two number "+ number + " and " + divisor);
	}
}

