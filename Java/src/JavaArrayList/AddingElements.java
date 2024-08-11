package JavaArrayList;

import java.util.ArrayList;     // Importing array list class
import java.util.Scanner;       // Importing scanner class

// Write a Java program to create an array list, add some colors (strings) and print out the collection.
public class AddingElements {
    public static void main(String[] args) {      // Main method
        AddingElements obj = new AddingElements();    // Creating an object
        ArrayList<String> list = obj.userInputs();     //  Creating an array list

        System.out.println("\nList containing name of colours:\n" + list);      // Displaying the array list
    }

    public ArrayList<String> userInputs() {     // Method to get inputs from the user
        Scanner in = new Scanner(System.in);    // Creating a scanner object

        System.out.println("Enter the size of the array list:");
        int size = in.nextInt();    // Getting the size
        in.nextLine();      // Changing the integer input type to string

        ArrayList<String> temp = new ArrayList<String>(size);       // Creating a temporary list to store elements
        System.out.println("Enter the colour name:");

        for (int i = 0; i < size; i++) {    // Iterating over the list
            temp.add(in.nextLine());    // Adding elements to the list for each iteration
        }
        in.close();     // Closing scanner to save memory storage

        return temp;    // Returning the user inputs
    }
}
