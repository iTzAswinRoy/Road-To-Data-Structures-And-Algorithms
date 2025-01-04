package JavaArrayList;

import java.util.ArrayList;         // Importing array list class
import java.util.Random;        // Importing random class
import java.util.Scanner;       // Importing scanner class

// Write a Java program to shuffle elements in an array list.

public class ShuffleElements {
    public static void main(String[] args) {        // Main method
        ShuffleElements obj = new ShuffleElements();        //Creating an object
        ArrayList<Integer> list = obj.userInputs();         // Creating a empty list to store inputs

        System.out.println("Given array list:\n" + list);       // Displaying the list

        ArrayList<Integer> shuffledList = obj.shuffle(list);        // Storing the rust in new list

        System.out.println("\nArray list after being shuffled:\n" + shuffledList);      // Displaying the shuffled list
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

    public ArrayList<Integer> shuffle(ArrayList<Integer> list) {        // Method to shuffle elements ion the array list
        Random rnd = new Random();      // Creating an object from random class

        for (int i = 0; i < list.size(); i++) {     // Iterating over the array list
            int randomValue = rnd.nextInt(i+1);     // The reason for (i + 1) is the nextInt range can't be zero, so it should start with a value

            // Shuffling by swapping the elements at index i and randomValue
            int temp = list.get(i);
            list.set(i, list.get(randomValue));
            list.set(randomValue, temp);
        }
        return list;        // Returning the swapped list
    }
}