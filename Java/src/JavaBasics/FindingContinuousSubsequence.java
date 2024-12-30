package JavaBasics;

import java.util.ArrayList;     // Importing arraylist class
import java.util.Scanner;       // Importing scanner class

// Write a Java program to find the longest increasing continuous subsequence in a given array of integers.
public class FindingContinuousSubsequence {
    public static void main(String[] args) {        // Main method
        FindingContinuousSubsequence obj = new FindingContinuousSubsequence();      // Creating class object

        ArrayList<Integer> result = obj.userInputs();    // Storing the result in a variable by calling the input method
        System.out.println("The longest increasing continuous subsequence in a given array of integers\n" + obj.continuousSubsequence(result));    // Calling the method to find the longest continuous subsequence in an array
    }

    public ArrayList<Integer> userInputs() {     // Method to get user inputs
        Scanner in = new Scanner(System.in);      // Creating a scanner object

        ArrayList<Integer> temp = new ArrayList<>();    // Creating an array list
        System.out.println("Enter the size of the array:");
        int size = in.nextInt();    // Getting the size using scanner object

        System.out.println("Enter the values including continuous subsequent elements:");
        for (int i = 0; i < size; i++) {    // Iterating over the array
            temp.add(in.nextInt());     // Adding elements for each iteration of the array list
        }
        in.close();     // Closing scanner

        return temp;    // Retuning the scanner to get inputs from the user
    }

    public int continuousSubsequence(ArrayList<Integer> data) {        // Method to find the longest continuous subsequent array
        int max = 0;        // Initializing max valur to 0

        for (int i = 0; i < data.size() - 1; i++) {
            int count = 0;      // Initializing count to 1
            int j = i;       // Storing the current iteration value

            if (data.get(i + 1) > data.get(i)) {    // Checking the base condition if the number is greater than the next number

                while (j < data.size() - 1 && data.get(j + 1) > data.get(j)) {       // Checking for an increasing sequence
                    count++;       // Incrementing the counter for each increasing element
                    j++;    // Incrementing the pointer by 1
                }
            } else if (data.get(i + 1) < data.get(i)) {     // Checking the base condition if the number is lesser than the next number

                while (j < data.size() - 1 && data.get(j + 1) < data.get(j)) {       // Checking for a decreasing sequence
                    count++;        // Incrementing the counter for each decreasing element
                    j++;          // Incrementing the pointer by 1
                }
            }
            if (count > max) {     // If the count is greater than max value, then longest subsequent value is found
                max = count;        // Updating the maximum sequence length encountered so far
            }
        }
        return max;    // Returning the maximum count value
    }
}