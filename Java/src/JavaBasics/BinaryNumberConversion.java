package JavaBasics;

import java.util.Scanner;    // Importing scanner class
import java.util.Stack;     // Importing stack class

// Write a Java program that will accept an integer and convert it into a binary representation.
// Now count the number of bits equal to zero in this representation.
public class BinaryNumberConversion {
    public static void main(String[] args) {      // Main method
        BinaryNumberConversion obj = new BinaryNumberConversion();      // Creating an object

        int number = obj.userInputs();      // Storing the integer value to a variable
        Stack<Integer> binaryRepresentation = obj.convertToBinary(number);       // Storing the binary number to a queue interface

        // Displaying the binary representation of the number
        System.out.println("Binary representation of " + number + ":" );
        obj.displayBinaryNumber(binaryRepresentation);      // Calling the method to convert number to binary number

        System.out.println("\nNumber of zero bits: " + obj.countZero(binaryRepresentation));    // Calling the method to count of zero bits
    }

    public int userInputs() {       // Creating a method to get values from the user
        Scanner in = new Scanner(System.in);     // Creating a scanner class

        System.out.println("Enter the number:");
        int num = in.nextInt();      // Storing the value to a variable

        in.close();   // Closing scanner to avoid data breach

        return num;     // returning the input value
    }

    public Stack<Integer> convertToBinary(int num) {     // Creating a method to convert the number to binary
        Stack<Integer> binaryNumber = new Stack<>();     // Creating a queue interface

        if (num == 0){      // If the input value is zero then it returns 0
            binaryNumber.add(0);    // Add the number to the queue

            return binaryNumber;    // Returning the binary number
        }
        while (num > 0) {      // Iterating till the number is 0

            // Here the conversion of binary number takes place
            int reminder = num % 2;     // Getting the reminder from the number
            binaryNumber.add(reminder);     // Storing the reminder in the stack
            num = num / 2;      // Reducing the number by dividing it
        }
        return binaryNumber;    // Returning the binary number
    }

    public void displayBinaryNumber(Stack<Integer> data) {       // Method to display the binary number
        Stack<Integer> result = (Stack<Integer>) data.clone();      // Creating a stack which clones the data from the original stack

        while (!result.isEmpty()) {     // Iterates till the stack is empty
            System.out.print(result.pop());     // Removing the element from the clone stack in order to print the value
        }
    }

    public int countZero(Stack<Integer> num) {     // Creating a method to count the zero bits present in the binary number
        int count = 0;      // Initializing count to zero

        for (int i = 0; i < num.size(); i++) {      // Iterating through the stack
            if (num.get(i) == 0) {      // Checking if the stack is zero
                count++;     // For each iteration the count increase a values by 1
            }
        }
        return count;     // Returning the count value
    }
}
