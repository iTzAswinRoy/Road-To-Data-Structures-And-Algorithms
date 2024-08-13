package JavaArrayList;

import java.util.ArrayList;     // Importing array list class
import java.util.Scanner;       // Importing scanner class

// Write a Java program to retrieve an element (at a specified index) from a given array list.
public class RetrieveElement {
    public static void main(String[] args) {    // Main method
        RetrieveElement obj = new RetrieveElement();    // Creating an object

        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list
        System.out.println("Given list:\n" + list);       // Displaying the list

        obj.getElement(list);      // Calling the method to retrieve elements from the list
    }

    public ArrayList<Integer> userInputs() {         // Method to get inputs from the user
        Scanner in = new Scanner(System.in);        // Creating a scanner object

        System.out.println("Enter the size:");
        int size = in.nextInt();        // Getting the size from the user

        ArrayList<Integer> temp = new ArrayList<>(size);        // Creating a temporary array list
        System.out.println("Enter the value:");

        for (int i = 0; i < size; i++) {        // Iterating over the array list
            temp.add(in.nextInt());      // Adding elements for each iteration
        }
        return temp;       // Returning the array list
    }

    public void getElement(ArrayList<Integer> data) {       // Method to get element at a specific index
        Scanner in = new Scanner(System.in);        // Creating a scanner object

        System.out.println("\nEnter the index to retrieve the element from the list:");
        int index = in.nextInt();       // Getting the index from the user

        System.out.print("\nElement at index " + index + " is " + data.get(index));     // Displaying the element
    }
}
