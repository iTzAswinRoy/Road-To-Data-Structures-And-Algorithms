package JavaMatrix;

import java.util.Arrays;        // Importing array class

// Find the sum of the elements on the primary and secondary diagonals of a square matrix.
public class SumOfDiagonalMatrix {
    public static void main(String[] args) {       // Main method
        SumOfDiagonalMatrix obj = new SumOfDiagonalMatrix();          // Creating an object to call the method

        // Creating a 2 by 2 matrix
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};

        // Calling the method to display the matrix
        System.out.println("Given matrix:");
        obj.display(matrix);

        // Calling the method to find the sum of diagonal elements in a matrix
        System.out.println("\nFinding the sum of primary and secondary diagonal of the matrix:");
        obj.sumOfDiagonal(matrix);
    }

    public void sumOfDiagonal(int[][] data) {        // Method to find the sum of diagonal elements in a matrix

        // Creating a integer variable to sore the results
        int primary = 0;
        int secondary = 0;

        // Creating a nested for loop to view each element in the matrix
        for (int i = 0; i < data.length; i++) {        // Iterating through the rows of the matrix
            for (int j = 0; j < data[0].length; j++) {         // Iterating through the columns of the matrix
                // Checking if the element is in diagonal
                if (i == j) {
                    primary += data[i][j];      // Adding the primary values in diagonal
                }
            }
            secondary += data[i][data.length - 1 - i];       // Adding the secondary values in diagonal
        }
        // Displaying the results
        System.out.println("Primary:\n" + primary);
        System.out.println("Secondary:\n" + secondary);
    }

    public void display(int[][] data) {         // Method to display the matrix
        for (int i = 0; i < data.length; i++) {         // Iterating through the rows of the matrix
            System.out.println(Arrays.toString(data[i]));       // Displaying each element in the matrix
        }
    }
}
