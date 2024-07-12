package JavaBasics;
import java.util.ArrayList;     // Importing array list class
import java.util.Scanner;       // Importing scanner class
// Finding the largest 3 elements in an array
public class w159 {
    public static void main(String[] args) {
        w159 obj = new w159();  // Creating an object to call the method
        ArrayList<Integer> arr = obj.getInput();    // Get user input and store it in an ArrayList
        obj.printArray(arr);    // Prints the ArrayList
        obj.maximumArray(arr);  // Calling the Maximum array method
    }
    public ArrayList<Integer> getInput() {  // Creating an array to get the size and values
        Scanner in = new Scanner(System.in);    // Creating an object for scanner class
        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();    // Getting size using scanner
        ArrayList<Integer> arr = new ArrayList<>(); // Creating an instance of the class array
        System.out.println("Enter the values of the array: ");
        for (int i = 0; i < size; i++) {
            int element = in.nextInt();
            arr.add(element);   // Adding elements to an ArrayList
        }
        in.close(); // Close the Scanner to free up resources
        return arr; // Returning values containing ArrayList
    }
    public void printArray(ArrayList<Integer> data){    // Method to print the ArrayList
        System.out.println("Your array: "+ data);
    }
    public void maximumArray(ArrayList<Integer> data){  // Method to find the maximum elements in an ArrayList
        int first = 0;  // Creating empty variables to store the maximum numbers
        int second = 0;
        int third = 0;
        ArrayList<Integer> newArray = new ArrayList<>();    // A new ArrayList to store the maximum elements
        if(data == null || data.isEmpty()){    // This ensures if the ArrayList is empty or not
            System.out.println("Array is empty.");
        }
        for (int i = 0; i < data.size(); i++) { // Iterating over the ArrayList
            if (data.get(i) > first) {  // This condition finds out the first maximum element
                first = data.get(i);
            }
        }
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) > second && data.get(i) != first) { // This condition finds out the second maximum element
                second = data.get(i);
            }
        }
        for (int i = 0; i < data.size(); i++) {
            if(data.get(i) > third && data.get(i) != second && data.get(i) != first){   //// This condition finds out the third maximum element
                third = data.get(i);
            }
        }
        newArray.add(first); // Stacking the 3 largest element to an ArrayList
        newArray.add(second);
        newArray.add(third);

        System.out.println("The 3 largest elements are "+newArray);
    }
}
