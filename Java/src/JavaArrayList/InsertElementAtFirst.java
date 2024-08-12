package JavaArrayList;

import java.util.ArrayList;     // Importing array list class
import java.util.Scanner;       // Importing scanner class

// Write a Java program to insert an element into the array list at the first position.
public class InsertElementAtFirst {
    public static void main(String[] args) {          // Main method
        InsertElementAtFirst obj = new InsertElementAtFirst();    // Creating an object
        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list

        System.out.println("Given array list:\n" + list);     // Displaying the arraylist

        obj.insertFirst(list);      // Calling the method to insert the element at first
        System.out.println("\nList after adding the element at first:\n" + list);      // Displaying the result
    }

    public ArrayList<Integer> userInputs() {     // Method to get inputs from the user
        Scanner in = new Scanner(System.in);        // Creating a scanner object

        System.out.println("Enter the size of the array list:");
        int size = in.nextInt();        // Getting the size from the user

        ArrayList<Integer> temp = new ArrayList<>(size);     // Creating a temporary array list
        System.out.println("Enter the value:");

        for (int i = 0; i < size; i++) {        // Iterating over the array list
            temp.add(in.nextInt());     // Adding elements for each iteration
        }
        return temp;        // Returning the array list
    }

    public void insertFirst(ArrayList<Integer> temp) {      // Method the insert element at firts
        Scanner in = new Scanner(System.in);        // Creating a scanner object

        System.out.println("\nEnter the element to add at first:");
        temp.add(0,in.nextInt());       // Adding element at first
    }
}
