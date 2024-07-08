package W3Resource.JavaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

// Write a Java program to print the element of an ArrayList using the elements' position.
public class WAL22 {
    public static void main(String[] args) {    // Main method
        WAL22 obj = new WAL22();    // Creating an object
        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list
        System.out.println("The given array list:\n"+list);
        obj.elementPosition(list);
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
    public void elementPosition(ArrayList<Integer> list){
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the position of the element:");
        int position = in.nextInt();
        if(position > list.size()){
            System.out.println("Index out of bound!");
        } else {
            System.out.println("The element at position "+position+" is "+list.get(position));
        }
    }
}
