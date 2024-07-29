package JavaBasics;
import java.util.Scanner;     // Importing scanner class
// Finding the first letter in an 2D array
public class FirstLetterInMatrix {
    public static void main(String[] args) {    // Main method
        FirstLetterInMatrix obj = new FirstLetterInMatrix();  // Creating an object to call the method
        String[][] array = obj.gettingSize();  // Creating an empty array

        obj.userInputs(array);      // Calling the method to get inputs from the user
        obj.FindingLetters(array);      // Calling the method to find the first letter in the matrix
    }

    public String[][] gettingSize() {       // Method to initialize the size of the matrix
        Scanner in = new Scanner(System.in);        // Creating a scanner object

        System.out.println("Enter the number of rows: ");
        int rows = in.nextInt();    // Getting inputs from the user to initialize the rows

        System.out.println("Enter the number of columns: ");
        int columns = in.nextInt();     // Getting inputs from the user to initialize the column

        return new String[rows][columns];     // Returning the rows and columns by creating a new matrix variable
    }

    public void userInputs(String[][] arr) {      // Method to initialize the String
        int rows = arr.length;      // Initializing the size of the row
        int column = arr[0].length;     // Initializing the size of the column

        Scanner in = new Scanner(System.in);    // Creating a scanner object

        System.out.println("Enter the String: ");
        for (int i = 0; i < rows; i++) {      // Iterating over an 2D array to get the string
            for (int j = 0; j < column; j++) {
                arr[i][j] = in.nextLine();      // Assigning a string to each matrix variable
            }
        }
    }

    public void FindingLetters(String[][] data){      // Method to iterate over the Matrix array
        int rows = data.length;     // Initializing the size of the row
        int column = data[0].length;       // Initializing the size of the column

        char[][] result = new char[rows][column];       // Creating a char array to store the first letter
        for (int i = 0; i < rows; i++) {
            System.out.print("[");

            for (int j = 0; j < column; j++) {
                result[i][j] = data[i][j].charAt(0);    // Storing the first letter from a string
                System.out.print(result[i][j]);     // Printing the result for each index

                if (j < column-1) {     // Placing comma until it reaches the end of the column
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}