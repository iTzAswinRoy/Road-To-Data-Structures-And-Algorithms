package JavaRecursion;

import java.util.Arrays;

// Write a recursive function to split an array into two parts at a given index.
public class SplitArray {
    public static void main(String[] args) {
        SplitArray obj = new SplitArray();
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int[][] result = obj.split(array, 5);
        System.out.println("Given array:\n"+ Arrays.toString(array));
        System.out.println("\nAfter splitting the array.");

        System.out.println("First part:\n" + Arrays.toString(result[0]));
        System.out.println("\nSecond part:\n" + Arrays.toString(result[1]));
    }

    public int[][] split(int[] data, int splitIndex) {
        int[][] splitArray = new int[2][];

        splitArray[0] = new int[splitIndex];
        splitArray[1] = new int[data.length - splitIndex];

        return fillArray(data, 0, splitIndex, splitArray[0], splitArray[1]);
    }

    public int[][] fillArray(int[] data, int currentIndex, int splitIndex, int[] leftArray, int[] rightArray){
        if(currentIndex == data.length){
            return new int[][]{leftArray, rightArray};
        }
        if(currentIndex < splitIndex){
            leftArray[currentIndex] = data[currentIndex];
        } else {
            rightArray[currentIndex - splitIndex] = data[currentIndex];
        }
        return fillArray(data, currentIndex+1, splitIndex, leftArray, rightArray);
    }
}
