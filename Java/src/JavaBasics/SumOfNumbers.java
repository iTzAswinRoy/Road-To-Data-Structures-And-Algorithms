package JavaBasics;

import java.util.Scanner;       // Importing scanner class

// Write a Java program to print the sum of two numbers.
public class SumOfNumbers {
    public static void main(String[] args) {       // Main method
        SumOfNumbers obj = new SumOfNumbers();      // Creating an object to call the method

        System.out.println("Enter the first number:");
        int a = obj.userInputs();     // Getting inputs from user

        System.out.println("Enter the second number:");
        int b = obj.userInputs();     // Getting inputs from user

        int result = obj.sum(a,b);      // Storing the sum method in a variable
        System.out.println(result);      // Printing the result using a print method
    }

    public int userInputs() {    // Method to get inputs from the user
        Scanner in = new Scanner(System.in);    // Creating a scanner object

        return in.nextInt();    // Returning the input
    }

    public int sum(int n1, int n2) {     // Method to calculate the sum
        System.out.println("\nSum of two numbers:");

        return n1 + n2;     // Returning the sum
    }
}