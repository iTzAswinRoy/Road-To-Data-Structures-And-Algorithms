package JavaMatrix;

import java.util.Arrays;

// Write a function that rotates a matrix by 90 degrees clockwise.
public class M6 {
    public static void main(String[] args) {
        M6 obj = new M6();
        int[][] matrix = {{1,2,3},{4,5,6}, {7,8,9}};

        System.out.println("Given matrix:");
        obj.display(matrix);

        System.out.println("\nRotating matrix at 90 degree:");
        obj.display(obj.matrixRotation(matrix));
    }

    public int[][] matrixRotation(int[][] data){
        int[][] result = new int[data.length][data[0].length];
        int size = data.length-1;;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {

                result[j][size-i] = data[i][j];
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
