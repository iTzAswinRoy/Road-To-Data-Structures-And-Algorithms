package JavaRecursion.ArrayList;//

import java.util.ArrayList;//

// Write a recursive function to check if an ArrayList of integers is sorted in ascending order.
public class CheckSorted {//
    public static void main(String[] args) {//
        CheckSorted obj = new CheckSorted();//

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);//
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(3);

        System.out.println("Given array list:\n" + list);
        System.out.println("\nSorting the array list:\n"+obj.sortingList(list, 0));
        System.out.println("\nChecking if the array list are sorted in order.\n" + obj.isSorted(list, 0));
    }

    public ArrayList<Integer> sortingList(ArrayList<Integer> data, int index){
        if(index == data.size()){
            return data;
        }
        boolean isSwapped = false;      // Creating a check to avoid unnecessary running of for loop

        for (int i = 0; i < data.size()-index-1; i++) {
            if(data.get(i) > data.get(i+1)) {
                swap(data, i, i + 1);
                isSwapped = true;
            }
        }
        if(!isSwapped){      // If no swaps were made after a recursive call, the array is sorted
            return data;
        }
        return sortingList(data,index+1);
    }

    public void swap(ArrayList<Integer> data, int i, int j){
        int temp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, temp);
    }

    public boolean isSorted(ArrayList<Integer> data, int index){
        if (index == data.size() - 1 || data.isEmpty()) {
            return true;
        }
        if(data.get(index) > data.get(index+1)){
            return false;
        }

        return isSorted(data, index+1);
    }
}
