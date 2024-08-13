package JavaArrayList;

import java.util.ArrayList;     // Importing array list class
import java.util.Scanner;       // Importing scanner class

// Write a Java program to remove the required element from an array list
public class RemovingElement {
    public static void main(String[] args) {       // Main method
        RemovingElement obj = new RemovingElement();        // Creating an object

        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list
        System.out.println("Given array list:\n" + list);     // DDisplaying the list

        ArrayList<Integer> updatedList = obj.removeElement(list);       // Calling the remove element method
        System.out.println("\nList after removing the specific index:\n" + updatedList);        // Displaying the updated list after removing the element
    }

    public ArrayList<Integer> userInputs() {          // Method to get inputs from the user
        Scanner in = new Scanner(System.in);        // Creating a scanner object

        System.out.println("Enter the size:");
        int size = in.nextInt();        // Getting the size from the user

        ArrayList<Integer> temp = new ArrayList<>(size);      // Creating a temporary array list
        System.out.println("Enter the value:");

        for (int i = 0; i < size; i++) {        // Iterating over the array list
            temp.add(in.nextInt());     // Adding elements for each iteration
        }
        return temp;        // Returning the array list
    }

    public ArrayList<Integer> removeElement(ArrayList<Integer> data) {      // Method to remove element at a specific index
        Scanner in = new Scanner(System.in);         // Creating a scanner object

        System.out.println("\nEnter the index to remove the element from the list:");
        int index = in.nextInt();       // Getting the index from the user

        data.remove(index);     // Removing element at a specific index

        return data;       // Returning the updated list
    }
}
