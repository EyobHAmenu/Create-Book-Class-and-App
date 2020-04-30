public class BookApp {
    public static void main(String[] args) {

        String bookTitle;
        String author;
        String description;
        String overView;
        double price;
        boolean isInStock;

        Book book1 = new Book();
        Book book2 = new Book("Stephen W.Hawking");

        //setter for book1
        book1.setAuthor("William McAllister");
        book1.setBookTitle("Java");
        book1.setDescription("Data structure and Algorithms using Java.");
        book1.setPrice(200);
        book1.getIsInStack();


        //getter for book1
        author = book1.getAuthor();
        bookTitle = book1.getBookTitle();
        description = book1.getDescription();
        price = book1.getPrice();
        isInStock = book1.getIsInStack();
        overView = book1.getDisplayText();

        System.out.println("Book1: \n " +bookTitle + ", by " + author + "\n description: " + description + "\n Price $" + price +
                "\n In stock: " + isInStock);
        System.out.println(overView);

        // setter for boo2
        book2.setBookTitle("A Brief History of Time");
        book2.setDescription("Was there a beginning of time?");
        book2.setPrice(24.99);
        book2.setIsInStock();

        //getter for book2
        author = book2.getAuthor();
        bookTitle = book2.getBookTitle();
        description = book2.getDescription();
        price = book2.getPrice();
        isInStock = book2.getIsInStack();
        overView = book2.getDisplayText();

        System.out.println("Book2: \n " +bookTitle + ", by " + author + "\n description: " + description + "\n Price $" + price +
                "\n In stock: " + isInStock);
        System.out.println(overView);

    }
}
