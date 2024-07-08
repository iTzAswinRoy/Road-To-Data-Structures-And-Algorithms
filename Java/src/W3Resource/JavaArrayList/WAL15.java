package W3Resource.JavaArrayList;

import java.util.ArrayList;
import java.util.Scanner;
// Write a Java program to join two array lists.
public class WAL15 {
    public static void main(String[] args) {
        WAL15 obj = new WAL15();    // Creating an object

        ArrayList<Integer> list1 = obj.userInputs();     //  Creating an array list
        ArrayList<Integer> list2 = obj.userInputs();     //  Creating an array list

        System.out.println("The given array list are");
        obj.display(list);
        obj.swapList(list);
    }
    public ArrayList<Integer> userInputs(){     // Method to get inputs from the user
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the size of the array list:");
         int size = in.nextInt();
         ArrayList<Integer> temp = new ArrayList<Integer>(size);
         System.out.println("Enter the values in the list:");
         for (int i = 0; i < size; i++) {
             temp.add(in.nextInt());
         }
         return temp;
    }
    public void swapList(ArrayList<Integer> list){

    }
    public void display(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
