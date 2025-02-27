package JavaRecursion.Arrays;

import java.util.Arrays;//

// Write a recursive function to find the sum of elements at odd indices in an array.
public class SumOfOddElements {//
    public static void main(String[] args) {
        SumOfOddElements obj = new SumOfOddElements();

        int[] array = {8,5,1,3,6};
        int result = obj.sumOfOddNumbers(array, array.length, 0);//

        System.out.println("Given array:\n" + Arrays.toString(array));
        System.out.println("\nSum of odd numbers:\n" + result);//
    }

    public int sumOfOddNumbers(int[] data, int index, int sum) {
        if(index <= 0){//
            return sum;//
        }
        if (checkingOddNumber(data[index-1])) {//
            sum = sum + data[index-1];//
        }
        return sumOfOddNumbers(data, index-1, sum);
    }

    public boolean checkingOddNumber(int num){
        if (num % 2 != 0){
            return true;
        }
        return false;
    }
}
