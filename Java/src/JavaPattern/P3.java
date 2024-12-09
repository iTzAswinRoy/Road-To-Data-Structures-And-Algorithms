package JavaPattern;

// Print an inverted right-angled triangle with n rows using asterisks (*).
public class P3 {
    public static void main(String[] args) {        // Main method
        int n = 5;         // Initializing 'n' as 5

        // Creating a nested for loop
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {           // Iterating the loop starting from the 5 to 0
                System.out.print("*");          // Printing '*' for each line
            }
            System.out.println();       // Giving a new line for each rows
        }
    }
}