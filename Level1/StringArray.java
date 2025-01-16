/*
Write a program to return all the characters in a string using the user-defined method,  
compare the result with the String built-in toCharArray() method, and display the result
Hint => 
Take user input using the  Scanner next() method to take the text into a String variable
Write a method to return the characters in a string without using the toCharArray() 
Write a method to compare two string arrays and return a boolean result
In the main() call the user-defined method and the String built-in ​​toCharArray() method, 
compare the 2 arrays, and finally display the result
*/

import java.util.Scanner;

class StringArray{
	
	public static char[] charArrayMethod(String str){
		return str.toCharArray();
	}
	
	public static char[] characterArray(String str){
		char []character = new char[str.length()];
		for(int index = 0;index < str.length(); index++){
			character[index] = str.charAt(index);
		}
		
		return character;
	}
	
	public static boolean compare(char []character1 , char []character2){
		boolean flag = true;
		
		for(int index = 0;index<character1.length;index++){
			if(character1[index] == character2[index]){
				continue;
			}else{
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void print(char []character){
		for(int index = 0;index<character.length;index++){
			System.out.print( character[index] + " ");
		}
	}
	public static void main(String []args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String :");
		String str = input.next();
		
		char []character1 = new char[str.length()];
		char []character2 = new char[str.length()];
		
		character1 = charArrayMethod(str);
		
		character2 = characterArray(str);
		
		print(character1);
		System.out.println();
		print(character2);
		System.out.println();
		
		boolean result  = compare(character1 , character2);
		
		System.out.print("Both array same :" + result);
	}
}