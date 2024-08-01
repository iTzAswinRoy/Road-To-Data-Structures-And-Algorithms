package JavaRecursion;

import java.util.ArrayList;
import java.util.Arrays;

// Write a recursive function to find the sum of elements at odd indices in an array.
public class SumOfOddElements {
    public static void main(String[] args) {
        SumOfOddElements obj = new SumOfOddElements();

        int[] array = {2,5,6,9,1};
        int result = obj.sumOfOddNumbers(array, array.length);
        System.out.println("Given array:\n" + Arrays.toString(array));
        System.out.println("Sum of odd numbers:" + result);
    }
    public int sumOfOddNumbers(int[] data, int length){
        int sumOdd = 0;

        if (length <= 0){
            return sumOdd;
        }
        sumOdd += findingOddNumber(data, length-1).get(length-1);
        return sumOfOddNumbers(data, length-1);

    }
    public ArrayList<Integer> findingOddNumber(int[] num, int length){
        ArrayList<Integer> list = new ArrayList<>();

        if(length <= 0 ){
            return list;
        }
        if(num[num.length-1] % 2 != 0){
            list.add(num[num.length-1]);
        }
        return findingOddNumber(num, length-1);
    }
}
