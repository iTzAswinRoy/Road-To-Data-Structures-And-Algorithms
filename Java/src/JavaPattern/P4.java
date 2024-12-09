package JavaPattern;

// Print a pyramid with n levels using asterisks (*)
public class P4 {
    public static void main(String[] args) {        // Main method
        int n = 5;          // Initializing 'n' as 5

        // Creating a nested for loop
        for (int i = 0; i < n; i++) {       // Outer loop 1: Controls the number of rows

            for (int j = i; j < n; j++) {       // Inner loop 1: Prints spaces for alignment
                System.out.print(" ");        // Print a single space
            }

            for (int k = i+1; k > 0; k--) {       // Inner loop 2: Prints '*' for the current row
                System.out.print(" *");       // Print a '*' followed by a space

            }
            System.out.println();       // Move to the next line after finishing a row
        }
    }
}