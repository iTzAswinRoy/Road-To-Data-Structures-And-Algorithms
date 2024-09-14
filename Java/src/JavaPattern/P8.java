package JavaPattern;

// Print a right-angled triangle where each row contains increasing numbers starting from 1.
public class P8 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = n-i ; j < n; j++) {
                System.out.print(" "+count);
                count++;
            }
            count = 1;
            System.out.println();
        }
    }
}
