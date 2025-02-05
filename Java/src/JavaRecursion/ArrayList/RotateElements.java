package JavaRecursion.ArrayList;

import java.util.ArrayList;         // Importing the array list class

// Write a recursive function to rotate elements of an ArrayList to the right by k positions.
public class RotateElements {
    public static void main(String[] args) {            // Main method
        RotateElements obj = new RotateElements();          // Creating an object of the class

        ArrayList<Integer> list = new ArrayList<>();            // Creating an array list

        // Calling the method to store elements in the array list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Displaying the array list
        System.out.println("Given array list:\n" + list);

        // Calling the method to rotate the element in all positions
        System.out.println("\nRotating the element in the array list:");
        obj.generateRotation(list, 0);
    }

    public void generateRotation(ArrayList<Integer> data, int index) {          // Method to rotate the element in all positions
        // Base case
        if(index >= data.size()) {          // Checking if the index is greater than the size of the list
            return;             // Exits the method
        }
        System.out.println(data);       // Printing the current list

        rotateList(data);       // Calling the method to rotate the list

        // Calling the recursive function by incrementing the index by 1
        generateRotation(data, index + 1);
    }

    public void rotateList(ArrayList<Integer> data) {         // Method to rotate the list
        int first = data.getFirst();        // Storing the first element in the list

        // Iterating through the list
        for (int i = 0; i < data.size() - 1; i++) {
            data.set(i, data.get(i + 1));       // Setting the current element with the next element for each iteration
        }

        data.set(data.size() - 1, first);       // Finally, setting the last elements with the first element
    }
}