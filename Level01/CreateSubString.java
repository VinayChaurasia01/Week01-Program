/*
Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
Hint => 
Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result
*/

import java.util.Scanner;

class CreateSubString{
	
	public static String subStringMethod(int start , int end , String str){
	    return str.substring(start , end);
	}
	
	public static String subStringByCharAt(int start , int end , String str){
		String subStr = "";
		
		for(int index = start ; index < end;index++){
			subStr += str.charAt(index);
		}
		return subStr;
	}
	
	public static boolean compareString(String subStr1 , String subStr2 ){
		boolean flag = true;
		for(int index = 0;index < subStr1.length();index++){
			if(subStr1.charAt(index) == subStr2.charAt(index)){
				continue;
			}else{
				flag = false;
				break;
			}
		}
        return 	flag;
	}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string :");
		String str = input.next();
		
		System.out.print("Enter starting index of substring (positive number ):");
		int start = input.nextInt();
		
		if(start < 0 || start > str.length()-1){
			System.out.println("Please enter a valid starting index ");
			return;
		}
		System.out.print("Enter ending index :");
		int end = input.nextInt();
		
		if(end < 0 || start > end || end > str.length()-1){
			System.out.println("Please enter a valid ending index");
			return;
		}
		
		String subStr1 = subStringMethod(start ,end , str);
		String subStr2 = subStringByCharAt(start,end,str);
		
		System.out.println("SubString 1 is :" + subStr1); 
		System.out.println("SubString 2 is :" + subStr2); 
		
		boolean result = compareString(subStr1 ,subStr2);
		
		if(result){
			System.out.println("Both substring are same ");
		}else{
			System.out.println("Both substring are different ");
		}
		
	}
}
