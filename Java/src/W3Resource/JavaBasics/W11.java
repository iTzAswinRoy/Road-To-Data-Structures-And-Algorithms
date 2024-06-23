package W3Resource.JavaBasics;
import java.util.Scanner;
// Write a Java program to print the area and perimeter of a circle.
public class W11 {
    public static void main(String[] args) {
        W11 obj = new W11();      // Creating an object to call the method
        int radius = obj.input();   // Storing the method in a variable
        obj.perimeter(radius);      // Calling the perimeter method
        obj.area(radius);       // Calling the area method
    }
    public int input() {    // Method to get inputs from the user
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        System.out.println("Enter the radius: ");
        int r = in.nextInt();   // Getting the radius from the user
        in.close();     // Closing scanner
        return r;   // Returning the radius
    }
    public void perimeter(int radius){      // Method to calculate perimeter
        double result = 2 * Math.PI * radius;       // Using the perimeter formula
        System.out.println("Perimeter of the circle: "+result);     // Printing the result
    }
    public void area(int radius){       // Method to find the area of the circle
        double result = Math.PI * radius * radius;      // Using area formula
        System.out.println("Area of the circle: "+result);      // Printing the results
    }
}