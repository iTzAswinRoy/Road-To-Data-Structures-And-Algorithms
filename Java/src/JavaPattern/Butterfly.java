package JavaPattern;

// Print a butterfly pattern using asterisks (`*`).
public class Butterfly {
    public static void main(String[] args) {        // Main method
        int n = 5;        // Initializing 'n' as 5

        // First half of the butterfly pattern
        for (int i = 0; i < n; i++) {       // Outer loop for the rows

            // First inner loop: Prints the first set of stars for each row
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            // Second inner loop: Prints spaces between the two halves of the butterfly
            for (int j = 0; j < 2 * (n - i -1); j++) {

                System.out.print(" ");
            }

            // Third inner loop: Prints the second set of stars for each row
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();       // Move to the next line after completing the current row
        }
    }
}