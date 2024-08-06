package JavaRecursion.ArrayList;

import java.util.ArrayList;

// Write a recursive function to check if an ArrayList of integers is sorted in ascending order.
public class CheckSorted {
    public static void main(String[] args) {
        RotateElements obj = new RotateElements();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        System.out.println("Given array list:\n" + list);
        System.out.println("\nRotating the element in the array list:");

        obj.generateRotation(list, 0);
    }

    public int[] sortingList(ArrayList<Integer> data, int index){
        if(index == data.size()){
            return;
        }
        for (int i = 0; i < ; i++) {
            
        }
    }
}
