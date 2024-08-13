package JavaArrayList;

import java.util.ArrayList;     // Importing array list class
import java.util.Scanner;       // Importing scanner class

// Write a Java program to search for an element in an array list.
public class SearchElement {
    public static void main(String[] args) {        // Main method
        SearchElement obj = new SearchElement();      // Creating an object

        ArrayList<Integer> list = obj.userInputs();      // Creating an array list
        System.out.println("Given array list:\n" + list);

        obj.searchingElement(list);     // Calling the method to search the element
    }

    public ArrayList<Integer> userInputs() {        // Method to get inputs from the user
        Scanner in = new Scanner(System.in);        // Creating a scanner object

        System.out.println("Enter the size:");
        int size = in.nextInt();        // Getting the size from the user

        ArrayList<Integer> temp = new ArrayList<>(size);        // Creating a temporary array list
        System.out.println("Enter the value:");

        for (int i = 0; i < size; i++) {         // Iterating over the array list
            temp.add(in.nextInt());         // Adding elements for each iteration
        }
        return temp;        // Returning the array list
    }

    public void searchingElement(ArrayList<Integer> data) {     // Method to search a specific element
        Scanner in = new Scanner(System.in);        // Creating a scanner object

        System.out.println("\nEnter the element to be searched:");

        int element = in.nextInt();     // Getting the element from the user
        boolean isFound = false;        // Creating a boolean to check if its true or false

        for (int i = 0; i < data.size(); i++) {     // Iterating over the array list

            if (data.get(i) == element) {       // Checking if the list contains the specific elements

                System.out.println("\nElement is found at index " + i);     // Displaying the elements
                isFound = true;     // If it contains the required element then it assigns true
                break;      // Once the condition is reached, it exits the loops
            }
        }
        if (!isFound) {     // Checking if the element is not present in the list
            System.out.println("\nElement not found!");
        }
    }
}
