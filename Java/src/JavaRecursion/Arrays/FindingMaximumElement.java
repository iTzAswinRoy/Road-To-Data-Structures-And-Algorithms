package JavaRecursion.Arrays;

import java.util.Arrays;       // Importing arrays class

// Write a recursive function to find the maximum element in an array of integers.

public class FindingMaximumElement {
    public static void main(String[] args) {        // Main Method
        FindingMaximumElement obj = new FindingMaximumElement();        // Creating an object of the class

        int[] array = {8,2,9,3};            // Creating an array
        System.out.println("Given array:\n" + Arrays.toString(array));        // Displaying the array

        int max = obj.findMax(array, array.length, Integer.MIN_VALUE);          // Calling the method to find the maximum element in the array
        System.out.println("result:\n" + max);        // Displaying the maximum value
    }

    public int findMax(int[] data, int length, int max) {         // Method to find the maximum element in the array
        // Base case
        if (length <= 0) {      // Checking if the length is less than the zero
            return max;         // Returning the max value
        }

        // Checking if the current element is greater than the max value
        if (data[length - 1] > max) {
            max = data[length - 1];         // Updating the max value
        }

        return findMax(data, length - 1 , max);         // Calling the recursive function by passing the max value and reducing the length by 1
    }
}