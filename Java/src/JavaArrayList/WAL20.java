package JavaArrayList;

import java.util.ArrayList;         // Importing array list class
import java.util.Scanner;          // Importing scanner class

// Write a Java program to increase an array list size.
public class WAL20 {
    public static void main(String[] args) {    // Main method
        WAL20 obj = new WAL20();    // Creating an object

        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list
        System.out.println("The given array list:\n"+list);

        obj.increaseSize(list);
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

    public void increaseSize(ArrayList<Integer> list){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size to be increased:");
        int extraSize = in.nextInt();

        System.out.println("Add new elements to the list:");
        for (int i = 0; i < extraSize; i++) {
            list.add(in.nextInt());
        }
        System.out.println("List after the size being added:\n"+list);
    }
}
