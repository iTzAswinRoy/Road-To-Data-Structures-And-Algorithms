package JavaArrayList;

import java.util.ArrayList;         // Importing array list class
import java.util.Scanner;          // Importing scanner class

// Write a Java program to print the element of an ArrayList using the elements' position.
public class FindingElementsPosition {
    public static void main(String[] args) {      // Main method
        FindingElementsPosition obj = new FindingElementsPosition();      // Creating an object

        ArrayList<Integer> list = obj.userInputs();       //  Creating an array list
        System.out.println("The given array list:\n" + list);

        obj.elementPosition(list);      // Calling the method to find the elements position
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

    public void elementPosition(ArrayList<Integer> list) {      // Method to find the elements position
        Scanner in = new Scanner(System.in);        // Creating a scanner object

        System.out.println("\nEnter the position of the element:");
        int index = in.nextInt();        // Getting the inputs from the user

        if (index > list.size()) {        // Checking if the index is withing the range
            System.out.println("\nIndex out of bound!");
        } else {
            System.out.println("\nThe element which is present at position " + index + ":\n" + list.get(index));        // Displaying the position of the element
        }
    }
}
