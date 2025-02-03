package JavaRecursion.ArrayList;

import java.util.ArrayList;         // Importing the array list class

// Write a recursive function to find common elements between two ArrayLists.

public class FindCommonElements {
    public static void main(String[] args) {        // Main method
        FindCommonElements obj = new FindCommonElements();          // Creating an object of the class

        ArrayList<Integer> list1 = new ArrayList<>();       // Creating an array list

        // Calling the method to add elements in the array list
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();       // Creating an array list

        // Calling the method to add elements in the array list
        list2.add(1);
        list2.add(0);
        list2.add(3);
        list2.add(0);
        list2.add(5);

        // Displaying the array list
        System.out.println("Given array list:" );
        System.out.println("List-1: " + list1);
        System.out.println("List-2: " + list2);

        ArrayList<Integer> result = obj.commonElements(list1, list2, new ArrayList<>(), 0);         // Creating an array list to store the common elements
        System.out.println("\nFinding the common element in the array list:\n" + result);           // Displaying the result
    }

    public ArrayList<Integer> commonElements(ArrayList<Integer> data1, ArrayList<Integer> data2, ArrayList<Integer> result, int index) {        // Method to collect the common elements from the array list
        // Base case
        // Checking if the index reaches the end of the array list
        if (index >= data1.size() || index >= data2.size()) {
            return result;
        }

        int currentElement = data2.get(index);      // Getting the current element from the 2nd stack

        // Checking if the element form the 2nd stack present in the 1st one
        if (data1.contains(currentElement)) {
            result.add(currentElement);     // Adding the element to the result
        }

        return commonElements(data1, data2, result, index+1);       // Calling the recursive function by incrementing the index
    }
}