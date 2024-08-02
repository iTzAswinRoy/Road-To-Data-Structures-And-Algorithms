package JavaBasics;

import java.util.ArrayList;     // Importing array list class
import java.util.Scanner;       // Importing Scanner class

// Finding the smallest 3 elements in an ArrayList
public class FindingSmallestElements {
    public static void main(String[] args) {        // Main method
        FindingSmallestElements obj = new FindingSmallestElements();       // Creating an object to call the method
        ArrayList<Integer> array = obj.getInput();        // Get user input and store it in an ArrayList

        System.out.println("Given array list:\n" + array);        // Displaying the ArrayList
        System.out.println("The 3 smallest elements are " + obj.minimumElements(array));       // Calling the method to find the smallest 3 elements
    }

    public ArrayList<Integer> getInput() {      // Creating an array to get the size and values
        Scanner in = new Scanner(System.in);     // Creating an object for scanner class

        System.out.println("Enter the size of the array:");
        int size = in.nextInt();        // Getting size using scanner

        ArrayList<Integer> list = new ArrayList<>();     // Creating an instance of the class array
        System.out.println("Enter the values of the array:");

        for (int i = 0; i < size; i++) {
            int element = in.nextInt();
            list.add(element);       // Adding elements to an ArrayList
        }
        in.close();     // Close the Scanner to free up resources

        return list;     // Returning values containing ArrayList
    }

    public ArrayList<Integer> minimumElements(ArrayList<Integer> data) {      // Method to find the minimum elements in an ArrayList
        ArrayList<Integer> newArray = new ArrayList<>();      // A new ArrayList to store the minimum elements
        // Creating variable to store maximum integer value
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        if(data == null || data.isEmpty()) {       // This ensures if the ArrayList is empty or not
            System.out.println("Array is empty.");
        }

        for (int i = 0; i < data.size(); i++) {     // Iterating over the ArrayList
            if (data.get(i) < first) {      // This condition finds out the first smallest element
                first = data.get(i);        // Getting the first smallest element
            }
        }

        for (int i = 0; i < data.size(); i++) {     // Iterating over the ArrayList
            if (data.get(i) < second && data.get(i) != first) {     // This condition finds out the second-smallest element
                second = data.get(i);       // Getting the first smallest element
            }
        }

        for (int i = 0; i < data.size(); i++) {     // Iterating over the ArrayList
            if (data.get(i) < third && data.get(i) != second && data.get(i) != first) {       // This condition finds out the third-smallest elements
                third = data.get(i);        // Assigning the first smallest element
            }
        }
        // Inserting the 3 smallest element to an ArrayList
        newArray.add(first);
        newArray.add(second);
        newArray.add(third);

        return newArray;        // Returning arraylist containing last 3 smallest elements
    }
}
