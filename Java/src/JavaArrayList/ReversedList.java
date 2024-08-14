package JavaArrayList;

import java.util.ArrayList;         // Importing array list class
import java.util.Scanner;          // Importing scanner class

// Write a Java program to reverse elements in an array list
public class ReversedList {
    public static void main(String[] args) {    // Main method
        ReversedList obj = new ReversedList();    // Creating an object
        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list

        System.out.println("Given list:\n"+list);
        ArrayList<Integer> reversedList = obj.reverseList(list);     // Calling the method to reverse the arraylist

        System.out.println("\nReversed list:\n" + reversedList);        // Displaying the reversed array list
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

    public ArrayList<Integer> reverseList(ArrayList<Integer> data) {        // Method to reverse the list
        ArrayList<Integer> result = new ArrayList<>();      // Creating a array list to store the result

        for (int i = data.size() - 1; i >= 0; i--) {        // Iterating over the array list

            result.add(data.get(i));        // Adding elements to the array list in reverse order
        }
        return result;      // Returning the reversed array list
    }
}
