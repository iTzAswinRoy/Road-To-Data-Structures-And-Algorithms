package JavaBasics;

import java.util.Arrays;        // Importing array class
import java.util.Scanner;       // Importing scanner class

// Finding the smallest and largest element in an array. Elements in the array can be in any order.
public class FindingSmallestAndLargestElement {
    public static void main(String[] args) {       // Main method
        FindingSmallestAndLargestElement obj = new FindingSmallestAndLargestElement();      // Creating an object to call the method

        int[] array = obj.getInputs();    // Getting inputs from the user
        System.out.println("Given array:\n" + Arrays.toString(array));

        obj.minArray(array);      // Calling the method to find minimum element
        obj.maxArray(array);      // Calling the method to find the maximum element
    }

    public int[] getInputs() {    // Method to get inputs
        Scanner in = new Scanner(System.in);     // Creating a scanner object

        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();     // Initializing the size

        int[] data = new int[size];      // Creating an array to store the elements
        System.out.println("Enter the values of the array: ");

        for (int i = 0; i < size; i++) {      // Iterating through an array
             data[i] = in.nextInt();         // Initialize the elements to an array
        }
        in.close();     // Closing the scanner object to reduce unwanted storage

        return data;     // Returning the user inputs
    }

    public void minArray(int[] data) {      // Creating a method to find the minimum element
        int min = Integer.MAX_VALUE;        // Setting a variable to maximum value

        for (int i = 0; i < data.length; i++) {      // Iterating through an array
            if (data[i] < min) {      // Here the condition is applied to find the minimum element
                min = data[i];      // Storing the least element in the variable
            }
        }
        System.out.println("\nThe minimum element in the array is " + min);     // Displaying the minimum element
    }

    public void maxArray(int[] data){      // Creating a method to find the maximum element
        int max = Integer.MIN_VALUE;     // Setting a variable to minimum value

        for (int i = 0; i < data.length; i++) {     // Iterating through an array
            if (data[i] > max) {      // Condition to find the maximum element
                max = data[i];      // Storing the maximum element in the variable
            }
        }
        System.out.println("\nThe maximum element in the array is " + max);     // Displaying the maximum element
    }
}
