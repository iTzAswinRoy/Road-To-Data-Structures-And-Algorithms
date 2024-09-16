package JavaMatrix;

import java.util.Arrays;

// Implement a function that multiplies a matrix by a scalar value.
public class M5 {
    public static void main(String[] args) {
        M5 obj = new M5();
        int[][] matrix = {{1,2,3,}, {4,5,6}, {7,8,9}};

        System.out.println("Given matrix:");
        obj.display(matrix);

        System.out.println("\nMultiplying the matrix using scalar value:");
        obj.display(obj.scalarValue(matrix));
    }

    public int[][] scalarValue(int[][] data) {
        int scalarNum = 3;
        int[][] result = new int[data.length][data[0].length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                result[i][j] = data[i][j] * scalarNum;
            }
        }
        return result;
    }

    public void display(int[][] data){
        for (int i = 0; i < data.length; i++) {
            System.out.println(Arrays.toString(data[i]));
        }
    }
}
