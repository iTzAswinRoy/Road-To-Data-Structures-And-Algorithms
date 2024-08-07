package JavaRecursion.Arrays;

import java.util.Arrays;

// Write a recursive function to generate all possible rotations of an array.
public class GenerateRotations {
    public static void main(String[] args) {
        GenerateRotations obj = new GenerateRotations();
        int[] array = {1,2,3,4,5};
        System.out.println("Given array:\n"+Arrays.toString(array));

        System.out.println("\nGenerating all possible rotations of the array:");
        obj.genArray(array, 0);
    }

    public void genArray(int[] data, int index){
        if(index == data.length){
            return;
        }
        rotateArray(data);

        printArray(data);

        genArray(data, index+1);
    }

    public void rotateArray(int[] data){
        int first = data[0];

        for (int i = 0; i < data.length - 1; i++) {
            data[i] = data[i+1];
        }
        data[data.length-1] = first;

    }
    public void printArray(int[] data){
        System.out.println(Arrays.toString(data));
    }
}
