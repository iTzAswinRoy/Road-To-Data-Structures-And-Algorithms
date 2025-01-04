package JavaArrayList;

import java.util.ArrayList;         // Importing array list class
import java.util.Scanner;          // Importing scanner class

// Write a Java program that swaps two elements in an array list

public class SwapElements {
    public static void main(String[] args) {     // Main method
        SwapElements obj = new SwapElements();      // Creating an object

        ArrayList<Integer> list = obj.userInputs();       //  Creating an array list
        System.out.println("Given array list:\n" + list);       // Displaying the lsit

        obj.swapList(list);     // Calling the method to swap elements in the list
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

    public void swapList(ArrayList<Integer> list) {      // Method to swap elements in the list
        System.out.println("\nEnter the elements to be swapped");
        Scanner in = new Scanner(System.in);      // Creating a scanner object

        System.out.println("Element-1:");
        int e1 = in.nextInt();      // Getting inputs from the user

        System.out.println("Element-2:");
        int e2 = in.nextInt();      // Getting inputs from the user

        //  Initializing index to -1
        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < list.size(); i++) {        // Iterating over the array list
            // Checking whether the element is present in the array
            if (list.get(i) == e1 && index1 == -1) {
                index1 = i;     // Storing the index of the specific element
            }

            if (list.get(i) == e2 && index2 == -1) {
                index2 = i;     // Storing the index of the specific element
            }
        }

        if (index1 != -1 && index2 != -1) {      // Checking if the index are in bound

            // Swapping the elements
            int temp = list.get(index1);
            list.set(index1, list.get(index2));
            list.set(index2, temp);

            System.out.println("\nList after swapping elements:\n" + list);     // Displaying the swapped list
        } else {
            System.out.println("\nElement not found!");     // Displaying the error message
        }
    }
}
