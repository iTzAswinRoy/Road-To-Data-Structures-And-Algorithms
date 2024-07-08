package W3Resource.JavaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

// Write a Java program to increase an array list size.
public class WAL20 {
    public static void main(String[] args) {    // Main method
        WAL20 obj = new WAL20();    // Creating an object
        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list
        System.out.println("The given array list:\n"+list);
        obj.increaseSize(list);
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
    public void increaseSize(ArrayList<Integer> list){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size to be increased:");
        int extraSize = in.nextInt();
        System.out.println("Add new elements to the list:");
        for (int i = 0; i < extraSize; i++) {
            list.add(in.nextInt());
        }
        System.out.println("List after the size being added:\n"+list);
    }
}
