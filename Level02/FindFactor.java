/*
Create a program to find the factors of a number taken as user input, store the factors in an array and display the factors. Also find the sum, 
sum of square of factors and product of the factors and display the results
Hint => 
Take the input for a number
Write a static Method to find the factors of the number and save them in an array and return the array. 
To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count. And the second
 loop save the factors into the array
Write a method to find the sum of the factors using factors array
Write a method to find the product of the factors using factors array
Write a method to find the sum of square of the factors using Math.pow() method
*/

import java.util.*;

class FindFactor{
	
	//create a method for calculate factors
	public static int[] factor(int number , int []fact){
		
		int idx = 0;
		for(int i=1;i<=number/2;i++){
			if(number % i == 0){
				fact[idx] = i;
				idx++;
		}
		
	}
	return fact;
	}
	
	
    public static int sum(int []fact){
		int ans = 0;
		//this loop is for calculate sum of factors
		for(int i=0;i<fact.length;i++){
			if(fact[i] == 0){
			break;
			}else{
				ans += fact[i] ;
			}
		}
		return ans;
	}
	
	public static int product(int []fact){
		int ans = 1;
		//this loop is for calculate product of factors
		for(int i=0;i<fact.length;i++){
			if(fact[i] == 0){
			break;
			}
			else{
				ans =  ans*fact[i];
			}
		}
		return ans;
	}
	
	public static int sumOfSquareFactors(int []fact){
		int ans = 0;
		//this loop is for calculate sum of square of the factors
		for(int i=0;i<fact.length;i++){
			if(fact[i] == 0){
			 break;
			}else{
				ans += Math.pow(fact[i],2) ;
			}
		}
		return ans;
	}
	
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number for finding factors :");
		int number = scan.nextInt();
		
		int fact[] = new int[number];
		
		fact = factor(number , fact);
		
		System.out.print("Factors of number "+ number + " is : ");
		for(int i=0;i<fact.length;i++){
			if(fact[i] == 0){
				break;
			}else{
				System.out.print(fact[i] + " ");
			}
		}
		System.out.println();
		System.out.println("The sum of the factors is : " + sum(fact));

        System.out.println("The product of the factors is : " + product(fact));

        System.out.println("The sum of square of the factors is : " + sumOfSquareFactors(fact));
	}
}

