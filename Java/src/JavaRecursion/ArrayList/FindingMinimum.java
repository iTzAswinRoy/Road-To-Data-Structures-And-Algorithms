package JavaRecursion.ArrayList;

import java.util.ArrayList;         // Importing the array list class

// Write a recursive function to find the minimum element in an ArrayList of integers.
public class FindingMinimum {
    public static void main(String[] args) {            // Main method
        FindingMinimum obj = new FindingMinimum();          // Creating an object of the class

        ArrayList<Integer> list = new ArrayList<>();        // Creating an array list

        // Calling the method to add elements in the array list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Displaying the array list
        System.out.println("Given array list:\n" + list);

        // Calling the method to get the minimum element from the array list
        int result = obj.minimumElement(list, 0, 0, Integer.MAX_VALUE);

        // Displaying the result
        System.out.println("\nFinding minimum element in the array list:\n" + result);
    }

    public int minimumElement(ArrayList<Integer> data, int index, int min, int maxValue) {          // Method to get the minimum element from the array list
        // Base case
        if (index >= data.size()) {         // Checking if the index in within the bound
            return min;         // Returning the Minimum value
        }

        // Checking of the element is greater than the max value
        if (data.get(index) < maxValue) {
            min = data.get(index);          // Updating the minimum value
            maxValue = min;         // Also updating the max value with min value
        }
        return minimumElement(data, index + 1, min, maxValue);        // Calling the recursive function by incrementing the index by 1
    }
}