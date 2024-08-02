package JavaBasics;

import java.util.ArrayList;     // Importing array list class
import java.util.Scanner;       // Importing scanner class

// Finding the largest 3 elements in an array
public class FindingLargestElements {
    public static void main(String[] args) {        // Main method
        FindingLargestElements obj = new FindingLargestElements();       // Creating an object to call the method
        ArrayList<Integer> array = obj.getInput();     // Get user input and store it in an ArrayList

        System.out.println("Given array list:\n" + array);        // Prints the ArrayList
        System.out.println("\nThe 3 largest elements are " + obj.LargestElements(array));      // Calling the Maximum array method
    }

    public ArrayList<Integer> getInput() {      // Creating an array to get the size and values
        Scanner in = new Scanner(System.in);      // Creating an object for scanner class

        System.out.println("Enter the size:");
        int size = in.nextInt();         // Getting size using scanner

        ArrayList<Integer> list = new ArrayList<>();        // Creating an instance of the class array
        System.out.println("Enter the values:");

        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());       // Adding elements to an ArrayList
        }
        in.close();     // Close the Scanner to free up memory space

        return list;     // Returning values containing ArrayList
    }

    public ArrayList<Integer> LargestElements(ArrayList<Integer> data){       // Method to find the maximum elements in an ArrayList
        ArrayList<Integer> newArray = new ArrayList<>();    // A new ArrayList to store the maximum elements
        // Creating empty variables to store the maximum numbers
        int first = 0;
        int second = 0;
        int third = 0;

        if(data == null || data.isEmpty()) {     // This ensures if the ArrayList is empty or not
            System.out.println("Array is empty!");
        }

        for (int i = 0; i < data.size(); i++) {     // Iterating over the ArrayList
            if (data.get(i) > first) {      // This condition finds out the first maximum element
                first = data.get(i);    // Getting the first maximum element
            }
        }

        for (int i = 0; i < data.size(); i++) {     // Iterating over the ArrayList
            if (data.get(i) > second && data.get(i) != first) {     // This condition finds out the second maximum element
                second = data.get(i);       // Getting the second maximum element
            }
        }

        for (int i = 0; i < data.size(); i++) {     // Iterating over the ArrayList
            if (data.get(i) > third && data.get(i) != second && data.get(i) != first) {   // This condition finds out the third maximum element
                third = data.get(i);        // Getting the first maximum element
            }
        }
        // Inserting the 3 largest element to an ArrayList
        newArray.add(first);
        newArray.add(second);
        newArray.add(third);

        return newArray;      // Returning the list containing the top 3 elements
    }
}