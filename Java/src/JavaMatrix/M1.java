package JavaMatrix;

import java.util.Arrays;

// Write a function that adds two matrices of the same size.
public class M1 {
    public static void main(String[] args) {
        M1 obj = new M1();

        int[][] mat1 = {{1,2,3}, {4,5,6}};
        int[][] mat2 = {{10,20,30}, {40,50,60}};

        System.out.println("Given matrix:");
        System.out.println("Matrix - 1:");
        obj.display(mat1);

        System.out.println("\nMatrix - 2:");
        obj.display(mat2);

        try {
            System.out.println("\nSum of matrix:");
            obj.display(obj.addMatrix(mat1, mat2));

        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public int[][] addMatrix(int[][] data1, int[][] data2) {
        if (data1 == null || data2 == null || data1.length != data2.length || data1[0].length != data2[0].length){
            throw new IllegalArgumentException("Matrix size is not equal!");
        }
        int[][] result = new int[data1.length][data1[0].length];

        for (int i = 0; i < data1.length; i++) {

            for (int j = 0; j < data1[0].length; j++) {
                result[i][j] = data1[i][j] + data2[i][j];
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