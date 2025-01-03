package JavaArrayList;

import java.util.ArrayList;       // Importing scanner class
import java.util.Scanner;       // Importing scanner class

// Write a Java program to extract a portion of an array list.
public class ExtractingList {
    public static void main(String[] args) {        // Main method
        ExtractingList obj = new ExtractingList();     // Creating an object

        ArrayList<Integer> list = obj.userInputs();         //  Creating an array list
        System.out.println("Given list:" + list);

        obj.extractList(list);
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

    public void extractList(ArrayList<Integer> list) {      // Method to extract a range from the list
        Scanner in = new Scanner(System.in);        // Creating a scanner object
        System.out.println("\nEnter the starting and ending index to extract the elements from the list");

        System.out.println("Enter index 1:");
        int i1 = in.nextInt();      // Getting user inputs

        System.out.println("Enter index 2:");
        int i2 = in.nextInt();       // Getting user inputs

        if (i1 > list.size() || i2 > list.size() ) {      // Condition to check whether the index is not out of bound
            System.out.println("\nIndex out of bound!");      // Error message

        } else if (i1 < i2) {        // Checking if the index is within the range of index 2
            System.out.println("\nList from given index " + i1 + " and " + i2 + ":");

            for (int i = i1; i <= i2; i++) {        // Iterating over the array list
                System.out.print(list.get(i) + " ");      // Displaying the list from given range
            }
        } else {
            System.out.println("\nList from given index " + i1 + " and " + i2 + ":");

            for (int i = i2; i <= i1; i++) {        // Iterating over the array list
                System.out.print(list.get(i) + " ");      // Displaying the list from given range
            }
        }
    }
}