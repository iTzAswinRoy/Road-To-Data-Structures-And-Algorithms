package JavaRecursion;

import java.util.Arrays;

// Write a recursive function to find a peak element in an array (an element that is not smaller than its neighbors).
public class PeakElement {
    public static void main(String[] args) {
        PeakElement obj = new PeakElement();
        int[] array = {1,2,3,4,5};
        System.out.println("Given array:\n"+ Arrays.toString(array));

        int result = obj.findingPeakElement(array, 0, array.length -1,0 );
        System.out.println("\nFinding peak element in the array:\n"+ result);
    }

    public int findingPeakElement(int[] data,  int s, int e, int peakElement){
        if(s == e){
            return peakElement;
        }
        int mid = s + (e-s)/2;

        if(data[mid] > data[mid-1] && data[mid] > data[mid+1]){
            return peakElement;
        }
        if(data[mid] < data[mid-1]){
            findingPeakElement(data, 0 , mid, peakElement);
        } else {
            findingPeakElement(data, mid, data.length-1, peakElement );
        }


        return peakElement;
    }
}
