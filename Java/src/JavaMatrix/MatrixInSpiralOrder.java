package JavaMatrix;

import java.util.Arrays;        // Importing array class

// Print the elements of a matrix in spiral order.
public class MatrixInSpiralOrder {
    public static void main(String[] args) {        // Main method
        MatrixInSpiralOrder obj = new MatrixInSpiralOrder();          // Creating an object to call the method

        // Creating a 2 by 2 matrix
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}, {13,14,15}};

        // Calling the method to display the matrix
        System.out.println("Given matrix:");
        obj.display(matrix);

        // Calling the method to display the matrix in spiral order
        System.out.println("\nDisplaying matrix in spiral order:");
        obj.spiralOrder(matrix);
    }

    public void spiralOrder(int[][] data) {         // Method to display the matrix in spiral order
        // Creating a nested for loop to vies each element in the matrix

        // Creating a nested for loop to vies each element in the matrix
        for (int i = 0; i < data.length; i++) {         // Iterating through the rows of the matrix
            for (int j = 0; j < data[0].length; j++) {          // Iterating through the columns of the matrix

                System.out.print(data[i][j] + " ");         // Displaying each element in the matrix
            }
        }
    }

    public void display(int[][] data) {         // Method to display the matrix
        for (int i = 0; i < data.length; i++) {         // Iterating through the rows of the matrix
            System.out.println(Arrays.toString(data[i]));       // Displaying each element in the matrix
        }
    }
}