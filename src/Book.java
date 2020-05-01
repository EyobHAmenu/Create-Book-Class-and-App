import java.util.Random;
import java.util.Scanner;

public class Book {
    /*
        Create a Book class that allows for Book title, author, description, price and isInStock variables
        The Book class shall contain private member variables, a default constructor, an overloaded constructor
        and a method called getDisplayText() which prints the author, title and description.

     */
    private String bookTitle;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    // Default constructor
    Book(){ }

    // overload the default constructor
    Book(String author){
        this.author = author;
    }

    //Getter Methods
    public String getBookTitle() {
        return bookTitle;
    }
    public String getAuthor() {
        return author;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public boolean getIsInStack(){ return isInStock; }
    public String getDisplayText(){
        return "Over view of " + getBookTitle() + ", Author: " + getAuthor() + ", About the Book: " + getDescription();
    }

    // Setter methods
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setDescription(String description) { this.description = description; }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setInStock() {
        isInStock = true;
        Random r = new Random();
        int run = 1 + r.nextInt(2);
        if(run == 1){
            isInStock = false;
        }
    }

    public double totalOrderPrice(int numberOfOrders){
        double totalPrice = 0;
        if(getIsInStack() == true && numberOfOrders > 0){
            totalPrice = numberOfOrders * getPrice();
        }else if (getIsInStack() == false){
            System.out.println("Sorry the book is out of stock.");
        }else if(numberOfOrders < 0){
            System.out.println("Wrong number of book ordered. Please check it again.");
        }
        return totalPrice;
    }


}
