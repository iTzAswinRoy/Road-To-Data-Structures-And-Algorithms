package JavaxIQ;

import java.util.Arrays;

public class RotateArrayRight {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int k = 2;

        k = k % arr.length;         // This is to avoid index out of bound if the k > the size of array

        while (k > 0) {
            int first = arr[arr.length-1];

            for (int i = arr.length-1; i > 0; i--) {
                arr[i] = arr[i-1];
            }

            arr[0] = first;
            k--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
