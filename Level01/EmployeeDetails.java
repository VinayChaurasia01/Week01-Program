import java.util.Scanner;

//create a employee class 
class Employee{
	private int id;
	private String name;
	private float salary;
	
	//create Employee class constructor for accessing private data member
	Employee(int id,String name , float salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	//create printDetails function for printing values 
	public void printDetails(){
		System.out.println("Employee Id is :" + id);
		System.out.println("Employee  name is :" + name);
		System.out.println("Employee salary is :" + salary);
	}		
}

class EmployeeDetails{
	public static void main(String [] args){
		//create scanner object for user input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee id : ");
		int id = input.nextInt();
		
		System.out.print("Enter employee name : ");
		String name = input.next();
		
		System.out.print("Enter employee salary : ");
		float salary = input.nextFloat();
		
		//create employee class object for constructor calling
		Employee employee1 = new Employee(id,name,salary);
		
		employee1.printDetails();
	}
}	