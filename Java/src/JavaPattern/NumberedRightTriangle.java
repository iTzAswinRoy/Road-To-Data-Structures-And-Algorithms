package JavaPattern;

// Print a right-angled triangle where each row contains increasing numbers starting from 1.
public class NumberedRightTriangle {
    public static void main(String[] args) {        // Main method
        int n = 5;      // Initializing 'n' as 5
        int count = 1;      // Creating a variable to track the number to print in each row

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {

            // Inner loop for each column in the current row
            for (int j = n-i ; j < n; j++) {        // Adjusts the starting point for each row
                System.out.print(" " + count);        // Print the current number with a space
                count++;        // Increment the number after printing
            }

            // Reset count to 1 for the next row
            count = 1;
            System.out.println();       // Move to the next line after completing a row
        }
    }
}