package JavaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

// Write a Java program that swaps two elements in an array list
public class WAL14 {
    public static void main(String[] args) {    // Main method
        WAL14 obj = new WAL14();    // Creating an object

        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list
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
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the elements to be swapped");
        System.out.println("Element-1:");
        int e1 = in.nextInt();
        System.out.println("Element-2:");
        int e2 = in.nextInt();
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == e1 && index1 == -1){
                index1 = i;
            }
            if (list.get(i) == e2 && index2 == -1) {
                index2 = i;
            }
        }
        if(index1 != -1 && index2 != -1) {
            System.out.println("\nElements after swapping:");
            int temp = list.get(index1);
            list.set(index1, list.get(index2));
            list.set(index2, temp);
            display(list);
        } else {
            System.out.println("\nElement not found!");
        }
    }
    public void display(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
