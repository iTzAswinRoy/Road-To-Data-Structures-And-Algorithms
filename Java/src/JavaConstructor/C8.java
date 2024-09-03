package JavaConstructor;

import java.util.ArrayList;      // Importing array list class

// Write a class Library that initializes a list of books using an ArrayList passed to the constructor.
public class C8 {       // Creating a class named 'Library' which contains player details
    private ArrayList<String> books;        // Creating an instance variable of type array list

    C8(ArrayList<String> books) {        // Creating a parameterized constructor that takes array list as an arguments
        // Initialing values to the instance variables
        this.books = books;
    }

    public void getBooks() {        // Creating a getter method to get the instance variable book
        System.out.println(books);      // Displaying the books
    }

    public static void main(String[] args) {        // Main method
        ArrayList<String> bookTitles = new ArrayList<>();       // Creating an array list that holds the book titles

        // Inserting elements to the array list
        bookTitles.add("Harry Potter");
        bookTitles.add("Prince of Persia");
        bookTitles.add("Joker");

        C8 obj = new C8(bookTitles);        // Creating an objects by passing array list as an arguments

        // Displaying the object's parameter using the getter method
        System.out.println("Displaying the books from the collection:");
        obj.getBooks();
    }
}
