package JavaArrayList;

import java.util.ArrayList;         // Importing array list class
import java.util.Scanner;          // Importing scanner class

// Write a Java program to empty an array list.

public class EmptyingArrayList {
    public static void main(String[] args) {       // Main method
        EmptyingArrayList obj = new EmptyingArrayList();     // Creating an object

        ArrayList<Integer> list = obj.userInputs();        //  Creating an array list
        System.out.println("The given array list:\n"+list);      // Displaying the lists

        obj.emptyList(list);        // Calling the method to empty the array list
        System.out.println(obj.isEmpty(list));      // Calling the method to check if the list i s empty
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

        in.close();         // Closing scanner for avoid excess memory storage
        return tempList;        // Returning the array list
    }

    public void emptyList(ArrayList<Integer> list) {     // Method to empty the existing list
        System.out.println("\nEmptying the list!");

        for (int i = list.size() - 1; i >= 0; i--) {    // Iterating through the list from the last because after each removal, the elements shifts to its previous index
            list.remove(i);     // Removing elements for eave iteration
        }
    }

    public boolean isEmpty(ArrayList<Integer> list) {       // Method to check if the list is empty
        System.out.println("\nChecking if the given array list is empty.....");

        return list.isEmpty();      // Returning the boolean value to check if the list is empty or not
    }
}