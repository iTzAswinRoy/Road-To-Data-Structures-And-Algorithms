package JavaArrayList;

import java.util.ArrayList;         // Importing array list class
import java.util.Scanner;          // Importing scanner class

// Write a Java program to clone an array list to another array list.
public class CloneList {
    public static void main(String[] args) {     // Main method
        CloneList obj = new CloneList();     // Creating an object

        ArrayList<Integer> list = obj.userInputs();      //  Creating an array list
        System.out.println("The given array list:\n" + list);     // Displaying the array list

        ArrayList<Integer> result = obj.cloneList(list);        // Storing the result in new array list
        System.out.println("\nCloned array list:\n" + result);     // Displaying the cloned list
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
        in.close();       // Closing scanner for avoid excess memory storage

        return tempList;      // Returning the array list
    }

    public ArrayList<Integer> cloneList(ArrayList<Integer> list) {       // Method to clone the existing list
        ArrayList<Integer> newList = new ArrayList<>();     // Creating a new list

        for (int i = 0; i < list.size(); i++) {     // Iterating over the array list
            newList.add(i, list.get(i));        // Adding elements to the new list
        }
        return newList;     // Returning the cloned list
    }
}
