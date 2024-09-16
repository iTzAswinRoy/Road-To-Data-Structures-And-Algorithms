package JavaMatrix;

import java.util.Arrays;

// Determine if a given matrix is symmetric.
public class M10 {
    public static void main(String[] args) {
        M10 obj = new M10();
        int[][] matrix1 = {{1,2,3}, {2,5,4}, {3,4,5}};

        int[][] matrix2 = {{1,0,0}, {0,1,0}, {0,2,1}};


        System.out.println("Given matrix:");
        System.out.println("Matrix - 1:");
        obj.display(matrix1);

        System.out.println("\nMatrix - 2:");
        obj.display(matrix2);

        System.out.println("\nChecking if the matrix - 1 is symmetric:\n" + obj.checkingSymmetric(matrix1));
        System.out.println("\nChecking if the matrix - 2 is symmetric:\n" + obj.checkingSymmetric(matrix2));
    }

    public boolean checkingSymmetric(int[][] data) {

        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data[0].length; j++) {
                if(data[i][j] != data[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void display(int[][] data){
        for (int i = 0; i < data.length; i++) {
            System.out.println(Arrays.toString(data[i]));
        }

    }
}
