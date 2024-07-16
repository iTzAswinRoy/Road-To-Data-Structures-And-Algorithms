package JavaBasics;
import java.util.Scanner;       // Importing scanner class
// Write a Java program that takes two numbers as input and displays the product of two numbers.
public class MultiplyingTheNumbers {
    public static void main(String[] args) {       // Main method
        MultiplyingTheNumbers obj = new MultiplyingTheNumbers();      // Creating an object to call the method

        System.out.println("Enter the first number:");
        int a = obj.userInputs();     // Getting inputs from user

        System.out.println("Enter the second number:");
        int b = obj.userInputs();     // Getting inputs from user

        int result = obj.multiply(a,b);      // Storing the multiply method in a variable
        System.out.println("\nThe product of two number:\n"+result);     // Printing the result using a print method
    }

    public int userInputs() {       // Method to get inputs from the user
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        return in.nextInt();    // Returning the input
    }

    public int multiply(int n1, int n2) {     // Method to calculate multiplication
        return n1 * n2;     // Returning the calculation
    }
}