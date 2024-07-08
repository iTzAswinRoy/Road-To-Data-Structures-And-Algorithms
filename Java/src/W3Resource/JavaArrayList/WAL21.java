package W3Resource.JavaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

// Write a Java program to replace the required element of an ArrayList with the specified element.
public class WAL21 {
    public static void main(String[] args) {    // Main method
        WAL21 obj = new WAL21();    // Creating an object
        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list
        System.out.println("The given array list:\n"+list);
        obj.replaceElement(list);
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
    public void replaceElement(ArrayList<Integer> list){
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the index to be replaced:");
        int index = in.nextInt();
        if(index > list.size()){
            System.out.println("Index out of bound!");
        } else {
            System.out.println("Enter the new element:");
            list.set(index, in.nextInt());
            System.out.println("List after being replaced by the specified index:\n" + list);
        }
    }
}
