import java.util.Scanner;
//create a book class
class Book{
    private String title;
    private String author;
    private float price;
    
    //Create a constructor for value setting
    Book(String title , String author , float price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    //create printBookDetails function 
    public void printBookDetails(){
        System.out.println("Title of the book is : " + title);
        System.out.println("Author of the book is : " + author);
        System.out.println("Price of the book is : " + price);
    }
}

public class HandleBookDetails {
    public static void main(String[] args) {
        //Create scanner object for user input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Title of the book : ");
        String title = input.nextLine();

        System.out.print("Enter the author of the book : ");
        String author = input.nextLine();

        System.out.print("Enter the price of the book : ");
        float price = input.nextFloat();
        //create book class object
        Book book1 = new Book(title , author , price);
        //call printBookDetails function
        book1.printBookDetails();
    }
}
