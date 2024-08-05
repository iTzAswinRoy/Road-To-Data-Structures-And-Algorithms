package JavaRecursion;

import java.util.Arrays;

// Write a recursive function to check if an array of integers is sorted in descending order.
public class CheckSortedDescendingElements {
    public static void main(String[] args) {
        CheckSortedDescendingElements obj = new CheckSortedDescendingElements();
        int[] array = {9,5,1,8,3};
        System.out.println("Given array:\n"+ Arrays.toString(array));

        int[] sortedArray = obj.sortingInDescendingOrder(array, array.length);
        System.out.println("\nArrays sorted in descending order:\n"+Arrays.toString(sortedArray));
        System.out.println("\nChecking if the array elements are sorted in descending order.\n"+ obj.checkingDescendingOrder(array, 0));
    }

    public int[] sortingInDescendingOrder(int[] data, int length) {
        if(length == 1){
            return data;
        }
        for (int i = 0; i < length-1; i++) {

            if(data[i] < data[i+1]){
                int temp = data[i];
                data[i] = data[i+1];
                data[i+1] = temp;
            }
        }
        return sortingInDescendingOrder(data, length-1);
    }

    public boolean checkingDescendingOrder(int[] data, int index){
        if(index == data.length-1) {
            return true;
        }
        if(data[index] < data[index+1]){
            return false;
        }
        return checkingDescendingOrder(data, index+1);
    }
}