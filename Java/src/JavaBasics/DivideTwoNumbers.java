package JavaBasics;
import java.util.Scanner;       // Importing scanner class
// Write a Java program to divide two numbers and print them on the screen.
public class DivideTwoNumbers {
    public static void main(String[] args) {       // Main method
        DivideTwoNumbers obj = new DivideTwoNumbers();      // Creating an object to call the method

        System.out.println("Enter the first number:");
        float a = obj.userInputs();     // Getting inputs from user

        System.out.println("Enter the second number:");
        float b = obj.userInputs();     // Getting inputs from user

        float result = obj.divide(a,b);      // Storing the divide method in a variable
        System.out.println(result);   // Printing the result using a print method
    }
    public int userInputs() {       // Method to get inputs from the user
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        return in.nextInt();    // Returning the input
    }
    public float divide(float n1, float n2) {     // Method to calculate division
        return n1 / n2;     // Returning the divided value
    }
}