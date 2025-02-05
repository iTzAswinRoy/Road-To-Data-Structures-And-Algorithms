package JavaRecursion.Arrays;

// Write a recursive function to calculate the factorial of a number n.
public class FactorialCalculation {
    public static void main(String[] args) {         // Main method
        FactorialCalculation obj = new FactorialCalculation();      // Creating an object of the class

        int result = obj.factorial(5);          // Calling the method to find the factorial of the number
        System.out.println(result);         // Displaying the result
    }

    public int factorial(int num) {         // Method to find the factorial of the number
        // Base case
        if (num == 1) {
            return num;     // Returning the num
        }

        // Calling the recursive function by multiplying the current number
        return factorial(num - 1) * num;
    }
}