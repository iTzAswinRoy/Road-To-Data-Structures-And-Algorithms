package JavaRecursion.ArrayList;

import java.util.ArrayList;         // Importing the array list class

// Write a recursive function to find the sum of all even elements in an ArrayList of integers.
public class SumOfEvenNumbers {
    public static void main(String[] args) {            // Main method
        SumOfEvenNumbers obj = new SumOfEvenNumbers();          // Creating an object of the class

        ArrayList<Integer> list = new ArrayList<>();            // Creating an array list

        // Calling the method to store elements in the array list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Displaying the array list
        System.out.println("Given array list:\n" + list);

        int result = obj.sumEven(list, 0, 0);            // Calling the method to find the sum of even elements in the list
        System.out.println("\nSum of even numbers in a array list:\n" + result);        //Displaying the result
    }

    public int sumEven(ArrayList<Integer> data, int index, int sum) {
        // Base case
        if (index >= data.size()) {         // Checking if the index is greater than the size of the list
            return sum;         // Returning the sum
        }
        // Checking if the current element is even
        if (data.get(index) % 2 == 0) {
            sum = sum + data.get(index);        // Adding the sum
        }
        return sumEven(data, index + 1, sum);       // Calling the recursive function by incrementing the index by 1
    }
}