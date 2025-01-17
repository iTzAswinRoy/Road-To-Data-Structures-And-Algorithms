package JavaMatrix;

import java.util.Arrays;        // Importing array class

// Write a function that checks if a given matrix is an identity matrix.
public class CheckingIdentityMatrix {
    public static void main(String[] args) {        // Main method
        CheckingIdentityMatrix obj = new CheckingIdentityMatrix();      // Creating an object to call the method

        // Creating a 2 by 2 matrix
        int[][] matrix1 = {{1,0,0}, {0,1,0}, {0,0,1}};
        int[][] matrix2 = {{1,0,0}, {0,1,0}, {0,2,1}};

        System.out.println("Given matrix:");

        // Calling the method to display the matrix - 1
        System.out.println("Matrix - 1:");
        obj.display(matrix1);

        // Calling the method to display the matrix - 2
        System.out.println("\nMatrix - 2:");
        obj.display(matrix2);

        // Calling the method to check if a given matrix is an identity matrix.
        System.out.println("\nChecking if the matrix - 1 is a identity matrix:\n" + obj.checkIdentityMatrix(matrix1));
        System.out.println("\nChecking if the matrix - 2 is a identity matrix:\n" + obj.checkIdentityMatrix(matrix2));
    }

    public boolean checkIdentityMatrix(int[][] data) {       // Method to check if a given matrix is an identity matrix.

        // Creating a nested for loop to view each element in the matrix
        for (int i = 0; i < data.length; i++) {        // Iterating through the rows of the matrix
            for (int j = 0; j < data[0].length; j++) {         // Iterating through the columns of the matrix

                // Checking the matrix is an identity matrix.
                if (data[i][i] != 1 || (i != j && data[i][j] != 0)) {
                    return false;        // Returns false
                }
            }
        }
        return true;        // Returns true
    }

    public void display(int[][] data) {         // Method to display the matrix
        for (int i = 0; i < data.length; i++) {         // Iterating through the rows of the matrix
            System.out.println(Arrays.toString(data[i]));       // Displaying each element in the matrix
        }
    }
}