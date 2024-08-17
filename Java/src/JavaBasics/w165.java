package JavaBasics;

import java.util.Scanner;       // Importing scanner class
import java.util.Arrays;        // Importing array class

// Write a Java program to move every positive number to the right and every negative number to the left of a given array of integers.
public class w165 {
    public static void main(String[] args) {    // Main method
        w165 obj = new w165();     // Creating an object ot call the methods

        int[] array = obj.inputElements();  // Calling a method to get inputs for the array
        int[] result = obj.rearrangeArray(array);   // Storing the rearranged array in a variable

        obj.printArray(result);     // Printing the result
    }

    public int[] inputElements() {       // Method to get the inputs
        Scanner in = new Scanner(System.in);       // Creating a scanner object

        System.out.println("Enter the size of the array: ");
        int[] data = new int[in.nextInt()];     // Getting the size of an array

        System.out.println("Enter the values for the array: ");
        for (int i = 0; i < data.length; i++) {     // iterating over an array to assign values to an array
            data[i] = in.nextInt();     // Getting inputs using scanner object
        }
        System.out.println("Given array:\n "+Arrays.toString(data));

        in.close();         // Closing scanner

        return data;        //
    }

    public int[] rearrangeArray(int[] data) {    // Method to rearrange the array
        int right = data.length-1;     // Assigning a value for right index of an array
        int left = 0;       // Assigning a value for left index of an array
        int[] newArray = new int[data.length];    // Creating a new array to store the rearranged array

        for (int i = 0; i < data.length; i++) {     // Iterating over the array to rearrange the positive and negative elements

            if(data[i] > 0){
                newArray[right] = data[i];
                right--;

            } else if(data[i] < 0){
                newArray[left] = data[i];
                left++;
            }
        }
        return newArray;        //
    }

    public void printArray(int[] data) {     // Method to display the final result
        System.out.println("Rearranged array:\n " + Arrays.toString(data));
    }
}
