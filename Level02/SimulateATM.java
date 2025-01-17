import java.util.Scanner;

//create a bank account class
class BankAccount{
	String accountHolder ;
	long accountNumber;
	double balance;
	
	//create constructor of bank account class
	BankAccount(String accountHolder,long accountNumber,double balance){
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	//create printDetails function for print values
	public void printDetails(){
		System.out.println("Name of account holder : " + accountHolder);
		System.out.println("Account number of the account holder : " + accountNumber);
		System.out.println("Balance of account : " + balance);
	}
	
	//create function deposite for add money in balance
	public double deposite(double money){
		balance += money;
		return balance;
	}
	
	//create function withdraw for reduce money from balance
	public double withdraw(double money){
		balance -= money;
		return balance;
	}	
}

public class SimulateATM{
	
	public static void main(String [] args){
		
		//create scanner object for user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name of the account holder :");
		String name = input.nextLine();
		
		System.out.print("Enter account number of account holder :");
	    long accountNumber = input.nextLong();
		
		System.out.print("Enter Balance of account holder :");
		double balance = input.nextDouble();
		
		System.out.println("Do you want to deposite money , enter 1 and for withdraw enter 2 ");
		int operation = input.nextInt();
		
		//create bank account class object and initialize constructor 
		BankAccount account1 = new BankAccount(name,accountNumber,balance);
		account1.printDetails();
		
		//condition statements for perform deposite and withdraw operation
		if(operation == 1){
			System.out.print("Enter the value for deposite :");
			double money = input.nextDouble();
			
			System.out.println("Balance after deposite amount " + money + " is : " + (money + account1.balance ));
		}else if(operation == 2){
			System.out.print("Enter the value for withdraw :");
			double money = input.nextDouble();
			if(money > account1.balance){
				System.out.println("You don't have sufficient balance ");
				return;
			}else{
			System.out.println("Balance after withdraw amount " + money + " is : " + (account1.balance - money ));
			}
		}else{
			System.out.print("Enter Valid number (1 or 2)");
			return;
		}	
	}
}