package W3Resource.JavaBasics;

import java.util.Arrays;
import java.util.Scanner;

// Generate the following series and store them in an array. Display from the array, Display the Sum
// Example: if N = 50, then Output: 1, 2, 5, 10, 17, 26, 37, 50, 65, 82, 101, 122 ....... N
public class I1 {
    public static void main(String[] args) {    // Main method
        I1 obj = new I1();    // Creating a class object
        System.out.println("Enter the number of elements: ");
        int size = obj.userInput();     // Initializing size by calling the suer input method
        System.out.println("Display array: "+Arrays.toString(obj.series(size)));    // Displaying the array
        System.out.println("Sum of array: "+obj.sum(obj.series(size)));     // Displaying the sum of the array
    }
    public int userInput(){     // Method to get inputs from the user
        Scanner in = new Scanner(System.in);    // Creating a scanner object
        return in.nextInt();    // Returning the input value
    }
    public int[] series(int data){
        int[] arr = new int[data];
        int sum = 1;
        for (int i = 0; i < data; i++) {
            arr[i] = sum;
            sum += (i + 1)*2;

        }
        return arr;
    }
    public int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
