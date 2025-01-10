/*
Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
Hint => 
Use Modulus Operator (%) to find the reminder.
Use Division Operator to find the Quantity of pens
I/P => NONE
O/P => The Pen Per Student is ___ and the remaining pen not distributed is ___
*/
class PenDistribution{
	public static void main(String [] args){
		
		// create a variable pens and assign value of pens
		int pens = 14;
		
		// create a variable student and assign value of students
		int student = 3;
		
		// calculate the number of pens which is distributed to students
		int havingPen = pens / student;
		
		// calculate the remaining pens which is not distribute
		int remainingPens = pens - (havingPen * student);
		
		//Print result
		System.out.println("The Pen Per Student is " + havingPen + " and the remaining pen not distributed is " + remainingPens);
	}
}
		