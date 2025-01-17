
//create a mobile phone class
class MobilePhone{
    String brand ;
    String model;
    float price;

    //create a function for print values
    public void printMobilePhoneDetails(){
        System.out.println("brand name of the mobile phone : " + brand);
        System.out.println("Model name of the mobile phone : " + model);
        System.out.println("Model price of the mobile phone : " + price);
    }

}

public class MobilePhoneDetails {
    public static void main(String[] args) {
        //create object of mobilephone class
        MobilePhone mobile1 = new MobilePhone();
        //its for assiging the values by using object
        mobile1.brand = "vivo";
        mobile1.model = "y29";
        mobile1.price = 2000;
        
        //call printMobilePhoneDetails for Display the data
        mobile1.printMobilePhoneDetails();
    }
}
