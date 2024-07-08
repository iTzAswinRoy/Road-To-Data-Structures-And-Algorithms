package W3Resource.JavaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

// Write a Java program for trimming the capacity of an array list
public class WAL19 {
    public static void main(String[] args) {    // Main method
        WAL19 obj = new WAL19();    // Creating an object
        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list
        System.out.println("Given list:\n"+list);
        obj.trimmingList(list);
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
    public void trimmingList(ArrayList<Integer> list){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size to trim the list:");
        int size = in.nextInt();
        if(size > list.size()){
            System.out.println("Invalid size!");
        } else {
            for (int i = list.size()-1; i >= size ; i--) {
                list.remove(i);
            }
        }
        System.out.println("After trimming the size of the list:\n"+list);
    }
}
