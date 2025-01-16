/*
Write a program to convert the complete text to lowercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toUpperCase() to get the Uppercase Text and compare the two strings using the user-defined method. And finally display the result
Write a program to split the text into words and return the words along with their lengths in a 2D array
*/

import java.util.Scanner;

class Convert{
	
	public static String upperCaseByMethod(String str){
		return str.toLowerCase();
	}
	
	public static String upperCaseByScratch(String str){
        String temp = "";		
		for(int index = 0;index < str.length();index++){
			if(str.charAt(index) <= 96){
				int i = (int)str.charAt(index);
				char ch = (char)(i + 32);
				temp = temp + "" + ch;
			}else{
				temp =temp +  str.charAt(index);
				continue;
			}
		}
		return temp;
	}
	
	public static boolean compare(String str1 , String str2){
		boolean flag = true;
		for(int index = 0;index < str1.length();index++){
			if(str1.charAt(index) != str2.charAt(index)){
				flag = false;
				break;
			}else{
				continue;
			}
		}
		return flag;
	}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		String result1 = upperCaseByMethod(str);
		String result2 = upperCaseByScratch(str);
		System.out.println("String by using toUpperCase method : " + result1);
		System.out.println("String by using ASCII code : "  + result2);
		
		boolean result = compare(result1,result2);
		
		if(result){
			System.out.print("Both String are same ");
		}else{
			System.out.println("Both String are different ");
		}
	}
}