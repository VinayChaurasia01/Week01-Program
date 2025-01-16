import java.util.*;

public class Employee{
	private int id;
	private String name;
	private float salary;
	
	Employee(int id,String name , float salary){
		id = id;
		name = name;
		salary = salary;
	}
	
	public void printDetails(){
		System.out.println("Employee Id is :" + id);
		System.out.println("Employee  name is :" + id);
		System.out.println("Employee salary is :" + id);
	}		
}

class EmployeeDetails{
	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee id : ");
		int id = input.nextInt();
		
		System.out.print("Enter employee name :");
		String name = input.nextLine();
		
		System.out.print("Enter employee salary :");
		float salary = input.nextFloat();
		
		Employee employee1 = new Employee(id,name,salary);
		
		employee1.printDetails();
		
		input.close();
	}
}	