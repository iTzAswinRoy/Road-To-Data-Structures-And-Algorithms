package JavaMatrix;

import java.util.Arrays;        // Importing array class

// Write a function that rotates a matrix by 90 degrees clockwise.
public class MatrixRotation {
    public static void main(String[] args) {        // Main method
        MatrixRotation obj = new MatrixRotation();          // Creating an object to call the method

        // Creating a 2 by 2 matrix
        int[][] matrix = {{1,2,3},{4,5,6}, {7,8,9}};

        // Calling the method to display the matrix
        System.out.println("Given matrix:");
        obj.display(matrix);

        // Calling the method to rotate the matrix by 90 degree
        System.out.println("\nRotating matrix at 90 degree:");
        obj.display(obj.RotateMatrix(matrix));
    }

    public int[][] RotateMatrix(int[][] data) {           // Method to rotate the matrix by 90 degree
        int[][] result = new int[data.length][data[0].length];          // Creating an empty matrix to store the result

        int size = data.length-1;           // Storing the size of the matrix

        // Creating a nested for loop to vies each element in the matrix
        for (int i = 0; i < data.length; i++) {         // Iterating through the rows of the matrix
            for (int j = 0; j < data[0].length; j++) {          // Iterating through the columns of the matrix

                result[j][size - i] = data[i][j];          // Multiplying each element using scalar value
            }
        }
        return result;          // Returning the result
    }

    public void display(int[][] data) {         // Method to display the matrix
        for (int i = 0; i < data.length; i++) {         // Iterating through the rows of the matrix
            System.out.println(Arrays.toString(data[i]));       // Displaying each element in the matrix
        }
    }
}