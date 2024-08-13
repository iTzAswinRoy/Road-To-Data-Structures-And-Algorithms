package JavaArrayList;

import java.util.ArrayList;     // Importing array list class
import java.util.Scanner;       // Importing scanner class

// Write a Java program to update an array element by the given element.
public class ReplacingElement {
    public static void main(String[] args) {        // Main method
        ReplacingElement obj = new ReplacingElement();    // Creating an object

        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list
        System.out.println("Given array list:\n" + list);        // Displaying the list

        ArrayList<Integer> updatedList = obj.setElement(list);      // Calling the method to replace the element

        System.out.println("\nThe updated list:\n" + updatedList);    // Displaying the updated list
    }

    public ArrayList<Integer> userInputs() {        // Method to get inputs from the user
        Scanner in = new Scanner(System.in);        // Creating a scanner object

        System.out.println("Enter the size:");
        int size = in.nextInt();        // Getting the size from the user

        ArrayList<Integer> temp = new ArrayList<>(size);        // Creating a temporary array list
        System.out.println("Enter the value:");

        for (int i = 0; i < size; i++) {        // Iterating over the array list
            temp.add(in.nextInt());     // Adding elements for each iteration
        }
        return temp;        // Returning the array list
    }

    public ArrayList<Integer> setElement(ArrayList<Integer> data) {        // Method to replace the element at a specific index
        Scanner in = new Scanner(System.in);        // Creating a scanner object

        System.out.println("\nEnter the index to set a new element:");
        int index = in.nextInt();        // Getting the index from the user

        System.out.println("Enter the value of the new element:");
        data.set(index, in.nextInt());      // Replacing the element at specific element

        return data;        // Returning the updated array list
    }
}
