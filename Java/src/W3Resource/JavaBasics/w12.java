package W3Resource.JavaBasics;
import java.util.ArrayList;
import java.util.Scanner;
// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
public class w12 {
    public static void main(String[] args) {
        w12 obj = new w12();    // Creating an object to call the method
        ArrayList<Integer> array = obj.inputs();     // Storing the user-inputs in an array list
        int result = obj.average(array);       // Storing the average method in a variable
        obj.print(result);      // Calling the print method
    }
    public ArrayList<Integer> inputs(){     // Method to get inputs from the user
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        ArrayList<Integer> num = new ArrayList<>();     // Creating an ArrayList to store the inputs
        System.out.println("Enter the size of the array:");
        int size = in.nextInt();       // Getting the values from the user
        System.out.println("Enter the values of the array:");
        for (int i = 0; i < size; i++) {    // Iterating over the arraylist
            num.add(in.nextInt());      // Storing the values in the arraylist for each iteration
        }
        in.close();     // Closing scanner
        return num;     // Returning the inputs
    }
    public int average(ArrayList<Integer> data){      // Method to calculate the average
        int sum = 0;      // Creating an empty variable to store the total value
        for (int i = 0; i < data.size(); i++) {     // Iterating over the arraylist
            sum += data.get(i);     // Adding the values for each iteration
        }
        return sum / data.size();     // Returning the average formula
    }
    public void print(int ans){     // Method to display the output
        System.out.println("The average of an array is "+ans);
    }
}
