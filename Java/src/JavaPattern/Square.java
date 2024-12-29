package JavaPattern;

// Print a n x n square using asterisks (*).
public class Square {
    public static void main(String[] args) {        // Main method
        int n = 5;      // Initializing 'n' as 5

        // Creating a nested for loop
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("*");      // Printing '*' for each line
            }
            System.out.println();       // Giving a new line for each rows
        }
    }
}
