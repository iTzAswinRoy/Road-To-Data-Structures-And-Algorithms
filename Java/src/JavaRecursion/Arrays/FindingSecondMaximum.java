package JavaRecursion.Arrays;

import java.util.Arrays;            // Importing arrays class

// Write a recursive function to find the second maximum element in an array of integers.

public class FindingSecondMaximum {
    public static void main(String[] args) {            // Main Method
        FindingSecondMaximum obj = new FindingSecondMaximum();          // Creating an object of the class

        int[] array = {8, 2, 9, 3};         // Creating an array

        // Calling the method to find the second max in the array by storing it in a variable
        int result = obj.findSecondMax(array, array.length, obj.findMax(array, array.length, Integer.MIN_VALUE), Integer.MIN_VALUE);

        System.out.println("Given array:\n" + Arrays.toString(array));          // Converting the array to sting
        System.out.println("\nThe second maximum element in the array:\n" + result);        // Displaying the result
    }

    public int findMax(int[] data, int length, int max) {           // Method to find the max in the array
        // Base case
        if (length <= 0) {          // Checking if the length is less than zero
            return max;         // Returning the max value
        }

        if (data[length - 1] > max) {           // Checking if the current element is greater than the max value
            max = data[length - 1];         // Updating the current max value
        }
        return findMax(data, length - 1, max);      // Calling the recursive function by passing the max value and reducing the length by 1
    }

    public int findSecondMax(int[] data, int length, int max, int secondMax) {          // Method to find the second max in the array
        // Base class
        if (length <= 0) {          // Checking if the length is less than zero
            return secondMax;
        }
        if (data[length - 1] > secondMax && data[length - 1] != max) {
            secondMax = data[length - 1];
        }
        return findSecondMax(data, length - 1, max, secondMax);
    }
}