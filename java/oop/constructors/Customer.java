package constructors;
// STANDAR CONSTRUCTOR:

// public class Customer {
//     int minOrderValue;
//     ShoppingCart cart;

//     // standar constructor
//     public Customer() {
//         minOrderValue = 10; // set a default
//         cart = new ShoppingCart; // create a new object
//     }
// }


// DEFAULT CONSTRUCTOR:
// class Book {
//     String title;
// }
// Book book1 = new Book(); // This works because Java add an empty constructor


// GARBAGE COLLECTION
// Java automatically deletes unused objects from memory
// iF AN object doenst have vairables point to it, Java will automatically remove it later


// OVERLOADED CONSTRUCTORS
// A class can have different constructors as long as each one has different parameters
public class Customer {
    String firtName;
    String lastName;
    int age;

    // standard constructors = no parameters
    public Customer() {
        this.firtName = "Unknown";
        this.lastName = "Unknown";
        this.age = 0;
    }

    // Overloaded constructor - takes 2 values
    public Customer(String firstName, String lastName) {
        this.firtName = firstName;
        this.lastName = lastName;
    }

    // Overloaded constructor - taskes 3 values
    public Customer(String firstName, String lastName, int age) {
        this.firtName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}


// CONSTRUCTOR CHAINING WITH THIS()
// to avoid repeting the contructors as shown above, you can use one contructor to call the others

// public Customer(String firstName, String lastName, int age) {
//     this(firstName, lastName); // calls the 2-parameter constructor
//     this.age = age;
// }