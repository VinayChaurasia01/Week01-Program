import java.util.Scanner;

//create a class student Data
class StudentData{
    String name ;
    int rollNumber ;
    int totalMarks;

    //create constructor with the class name
    StudentData(String name,int rollNumber,int totalMarks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMarks = totalMarks;
    }

    //calculate percentage for garde  
    public float grade(int numOfSubject){
        return totalMarks/numOfSubject;
    }

    //create a method print details 
    public void printDetails(){
        System.out.println("Student name is : " + name);
        System.out.println("Student roll Number is : " + rollNumber);
        System.out.println("Student grade is : " + grade(5));
    }

}

public class StudentReport{
    public static void main(String[] args) {
        //create a scanner object for user input 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name of the student : ");
        String name = input.nextLine();

        System.out.print("Enter roll number of the student : ");
        int rollNumber = input.nextInt();

        System.out.print("Enter total marks of the student out of 500 : " );
        int totalMarks = input.nextInt();

        //create object of Student data class and intialize constructor with values
        StudentData st1 = new StudentData(name , rollNumber , totalMarks);

        //call printDetails function
        st1.printDetails();
    }
}