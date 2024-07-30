package JavaBasics;
import java.util.Scanner;       // Importing scanner class
// Transposing an array
public class ArrayTranspose {
    public static void main(String[] args) {       // Main method
        ArrayTranspose obj = new ArrayTranspose();      // Creating an object to call the methods
        int[][] arr = obj.userInputs();       // Assigning the values for a 2D array

        System.out.println("\nGiven 2D array:");
        obj.printArray(arr);    // Displaying the 2D array

        System.out.println("\nAfter transposing the array: ");
        obj.printArray(obj.transposeArray(arr));    // Calling the method inside the method inorder to transverse the array
    }

    public int[][] userInputs() {       // Method to get inputs from the user
        Scanner in = new Scanner(System.in);       // Creating a scanner object

        System.out.println("Enter the number of rows:");
        int rows = in.nextInt();    // Storing no. of rows

        System.out.println("Enter the number of columns:");
        int column = in.nextInt();      // Storing ni. of columns

        int[][] matrix = new int[rows][column];     // Creating an empty 2D array to store the values
        System.out.println("Enter the values of the 2D array:");

        for (int i = 0; i < rows; i++) {      // Iterating through rows

            for (int j = 0; j < column; j++) {      // Iterating through columns
                matrix[i][j] = in.nextInt();    // Assigning values to each index
            }
        }
        return matrix;      // Returning the 2D array
    }

    public int[][] transposeArray(int[][] data) {     // Creating a method to transpose the array
        int[][] new_arr = new int[data[0].length][data.length];      // Creating a new array were the rows and columns are swapped

        for (int i = 0; i < data.length; i++) {       // Iterating through the rows

            for (int j = 0;j < data[0].length; j++) {    // Iterating through the columns
                new_arr[j][i] = data[i][j];     // Storing the values in a new array
            }
        }
        return new_arr;     // Returning the transposed array
    }

    public void printArray(int[][] data) {      // Creating a method to print the array
        for (int i = 0; i < data.length; i++) {     // Iterating through the rows
            System.out.print("[");

            for (int j = 0; j < data[0].length; j++) {      // Iterating through the columns
                System.out.print(data[i][j]);      // Printing the values for each values in the 2D array

                if (j < data[0].length - 1) {       // Setting comma after each value
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}