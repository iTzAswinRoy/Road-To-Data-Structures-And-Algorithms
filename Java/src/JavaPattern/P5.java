package JavaPattern;

// Print an inverted pyramid with n levels using asterisks (*).
public class P5 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = i; k < n; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
