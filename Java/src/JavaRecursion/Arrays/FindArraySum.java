package JavaRecursion.Arrays;

import java.util.Scanner;       // Importing scanner class

// Write a recursive function to find the sum of elements in an array.

public class FindArraySum {
    public static void main(String[] args) {            // Main method
        FindArraySum obj = new FindArraySum();          // Creating an object of the class

        int[] array = obj.userInputs();             // Creating an array to store the user inputs

        System.out.println(obj.sumOfArray(array, array.length));            // Calling the method to print the sum of array
    }

    public int[] userInputs() {         // Method to get inputs from the user
        Scanner in = new Scanner(System.in);            // Creating a scanner object

        System.out.println("Enter the size:");
        int size = in.nextInt();        // Getting the size form the user

        int[] temp_arr = new int[size];         // Creating a temp array to store the user inputs

        System.out.println("Enter the values:");

        // Iterating through the array
        for (int i = 0; i < size; i++) {
            temp_arr[i] = in.nextInt();         // Assigning the values for each element in the array
        }
        in.close();         // Closing the scanner

        return temp_arr;            // Returning hte temp array
    }

    public int sumOfArray(int[] data, int size) {         // Method to print the sum of array
        // Base case
        if (size <= 0) {           // Checking if the size in less than zero
            return 0;           // Returns zero
        }

        // Calling the recursive function by reducing the size 1 and adding with the current element
        return sumOfArray(data, size - 1) + data[size - 1];
    }
}