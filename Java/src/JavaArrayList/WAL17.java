package JavaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

// Write a Java program to empty an array list.
public class WAL17 {
    public static void main(String[] args) {    // Main method
        WAL17 obj = new WAL17();    // Creating an object
        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list
        System.out.println("The given array list:\n"+list);
        obj.emptyList(list);
        System.out.println(obj.isEmpty(list));
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
    public void emptyList(ArrayList<Integer> list){
        System.out.println("\nEmptying the list!");
        for (int i = list.size() - 1; i >= 0; i--) {    // Iterating through the list from the last because after each removal, the elements shits to its previous index
            list.remove(i);
        }
    }
    public boolean isEmpty(ArrayList<Integer> list){
        System.out.println("\nChecking if the given array list is empty.....");
        if(list.isEmpty()){
            return true;
        }
        return false;
    }
}
