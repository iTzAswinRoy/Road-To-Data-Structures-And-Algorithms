package JavaPattern;

// Print a n x n square using asterisks (*).
public class P1 {//
    public static void main(String[] args) {        // Main method
        int n = 5;      // Initializing as 5
        // Creating a nested for loop
        for (int i = 0; i < n; i++) {//
            for (int j = 0; j < n; j++) {//
                System.out.print("*");//
            }
            System.out.println();       // Giving a new line for each rows
        }
    }
}
