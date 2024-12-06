package JavaMatrix;

import java.util.Arrays;         // Importing array class

// Write a function to transpose a given matrix.
public class TransposingAMatrix {
    public static void main(String[] args) {        // Main method
        TransposingAMatrix obj = new TransposingAMatrix();          // Creating an object to call the method

        // Creating a 2 by 2 matrix
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8, 9}, {11, 12, 13, 14, 15}};

        // Calling the method to display the matrix
        System.out.println("Given matrix:");
        obj.display(matrix);

        // Calling the method to display transposed matrix
        System.out.println("\nTransposing matrix:");
        obj.display(obj.transposeMatrix(matrix));
    }

    public int[][] transposeMatrix(int[][] data) {       // Method to transpose a matrix
        int[][] result = new int[data[0].length][data.length];          // Creating an empty matrix to store the result

        // Creating a nested for loop to vies each element in the matrix
        for (int i = 0; i < data.length; i++) {         // Iterating through the rows of the matrix
            for (int j = 0; j < data[0].length; j++) {          // Iterating through the columns of the matrix

                result[j][i] = data[i][j];          // Here, we're transposing the matrix by interchanging the index
            }
        }
        return result;      // Returning the result
    }

    public void display(int[][] data) {         // Method to display the matrix
        for (int i = 0; i < data.length; i++) {         // Iterating through the rows of the matrix
            System.out.println(Arrays.toString(data[i]));       // Displaying each element in the matrix
        }
    }
}