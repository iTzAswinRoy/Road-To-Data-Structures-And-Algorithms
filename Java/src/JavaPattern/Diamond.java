package JavaPattern;

// Print a diamond shape with n levels using asterisks (*).
public class Diamond {
    public static void main(String[] args) {        // Main method
        int n = 5;      // Initializing 'n' as 5

        // First part: Top half of the diamond (excluding the middle line)
        for (int i = 0; i < n-1; i++) {         // Outer loop for the rows

            for (int j = i; j < n; j++) {       // Inner loop for printing spaces
                System.out.print(" ");
            }

            for (int k = i; k >= 0; k--) {       // Inner loop for printing stars
                System.out.print("* ");

            }
            System.out.println();       // Move to the next line after each row
        }

        // Second part: Bottom half of the diamond (including the middle line)
        for (int i = 0; i < n; i++) {       // Outer loop for the rows

            for (int j = 0; j < i; j++) {       // Inner loop for printing spaces
                System.out.print(" ");
            }

            for (int k = i; k < n; k++) {       // Inner loop for printing stars
                System.out.print(" *");

            }
            System.out.println();       // Move to the next line after each row
        }
    }
}