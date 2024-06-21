package W3Resource.JavaBasics;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Scanner;
// Write a Java program to test if the first and last element of two integer arrays are the same. The array length must be greater than or equal to 2.
public class w76 {
    private int count = 0;      // Declaring a count variable outside the method in order to count the method calls
    public static void main(String[] args) {    // Main method
        w76 obj = new w76();    // Creating a class object
        ArrayList<Integer> arr1 = obj.userInputs();     // Storing values in array 1 using the input method
        ArrayList<Integer> arr2 = obj.userInputs();     // Storing values in array 2 using the input method
        System.out.println("The given arrays are:");
        obj.display(arr1);      // Displaying the array
        obj.display(arr2);      // Displaying the array
        System.out.println("Checking if the fist and last element of both the array are equal.\n"+obj.checkArray(arr1, arr2));      // Calling the method to check the array
    }
    public ArrayList<Integer> userInputs() {     // Method to get user inputs
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        count++;    // Incrementing the count as we call the method
        System.out.println("Enter the size for array "+count+":");
        int size = in.nextInt();    // Getting the size from the user
        ArrayList<Integer> temp = new ArrayList<>();
        System.out.println("Enter the value's of array "+count+":");
        for (int i = 0; i < size; i++) {    // Iterating over an array list
            temp.add(in.nextInt());     // Assigning the values to an array list
        }
        return temp;     // Returning the inputs
    }
    public void display(ArrayList<Integer> data){     // Method to display the array list
        System.out.println(data);   // Printing the array list
    }
    public boolean checkArray(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {     // Method to check if both the array contains same first and last elements
        if (arr1.size() >= 2 && arr2.size() >= 2) {     // Setting a condition that the array length should be greater than 2
            for (int i = 0; i < arr1.size(); i++) {     // Iteration over array list 1
                for (int j = 0; j < arr2.size(); j++) {     // Iteration over array list 2
                    if(Objects.equals(arr1.getFirst(), arr2.getFirst()) && Objects.equals(arr1.getLast(), arr2.getLast())){     // Applying the main condition over here
                        return true;    // Returns true if the conditions are met
                    }
                }
            }
        } else {
            System.out.println("Invalid array size");
        }
        return false;   // Returns false if the conditions are not met
    }
}

