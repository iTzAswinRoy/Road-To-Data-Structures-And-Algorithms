package JavaBasics;
import java.util.Scanner;
import java.util.Arrays;
// Finding the smallest and largest element in an array. Elements in the array can be in any order.
public class w161 {
    public static void main(String[] args) {
        w161 obj = new w161();      // Creating an object to call the method
        int[] arr = obj.getInputs();    // Getting inputs from the user
        obj.printArray(arr);    // Printing the array
        obj.minArray(arr);      // Finding the minimum element
        obj.maxArray(arr);      // Finding the maximum element
    }
    public int[] getInputs(){   // Method to get inputs
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();    // Initializing the size
        int[] arr = new int[size];  // Creating an array to store the elements
        System.out.println("Enter the values of the array: ");
        for (int i = 0; i < size; i++) {    // Iterating through an array
             arr[i] = in.nextInt();     // Initialize the elements to an  array
        }
        in.close();     // Closing the scanner object to reduce unwanted storage
        return arr;
    }
    public void printArray(int[] data){     // Method to print the array
        System.out.println("Given array: "+ Arrays.toString(data));
    }
    public void minArray(int[] data){      // Creating a method to find the minimum element
        int min = Integer.MAX_VALUE;    // Setting a variable to maximum value
        for (int i = 0; i < data.length; i++) {     // Iterating through an array
            if(data[i] < min){      // Here the condition is applied to find the minimum element
                min = data[i];      // Storing the least element in the variable
            }
        }
        System.out.println("The minimum element in the array is "+ min);
    }
    public void maxArray(int[] data){     // Creating a method to find the maximum element
        int max = Integer.MIN_VALUE;    // Setting a variable to minimum value
        for (int i = 0; i < data.length; i++) {     // Iterating through an array
            if(data[i] > max){      // Condition to find the maximum element
                max = data[i];      // Storing the maximum element in the variable
            }
        }
        System.out.println("The maximum element in the array is "+ max);
    }
}
