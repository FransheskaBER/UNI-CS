package constructors;

// public class CopyConstructor {
    
// }

// A cippy constructor is a contructor that takes another object of the same class and uses it to create a copy
// public Book(Book original) {
//     this.title = original.title;
//     this.author = original.author;
//     this.price = original.price;
// }

// // Now you can do:
// Book original = new Book("Dune", "Frank H.", 50.0);
// Book copy = new Book(original);

public class Bookk {
    String title;
    String author;
    double price;

    public Bookk(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Bookk(Bookk original) {
        this.title = original.title;
        this.author = original.author;
        this.price = original.price;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: $" + price;

    }

    public static void main(String[] args) {
        Bookk original = new Bookk("The Hitchhiker's Guide", "Douglas Adams", 12.99);
        Bookk copy = new Bookk(original);
        System.out.println("Original Book: " + original.toString());
        System.out.println("Copied Book: " + copy.toString());
        System.out.println("After modifying the copy:");
        copy.title = "The Hitchhiker's Guide — Extended Edition";
        copy.price = 20.99;
        System.out.println("Original Book: " + original);
        System.out.println("Copied Book: " + copy);
    }
}