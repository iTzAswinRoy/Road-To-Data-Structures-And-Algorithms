package JavaMatrix;

import java.util.Arrays;        // Importing array class

// Implement a function that multiplies a matrix by a scalar value.
public class MultiplyMatrixUsingScalarValue {
    public static void main(String[] args) {        // Main method
        MultiplyMatrixUsingScalarValue obj = new MultiplyMatrixUsingScalarValue();          // Creating an object to call the method

        // Creating a 2 by 2 matrix
        int[][] matrix = {{1,2,3,}, {4,5,6}, {7,8,9}};

        // Calling the method to display the matrix
        System.out.println("Given matrix:");
        obj.display(matrix);

        // Calling the method to multiply the matrix using scalar value
        obj.display(obj.multiplyingMatrix(matrix));
    }

    public int[][] multiplyingMatrix(int[][] data) {
        int scalarNum = 3;

        System.out.println("\nThe scalar value is " + scalarNum);       // Displaying the scalar value
        int[][] result = new int[data.length][data[0].length];       // Creating an empty matrix to store the result

        System.out.println("\nMultiplying the matrix using scalar value:");

        // Creating a nested for loop to vies each element in the matrix
        for (int i = 0; i < data.length; i++) {         // Iterating through the rows of the matrix
            for (int j = 0; j < data[0].length; j++) {          // Iterating through the columns of the matrix

                result[i][j] = data[i][j] * scalarNum;          // Multiplying each element using scalar value
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
