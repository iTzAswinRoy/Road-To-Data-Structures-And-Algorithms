package JavaBasics;
import java.util.Scanner;   // Importing scanner class
// Write a Java program to print the area and perimeter of a rectangle
public class FindingRectangleDimensions {
    public static void main(String[] strings) {     // Main method
        FindingRectangleDimensions obj = new FindingRectangleDimensions();    // Creating a class object to call a method

        System.out.println("Enter the width of the rectangle:");
        int width = obj.userInputs();   // Initializing width by calling the input method

        System.out.println("Enter the height of the rectangle:");
        int height = obj.userInputs();   // Initializing height by calling the input method

        obj.sizeOfAnRectangle(width, height);   // Calling the method to find the size of the rectangle
    }
    public int userInputs() {    // Method to receive inputs from the user
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        return in.nextInt();    // Returning the inputs
    }
    public void sizeOfAnRectangle(int w, int h) {    // Method to find the size of the rectangle
        int perimeter = 2 * (h + w);    // Initializing the formula for perimeter of a rectangle
        int area = w * h;   // Initializing the formula for area of a rectangle

        System.out.println("Perimeter of a rectangle: "+perimeter);    // Displaying the perimeter of a rectangle
        System.out.println("\nArea of a rectangle: "+area);   // Displaying the perimeter of a rectangle
    }
}