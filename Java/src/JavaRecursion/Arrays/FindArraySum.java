package JavaRecursion.Arrays;

import java.util.Scanner;//

// Write a recursive function to find the sum of elements in an array.
public class FindArraySum {//
    public static void main(String[] args) {
        FindArraySum obj = new FindArraySum();//
        int[] array = obj.userInputs();//

        System.out.println(obj.sumOfArray(array, array.length));//

    }
    public int[] userInputs() {//
        Scanner in = new Scanner(System.in);//

        System.out.println("Enter the size:");
        int size = in.nextInt();

        int[] temp_arr = new int[size];
        System.out.println("Enter the values:");
        for (int i = 0; i < size; i++) {
            temp_arr[i] = in.nextInt();
        }
        in.close();
        return temp_arr;
    }

    public int sumOfArray(int[] data, int n) {
        if (n <= 0) {
            return 0;
        }
        return sumOfArray(data, n-1) + data[n-1];
    }
}
