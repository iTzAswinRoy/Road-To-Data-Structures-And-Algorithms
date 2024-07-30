package JavaBasics;

import java.util.Arrays;        // Importing arrays class
import java.util.Objects;       // Importing object class
import java.util.Scanner;       // Importing scanner class

// Write a Java program to test if the first and last element of two integer arrays are the same.
// The array length must be greater than or equal to 2.
public class CheckingArrayElements {
    private int count = 0;      // Declaring a count variable outside the method in order to count the method calls

    public static void main(String[] args) {    // Main method
        CheckingArrayElements obj = new CheckingArrayElements();    // Creating a class object

        int[] arr1 = obj.userInputs();     // Storing values in array 1 using the input method
        int[] arr2 = obj.userInputs();     // Storing values in array 2 using the input method

        System.out.println("\nThe given arrays are");     // Displaying the array
        System.out.println("Array-1:\n" + Arrays.toString(arr1));
        System.out.println("\nArray-2:\n" + Arrays.toString(arr2));

        obj.checkArray(arr1, arr2);
    }

    public int[] userInputs() {     // Method to get user inputs
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        count++;    // Incrementing the count as we call the method

        System.out.println("Enter the size for array-" + count + ":");
        int size = in.nextInt();    // Getting the size from the user
        int[] temp = new int[size];     // Creating an array to store inputs

        System.out.println("Enter the value of array-" + count + ":");
        for (int i = 0; i < size; i++) {    // Iterating over an array list
            temp[i] = in.nextInt();     // Assigning the values to an array list
        }
        return temp;     // Returning the inputs
    }

    public void checkArray(int[] arr1, int[] arr2) {     // Method to check if both the array contains same first and last elements
        boolean isEquals = false;       // Assigning a boolean variable

        if (Objects.equals(arr1[0], arr2[0]) && Objects.equals(arr1[arr1.length-1], arr2[arr2.length-1])) {     // Checking if the elements are same
            isEquals = true;    // Returns true if the conditions are met

        } else if (arr1.length == 1 && arr2.length == 1) {      // Checking if the array contains 1 element

            if (Objects.equals(arr1[0], arr2[0])) {     // Checking if the elements are same in both the arrays
                isEquals = true;    // Returns true if the conditions are met
            }

        } else {
            System.out.println("\nInvalid array size!");
            return;     // Exits the method if the size is invalid
        }
        System.out.println("\nChecking if the fist and last element of both the array are equal.\n" + isEquals);      // Displaying the result
    }
}

