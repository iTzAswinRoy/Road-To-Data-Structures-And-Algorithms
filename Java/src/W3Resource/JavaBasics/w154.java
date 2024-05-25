package W3Resource.JavaBasics;
import java.util.Scanner;
// Finding the first letter in an 2D array
public class w154 {
    public static void main(String[] args) {
        w154 obj = new w154(); // Creating an object to call the method
        String[][] array = obj.size(); // Creating an empty array
        obj.input(array);
        obj.iterator(array);

    }
    public String[][] size(){   // Method to initialize the size of the matrix
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = in.nextInt(); // Getting inputs from the user to initialize the rows
        System.out.println("Enter the number of columns: ");
        int columns = in.nextInt(); // Getting inputs from the user to initialize the column
        return new String[rows][columns];
    }
    public void input(String[][] arr){  // Method to initialize the String
        int rows = arr.length;
        int column = arr[0].length;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");
        for(int i = 0; i < rows; i++){ // Iterating over an 2D array to get the string
            for(int j =0; j < column; j++){
                arr[i][j] = in.nextLine();
            }
        }
    }
    public void iterator(String[][] data){ // Method to iterate over the Matrix array
        int rows = data.length;
        int column = data[0].length;
        char[][] result = new char[rows][column]; // Creating a char array to store the first letter
        for(int i = 0; i < rows; i++){
            System.out.print("[");
            for (int j = 0; j < column; j++) {
                result[i][j] = data[i][j].charAt(0); // Storing the first letter from a string
                System.out.print(result[i][j]);
                if(j < column-1){
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
