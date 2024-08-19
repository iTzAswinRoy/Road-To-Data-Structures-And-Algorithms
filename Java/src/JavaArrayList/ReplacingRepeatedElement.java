package JavaArrayList;

import java.util.ArrayList;     // Importing array list class
import java.util.Scanner;       // Importing scanner class

// Write a Java program to update an array element by replacing the repeated elements.
public class ReplacingRepeatedElement {
    public static void main(String[] args) {        // Main method
        ReplacingRepeatedElement obj = new ReplacingRepeatedElement();    // Creating an object

        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list
        System.out.println("Given array list:\n" + list);        // Displaying the list

        obj.replacingElement(list);         // Calling the method to replace the repeated elements
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

    public void replacingElement(ArrayList<Integer> list) {        // Method to replace the repeated elements
        Scanner in = new Scanner(System.in);        // Creating a scanner object

        System.out.println("\nSelect an element from the list:");
        int element = in.nextInt();       // Getting the inputs from the user

        System.out.println("\nEnter the element to be replaced:");
        int replaceElement = in.nextInt();       // Getting the inputs from the user

        for (int i = 0; i < list.size(); i++) {     // Iterating over the array list
            if (element == list.get(i)) {       // Checking if the elements is present in the list
                list.set(i, replaceElement);        // Replacing the repeated elements
            }
        }
        System.out.println("\nList after being replaced by a specified element:\n" + list);     // Displaying the list after replacing element
    }
}