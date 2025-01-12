import java.util.Scanner;

class ChocolateDistribution{
	
	//create a method for calculate chocolate distribution
	public static int[] distributeChocolates(int numOfChildren, int numOfChocolates){
		
		// Number of chocolates each children
		int distribute = numOfChocolates/numOfChildren;
		
		//Remaining chocolates
		int Remaining = numOfChocolates%numOfChildren;
		
		return new int [] {distribute,Remaining};
		
	}

	
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner scan = new Scanner(System.in);
		
		// Taking number of chocolates and number of children as input from user
		System.out.print("Enter the number of chocolates :");
		int numOfChocolates = scan.nextInt();
		
		System.out.print("Enter the number of children :");
		int numOfChildren = scan.nextInt();
	    
		//Methods calling
	    int Distributed[] = distributeChocolates( numOfChildren,  numOfChocolates);	   
		
		System.out.println("The number of chocolates each child gets is "+ Distributed[0]+" and\n the number of remaining chocolates are "+ Distributed[1]);
		}
}