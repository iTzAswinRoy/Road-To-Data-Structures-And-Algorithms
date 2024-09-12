package JavaPattern;

// Print an inverted right-angled triangle with n rows using asterisks (*).
public class P3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
