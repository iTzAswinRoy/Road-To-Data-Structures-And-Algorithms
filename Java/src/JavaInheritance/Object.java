package JavaInheritance;

//  Write a Java program to create a class called 'Shape' with methods called getPerimeter() and getArea().
//  Create a subclass called 'Circle' that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.
class Shape {       // Created a class called 'Shape'

    public double getPerimeter() {      // Creating an empty method 'perimeter' which returns 0
        return 0;
    }

    public double getArea() {       // Creating an empty method 'area' which returns 0
        return 0;
    }
}

class Circle extends Shape {        // Creating a class named 'Circle' that extends 'Shape'
    // Creating instance variables for the class
    private double radius;

    Circle(double radius) {     // Creating a parameterized constructor that takes 1 argument
        // Initializing value's to the instance variable
        this.radius = radius;
    }

    public double getPerimeter() {      // Overwriting the getter method to get the instance variable 'perimeter'
        return (2 * Math.PI * radius);
    }

    public double getArea() {       // Overwriting the getter method to get the instance variable 'area'
        return (Math.PI * radius * radius);
    }
}

public class Object {       // Creating a main class containing all the properties
    public static void main(String[] args) {        // Main method
        // Creating an object of class 'Circle'
        Circle circle = new Circle(5);

        // Displaying the properties using the getter methods
        System.out.println("Area of the circle is " + circle.getArea());
        System.out.println("Perimeter of the circle is " + circle.getPerimeter());

    }

}
