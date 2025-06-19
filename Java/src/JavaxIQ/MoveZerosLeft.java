package JavaxIQ;

import java.util.Arrays;

public class MoveZerosLeft {
    public static void main(String[] args) {
        int[] arr = {1,0,3,4,0,2};

        int last = arr.length-1;

        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i] != 0) {
                arr[last] = arr[i];
                last--;
            }
        }

        while (last >= 0) {
            arr[last] = 0;
            last--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
