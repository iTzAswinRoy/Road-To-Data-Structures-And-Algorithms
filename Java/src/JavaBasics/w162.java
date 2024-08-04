package JavaBasics;

import java.util.Arrays;
import java.util.Scanner;

// Write a Java program that finds numbers greater than the average of an array.
public class w162 {     // Main class
    public static void main(String[] args) {
        w162 obj = new w162();  // Creating an object

        int[] array = obj.inputArray();   // Calling a method to get inputs from the user
        System.out.println("Given array:\n" + Arrays.toString(array));

        System.out.println("\nThe average value of the array is\n"+obj.average(array));   // Getting the average value of the array
        obj.aboveAverage(array);  // Getting the above average value of the array
    }

    public int[] inputArray() {     // Creating a method to get inputs
        Scanner in = new Scanner(System.in);    // Creating a scanner object

        System.out.println("Enter the size:");
        int size = in.nextInt();    // Getting the size from the user

        int[] arr = new int[size];  // Creating the array object
        System.out.println("Enter the values:");

        for (int i = 0; i < arr.length; i++) {      // Assigning value's to an array using for-loop
            arr[i] = in.nextInt();
        }
        in.close(); // Closing scanner

        return arr;
    }

    public int average(int[] data){     // Creating a method to get an average
        int sum = 0;    // Creating a variable to store the sum value
        int avg = 0;    // Creating a variable to store the average value

        for (int i = 0; i < data.length; i++) {
            sum += data[i];     // Finding the sum of the array
        }
        avg = sum/data.length;  // Finding the average

        return avg;
    }

    public void aboveAverage(int[] data){   // Creating a method to find the above average elements
        int aa = 0;
        System.out.println("The above average values are");

        for (int i = 0; i < data.length; i++) {     // Using for-loop iterating over an array to find the above average value

            if(data[i] > average(data)){
                aa = data[i];
                System.out.print(aa+" ");
            }
        }
    }
}

