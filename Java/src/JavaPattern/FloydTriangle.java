package JavaPattern;

//Print Floyd’s triangle of `n` rows. Floyd's triangle is a triangular array of natural numbers.
public class FloydTriangle {
    public static void main(String[] args) {        // Main method
        int n = 5;      // Initializing 'n' as 5
        int count = 1;      // Creating a variable to track the number to print in each row

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {

            // Inner loop for printing the numbers in the current row
            for (int j = n-i ; j < n; j++) {        // Determines the number of elements in the row
                System.out.print(" "+count);        // Print the current number with a space
                count++;        // Increment count by 1
            }
            System.out.println();       // Move to the next line after completing the current row
        }
    }
}