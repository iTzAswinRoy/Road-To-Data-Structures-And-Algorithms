package JavaPattern;

// Print a diamond shape with n levels using asterisks (*).
public class P6 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n-1; i++) {

            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int k = i; k >= 0; k--) {
                System.out.print("* ");

            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = i; k < n; k++) {
                System.out.print(" *");

            }
            System.out.println();//
        }
    }
}
