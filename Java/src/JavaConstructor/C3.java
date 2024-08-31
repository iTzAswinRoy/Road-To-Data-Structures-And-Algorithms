package JavaConstructor;

// Implement a class Rectangle with two constructors: one that takes length and width as parameters and another that sets both to a default value.
public class C3 {       // Creating a class that contains car details
    // Creating instance variables for the class
    private int length;         // Crating a variable to store the length
    private int width;         // Crating a variable to store the width

    C3() {       // Creating a default constructor that takes no arguments
        // Initialing default values to the instance variables
        this.length = 10;
        this.width = 15;
    }

    C3(int length, int width) {     // Creating a parameterized constructor that takes 2 arguments
        // Calling the setter method to put a condition to initialize values to the instance variables
        setLength(length);
        setWidth(width);
    }

    public int getLength() {        // Creating a getter method to get the instance variable length
        return length;      // Returning the value of length
    }

    public int getWidth() {       // Creating a getter method to get the instance variable width
        return width;       // Returning the value of manufacture
    }

    // Method to find the area
    public int area() {
        return length * width;
    }

    // Method to find the perimeter
    public int perimeter() {
        return 2 * (length + width);
    }

    // Creating a setter method for length with constrains
    public void setLength(int length) {
        if (length > 0) {       // Checking if the length is greater than 0
            this.length = length;

        } else {
            System.out.println("Length must be positive!");
            this.length = 10;       // Setting a default value if validation fails
        }
    }

    // Creating a setter methods for width with constrains
    public void setWidth(int width) {
        if (width > 0) {        // Checking if the width is greater than 0
            this.width = width;
        } else {
            System.out.println("\nWidth must be positive!");
            this.width = 15;    // Setting a default value if validation fails
        }
    }

    public static void main(String[] args) {        // Main method
        C3 rectangle1 = new C3();     // Creating an objects with no parameters

        // Displaying the object and its values by calling getter methods
        System.out.println("Rectangle 1: \nLength = "+ rectangle1.getLength() + "\nWidth = " + rectangle1.getWidth());
        System.out.println("Area of the rectangle: " + rectangle1.area());
        System.out.println("Perimeter of the rectangle: " + rectangle1.perimeter());

        C3 rectangle2 = new C3(20, -5);     // Creating an objects by passing 2 parameters

        // Displaying the object and its values by calling getter methods
        System.out.println("\nRectangle 2: \nLength = "+ rectangle2.getLength() + "\nWidth = "+rectangle2.getWidth());
        System.out.println("Area of the rectangle: " + rectangle2.area());
        System.out.println("Perimeter of the rectangle: " + rectangle2.perimeter());
    }
}
