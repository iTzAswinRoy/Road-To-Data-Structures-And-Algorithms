package JavaRecursion.ArrayList;

import java.util.ArrayList;         // Importing the array list class

// Write a recursive function to check if an ArrayList of integers is sorted in ascending order.

public class CheckSorted {
    public ArrayList<Integer> sortingList(ArrayList<Integer> data, int index) {         // Method to sort the list in ascending order
        // Base case
        if(index == data.size() - 1) {      // Checking if the index reaches the size of the list
            return data;        // Returning the array list
        }

        boolean isSwapped = false;      // Creating a check to avoid unnecessary running of for loop

        // Iterating through the array list
        for (int i = 0; i < data.size() - index - 1; i++) {
            // Implementing bubble sort
            if (data.get(i) > data.get(i + 1)) {
                swap(data, i, i + 1);       // Calling a helper method called swap
                isSwapped = true;       // Changing the boolean to 'true', if the swap occurs
            }
        }

        if (!isSwapped) {      // If no swaps were made after a recursive call, the array is already sorted
            return data;        // Retuning the array list
        }
        return sortingList(data,index + 1);         // Calling the recursive function by incrementing the index
    }

    public void swap(ArrayList<Integer> data, int i, int j) {       // Method to swap the values present in the index
        // Here the swapping process takes place
        int temp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, temp);
    }

    public boolean isSorted(ArrayList<Integer> data, int index) {       // Method to check if the array list is sorted in ascending order.

        // Base case
        if (index == data.size() - 1 || data.isEmpty()) {       // Checking if the index reaches the end of the list
            return true;
        }

        if (data.get(index) > data.get(index + 1)) {        // Checking if the current element is greater than the next element in the stack
            return false;
        }

        return isSorted(data, index + 1);       // Calling the recursive function by incrementing the index
    }

    public static void main(String[] args) {        // Main method
        CheckSorted obj = new CheckSorted();        // Creating an object of the class

        ArrayList<Integer> list = new ArrayList<>();        // Creating an array list

        // Calling the method to add elements in the array list
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(3);

        System.out.println("Given array list:\n" + list);       // Displaying the array list
        System.out.println("\nSorting the array list:\n" + obj.sortingList(list, 0));       // Calling the method to sort the list using recursion
        System.out.println("\nChecking if the array list are sorted in order.\n" + obj.isSorted(list, 0));          // Calling the method to check if the stack is sorted in ascending order
    }
}