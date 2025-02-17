package JavaRecursion.Arrays;

import java.util.Arrays;        // Importing arrays class

// Write a recursive function to generate all possible rotations of an array.
public class GenerateRotations {
    public static void main(String[] args) {            // Main method
        GenerateRotations obj = new GenerateRotations();        // Creating an object of the class

        int[] array = {1,2,3,4,5};          // Creating an array

        System.out.println("Given array:\n" + Arrays.toString(array));          // Converting the array to sting

        System.out.println("\nGenerating all possible rotations of the array:");
        obj.generateRotational(array, 0);             // Calling the method to generate rotational of the array
    }

    public void generateRotational(int[] data, int index) {         // Method to generate rotational of the array
        // Base case
        if(index == data.length) {          // Checking if the index is equal to its array length
            return;         // Exits the method
        }
        rotateArray(data);          // Calling the rotate method to rotate the array

        printArray(data);

        generateRotational(data, index+1);
    }

    public void rotateArray(int[] data){
        int first = data[0];

        for (int i = 0; i < data.length - 1; i++) {
            data[i] = data[i+1];
        }
        data[data.length-1] = first;

    }
    public void printArray(int[] data){
        System.out.println(Arrays.toString(data));
    }
}
