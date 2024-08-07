package JavaRecursion.ArrayList;

import java.util.ArrayList;

//Write a recursive function to interleave two ArrayLists of the same size.
public class InterLeaveList {
    public static void main(String[] args) {
        InterLeaveList obj = new InterLeaveList();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        System.out.println("Given array list:" );
        System.out.println("List-1: "+list1);
        System.out.println("List-2: "+list2);

        ArrayList<Integer> result = obj.interLeavingElements(list1, list2, new ArrayList<>(), 0);
        System.out.println("\nArray list after interleaving both list-1 and list-2:\n"+ result);
    }

    public ArrayList<Integer> interLeavingElements(ArrayList<Integer> data1, ArrayList<Integer> data2, ArrayList<Integer> result, int index){
        if(data1.size() != data2.size()){
            System.out.println("\nBoth size are not equal");
            return result;
        }
        int size = data1.size();
        if (index == size){
            return result;
        }
        result.add(data1.get(index));
        result.add(data2.get(index));

        return interLeavingElements(data1, data2, result, index+1);

    }
}
