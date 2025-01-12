import java.util.Scanner;
class VoteCheck{
	
	//create method for check student is eligible for vate
	public static boolean canStudentVote(int age){
	if (age < 0) {
            return false;
        }
        return age >= 18;
    }
		
	
	public static void main(String[] args){
		
	  // Creating Scanner object for user input
	  Scanner scan = new Scanner(System.in);
	  
	  // creating an array of ages
	  int age[] = new int[10];
	  
	  // loop for input for get student age
	  for(int i=0; i<age.length;i++){
		
		System.out.print("Enter student "+ (i+1) + " age : ");
	    age[i]= scan.nextInt();
	  }
	  
        // check eligibility for voting
	    for(int i=0; i<age.length;i++){
			boolean results = canStudentVote(age[i]);
		
		if(results){
			
			System.out.println("The student with the age "+age[i]+" can vote ");
		}
		else{
			
			System.out.println("The student with the age "+age[i]+" cannot vote ");
		}
	  }
	}
}
		
       	   
	  