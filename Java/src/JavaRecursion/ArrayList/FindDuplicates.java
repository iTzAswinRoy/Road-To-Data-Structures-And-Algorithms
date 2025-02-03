package JavaRecursion.ArrayList;

import java.util.ArrayList;         // Importing the array list class

// Write a recursive function to find duplicate elements in an ArrayList.
public class FindDuplicates {
    public static void main(String[] args) {        // Main method
        FindDuplicates obj = new FindDuplicates();          // Creating an object of the class

        ArrayList<Integer> list = new ArrayList<>();        // Creating an array list

        // Calling the method to add elements in the array list
        list.add(5);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(5);

        // Displaying the array list
        System.out.println("Given array list:\n" + list);

        // Calling the method
        System.out.println("\nFinding duplicate elements in the array list:\n" + obj.duplicateElements(list, 0, new ArrayList<>()));
    }

    public ArrayList<Integer> duplicateElements(ArrayList<Integer> data, int index, ArrayList<Integer> result) {        // Method to find the duplicate elements in the stack

        // Base case
        // Checking if the index reaches the size of the stack
        if (index == data.size()) {
            return result;
        }

        int currentElements = data.get(index);      // Accessing the current element from the stack
        boolean isChecked = false;      // Creating a boolean value as false

        // Iterating the array list
        for (int i = 0; i < data.size(); i++) {

            // Checking tf the current elements is present in the stack
            if (data.get(i) == currentElements && index != i) {
                isChecked = true;       // Changing the boolean to true
                break;      // Breaks the loop
            }
        }

        if (isChecked) {
            // Checking if the current element is not in the result list
            if (!result.contains(currentElements)) {
                result.add(currentElements);        // Adding the element to the result list
            }
        }

        return duplicateElements(data, index + 1, result);      // Calling the recursive function by passing the result and incrementing the index
    }
}