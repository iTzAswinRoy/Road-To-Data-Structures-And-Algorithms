package JavaBasics;
import java.util.ArrayList;     // Importing array list class
import java.util.Scanner;       // Importing scanner class

// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
public class FindingAverageNumber {
    public static void main(String[] args) {    // Main method
        FindingAverageNumber obj = new FindingAverageNumber();    // Creating an object to call the method

        ArrayList<Integer> array = obj.inputs();     // Storing the user-inputs in an array list
        System.out.println("Original array:\n"+array);      // Displaying the array

        int result = obj.average(array);       // Storing the average method in a variable
        System.out.println("\nThe average value of an array is " + result);     // Displaying the average value
    }

    public ArrayList<Integer> inputs() {     // Method to get inputs from the user
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        ArrayList<Integer> num = new ArrayList<>();     // Creating an ArrayList to store the inputs

        System.out.println("Enter the size:");
        int size = in.nextInt();       // Getting the values from the user

        System.out.println("Enter the values:");
        for (int i = 0; i < size; i++) {    // Iterating over the arraylist
            num.add(in.nextInt());      // Storing the values in the arraylist for each iteration
        }
        in.close();     // Closing scanner

        return num;     // Returning the inputs
    }

    public int average(ArrayList<Integer> data) {      // Method to calculate the average
        int sum = 0;      // Creating an empty variable to store the total value
        for (int i = 0; i < data.size(); i++) {     // Iterating over the arraylist
            sum += data.get(i);     // Adding the values for each iteration
        }

        return sum / data.size();     // Returning the average formula
    }
}
