package JavaMatrix;

import java.lang.reflect.Array;
import java.util.Arrays;

// Write a function to transpose a given matrix.
public class M4 {
    public static void main(String[] args) {
        M4 obj = new M4();
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8, 9}, {11, 12, 13, 14, 15}};

        System.out.println("Given matrix:");
        obj.display(matrix);

        System.out.println("\nTransposing matrix:");
        obj.display(obj.transposingAMatrix(matrix));
    }

    public int[][] transposingAMatrix(int[][] data) {
        int[][] result = new int[data[0].length][data.length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                result[j][i] = data[i][j];
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
