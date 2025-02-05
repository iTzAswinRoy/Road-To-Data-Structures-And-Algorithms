package JavaRecursion.Arrays;

// Implement a recursive function to find the n-th Fibonacci number.
public class FibonacciSequence {
    public static void main(String[] args) {        // Main method
        FibonacciSequence obj = new FibonacciSequence();        // Creating an object of the class

        int result = obj.findFibonacciNumber(5);            // Calling the method to find the fibonacci number
        System.out.println(result);         // Displaying the result
    }

    public int findFibonacciNumber(int num) {           // Method to find the fibonacci number
        // Base case
        if (num == 0) {         // Checking if the num is 0
            return 0;
        }

        // Base case
        if (num == 1) {         // Checking if the num is 1
            return 1;
        }

        return findFibonacciNumber(num - 1) + findFibonacciNumber(num - 2);         // Calling the recursive function by adding two recursive calls
    }
}