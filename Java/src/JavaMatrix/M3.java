package JavaMatrix;

import java.util.Arrays;

// Implement matrix multiplication for two matrices. Ensure you handle the cases where multiplication is not possible.
public class M3 {
    public static void main(String[] args) {
        M3 obj = new M3();

        int[][] mat1 = {{1,2,3}, {4,5,6}};
        int[][] mat2 = {{10,20,30}, {40,50,60}};

        System.out.println("Given matrix:");
        System.out.println("Matrix - 1:");
        obj.display(mat1);

        System.out.println("\nMatrix - 2:");
        obj.display(mat2);

        System.out.println(mat1.length);
        System.out.println(mat2[0].length);

        try {
            System.out.println("\nDifference of matrix:");
            obj.display(obj.multiplicationMatrix(mat1, mat2));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public int[][] multiplicationMatrix(int[][] data1, int[][] data2) {

        if (data1 == null || data2 == null || data1.length != data2.length || data1[0].length != data2[0].length) {
            throw new IllegalArgumentException("Matrix multiplication is not possible. Matrix size is not equal!");
        }
        int[][] result = new int[data1.length][data1[0].length];

        for (int i = 0; i < data1.length; i++) {

            for (int j = 0; j < data1[0].length; j++) {
                result[i][j] = data1[i][j] * data2[i][j];
            }
        }
        return result;
    }

    public void display(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(Arrays.toString(data[i]));
        }
    }
}
