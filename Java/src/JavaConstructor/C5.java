package JavaConstructor;

// Write a class Book that has an overloaded constructor with a default value for price.
public class C5 {       //
    private String title;       //
    private String author;      //
    private int price = 500;        //

    C5 (String title, String author, int price) {
        this.title = title;     //
        this.author = author;       //
        this.price = price;     //
    }

    C5 (String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        C5 obj1 = new C5("Balls of steel", "G.P. Muthu", 69);
        C5 obj2 = new C5("Chick with dick", "Sumar Munji Kumar");

        System.out.println("Displaying the the book details:");
        System.out.println("Book - 1:\nTitle: " + obj1.getTitle() + "\nAuthor: " + obj1.getAuthor()+"\nPrice: "+obj1.getPrice());
        System.out.println("\nBook - 2:\nTitle: " + obj2.getTitle() + "\nAuthor: " + obj2.getAuthor()+"\nPrice: "+obj2.getPrice());
    }
}
