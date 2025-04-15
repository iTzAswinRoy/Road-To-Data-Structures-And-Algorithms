package JavaMatrix;

import java.util.ArrayList;
import java.util.List;

public class PeakElementInMatrix {
    public static void main(String[] args) {
//        int[][] matrix = {{10, 20, 30},
//                {5, 60, 70},
//                {1, 100, 110}};

        int[][] matrix = {{10, 20, 30},
                {5, 60, 30},
                {1, 20, 110}};

        PeakElementInMatrix obj = new PeakElementInMatrix();

        List<List<Integer>> result = obj.findPeekElement(matrix);
        System.out.println(result);
    }

    public List<List<Integer>> findPeekElement(int[][] mat) {
        List<List<Integer>> mainList = new ArrayList<>();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {


                if (isPeak(mat, i, j)) {
                    List<Integer> subList = new ArrayList<>();
                    subList.add(i);
                    subList.add(j);

                    mainList.add(subList);
                }
            }
        }
        return mainList;
    }

    public boolean isPeak(int[][] mat, int i, int j) {
        int currentElement = mat[i][j];

        // Top
        if (i > 0 && currentElement < mat[i - 1][j]) {
            return false;
        }

        // Bottom
        if(i < mat.length - 1 && currentElement < mat[i + 1][j]) {
            return false;
        }

        // Left
        if(j > 0 && currentElement < mat[i][j - 1]) {
            return false;
        }

        // Right
        if(j < mat[0].length - 1 && currentElement < mat[i][j + 1]) {
            return false;
        }
        return true;
    }
}

//find the index of the peek element in the matrix
// Which is largest in the row

// Output:
// [[0, 2], [1, 1], [2, 2]]
