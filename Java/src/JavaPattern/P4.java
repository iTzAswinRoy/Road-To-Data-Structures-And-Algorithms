package JavaPattern;

// Print a pyramid with n levels using asterisks (*)
public class P4 {
    public static void main(String[] args) {        // Main method
        int n = 5;          // Initializing as 5
        for (int i = 0; i < n; i++) {//

            for (int j = i; j < n; j++) {//
                System.out.print(" ");//
            }

            for (int k = i+1; k > 0; k--) {
                System.out.print(" *");

            }
            System.out.println();
        }
    }
}
