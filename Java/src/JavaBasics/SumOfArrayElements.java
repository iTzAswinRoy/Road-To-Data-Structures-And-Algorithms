package JavaBasics;

import java.util.Arrays;    // Importing array class
import java.util.Scanner;   // Importing scanner class

// Generate the following series and store them in an array. Display from the array, Display the Sum
// Example: if N = 50, then Output: 1, 2, 5, 10, 17, 26, 37, 50, 65, 82, 101, 122 ....... N

public class SumOfArrayElements {
    public static void main(String[] args) {        // Main method
        SumOfArrayElements obj = new SumOfArrayElements();    // Creating a class object

        System.out.println("Enter the number of elements: ");
        int size = obj.userInput();        // Initializing size by calling the suer input method

        System.out.println("Display array: " + Arrays.toString(obj.series(size)));    // Displaying the array
        System.out.println("Sum of array: " + obj.sum(obj.series(size)));        // Displaying the sum of the array
    }

    public int userInput() {     // Method to get inputs from the user
        Scanner in = new Scanner(System.in);        // Creating a scanner object

        return in.nextInt();    // Returning the input value
    }

    public int[] series(int data) {      // Method to create a series of array
        int[] arr = new int[data];      // Creating an empty array
        int sum = 1;      // Initializing sum value to 1

        for (int i = 0; i < data; i++) {        // Iterating through the given array
            arr[i] = sum;     // Assigning each element to the sum
            sum += (i + 1) * 2;      // Applying the formula
        }
        return arr;     // Returning the array
    }

    public int sum(int[] arr) {      // Method to calculate the sum of the elements in an array
        int sum = 0;    // Initializing te sum to 0

        for (int i = 0; i < arr.length; i++) {      // Iterating through the array
            sum += arr[i];     // Storing the sum of elements
        }
        return sum;     // Returning the sum
    }
}