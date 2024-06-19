package W3Resource.JavaBasics;
import java.util.Scanner;
// Write a Java program to divide two numbers and print them on the screen.
public class w3 {
    public static void main(String[] args) {
        w3 obj = new w3();      // Creating an object to call the method
        float result = obj.divide();      // Storing the divide method in a variable
        obj.print(result);      // Printing the variable using a print method
    }
    public float divide(){     // Method to calculate division
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        System.out.println("Enter the first number:");
        float num1 = in.nextInt();    // Getting user inputs
        System.out.println("Enter the first number:");
        float num2 = in.nextInt();
        in.close();     // Closing scanner
        return num1 / num2;     // Returning the calculation
    }
    public void print(float result){      // Creating a print method
        System.out.println("Divide = "+result);    // This prints the final result
    }
}

