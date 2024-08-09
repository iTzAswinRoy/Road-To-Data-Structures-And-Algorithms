package JavaBasics;

import java.util.Scanner;   // Importing scanner class
import java.lang.String;    // Importing string class

// Write a Java program to compute the digit number of the sum of two given integers.
public class CountingDigits {
    public static void main(String[] args) {    // Main method
        CountingDigits obj = new CountingDigits();      // Creating a class of an object

        System.out.println("Enter the first number:");
        int num1 = obj.userInputs();    // Storing the inputs in a variable

        System.out.println("Enter the second number:");
        int num2 = obj.userInputs();    // Storing the inputs in a variable

        obj.sumOfTwoIntegers(num1, num2);   // Calling the method for counting the digit number of the sum by passing two integers
    }

    public int userInputs() {    // Method to get inputs from the user
        Scanner in = new Scanner(System.in);    // Creating a scanner object

        return in.nextInt();    // Returning the user inputs
    }

    public void sumOfTwoIntegers(int a, int b) {    // Method to calculate the sum of two integers
        int c = a + b;      // Applying the formula
        int count = 0;      // initializing the count to 0

        String subString = String.valueOf(c);      // Converting integer into string

        for (int i = 0; i < subString.length(); i++) {      // iterating over the for loop
            count++;    // incrementing count by 1
        }
        System.out.println("\nCalculating the digit number of the sum of two given integers:\n" + count);      // Displaying the count
    }
}