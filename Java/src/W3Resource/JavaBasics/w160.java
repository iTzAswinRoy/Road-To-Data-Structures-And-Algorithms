package W3Resource.JavaBasics;
import java.util.ArrayList;
import java.util.Scanner;
// Finding the smallest 3 elements in an ArrayList
public class w160 {
    public static void main(String[] args) {
        w160 obj = new w160();  // Creating an object to call the method
        ArrayList<Integer> arr = obj.getInput();    // Get user input and store it in an ArrayList
        obj.printArray(arr);    // Prints the ArrayList
        obj.minimumArray(arr);  // This method finds out the minimum elements present in an ArrayList
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
    public void minimumArray(ArrayList<Integer> data){  // Method to find the minimum elements in an ArrayList
        int first = Integer.MAX_VALUE;  // Creating variable to store maximum integer value
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;
        ArrayList<Integer> newArray = new ArrayList<>();    // A new ArrayList to store the minimum elements
        if(data == null || data.isEmpty()){    // This ensures if the ArrayList is empty or not
            System.out.println("Array is empty.");
        }
        for (int i = 0; i < data.size(); i++) { // Iterating over the ArrayList
            if (data.get(i) < first) {  // This condition finds out the first maximum element
                first = data.get(i);
            }
        }
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) < second && data.get(i) != first) { // This condition finds out the second minimum element
                second = data.get(i);
            }
        }
        for (int i = 0; i < data.size(); i++) {
            if(data.get(i) < third && data.get(i) != second && data.get(i) != first){   // This condition finds out the 3 minimum elements
                third = data.get(i);
            }
        }
        newArray.add(first); // Stacking the 3 smallest element to an ArrayList
        newArray.add(second);
        newArray.add(third);

        System.out.println("The 3 smallest elements are "+newArray);
    }
}
