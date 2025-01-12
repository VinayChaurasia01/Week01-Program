import java.util.Scanner;

class UnitConvertor{
	//create a method for unit conversion
	 public static double unitConvertorKmToMiles(double km) {
		// km to miles = 0.621371;

		 return km*0.621371;
      
    }
	 public static double unitConvertorMilesTokm(double miles) {
		
		 // miles to km = 1.60934;
         return miles*1.60934;
      
    }
	 public static double unitConvertorMeterToFeet(double meters) {	 
		  //meters to feet = 3.28084;		 
		 return meters*3.28084;
      
    }
	 public static double unitConvertorFeetToMeter(double feet) {

		// double feet to meters = 0.3048;
		 return feet*0.3048;
      
    }
	
	public static void main(String[] args){
		
		// Creating Scanner object for user input
		Scanner scan = new Scanner(System.in);
		
      // Print options to the user
        System.out.println("Select a conversion type:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.print("Enter the number of your choice: ");
        
        int choice = scan.nextInt(); 

        double result = 0.0;
        
        switch (choice) {
            case 1:
                // call method convert kilometers to miles
                System.out.print("Enter kilometers: ");
                double km = scan.nextDouble();
                result = unitConvertorKmToMiles(km);
                System.out.println(km + " kilometers is equal to " + result + " miles.");
                break;
                
            case 2:
                // call method convert miles to kilometers
                System.out.print("Enter miles: ");
                double miles = scan.nextDouble();
                result = unitConvertorMilesTokm(miles);
                System.out.println(miles + " miles is equal to " + result + " kilometers.");
                break;
                
            case 3:
                // call method convert meters to feet
                System.out.print("Enter meters: ");
                double meters = scan.nextDouble();
                result = unitConvertorMeterToFeet(meters);
                System.out.println(meters + " meters is equal to " + result + " feet.");
                break;
                
            case 4:
                // call method convert feet to meters
                System.out.print("Enter feet: ");
                double feet = scan.nextDouble();
                result = unitConvertorFeetToMeter(feet);
                System.out.println(feet + " feet is equal to " + result + " meters.");
                break;
                
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
		
	}
}