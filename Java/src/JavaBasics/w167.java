package JavaBasics;

import java.util.Arrays;      // Importing array class
import java.util.Scanner;      // Importing scanner class

// Write a Java program to move every zero to the right side of a given array of integers.
public class w167 {
    public static void main(String[] args) {      // Main method
        w167 obj = new w167();     // Creating an object ot call the methods

        int[] array = obj.inputElements();  // Calling a method to get inputs for the array
        int[] result = obj.separatedArray(array);   // Storing the separated array in a variable

        System.out.println("Result:\n" + Arrays.toString(result));
    }

    public int[] inputElements() {   // Method to get the inputs
        Scanner in = new Scanner(System.in);    // Creating a scanner object

        System.out.println("Enter the size of the array:");
        int[] data = new int[in.nextInt()];    // Getting the size of an array

        System.out.println("Enter the value containing 0's:");
        for (int i = 0; i < data.length; i++) {     // iterating over an array to assign values to an array
            data[i] = in.nextInt();     // Getting inputs using scanner object
        }
        System.out.println("Given array:\n" + Arrays.toString(data));

        in.close();     // Closing scanner
        return data;    // Returning the inputs from the user
    }

    public int[] separatedArray(int[] data) {    // Method to separate zeros to the right of the array
        int[] modifiedArray = new int[data.length];    // Creating a new array to store the separated array

        int right = data.length-1;     // Assigning a value for right index of an array
        int left = 0;       // Assigning a value for left index of an array

        for (int i = 0; i < data.length; i++) {     // Iterating over the array to separate zeros from the array

            if (data[i] == 0) {
                modifiedArray[right] = data[i];
                right--;

            } else {
                modifiedArray[left] = data[i];
                left++;
            }
        }
        return modifiedArray;
    }

    public void printArray(int[] data) {     // Method to display the final result
    }
}
