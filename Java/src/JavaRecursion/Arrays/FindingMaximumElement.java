package JavaRecursion.Arrays;

import java.util.Arrays;//

// Write a recursive function to find the maximum element in an array of integers.
public class FindingMaximumElement {//
    public static void main(String[] args) {
        FindingMaximumElement obj = new FindingMaximumElement();//

        int[] array = {8,2,9,3};
        System.out.println("Given array:\n"+Arrays.toString(array));//

        int max = obj.findMax(array, array.length, Integer.MIN_VALUE);
        System.out.println("result:\n"+max);//
    }

    public int findMax(int[] data, int length, int max) {
        if (length <= 0) {//
            return max;
        }
        if (data[length-1] > max) {//
            max = data[length-1];
        }
        return findMax(data, length -1 , max);
    }
}