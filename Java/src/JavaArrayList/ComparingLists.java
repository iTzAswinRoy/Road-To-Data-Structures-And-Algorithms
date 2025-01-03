package JavaArrayList;

import java.util.ArrayList;         // Importing array list class
import java.util.Scanner;          // Importing scanner class

//Write a Java program to compare two array lists.
public class ComparingLists {
    private int count = 1;      // Initializing count in main class

    public static void main(String[] args) {    // Main method
        ComparingLists obj = new ComparingLists();    // Creating an object

        ArrayList<Integer> list1 = obj.userInputs();     //  Creating an array list
        ArrayList<Integer> list2 = obj.userInputs();     //  Creating an array list

        System.out.println("\nThe given array lists are");
        System.out.println("List-1:\n" + list1);        // Displaying list 1
        System.out.println("\nList-2:\n" + list2);      // Displaying list 2

        System.out.println("\nChecking whether the elements in the list are same: " + obj.compareList(list1, list2));       // Calling the method to find both the list are same
    }

    public ArrayList<Integer> userInputs() {        // Method to get inputs from the user
        Scanner in = new Scanner(System.in);      // Creating a scanner object

        System.out.println("Enter the size for list " + count + ":");
        int size = in.nextInt();        // Getting the size from the user

        ArrayList<Integer> tempList = new ArrayList<>();        // Creating a temporary array list
        System.out.println("Enter the values:");

        for (int i = 0; i < size; i++) {        // Iterating over the array list
            tempList.add(in.nextInt());       // Adding elements for each iteration
        }
        count++;       // Incrementing count by 1

        return tempList;        // Returning the array list
    }

    public boolean compareList(ArrayList<Integer> list1, ArrayList<Integer> list2) {        // Method to check if the elements are same in both the lists
        return list1.equals(list2);     // Returning the condition to check the elements
    }
}