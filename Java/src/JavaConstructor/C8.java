package JavaConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// Write a class Library that initializes a list of books using an ArrayList passed to the constructor.
public class C8 {
    private ArrayList<String> books;

    C8(ArrayList<String> books){
        this.books = books;
    }

    public void getBooks() {
        System.out.println((books));
    }

    public static void main(String[] args) {
        ArrayList<String> bookTitles = new ArrayList<>();

        bookTitles.add("Harry Potter");
        bookTitles.add("Prince of Persia");
        bookTitles.add("Joker");

        C8 obj = new C8(bookTitles);

        System.out.println("Displaying the books from the collection:");
        obj.getBooks();
    }
}
