package JavaBasics;
import java.util.Scanner;     // Importing scanner class
// Finding the first letter in an 2D array
public class FirstLetterInMatrix {
    public static void main(String[] args) {        // Main method
        FirstLetterInMatrix obj = new FirstLetterInMatrix();      // Creating an object to call the method
        String[][] array = obj.userInputs();       // Calling the method to get inputs from the user

        System.out.println("\nGiven string array:");
        obj.printArray(array);      // DDisplaying the array

        System.out.println("\nFinding the first letter in the array:");
        obj.printArray(obj.findingLetters(array));      // Calling the method to find the first letter in the matrix
    }

    public String[][] userInputs() {       // Method to initialize the size of the matrix
        Scanner in = new Scanner(System.in);        // Creating a scanner object

        System.out.println("Enter the number of rows: ");
        int rows = in.nextInt();    // Getting inputs from the user to initialize the rows

        System.out.println("Enter the number of columns: ");
        int columns = in.nextInt();     // Getting inputs from the user to initialize the column

        in.nextLine();  // Changing the newline character

        String[][] new_array = new String[rows][columns];
        System.out.println("Enter the String: ");
        for (int i = 0; i < rows; i++) {      // Iterating over an 2D array to get the string
            for (int j = 0; j < columns; j++) {
                new_array[i][j] = in.nextLine();      // Assigning a string to each matrix variable
            }
        }
        in.close();     // Closing scanner to avoid excess memory usage

        return new_array;     // Returning the rows and columns by creating a new matrix variable
    }

    public String[][] findingLetters(String[][] data) {      // Method to iterate over the Matrix array
        int rows = data.length;     // Initializing the size of the row
        int column = data[0].length;       // Initializing the size of the column

        String[][] result = new String[rows][column];       // Creating a char array to store the first letter
        for (int i = 0; i < rows; i++) {    // Iterating through rows

            for (int j = 0; j < column; j++) {      // Iterating through columns
                result[i][j] = Character.toString(data[i][j].charAt(0));    // Storing the first letter from a string
            }
        }
        return result;      // Returning the results containing only the first letter of each string
    }

    public void printArray(String[][] data) {      // Creating a method to print the array
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