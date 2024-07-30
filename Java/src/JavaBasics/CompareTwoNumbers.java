package JavaBasics;

import java.util.Scanner;     // Importing scanner class

// Write a Java program to compare two numbers
public class CompareTwoNumbers {
    public static void main(String[] args) {    // Main method
        CompareTwoNumbers obj = new CompareTwoNumbers();    // Creating a class object to call the methods

        System.out.println("Enter the first number: ");
        int n1 = obj.userInputs();     // Storing inputs in a variable for num1

        System.out.println("Enter the second number: ");
        int n2 = obj.userInputs();      // Storing inputs in a variable for num2

        obj.compare(n1, n2);    // Calling the method to compare the numbers
    }

    public int userInputs() {    // Method to get the user inputs
        Scanner in = new Scanner(System.in);    // Creating a scanner object

        return in.nextInt();    // returning the scanner
    }

    public void compare(int n1, int n2){    // Method to compare the two numbers
        if (n1 == n2) {     // Condition if the both numbers are equal
            System.out.println("Both numbers are equal!");
        } else if (n1 > n2) {    // Checking if the number is greater or less than
            System.out.println("Number " + n1 + " is greater than number " + n2);
        } else {
            System.out.println("Number " + n1 + " is less than number " + n2);
        }
    }
}
