package JavaPattern;

//Print Floyd’s triangle of `n` rows. Floyd's triangle is a triangular array of natural numbers.
 public class P9 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = n-i ; j < n; j++) {
                System.out.print(" "+count);
                count++;
            }
            System.out.println();
        }
    }
}

