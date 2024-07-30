package JavaBasics;
import java.util.Scanner;       // Importing scanner class
// Transversing an array from 3D to 2D
public class w155 {
    public static void main(String[] args) {       // Main method
        w155 obj = new w155();      // Creating an object to call the methods
        int[][] arr = obj.userInputs();       // Assigning the values for a 2D array

        System.out.println("\nGiven 3D array:");
        obj.printArray(arr);

        System.out.println("\nAfter transversing an array from 3D to 2D: ");
        obj.printArray(obj.transposeArray(arr));    // Calling the method inside the method inorder to transverse the array
    }

    public int[][] userInputs(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = in.nextInt();

        System.out.println("Enter the number of columns:");
        int column = in.nextInt();

        int[][] matrix = new int[rows][column];
        System.out.println("Enter the values of the 3D array:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < column; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        return matrix;
    }

    public int[][] transposeArray(int[][] data){     // Creating a method to transpose the array
        int[][] new_arr = new int[data[0].length][data.length];      // Creating a new array were the rows and columns are swapped

        for (int i = 0; i < data.length; i++) {       // Iterating through the rows

            for (int j = 0;j < data[0].length; j++){    // Iterating through the columns
                new_arr[j][i] = data[i][j];     // Storing the values in a new array
            }
        }
        return new_arr;     // Returning the transposed array
    }

    public void printArray(int[][] data) {      // Creating a method to print the array
        for (int i = 0; i < data.length; i++) {     // Iterating through the rows
            System.out.print("[");

            for (int j = 0; j < data[0].length; j++) {      // Iterating through the columns
                System.out.print(data[i][j]);      // Printing the values side by side

                if(j < data[0].length - 1){
                    System.out.print(", ");
                }
            }
            System.out.println("]");       // Printing the values one below the other
        }
    }
}
