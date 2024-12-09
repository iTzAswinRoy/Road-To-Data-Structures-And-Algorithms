package JavaPattern;

// Print a hollow square of n x n dimensions using asterisks (*).
public class P7 {
    public static void main(String[] args) {        // Main method
        int n = 5;      // Initializing 'n' as 5

        for (int i = 0; i < n; i++) {       // Outer loop for each row

            for (int j = 0; j < n; j++) {       // Inner loop for each column

                // Checking if it's the first or last row, or the first or last column
                if (i == 0 || i == n-1 ||  j == 0 || j == n-1) {
                    System.out.print(" *");          // Print '*' for boundary cells
                } else {
                    System.out.print("  ");          // Print '*' for boundary cells
                }
            }
            System.out.println();       // Move to the next line after printing each row
        }
    }
}