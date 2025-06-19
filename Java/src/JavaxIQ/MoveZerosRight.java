package JavaxIQ;

import java.util.Arrays;

public class MoveZerosRight {
    public static void main(String[] args) {
        int[] arr = {1,0,3,4,0,2};

        int first = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[first] = arr[i];
                first++;
            }
        }

        while (first < arr.length){
            arr[first] =0;
            first++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
