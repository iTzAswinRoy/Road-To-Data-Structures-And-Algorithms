package JavaMatrix;

import java.util.Arrays;

// Print the elements of a matrix in spiral order.
public class M7{
    public static void main(String[] args) {
        M7 obj = new M7();
        int[][] matrix = {{1,2,3},{4,5,6}, {7,8,9}, {10,11,12}, {13,14,15}};

        System.out.println("Given matrix:");
        obj.display(matrix);

        System.out.println("\nDisplaying matrix in spiral order:");
        obj.spiralOrder(matrix);
    }

    public void spiralOrder(int[][] data){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {

                System.out.print(data[i][j]+" ");
            }
        }
    }

    public void display(int[][] data){
        for (int i = 0; i < data.length; i++) {
            System.out.println(Arrays.toString(data[i]));
        }
    }
}
