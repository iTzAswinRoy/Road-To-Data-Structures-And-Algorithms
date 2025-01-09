package JavaRecursion.ArrayList;

import java.util.ArrayList;

// Write a recursive function to find common elements between two ArrayLists.
public class FindCommonElements {
    public static void main(String[] args) {
        FindCommonElements obj = new FindCommonElements();

        ArrayList<Integer> list1 = new ArrayList<>();//
        list1.add(1);//
        list1.add(2);//
        list1.add(3);//
        list1.add(4);//
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(0);
        list2.add(3);
        list2.add(0);
        list2.add(5);

        System.out.println("Given array list:" );
        System.out.println("List-1: "+list1);
        System.out.println("List-2: "+list2);

        ArrayList<Integer> result = obj.commonElements(list1, list2, new ArrayList<>(), 0);
        System.out.println("\nFinding the common element in the array list:\n"+ result);
    }

    public ArrayList<Integer> commonElements(ArrayList<Integer> data1, ArrayList<Integer> data2, ArrayList<Integer> result, int index){
        if(index >= data1.size() || index >= data2.size()){
            return result;
        }
        int currentElement = data2.get(index);

        if(data1.contains(currentElement)){
            result.add(currentElement);
        }
        return commonElements(data1, data2, result, index+1);
    }
}
