package JavaConstructor;

// Write a class Book that has an overloaded constructor with a default value for price.
public class ConstructorOverloading {       // Creating a class that contains book details
    // Creating instance variables for the class
    private String title;       // Crating a variable to store the title
    private String author;      // Crating a variable to store the author
    private int price = 500;        // Assigning a default value to the price

    ConstructorOverloading(String title, String author, int price) {       // Creating a parameterized constructor that takes 3 arguments
        // Initialing values to the instance variables
        this.title = title;
        this.author = author;
        this.price = price;
    }

    ConstructorOverloading(String title, String author) {      // Creating a parameterized constructor that takes 2 arguments
        // Initialing values to the instance variables
        this.title = title;
        this.author = author;
    }
    public String getTitle() {      // Creating a getter method to get the instance variable title
        return title;       // Returning the value of title
    }
    public String getAuthor() {     // Creating a getter method to get the instance variable author
        return author;      // Returning the value of author
    }
    public int getPrice() {     // Creating a getter method to get the instance variable price
        return price;       // Returning the value of price
    }

    public static void main(String[] args) {        // Main method
        // Creating an objects by passing arguments based on its constructor
        ConstructorOverloading obj1 = new ConstructorOverloading("Balls of steel", "G.P. Muthu", 69);
        ConstructorOverloading obj2 = new ConstructorOverloading("Chick with dick", "Sumar Munji Kumar");

        System.out.println("Displaying the the book details:");
        // Displaying the object's parameter using the getter method
        System.out.println("Book - 1:\nTitle: " + obj1.getTitle() + "\nAuthor: " + obj1.getAuthor() + "\nPrice: " + obj1.getPrice());
        System.out.println("\nBook - 2:\nTitle: " + obj2.getTitle() + "\nAuthor: " + obj2.getAuthor() + "\nPrice: " + obj2.getPrice());
    }
}
