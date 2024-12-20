package JavaPattern;

// Print an inverted pyramid with n levels using asterisks (*).
public class InvertedPyramid {
    public static void main(String[] args) {         // Main method
        int n = 5;          // Initializing 'n' as 5

        for (int i = 0; i < n; i++) {       // Outer loop: Controls the rows

            for (int j = 0; j < i; j++) {       // Inner loop 1: Prints spaces for alignment
                System.out.print(" ");
            }

            for (int k = i; k < n; k++) {       // Inner loop 2: Prints '*' for the current row
                System.out.print(" *");
            }
            System.out.println();       // Move to the next line after a row is printed
        }
    }
}
