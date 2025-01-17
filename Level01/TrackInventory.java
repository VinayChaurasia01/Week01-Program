import java.util.Scanner;

//create a item class for items
class Items{
    private int itemCode ;
    private String itemName;
    float itemPrice;
    
    //create constructor of Items class
    Items(int itemCode , String itemName , float itemPrice){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
    
    //create printItemDetails function for print data
    public void printItemDetail(){
        System.out.println("Item code is : " + itemCode);
        System.out.println("Item name is : " + itemName);
        System.out.println("Item price is : " + itemPrice);
    }
}
public class TrackInventory {
    public static void main(String[] args) {
        //create scanner object for user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the code of item : ");
        int code = input.nextInt();

        System.out.print("Enter the name of item : " );
        String name = input.next();

        System.out.print("Enter the price ot item : ");
        float price = input.nextFloat();
        
        //create items class for initilizing constructor  
        Items item1 = new Items(code,name,price);

        System.out.print("Enter the number of items (Quantity) : ");
        int quantity = input.nextInt();
         
        //call printItem
        item1.printItemDetail();
        System.out.println("Quantity of items is : " + quantity);

        System.out.println("Total cost is : " + quantity*item1.itemPrice);
    }
}
