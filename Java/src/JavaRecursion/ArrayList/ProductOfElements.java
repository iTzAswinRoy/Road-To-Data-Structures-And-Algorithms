package JavaRecursion.ArrayList;

import java.util.ArrayList;         // Importing the array list class

// Write a recursive function to find the product of all elements in an ArrayList of integers.
public class ProductOfElements {
    public static void main(String[] args) {        // Main method
        ProductOfElements obj = new ProductOfElements();        // Creating an object of the class

        ArrayList<Integer> list = new ArrayList<>();            // Creating an array list

        // Calling the method to store elements in the array list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Displaying the array list
        System.out.println("Given array list:\n" + list);

        int result = obj.multiplyingElements(list, 0);          // Calling the method to multiply all the elements in the array list
        System.out.println("\nFinding the product of the elements in the array list:\n" + result);          // Displaying the result
    }

    public int multiplyingElements(ArrayList<Integer> data, int index) {            // Method to multiply all the elements in the array list
        // Base case
        if (index >= data.size()) {         // Checking if the index is greater than the size of the list
            return 1;
        }

        // Calling the recursive function and also multiplying it byt the current element in the list
        return multiplyingElements(data, index + 1) * data.get(index);
    }
}