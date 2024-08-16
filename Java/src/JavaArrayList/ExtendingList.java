package JavaArrayList;

import java.util.ArrayList;         // Importing array list class
import java.util.Scanner;          // Importing scanner class

// Write a Java program to increase an array list size.
public class ExtendingList {
    public static void main(String[] args) {        // Main method
        ExtendingList obj = new ExtendingList();        // Creating an object

        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list
        System.out.println("The given array list:\n" + list);     // Displaying the list

        obj.increaseSize(list);         // Calling the method to increase the size of the list
    }

    public ArrayList<Integer> userInputs() {        // Method to get inputs from the user
        Scanner in = new Scanner(System.in);      // Creating a scanner object

        System.out.println("Enter the size:");
        int size = in.nextInt();        // Getting the size from the user

        ArrayList<Integer> tempList = new ArrayList<>();        // Creating a temporary array list
        System.out.println("Enter the values:");

        for (int i = 0; i < size; i++) {        // Iterating over the array list
            tempList.add(in.nextInt());       // Adding elements for each iteration
        }
        return tempList;        // Returning the array list
    }

    public void increaseSize(ArrayList<Integer> list) {          // Method to increase the size of the list
        Scanner in = new Scanner(System.in);        // Creating a scanner object

        System.out.println("\nEnter the size to be increased:");
        int extraSize = in.nextInt();       // Getting the size from the user

        System.out.println("Add new elements to the list:");
        for (int i = 0; i < extraSize; i++) {        // Iterating over the array list
            list.add(in.nextInt());         // Getting the size from the user for addition size of the list
        }
        System.out.println("\nList after the size being added:\n" + list);        // Displaying the list with increased size
    }
}
