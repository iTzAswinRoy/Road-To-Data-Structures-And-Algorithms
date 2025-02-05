package JavaRecursion.Arrays;

import java.util.Arrays;        // Importing the arrays class

//Write a recursive function to count the number of even numbers in an array.
public class CountEvenNumbers {
    public static void main(String[] args) {            // Main method
        CountEvenNumbers obj = new CountEvenNumbers();          // Creating an object of the class

        int[] array = {2,12,7,10,99};           // Creating an array with values

        System.out.println("Given array:\n" + Arrays.toString(array));          // Displaying the array
        System.out.println("\nFinding the no. of even elements in the array:\n" + obj.countEven(array, 0, 0));           // Calling the method to find the number of even elements in the array
    }

    public int countEven(int[] data, int index, int count) {            // Method to find the number of even elements in the array
        // Base case
        if (index >= data.length) {         // Checking if the index is greater than the size of the list
            return count;       // Returning the count
        }

        if (checkEven(data[index])) {           // Calling the method to check if the element is even
            count++;          // Incrementing the count by 1
        }

        return countEven(data, index + 1, count);           // Calling the recursive function by incrementing the index by 1
    }

    public boolean checkEven(int num) {         // Method to check if the element is even
        // Checking if the element is even
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}