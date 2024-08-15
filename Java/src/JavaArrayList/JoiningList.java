package JavaArrayList;

import java.util.ArrayList;         // Importing array list class
import java.util.Scanner;          // Importing scanner class

// Write a Java program to join two array lists.
public class JoiningList {
    private int count = 1;      // Initializing count in main class

    public static void main(String[] args) {    // Main method
        JoiningList obj = new JoiningList();    // Creating an object

        ArrayList<Integer> list1 = obj.userInputs();     //  Creating an array list 1
        ArrayList<Integer> list2 = obj.userInputs();     //  Creating an array list 2

        // Displaying the lists
        System.out.println("The given array list are");
        System.out.println("List-1:\n" + list1);
        System.out.println("\nList-2:\n" + list2);

        System.out.println("\nJoined array list:\n" + obj.joinList(list1, list2));      // Calling the method to join both the lists
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
        System.out.println();
        count++;        // Incrementing count by 1
        return tempList;        // Returning the array list
    }

    public ArrayList<Integer> joinList(ArrayList<Integer> list1, ArrayList<Integer> list2) {      // Method to join two different lists
        ArrayList<Integer> newList = new ArrayList<>();     // Creating a new list

        for (int i = 0; i < (list1.size() + list2.size()); i++) {       // Initializing null values to the entire new list.
            newList.add(null);      // Because we can't set values to an empty list. This avoids IndexOutOfBound exception.
        }
        for (int i = 0; i < list1.size(); i++) {
            newList.set(i, list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            newList.set(i + list1.size(), list2.get(i));
        }
        return newList;
    }
}
