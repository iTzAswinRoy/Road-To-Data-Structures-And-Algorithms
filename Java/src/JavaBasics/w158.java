package JavaBasics;
import java.util.Scanner;      // Importing scanner class
// Checking if an array contains a prime number
public class w158 {
    public static void main(String[] args) {
        w158 obj = new w158();  // Creating an object
        System.out.println("Enter the size of the 2d array");
        int[][] array = obj.inputArray(); // Calling the method to initialize the size of the 2D array
        obj.printArray(array);  // Printing the 2D array
        obj.checkingIfPrime(array); // Calling the method if the array contains a prime number

    }
    public int[][] inputArray() {   // This method is used to get the inputs of the 2D array
        Scanner in = new Scanner(System.in);
        System.out.println("No. of rows: ");
        int row = in.nextInt(); // Getting no. of rows from the user
        System.out.println("No of columns:");
        int column = in.nextInt();  // // Getting no. of columns from the user
        System.out.println("Enter the values for the 2d array:");
        int[][] arr = new int[row][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();   // Assigning values to the 2D array
            }
        }
        return arr;
    }
    public void printArray(int[][] data){   // Method to print the given 2D array
        System.out.println("Here's the entered 2D array");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j]+" ");   // Here it prints the 2D array value by value
            }
            System.out.println(); // New line is used to print the values to a new row
        }
    }
    public void checkingIfPrime(int[][] data){  // Method to check if the value is prime or not
        boolean containsPrime= false;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if(isPrime(data[i][j])){    // Using another method to check the prime number
                    containsPrime = true;
                    break;
                } else{
                    containsPrime = false;
                }
            }
        }
        if(containsPrime) {
            System.out.println("True, This 2D array contains prime number.");
        } else {
            System.out.println("False, This 2D array doesn't contains prime number.");
        }
    }
    public boolean isPrime(int num){    // Checking if the number is prime or not
        if(num <= 1 ) {
            return false;
        }
        return true;
    }
}