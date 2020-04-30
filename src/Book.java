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
    Book(){

    }

    // override the default constructor
    Book(String author){
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean setIsInStock() {
        isInStock = true;
        Random r = new Random();
        int run = 1 + r.nextInt(2);
        if(run == 1){
            isInStock = false;
        }
        return isInStock;
    }
    public boolean getIsInStack(){
        return isInStock;
    }

    public String getDisplayText(){
        return "Over view of " + getBookTitle() + ", Author: " + getAuthor() + ", About the Book: " + getDescription();
    }


}
