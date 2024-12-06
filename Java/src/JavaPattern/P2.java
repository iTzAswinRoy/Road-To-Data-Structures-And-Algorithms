package JavaPattern;

// Print a right-angled triangle with n rows using asterisks (`*`)
public class P2 {
    public static void main(String[] args) {        // Main method
        int n = 5;      // Initializing as 5

        // Creating a nested for loop
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {      // Iterating till the j is less than i
                System.out.print("*");          // Printing '*' for each line
            }
            System.out.println();       // Giving a new line for each rows
        }
    }
}
