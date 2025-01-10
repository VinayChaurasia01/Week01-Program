/*
Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___
*/

class FindAvgPercentage{
    public static void main(String [] args){
		    
		// Initialize marks for three subjects: Math, Physics, and Chemistry
		int mathMark = 94, physicsMark = 95, chemistryMark = 96;
		
		// Calculate the average of the marks
		// The formula used is the sum of all marks divided by the total number of subjects
		int average = (94 + 95 + 96) / 3;
		
		// Print the name of the student along with their average marks in PCM
		System.out.println("Sam's average mark in PCM is " + average );
	}
}	
