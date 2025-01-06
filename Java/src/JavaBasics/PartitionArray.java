package JavaBasics;

import java.util.ArrayList;     // Importing arraylist class
import java.util.Scanner;       // Importing scanner class

//  Write a Java program that partitions an array of integers into even and odd numbers.
public class PartitionArray {
    public static void main(String[] args) {    // Main method
        PartitionArray obj = new PartitionArray();      // Creating class object
        ArrayList<Integer> result = obj.userInputs();   // Storing the result in a variable by calling the input method

        System.out.println("Given array list:\n" + result);
        System.out.println("\nThe partitioned even and odd elements in an array are\n" + obj.partitionArray(result));     // Displaying the results
    }

    public ArrayList<Integer> userInputs() {     // Method to get user inputs
        ArrayList<Integer> temp = new ArrayList<>();    // Creating an array list
        Scanner in = new Scanner(System.in);      // Creating a scanner object

        System.out.println("Enter the size of the array:");
        int size = in.nextInt();    // Getting the size using scanner object

        System.out.println("Enter the values of the array list:");

        for (int i = 0; i < size; i++) {    // Iterating over the array
            temp.add(in.nextInt());     // Adding elements for each iteration of the array list
        }
        in.close();     // Closing scanner

        return temp;    // Retuning the list containing elements
    }

    public ArrayList<Integer> partitionArray(ArrayList<Integer> data) {      // Method to partition the even and odd numbers in an array
        ArrayList<Integer> temp = new ArrayList<>();    // Creating a temporary array list to store the partitioned array

        for (int i = 0; i < data.size(); i++) {     // Iterating through an array list

            if (data.get(i) % 2 == 0) {       // Checking if the element is even
                temp.addFirst(data.get(i));     // If yes,then it is added at the first of the array list

            } else if (data.get(i) % 2 != 0) {   // Checking if the element is odd
                temp.addLast(data.get(i));      // If yes,then it is added at the last of the array list
            }
        }
        return temp;    // Returning the array list
    }
}