package JavaBasics;
import java.util.Scanner;
// Write a Java program to print the sum of two numbers.
public class W2 {
    public static void main(String[] args) {
        W2 obj = new W2();      // Creating an object to call the method
        int result = obj.sum();      // Storing the sum method in a variable
        obj.print(result);      // Printing the variable using a print method
    }
    public int sum(){     // Method to calculate the sum
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        System.out.println("Enter the first number:");
        int num1 = in.nextInt();    // Getting user inputs
        System.out.println("Enter the second number:");
        int num2 = in.nextInt();
        in.close();     // Closing scanner
        return num1 + num2;     // Returning the calculation
        }
    public void print(int result){// Creating a print method
        System.out.println("Sum = "+result);    // This prints the final result
    }
}