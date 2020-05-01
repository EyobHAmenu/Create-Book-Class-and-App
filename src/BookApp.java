import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {

        /*
            case 1:
            Book1:
             Java, by William McAllister
             description: Data structure and Algorithms using Java.
             Price $200.0
             In stock: true
            Over view of Java, Author: William McAllister, About the Book: Data structure and Algorithms using Java.
            How many of Java book you want to order?-9
            Wrong number of book ordered. Please check it again.
            Your order total is: 0.0
            **************Book2**************
            Book2:
             A Brief History of Time, by Stephen W.Hawking
             description: Was there a beginning of time?
             Price $24.99
             In stock: false
            Over view of A Brief History of Time, Author: Stephen W.Hawking, About the Book: Was there a beginning of time?
            How many of A Brief History of Time book you want to order?0
            Sorry the book is out of stock.
            Your order total is: 0.0
        case 2:
            **************Book1**************
            Book1:
             Java, by William McAllister
             description: Data structure and Algorithms using Java.
             Price $200.0
             In stock: false
            Over view of Java, Author: William McAllister, About the Book: Data structure and Algorithms using Java.
            How many of Java book you want to order?5
            Sorry the book is out of stock.
            Your order total is: 0.0
            **************Book2**************
            Book2:
             A Brief History of Time, by Stephen W.Hawking
             description: Was there a beginning of time?
             Price $25.0
             In stock: false
            Over view of A Brief History of Time, Author: Stephen W.Hawking, About the Book: Was there a beginning of time?
            How many of A Brief History of Time book you want to order?5
            Sorry the book is out of stock.
            Your order total is: 0.0
        case 3:
            **************Book1**************
            Book1:
             Java, by William McAllister
             description: Data structure and Algorithms using Java.
             Price $200.0
             In stock: true
            Over view of Java, Author: William McAllister, About the Book: Data structure and Algorithms using Java.
            How many of Java book you want to order?5
            Your order total is: 1000.0
            **************Book2**************
            Book2:
             A Brief History of Time, by Stephen W.Hawking
             description: Was there a beginning of time?
             Price $25.0
             In stock: true
            Over view of A Brief History of Time, Author: Stephen W.Hawking, About the Book: Was there a beginning of time?
            How many of A Brief History of Time book you want to order?5
            Your order total is: 125.0
         */

        int numberOrdered;
        String bookTitle;
        String author;
        String description;
        String overView;
        double price;
        boolean isInStock;

        Scanner in = new Scanner(System.in);


        System.out.println("**************Book1**************");
        Book book1 = new Book();
        //setter for book1
        book1.setAuthor("William McAllister");
        book1.setBookTitle("Java");
        book1.setDescription("Data structure and Algorithms using Java.");
        book1.setPrice(200);
        book1.setInStock();

        //getter for book1
        author = book1.getAuthor();
        bookTitle = book1.getBookTitle();
        description = book1.getDescription();
        price = book1.getPrice();
        isInStock = book1.getIsInStack();
        overView = book1.getDisplayText();

        System.out.println("Book1: \n " +bookTitle + ", by " + author + "\n description: " + description + "\n Price $"
                + price + "\n In stock: " + isInStock);

        System.out.println(overView);

        System.out.print("How many of " + book1.getBookTitle() + " book you want to order?");
        numberOrdered = in.nextInt();
        in.nextLine();
        System.out.println("Your order total is: " + book1.totalOrderPrice(numberOrdered));



        System.out.println("**************Book2**************");
        Book book2 = new Book("Stephen W.Hawking");

        // setter for boo2
        book2.setBookTitle("A Brief History of Time");
        book2.setDescription("Was there a beginning of time?");
        book2.setPrice(25);
        book2.setInStock();


        //getter for book2
        author = book2.getAuthor();
        bookTitle = book2.getBookTitle();
        description = book2.getDescription();
        price = book2.getPrice();
        isInStock = book2.getIsInStack();
        overView = book2.getDisplayText();

        System.out.println("Book2: \n " +bookTitle + ", by " + author + "\n description: " + description + "\n Price $"
                + price + "\n In stock: " + isInStock);
        System.out.println(overView);

        System.out.print("How many of " + book2.getBookTitle() + " book you want to order?");
        numberOrdered = in.nextInt();
        in.nextLine();
        System.out.println("Your order total is: " + book2.totalOrderPrice(numberOrdered));

    }
}
