package JavaBasics;

import java.util.Scanner;      // Importing scanner class

// Write a Java program and compute the sum of an integer's digits.
public class SumOfDigits {
    public static void main(String[] args) {    // Main method
        SumOfDigits obj = new SumOfDigits();    // Creating a class object to call the methods

        System.out.println("Enter the number:");
        int value = obj.userInputs();   // Storing the inputs in a variable

        System.out.println("The sum of digits is " + obj.calculatingSumOfDigits(value));     // Displaying the result by calling the method
    }
    public int userInputs() {    // Method to get the user inputs
        Scanner in = new Scanner(System.in);    // Creating a scanner object

        return in.nextInt();    // returning the scanner
    }

    public int calculatingSumOfDigits(int n) {      // Method to calculate the sum of integers
        int sum = 0;    // creating an empty variable to store the result

        while (n !=  0) {       // Iterating over the string
            sum += n % 10;      // Getting the last digit and adding till the loop runs
            n = n/10;       // Removing the last digit from the number by dividing it by 10
        }
        return sum;     // Returning the final result
    }
}