package JavaRecursion.Arrays;

import java.util.Arrays;//

// Write a recursive function to find the second maximum element in an array of integers.
public class FindingSecondMaximum {
    public static void main(String[] args) {
        FindingSecondMaximum obj = new FindingSecondMaximum();//

        int[] array = {8, 2, 9, 3};
        int result = obj.findSecondMax(array, array.length, obj.findMax(array, array.length, Integer.MIN_VALUE), Integer.MIN_VALUE);//

        System.out.println("Given array:\n" + Arrays.toString(array));
        System.out.println("\nThe second maximum element in the array:\n" + result);//
    }

    public int findMax(int[] data, int length, int max) {
        if (length <= 0) {//
            return max;//
        }

        if (data[length - 1] > max) {
            max = data[length - 1];//
        }
        return findMax(data, length - 1, max);
    }

    public int findSecondMax(int[] data, int length, int max, int secondMax) {
        if (length <= 0) {
            return secondMax;
        }
        if (data[length-1] > secondMax && data[length-1] != max) {
            secondMax = data[length-1];
        }
        return findSecondMax(data, length-1, max, secondMax);
    }
}

