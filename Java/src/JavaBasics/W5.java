package JavaBasics;
import java.util.Scanner;
// Write a Java program that takes two numbers as input and displays the product of two numbers.
public class W5 {
    public static void main(String[] args) {
        W5 obj = new W5();      // Creating an object to call the method
        int result = obj.multiply();      // Storing the multiply method in a variable
        obj.print(result);      // Printing the variable using a print method
    }
    public int multiply(){     // Method to calculate multiplication
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        System.out.println("Enter the first number:");
        int num1 = in.nextInt();    // Getting user inputs
        System.out.println("Enter the second number:");
        int num2 = in.nextInt();    // Getting user inputs
        in.close();     // Closing scanner
        return num1 * num2;     // Returning the calculation
    }
    public void print(int result){// Creating a print method
        System.out.println("Multiplication = "+result);    // This prints the final result
    }
}