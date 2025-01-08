package JavaConstructor;

// Create an abstract class 'Shape' with a constructor that initializes color. Then, implement a concrete class 'Circle' that extends Shape.
abstract class Shape {      // Creating a class named 'Shape'
    // Creating instance variables for the class
    private String color;

    Shape(String colour) {       // Creating a parameterized constructor by passing arguments
        // Initialing values to the instance variables
        this.color = colour;
    }

    public abstract double area(int radius);        // Creating an abstract method for 'area'

    public abstract double perimeter(int radius);       // Creating an abstract method for 'perimeter'

    public String getColor() {      // Creating a getter method to get the instance variable 'color'
        return color;
    }
}

public class Circle extends Shape {        // Creating a class 'Circle' extends 'Shape' and inherits its properties and methods
    private int radius;

    Circle(String color, int radius) {      // Creating a parameterized constructor by passing arguments
        super(color);       // Calling the constructor of the parent 'Shape' class to initialize color
        // Initialing values to the instance variables
        this.radius = radius;
    }

    public double area(int radius) {       // Implementing the 'area' method from the abstract 'Shape' class
        return Math.PI * radius * radius;
    }

    public double perimeter(int radius) {       // Implementing the 'perimeter' method from the abstract 'Shape' class
        return 2 * Math.PI * radius * radius;
    }

    public int getRadius() {     // Method to return the value of the radius field
        return radius;
    }

    public static void main(String[] args) {        // Min method
        // Creating an object of class 'Circle' by passing arguments
        Circle obj = new Circle("red", 5);

        // Calling the method to display the area of the circle
        System.out.println("area of the circle:\n" + obj.area(obj.getRadius()));

        // Calling the method to display the perimeter of the circle
        System.out.println("Perimeter of the circle:\n" + obj.perimeter(obj.getRadius()));
    }
}
