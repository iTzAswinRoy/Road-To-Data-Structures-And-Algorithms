package JavaPattern;

// Print a right-angled triangle with n rows using asterisks (`*`)
public class P2 {
    public static void main(String[] args) {
        int n = 5;      // Initializing as 5
        // Creating a nested for loop
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
