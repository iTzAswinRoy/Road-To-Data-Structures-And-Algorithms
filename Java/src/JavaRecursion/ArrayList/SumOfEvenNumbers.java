package JavaRecursion.ArrayList;

import java.util.ArrayList;

// Write a recursive function to find the sum of all even elements in an ArrayList of integers.
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        SumOfEvenNumbers obj = new SumOfEvenNumbers();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Given array list:\n" + list);
        int result = obj.sumEven(list, 0, 0);
        System.out.println("\nSum of even numbers in a array list:\n"+ result);
    }

    public int sumEven(ArrayList<Integer> data, int index, int sum){
        if(index >= data.size()){
            return sum;
        }
        if (data.get(index) % 2 == 0){
            sum = sum + data.get(index);
        }
        return sumEven(data, index+1, sum);
    }
}