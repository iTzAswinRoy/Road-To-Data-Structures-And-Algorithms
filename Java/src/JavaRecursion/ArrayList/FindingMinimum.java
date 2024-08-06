package JavaRecursion.ArrayList;

import java.util.ArrayList;

// Write a recursive function to find the minimum element in an ArrayList of integers.
public class FindingMinimum {
    public static void main(String[] args) {
        FindingMinimum obj = new FindingMinimum();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int result = obj.minimumElement(list, 0, 0, Integer.MAX_VALUE);
        System.out.println("Given array list:\n" + list);
        System.out.println("\nFinding minimum element in the array list:\n"+ result);
    }

    public int minimumElement(ArrayList<Integer> data, int index, int min, int maxValue){
        if(index >= data.size()){
            return min;
        }

        if(data.get(index) < maxValue) {
            min = data.get(index);
            maxValue = min;
        }
        return minimumElement(data, index+1, min, maxValue);
    }
}
