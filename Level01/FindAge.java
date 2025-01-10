/* 
Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
I/P => NONE
O/P => Harry's age in 2024 is ___ 
*/

class FindAge{
	public static void main(String [] args){
		String name = "Harry";
		int birthDate = 2000;
		int currYear = 2024;
		
		int age = currYear - birthDate;
		
		System.out.println(name + "'s age in " + currYear + " is " + age );
	}
}