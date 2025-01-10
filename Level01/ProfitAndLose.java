/*
Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
Hint => 
Use a single print statement to display multiline text and variables.
Profit = selling price - cost price
Profit Percentage = profit / cost price * 100
I/P => NONE
O/P => 
The Cost Price is INR ___ and Selling Price is INR ___
The Profit is INR ___ and the Profit Percentage is ___
*/
class ProfitAndLose{
	public static void main(String [] args){
		
		//create a integer variable costPrice and assign value 129
		int costPrice = 129;

		//create a integer variable sellingPrice and assign value 191
		int sellingPrice = 191;
		
		// Calculate the difference between sellingPrice and costPrice for profit
		int profit = sellingPrice - costPrice;
		
		//Calculate the percentage of profit
		double profitPercentage = (double)profit / costPrice * 100;
		
		//print result
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage); 
	}
}	