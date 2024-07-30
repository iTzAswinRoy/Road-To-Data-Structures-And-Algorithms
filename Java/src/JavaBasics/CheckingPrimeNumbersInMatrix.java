package JavaBasics;
import java.util.Scanner;      // Importing scanner class
// Checking if an array contains a prime number
public class CheckingPrimeNumbersInMatrix {
    public static void main(String[] args) {        // Main method
        CheckingPrimeNumbersInMatrix obj = new CheckingPrimeNumbersInMatrix();  // Creating an object

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
        int[][] arr = new int[row][column];     // Creating a 2D array to store the inputs

        for (int i = 0; i < arr.length; i++) {      // Iterating through rows
            for (int j = 0; j < arr[0].length; j++) {       // Iterating through columns
                arr[i][j] = in.nextInt();   // Assigning values to the 2D array
            }
        }
        return arr;     // Returning the 2D array
    }

    public void printArray(int[][] data) {   // Method to print the given 2D array
        System.out.println("\nHere's the entered 2D array");
        for (int i = 0; i < data.length; i++) {     // Iterating through rows
            System.out.print("[");

            for (int j = 0; j < data[0].length; j++) {      // Iterating through columns
                System.out.print(data[i][j]);   // Here it prints the 2D array value by value

                if (j < data[0].length - 1) {       // Setting comma after each value
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    public void checkingIfPrime(int[][] data) {  // Method to check if the value is prime or not
        boolean containsPrime= false;

        for (int i = 0; i < data.length; i++) {     // Iterating through rows

            for (int j = 0; j < data[0].length; j++) {      // Iterating through columns

                if (isPrime(data[i][j])) {    // Using another method to check the prime number
                    containsPrime = true;
                    break;      // If it does contain prime number then it exits the loop
                } else {
                    containsPrime = false;
                }
            }
        }
        if (containsPrime) {      // Displaying the result based on the availability of the prime number
            System.out.println("\nTrue, This 2D array contains prime number.");
        } else {
            System.out.println("\nFalse, This 2D array doesn't contains any prime numbers.");
        }
    }

    public boolean isPrime(int num) {    // Checking if the number is prime or not
        if (num <= 1) {     // Checking if the number is less than 1
            return false;   // Returns false if it reaches the condition
        }
        if (num == 2) {     // Checking if the number is equal to 2
            return true;    // Returns true if it attains the condition
        }
        if (num % 2 == 0) {     // Checking if the number is even
            return false;       // Returns false if the number is even
        }
        for (int i = 3; i < Math.sqrt(num); i += 2) {    // Iterating though the square root of the number
            if (num % i == 0) {     // Checking is the square root of the number is divisible by 1 or itself
                return false;   // Return false if the number is even
            }
        }
        return true;    // Return true if the number is divisible by 1 or itself
    }
}