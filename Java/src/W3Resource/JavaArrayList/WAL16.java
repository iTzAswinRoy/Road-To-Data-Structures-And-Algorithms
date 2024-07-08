package W3Resource.JavaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

// Write a Java program to clone an array list to another array list.
public class WAL16 {
    public static void main(String[] args) {    // Main method
        WAL16 obj = new WAL16();    // Creating an object
        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list
        System.out.println("The given array list:\n"+list);
        ArrayList<Integer> newList = obj.cloneList(list);
        System.out.println("Cloned array list:\n"+newList);
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
    public ArrayList<Integer> cloneList(ArrayList<Integer> list){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            temp.add(i, list.get(i));
        }
        return temp;
    }
}
