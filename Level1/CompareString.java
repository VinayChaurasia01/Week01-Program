/*
vel 1 Practice Programs
Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
Hint => 
Take user input using the  Scanner next() method for 2 String variables
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result 
*/

import java.util.Scanner;

class CompareString{
	public static boolean compareWithMethod(String str1 , String str2){
		return str1.equals(str2);
	}
	
	public static boolean compareWithIndex(String str1 , String str2){
		boolean flag = true;
		if(str1.length() == str1.length()){
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i) == str2.charAt(i)){
				continue;
			}else{
				flag = false;
				break;
			}
		}
		}else{
			return false;
		}
		return flag;
	}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter String 1 :");
		String str1 = input.next();
		System.out.print("Enter String 2 :");
		String str2 = input.next();
		
		boolean result1 = compareWithMethod(str1,str2);
		boolean result2 = compareWithIndex(str1,str2);
		
		if(result1 == result2){
			System.out.println("Both method gives same output ");
		}else{
			System.out.println("Both method gives different output ");
		}
	}
}