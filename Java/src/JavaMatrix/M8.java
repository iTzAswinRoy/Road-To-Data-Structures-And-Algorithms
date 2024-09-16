package JavaMatrix;

import java.util.Arrays;

// Find the sum of the elements on the primary and secondary diagonals of a square matrix.
public class M8 {
    public static void main(String[] args) {
        M8 obj = new M8();
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println("Given matrix:");
        obj.display(matrix);

        System.out.println("\nFinding the sum of primary and secondary diagonal of the matrix:");
        obj.sumOfDiagonal(matrix);
    }

    public void sumOfDiagonal(int[][] data) {
        int primary = 0;
        int secondary = 0;

        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data[0].length; j++) {
                if(i == j) {
                    primary += data[i][j];
                }
            }
            secondary += data[i][data.length - 1 - i];
        }
        System.out.println("Primary:\n" + primary);
        System.out.println("Secondary:\n" + secondary);
    }

    public void display(int[][] data){
        for (int i = 0; i < data.length; i++) {
            System.out.println(Arrays.toString(data[i]));
        }
    }
}
