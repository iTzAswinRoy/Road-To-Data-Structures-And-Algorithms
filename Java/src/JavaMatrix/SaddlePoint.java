package JavaMatrix;

import java.util.ArrayList;
import java.util.List;

public class SaddlePoint {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30},
                {5, 60, 30},
                {1, 20, 110}};

        SaddlePoint obj = new SaddlePoint();

        List<Integer> result = obj.findSaddlePoint(matrix);
        if (result.isEmpty()) {
            System.out.println("No saddle point found!");
        } else {
            System.out.println(result);
        }
    }

    public List<Integer> findSaddlePoint(int[][] mat) {
        List<Integer> points = new ArrayList<>();

        for (int i = 0; i < mat.length; i++) {
            int minVal = mat[i][0];
            int minCol = 0;

            // Step 1: Find the minimum value in the row
            for (int j = 1; j < mat[i].length; j++) {
                if (mat[i][j] < minVal) {
                        minVal = mat[i][j];
                    minCol = j;
                }
            }

            // Step 2: Assume it's a saddle point, then find if its largest in the column
            boolean isSaddlePoint = true;

            for (int k = 0; k < mat.length; k++) {
                if (mat[k][minCol] > minVal) {
                    isSaddlePoint = false;
                    break;
                }
            }

            if (isSaddlePoint) {
                points.add(minVal);
            }
        }

        return points;
    }
}

// Finding the element which is smallest in the row and largest in the column

// Output:
// 10
