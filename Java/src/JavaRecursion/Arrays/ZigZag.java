package JavaRecursion.Arrays;

import java.util.Arrays;

//Write a recursive function to rearrange an array in zigzag order.
public class ZigZag {
    public static void main(String[] args) {
        ZigZag obj = new ZigZag();
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Given array:\n"+ Arrays.toString(array));

        int[] result = obj.zigZagOrder(array, 0);
        System.out.println("\nElements in zigzag order:\n"+ Arrays.toString(result));
    }
    public int[] zigZagOrder(int[] data, int index){
        if(index == data.length-1){
            return data;
        }
        swap(data, index, index+1);
        return zigZagOrder(data, index+1);

    }
    public void swap(int[] data, int i , int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
