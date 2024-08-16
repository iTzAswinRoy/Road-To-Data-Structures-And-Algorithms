package JavaArrayList;

import java.util.ArrayList;         // Importing array list class
import java.util.Scanner;          // Importing scanner class

// Write a Java program for trimming the capacity of an array list
public class TrimmingElements {
    public static void main(String[] args) {        // Main method
        TrimmingElements obj = new TrimmingElements();      // Creating an object

        ArrayList<Integer> list = obj.userInputs();         //  Creating an array list
        System.out.println("Given list:\n" + list);     // Displaying the list

        obj.trimmingList(list);       // Calling the method to trim the list
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

    public void trimmingList(ArrayList<Integer> list) {         // Method to trim the given list
        Scanner in = new Scanner(System.in);        // Creating a scanner object

        System.out.println("\nEnter the size to trim the list:");
        int size = in.nextInt();         // Getting the size from the user

        if (size > list.size()){        // Checking if the size is less than the size of the list
            System.out.println("\nInvalid size!");

        } else {
            for (int i = list.size()-1; i >= size ; i--) {      // Iterating over the array list
                list.remove(i);     // Removing the elements from the last
            }
        }
        System.out.println("\nList after trimming the size of the elements:\n" + list);     // Displaying the trimmed list
    }
}
