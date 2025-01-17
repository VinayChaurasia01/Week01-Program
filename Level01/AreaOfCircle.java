import java.util.Scanner;

//create a class circle 
class Circle {
    //create a data member radius
    private float radius ;
    
    //create a constructor for accessing and assigning value in private data member
    Circle(float radius) {
        this.radius = radius;
    }
    //create a function for calculate area of circle
    public double calculateAreaOfCircle(){
        double area = Math.PI*radius*radius;
        return area;
    }
}
public class AreaOfCircle {
    public static void main(String[] args) {
        //create an scanner object input for user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of the circle : ");
        float radius = input.nextFloat();
        
        //create circle class object and pass parameter for constructor calling 
        Circle circle = new Circle(radius);
        
        //function calling from circle class
        double area = circle.calculateAreaOfCircle();
        //print area of the circle 
        System.out.println("Area of the circle is : " + area);
    }
}
