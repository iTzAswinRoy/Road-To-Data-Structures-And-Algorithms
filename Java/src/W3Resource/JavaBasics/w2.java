package W3Resource.JavaBasics;
import java.util.Scanner;
// Write a Java program to print the sum of two numbers.
public class w2 {
        public static void main(String[] args) {
            w2 obj = new w2();      // Creating an object to call the method
            int result = obj.sum(1,2);      // Storing the sum method in a variable
            obj.print(result);      // Printing the variable using a print method
        }
        public int sum(int num1, int num2){     // Method to calculate the sum
            Scanner in = new Scanner(System.in);    // Creating a scanner object
            System.out.println("Enter the number:");
            num1 = in.nextInt();    // Getting user inputs
            num2 = in.nextInt();
            return num1 + num2;     // Returning the calculation
        }
        public void print(int result){      // Creating a print method
            System.out.println("Sum = "+result);    // This prints the final result
        }
}