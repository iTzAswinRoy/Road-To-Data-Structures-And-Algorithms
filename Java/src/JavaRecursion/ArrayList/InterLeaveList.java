package JavaRecursion.ArrayList;

import java.util.ArrayList;         // Importing the array list class

//Write a recursive function to interleave two ArrayLists of the same size.
public class InterLeaveList {
    public static void main(String[] args) {            // Main method
        InterLeaveList obj = new InterLeaveList();          // Creating an object of the class

        ArrayList<Integer> list1 = new ArrayList<>();           // Creating an array list 1

        // Calling the method to store elements in the array list
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();           // Creating an array list 2

        // Calling the method to store elements in the array list
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        // Displaying the array list
        System.out.println("Given array list:" );
        System.out.println("List-1: " + list1);
        System.out.println("List-2: " + list2);

        ArrayList<Integer> result = obj.interLeavingElements(list1, list2, new ArrayList<>(), 0);           // Calling the method to get the interleaving elements from both the array list
        System.out.println("\nArray list after interleaving both list-1 and list-2:\n" + result);           // Displaying the result
    }

    public ArrayList<Integer> interLeavingElements(ArrayList<Integer> data1, ArrayList<Integer> data2, ArrayList<Integer> result, int index) {          // Method to get the interleaving elements from both the array list
        // Base case
        if (data1.size() != data2.size()) {         // Checking if the size for both the list are same
            System.out.println("\nBoth size are not equal");
            return result;          // Returning the result
        }

        // Base case
        if (index == data1.size()) {        // Checking if the index is equal to the size
            return result;          // Returning the result
        }

        // Storing the values from the both list alternatively
        result.add(data1.get(index));
        result.add(data2.get(index));

        return interLeavingElements(data1, data2, result, index + 1);           // Calling the recursive function by incrementing the index by 1
    }
}