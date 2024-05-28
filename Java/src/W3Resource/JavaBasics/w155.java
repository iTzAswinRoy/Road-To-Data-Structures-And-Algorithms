package W3Resource.JavaBasics;
// Transversing an array from 3D to 2D
public class w155 {
    public static void main(String[] args) {
        int[][] arr = {{10,20,33},
                {40,50,60}}; // Assigning the values for a 2D array
        w155 obj = new w155(); // Creating an object to call the methods
        obj.transposeArray(arr);
        obj.printArray(obj.transposeArray(arr)); // Calling the method inside the method
    }
        public int[][] transposeArray(int[][] data){ // Creating a method to transpose the array
            int[][] new_arr = new int[data[0].length][data.length]; // Creating a new array were the rows and columns are swapped
            for (int i = 0; i < data.length; i++) { // Iterating through the rows
                for (int j = 0;j < data[0].length; j++){ // Iterating through the columns
                    new_arr[j][i] = data[i][j]; // Storing the values in a new array
                }
            }
            return new_arr;
        }
    public void printArray(int[][] data) { // Creating a method to print the array
        for (int i = 0; i < data.length; i++) { // Iterating through the rows
            for (int j = 0; j < data[0].length; j++) { // Iterating through the columns
                System.out.print(data[i][j] + " "); // Printing the values side by side
            }
            System.out.println(); // Printing the values one below the other
        }
    }
}
