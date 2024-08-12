package JavaArrayList;

import java.util.ArrayList;     // Importing array list class
import java.util.Scanner;       // Importing scanner class

// Write a Java program to insert an element into the array list at the first position.
public class WAL3 {
    public static void main(String[] args) {          // Main method
        WAL3 obj = new WAL3();    // Creating an object
        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list

        System.out.println("List containing name of colours:" + list);     // Displaying the arraylist

        obj.insertElementAtFirst(list);      // Calling the method to insert the element at first
        System.out.println("\nList after adding the element:" + list);      // Displaying the result

    }

    public ArrayList<Integer> userInputs(){     // Method to get inputs from the user
        Scanner in = new Scanner(System.in);        // Creating a scanner object

        System.out.println("Enter the size of the array list:");
        int size = in.nextInt();

        ArrayList<Integer> temp = new ArrayList<Integer>(size);
        System.out.println("Enter the value:");

        for (int i = 0; i < size; i++) {
            temp.add(in.nextInt());
        }
        return temp;
    }

    public void insertElementAtFirst(ArrayList<Integer> temp){
        Scanner in = new Scanner(System.in);

        System.out.println("\nEnter the element to add at the first:");
        temp.add(0,in.nextInt());
    }
}
