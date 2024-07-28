package JavaBasics;
import java.util.ArrayList;     // Importing array list class
import java.util.Arrays;        // Importing arrays class
import java.util.Scanner;       // Importing scanner class
// Extract the prime numbers from the array and display the same. Also display the sum of the prime numbers displayed.
public class SumOfPrimeNumbers {
    public static void main(String[] args) {    // Main method
        SumOfPrimeNumbers obj = new SumOfPrimeNumbers();      // Creating class object

        int[] arr = obj.userInput();    // Creating an array by calling the user input method to store values
        System.out.println("Original array:\n" + Arrays.toString(arr));      // Displaying the given array

        System.out.println("Extracting only prime numbers from the array:\n" + obj.displayPrime(arr));   // Displaying the array consisting of prime numbers

        System.out.println("Sum of prime numbers: " + obj.sumOfPrime(arr));     // Displaying the sum of prime numbers is an array
    }

    public int[] userInput() {      // Method to get user inputs
        Scanner in = new Scanner(System.in);    // Creating a scanner object

        System.out.println("Enter the size");
        int size = in.nextInt();    // Initializing the size of the array

        System.out.println("Enter the values:");
        int[] temp = new int[size];     // Creating a temporary  variable to store the values

        for (int i = 0; i < size; i++) {    //  Iterating through the array
            temp[i] = in.nextInt();     // Storing the value in a temporary variable
        }
        return temp;    // Returning the input values
    }

    public boolean checkPrime(int num) {       // Method to check if the number is prime or not
        if (num <= 1) {     // Checking if the number is less than 1
            return false;   // Returns false if it reaches the condition
        }
        if (num == 2) {     // Checking if the number is equal to 2
            return true;    // Returns true if it attains the condition
        }
        if (num % 2 == 0) {     // Checking if the number is even
            return false;       // Returns false if the number is even
        }
        for (int i = 3; i < Math.sqrt(num); i += 2) {    // Iterating though the square root of the number
            if (num % i == 0) {     // Checking is the square root of the number is divisible by 1 or itself
                return false;   // Return false if the number is even
            }
        }
        return true;    // Return true if the number is divisible by 1 or itself
    }

    public ArrayList<Integer> displayPrime(int[] num) {      // method to display the prime numbers
        ArrayList<Integer> temp = new ArrayList<>();    // Creating an array list to store the prime numbers

        for (int i = 0; i < num.length; i++) {      // iterating through the given array of random numbers
            if (checkPrime(num[i])) {     // Checking if the number is prime by calling the check prime method
            temp.add(num[i]);   // Adding each prime numbers to the array list
            }
        }
        return temp;    // Returning the list containing the prime numbers
    }

    public int sumOfPrime(int[] num) {     // Method to calculate the sum of prime numbers
        int sum = 0;    // Creating an empty variable to store the sum.

        for (int i = 0; i < num.length; i++) {      // Iterating through the array
            if (checkPrime(num[i])) {     // Checking if the number is prime number
                sum += num[i];      // Adding it to a variable
            }
        }
        return sum;     // Returning the sum of prime numbers
    }
}