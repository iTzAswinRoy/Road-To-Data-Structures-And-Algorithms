package JavaMatrix;

public class CheckSumOfEdges {
    public static void main(String[] args) {
        int[][] matrix = {
                { 2, 7, 6 },
                { 9, 5, 1 },
                { 4, 3, 8 }
        };
        boolean result = isBorderAndDiagonalSumEqual(matrix);
        System.out.println("Are border and diagonal sums equal - " + result);
    }

    public static boolean isBorderAndDiagonalSumEqual(int[][] mat) {
        int n = mat.length;

        int expectedSum = 0;

        for (int i = 0; i < n; i++) {           // Getting side sum
            expectedSum += mat[i][0];
        }

        for (int i = 0; i < n; i++) {           // Getting diagonal sum
            int diaSum = 0;
            int index = 0;

            for (int j = 0; j < n; j++) {
                diaSum += mat[index][index];
                index++;
            }

            if (diaSum != expectedSum) {
                return false;
            }
        }

        int otherDiaSum = 0;
        int index = n - 1;

        for (int i = 0; i < n; i++) {           // Getting other diagonal sum

            otherDiaSum += mat[i][index];
            index--;
        }

        if (otherDiaSum != expectedSum) {
            return false;
        }


        for (int i = 0; i < n; i++) {           // Checking row sum
            int rowSum = 0;

            for (int j = 0; j < n; j++) {
                rowSum += mat[i][j];
            }
            if(rowSum != expectedSum) {
                return false;
            }
        }

        for (int i = 0; i < n; i++) {           // Checking column sum
            int colSum = 0;

            for (int j = 0; j < n; j++) {
                colSum += mat[j][i];
            }
            if(colSum != expectedSum) {
                return false;
            }
        }
        return true;
    }
}