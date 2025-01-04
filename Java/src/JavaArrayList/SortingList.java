package JavaArrayList;

import java.util.ArrayList;     // Importing array list class
import java.util.Scanner;       // Importing scanner class

//Write a Java program to sort a given array list.

public class SortingList {
    public static void main(String[] args) {        // Main method
        SortingList obj = new SortingList();       // Creating an object

        ArrayList<String> list = obj.userInputs();        // Creating an array list
        System.out.println("Given array list:\n" + list);

        ArrayList<String> sortedList = obj.sortArrayList(list);     // Storing the sorted list
        System.out.println("\nSorted array list:\n" + sortedList);      // Displaying the updated list
    }

    public ArrayList<String> userInputs() {     // Method to get inputs from the user
        Scanner in = new Scanner(System.in);        // Creating a scanner object

        System.out.println("Enter the size of the list:");
        int size = in.nextInt();        // Getting the size from the user

        in.nextLine();      // Consume the newline after nextInt()

        ArrayList<String> newArrayList = new ArrayList<>(size);     // Creating a temporary array list
        System.out.println("Enter the string in the array list:");

        for (int i = 0; i < size; i++) {        // Iterating over the array list
            newArrayList.add(in.next());        // Adding elements for each iteration
        }
        in.close();     // Closing scanner for avoid excess memory storage

        return newArrayList;        // Returning the array list
    }

    public ArrayList<String> sortArrayList(ArrayList<String> list) {     // Method to sort the array list
        // Using bubble sort
        for (int i = 0; i < list.size() - 1; i++) {       // Iterating over the array list

            for (int j = 0; j < list.size() - i - 1; j++) {     // Reducing the size for each sort elements

                if (list.get(j).charAt(0) > list.get(j + 1).charAt(0)) {        // Checking if the element is greater or not

                    // Swapping elements using array list with the help of set and get methods
                    String temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
        return list;     // Returning the sorted list
    }
}
