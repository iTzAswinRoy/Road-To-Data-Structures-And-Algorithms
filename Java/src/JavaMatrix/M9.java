package JavaMatrix;

import java.util.Arrays;

// Write a function that checks if a given matrix is an identity matrix.
public class M9 {
    public static void main(String[] args) {
        M9 obj = new M9();
        int[][] matrix1 = {{1,0,0}, {0,1,0}, {0,0,1}};

        int[][] matrix2 = {{1,0,0}, {0,1,0}, {0,2,1}};


        System.out.println("Given matrix:");
        System.out.println("Matrix - 1:");
        obj.display(matrix1);

        System.out.println("\nMatrix - 2:");
        obj.display(matrix2);

        System.out.println("\nChecking if the matrix - 1 is a identity matrix:\n" + obj.checkingIdentityMatrix(matrix1));
        System.out.println("\nChecking if the matrix - 2 is a identity matrix:\n" + obj.checkingIdentityMatrix(matrix2));
    }

    public boolean checkingIdentityMatrix(int[][] data) {

        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data[0].length; j++) {
                if(data[i][i] != 1 || (i != j && data[i][j] != 0)) {
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
