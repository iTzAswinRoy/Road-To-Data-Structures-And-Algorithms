package JavaRecursion.Arrays;

import java.util.Arrays;        // Importing the array

// Write a recursive function to check if an array of integers is sorted in descending order.
public class CheckSortedDescendingElements {
    public static void main(String[] args) {        // Main method
        CheckSortedDescendingElements obj = new CheckSortedDescendingElements();        // Creating an object of the class
        int[] array = {9,5,1,8,3};          // Creating an array with values

        System.out.println("Given array:\n" + Arrays.toString(array));          // Displaying the array

        int[] sortedArray = obj.sortingInDescendingOrder(array, array.length);          // Calling the method to sort the array in descending order

        System.out.println("\nArrays sorted in descending order:\n" + Arrays.toString(sortedArray));        // Displaying the result

        // Calling the method to check if the element in the array is in descending order
        System.out.println("\nChecking if the array elements are sorted in descending order.\n" + obj.checkingDescendingOrder(array, 0));
    }

    public int[] sortingInDescendingOrder(int[] data, int length) {         // Method to sort the array in descending order
        // Base case
        if (length == 1) {          // Checking if the length is reduced to 1
            return data;        // Returning the data
        }
        // Iterating through the array list
        for (int i = 0; i < length - 1; i++) {
            // Checking if the current element is less than the next element
            if (data[i] < data[i + 1]) {
                // Here, the swapping process takes place
                int temp = data[i];
                data[i] = data[i + 1];
                data[i + 1] = temp;
            }
        }
        return sortingInDescendingOrder(data, length - 1);          // Calling the recursive function by decrementing the length by 1
    }

    public boolean checkingDescendingOrder(int[] data, int index) {          // Method to check if the element in the array is in descending order
        // Base case
        if (index >= data.length - 1) {     // Checking if the index is greater than the size of the list
            return true;
        }

        // Checking if the current element is less that the next element
        if (data[index] < data[index + 1]) {
            return false;
        }
        return checkingDescendingOrder(data, index + 1);        // Calling the recursive function by incrementing the index by 1
    }
}