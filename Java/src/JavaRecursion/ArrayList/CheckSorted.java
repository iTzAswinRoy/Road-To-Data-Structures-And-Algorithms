package JavaRecursion.ArrayList;

import java.util.ArrayList;         // Importing Array list class

// Write a recursive function to check if an ArrayList of integers is sorted in ascending order.
public class CheckSorted {
    public ArrayList<Integer> sortingList(ArrayList<Integer> data, int index) {         // Method to sort the list in ascending order
        // Base case
        if(index == data.size()) {      // Checking if the index reaches the size of the list
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
        // Swappkg
        int temp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, temp);
    }

    public boolean isSorted(ArrayList<Integer> data, int index) {
        if (index == data.size() - 1 || data.isEmpty()) {
            return true;
        }

        if(data.get(index) > data.get(index + 1)) {
            return false;
        }
        return isSorted(data, index + 1);
    }

    public static void main(String[] args) {        // Main method
        CheckSorted obj = new CheckSorted();//

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);//
        list.add(2);//
        list.add(4);//
        list.add(1);//
        list.add(3);//

        System.out.println("Given array list:\n" + list);
        System.out.println("\nSorting the array list:\n" + obj.sortingList(list, 0));
        System.out.println("\nChecking if the array list are sorted in order.\n" + obj.isSorted(list, 0));
    }
}
