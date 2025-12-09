package constructors;
public class Book {
    String title;
    String author;
    double price;
    

    //Standard constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0;
    }

    // Overloaded constructor that calls the standard no-argument constructor first
    public Book(String title, String author) {
        this(); 
        this.title = title;
        this.author = author;
    }

    // Overloaded consturctor that call the 2-parameter constrcutor
    public Book(String title, String author, double price) {
        this(title, author);
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: $" + price;
    }

    public static void main(String[] args) {

        // Test the standard constructor
        Book book1 = new Book();
        System.out.println("Book 1 details: " + book1);

        // Test the constructor with 2 parameters
        Book book2 = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams");
        System.out.println("Book 2 details: " + book2);

        // Test the constructor with 3 parameters
        Book book3 = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 34.55);
        System.out.println("Book 3 details: " + book3);

        // // Test the overloaded constructor (chaining used)
        // Book book2 = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 23.45);
        // System.out.print("Book 2 details: " + book2);
    }
}
