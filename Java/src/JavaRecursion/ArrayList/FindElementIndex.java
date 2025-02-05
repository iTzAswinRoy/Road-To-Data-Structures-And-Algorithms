package JavaRecursion.ArrayList;

import java.util.ArrayList;         // Importing the array list class
import java.util.Scanner;           // Importing scanner class

// Write a recursive function to find the first index of a specific element in an ArrayList.
public class FindElementIndex {
    public static void main(String[] args) {        // Main method
        FindElementIndex obj = new FindElementIndex();       // Creating an object of the class
        Scanner in = new Scanner(System.in);        // Creating a scanner object

        ArrayList<Integer> list = new ArrayList<>();        // Creating an array list

        // Calling the method to add elements in the array list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Displaying the array list
        System.out.println("Given array list:\n" + list);

        System.out.println("\nEnter the element to find its index:");
        int findElement = in.nextInt();         // Getting inputs from the user

        int result = obj.findingIndex(list, 0, findElement);        // Calling the method to find the index of the element

        // Checking if the element is present in the array list
        if (result >= 0) {
            System.out.println("\nElement " + findElement + " is found at given index " + result);
        } else {
            System.out.println("\nElement not found!");
        }
        in.close();     // Closing the scanner
    }

    public int findingIndex(ArrayList<Integer> data, int index, int element) {          // Method to find the index of the element
        // Base case
        // Checking if the index in within the bound
        if (index >= data.size()) {
            return -1;      // If not, returns a negative value
        }

        // Checking if the element match with the current index
        if (data.get(index) == element) {
            return index;       // Retuning the index
        }

        return findingIndex(data, index + 1, element);          // Calling the recursive function by incrementing the index by 1
    }
}