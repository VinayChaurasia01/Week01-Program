//Sample Program 1 - Write a program to display Sam with Roll Number 1, Percent Marks 99.99, and the result ‘P’ indicates Pass(‘P’) or Fail (‘F’). 

class Display{
  public static void main(String []args){
  
  //creating a string for name and assign sam
  String name = "Sam";
  
  int rollNumber = 1;
  
  double percentageMarks = 99.99;
  
  char result = 'p';
  
  System.out.println("Display result:\n" + name + " with roll number " + rollNumber + " has scored " + percentageMarks + "% marks and result is " + result );
  }
}