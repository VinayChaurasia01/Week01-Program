import java.util.Scanner;
class TrigonometricProblem{
	
	//create  a method for calculateTrigonometric
	 public static double[] calculateTrigonometric(int angle) {
		 
        // Convert the angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
       
        return new double[] {sine, cosine, tangent};
    }
	
	
	public static void main(String[] args){
		
		// Creating Scanner object for user input
		Scanner scan = new Scanner(System.in);
				
		System.out.print("Enter the angle in degrees : ");
		int angle = scan.nextInt();
		
		double results[] = calculateTrigonometric(angle);
		
	
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
		
		
	}
}
