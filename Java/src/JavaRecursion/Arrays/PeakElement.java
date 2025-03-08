package JavaRecursion.Arrays;

import java.util.Arrays;

// Write a recursive function to find a peak element in an array (an element that is not smaller than its neighbors).
public class PeakElement {
    public static void main(String[] args) {
        PeakElement obj = new PeakElement();
        int[] array = {11,2,3,4,5};
        System.out.println("Given array:\n"+ Arrays.toString(array));

        int result = obj.findingPeakElement(array, 0, array.length -1 );
        System.out.println("\nFinding peak element in the array:\n"+ result);
    }

    public int findingPeakElement(int[] data,  int s, int e){
        if(s == e){
            return data[s];//
        }
        int mid = s + (e-s)/2;//

        if (mid > 0 && mid < data.length - 1 && data[mid] > data[mid - 1] && data[mid] > data[mid + 1]) {
            return data[mid];//
        }
        if(data[mid] < data[mid-1]){
            return findingPeakElement(data, s , mid);
        }
        return findingPeakElement(data, mid + 1, e);
    }
}