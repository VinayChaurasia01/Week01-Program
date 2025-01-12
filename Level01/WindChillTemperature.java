import java.util.Scanner;
class WindChillTemperature{
	
	//create a method for calculating wind temperature
	public static double calculateWindChill(double temp, double windSpeed){
		
		// wind chill temperature using the formula 
		double windChill = 35.74 + 0.6215*temp + (0.4275*temp - 35.75) * Math.pow(windSpeed,0.16);
		
		return windChill;
	}
	
	
	public static void main(String[] args){
		
		// Creating Scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Enter the temperature : ");
		double temp = scan.nextDouble();
		
		System.out.print("Enter the wind speed : ");
		double windSpeed = scan.nextDouble();
		
		//call the calculateWindChill method and assign in windChillTemperature
		double windChillTemperature = calculateWindChill(temp,windSpeed);
		
		//display the result
		System.out.println("Wind chill temperature is "+windChillTemperature+" with temperature is "+temp+" with wind speed is " +windSpeed);
	}
}
