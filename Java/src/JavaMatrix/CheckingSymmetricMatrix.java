package JavaMatrix;

import java.util.Arrays;        // Importing array class

// Determine if a given matrix is symmetric.
public class CheckingSymmetricMatrix {
    public static void main(String[] args) {         // Main method
        CheckingSymmetricMatrix obj = new CheckingSymmetricMatrix();        // Creating an object to call the method

        // Creating a 2 by 2 matrix
        int[][] matrix1 = {{1,2,3}, {2,5,4}, {3,4,5}};
        int[][] matrix2 = {{1,0,0}, {0,1,0}, {0,2,1}};

        System.out.println("Given matrix:");

        // Calling the method to display the matrix - 1
        System.out.println("Matrix - 1:");
        obj.display(matrix1);

        // Calling the method to display the matrix - 2
        System.out.println("\nMatrix - 2:");
        obj.display(matrix2);


        // Calling the method to check if the given matrix is symmetric.
        System.out.println("\nChecking if the matrix - 1 is symmetric:\n" + obj.checkingSymmetric(matrix1));
        System.out.println("\nChecking if the matrix - 2 is symmetric:\n" + obj.checkingSymmetric(matrix2));
    }

    public boolean checkingSymmetric(int[][] data) {        // Method to check if the given matrix is symmetric.

        // Creating a nested for loop to view each element in the matrix
        for (int i = 0; i < data.length; i++) {        // Iterating through the rows of the matrix
            for (int j = 0; j < data[0].length; j++) {         // Iterating through the columns of the matrix
                // Checking if the matrix is symmetric
                if(data[i][j] != data[j][i]) {
                    return false;       // Returns false if the elements are not same
                }
            }
        }
        return true;        // Finally returns true if the all elements are same
    }

    public void display(int[][] data) {         // Method to display the matrix
        for (int i = 0; i < data.length; i++) {         // Iterating through the rows of the matrix
            System.out.println(Arrays.toString(data[i]));       // Displaying each element in the matrix
        }
    }
}