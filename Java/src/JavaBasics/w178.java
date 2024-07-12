package JavaBasics;
import java.util.ArrayList;
import java.util.Scanner;
// Write a Java program to find the longest increasing continuous subsequence in a given array of integers.
public class w178 {
    public static void main(String[] args) {
        w178 obj = new w178();      // Creating class object
        ArrayList<Integer> result = obj.userInputs();   // Storing the result in a variable by calling the input method
        System.out.println("The longest increasing continuous subsequence in a given array of integers\n"+obj.continuousSubsequence(result));   // Displaying the longest continuous subsequence in an array
    }
    public ArrayList<Integer> userInputs() {     // Method to get user inputs
        Scanner in = new Scanner(System.in);      // Creating a scanner object
        ArrayList<Integer> temp = new ArrayList<>();    // Creating an array list
        System.out.println("Enter the size of the array:");
        int size = in.nextInt();    // Getting the size using scanner object
        System.out.println("Enter the values of the array list:");
        for (int i = 0; i < size; i++) {    // Iterating over the array
            temp.add(in.nextInt());     // Adding elements for each iteration of the array list
        }
        in.close();     // Closing scanner
        return temp;    // Retuning the scanner to get inputs from the user
    }
    public int continuousSubsequence(ArrayList<Integer> data){
        int max = 0;
        for (int i = 0; i < data.size() - 1; i++) {
            int count = 1;
            int j = i;
            if (data.get(i + 1) > data.get(i)) {    // Checking the base condition if the number is greater than the next number
                while (j < data.size() - 1 && data.get(j+1) > data.get(j)) {    // Checking for an increasing sequence
                    count++; // Incrementing the counter for each increasing element
                    j++;    // Incrementing the pointer by 1
                }
            }
            else if (data.get(i+1) < data.get(i)) {     // Checking the base condition if the number is lesser than the next number
                while (j < data.size() - 1 && data.get(j+1) < data.get(j)) {    // Checking for a decreasing sequence
                    count++; // Incrementing the counter for each decreasing element
                    j++;    // Incrementing the pointer by 1
                }
            }
            if (count > max) {     // Updating the maximum sequence length encountered so far
                max = count;
            }
        }
        return max;    // Returning the maximum count value
    }
}
