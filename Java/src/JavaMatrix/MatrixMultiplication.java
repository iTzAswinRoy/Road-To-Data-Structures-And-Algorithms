package JavaMatrix;

import java.util.Arrays;        // Importing array class

// Implement matrix multiplication for two matrices. Ensure you handle the cases where multiplication is not possible.
public class MatrixMultiplication {
    public static void main(String[] args) {        // Main method
        MatrixMultiplication obj = new MatrixMultiplication();          // Creating an object to call the method

        // Creating a 2 by 2 matrix
        int[][] mat1 = {{1,2,3}, {4,5,6}};
        int[][] mat2 = {{10,20,30}, {40,50,60}};

        System.out.println("Given matrix:");

        // Calling the method to display the matrix - 1
        System.out.println("Matrix - 1:");
        obj.display(mat1);

        // Calling the method to display the matrix - 2
        System.out.println("\nMatrix - 2:");
        obj.display(mat2);

        try {
            // Calling the method to display matrix multiplication
            System.out.println("\nMatrix after multiplying 1 & 2:");
            obj.display(obj.multiplicationMatrix(mat1, mat2));          // Calling the method to multiply the elements in the matrix

        } catch (IllegalArgumentException e) {       // Assigning the required exception
            System.out.println(e.getMessage());         // Prints the error message from the exception class
        }
    }

    public int[][] multiplicationMatrix(int[][] data1, int[][] data2) {         // Method to multiply the elements in the matrix
        // Checking if both the matrix are not null and has the same size
        if (data1 == null || data2 == null || data1.length != data2.length || data1[0].length != data2[0].length) {
            throw new IllegalArgumentException("Matrix multiplication is not possible. Matrix size is not equal!");         // If the condition satisfies, it throws an exception
        }

        int[][] result = new int[data1.length][data1[0].length];        // Creating an empty matrix to store the result

        // Creating a nested for loop to vies each element in the matrix
        for (int i = 0; i < data1.length; i++) {        // Iterating through the rows of the matrix
            for (int j = 0; j < data1[0].length; j++) {         // Iterating through the columns of the matrix

                result[i][j] = data1[i][j] * data2[i][j];       // Storing the value after multiplying the elements in both the matrix
            }
        }
        return result;         // Returning the result
    }

    public void display(int[][] data) {         // Method to display the matrix
        for (int i = 0; i < data.length; i++) {         // Iterating through the rows of the matrix
            System.out.println(Arrays.toString(data[i]));       // Displaying each element in the matrix
        }
    }
}