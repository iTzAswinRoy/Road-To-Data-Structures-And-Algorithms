package W3Resource.JavaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

// Write a Java program to extract a portion of an array list.
public class WAL12 {
    public static void main(String[] args) {    // Main method
        WAL12 obj = new WAL12();    // Creating an object
        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list
        System.out.println("Given list:");
        obj.display(list);      // Calling the method to display the array list
        obj.extractList(list);

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
    public void extractList(ArrayList<Integer> list){
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the starting and ending index to extract the elements from the list");
        System.out.println("Index-1:");
        int i1 = in.nextInt();
        System.out.println("Index-2:");
        int i2 = in.nextInt();
        if(i1> list.size() || i2 > list.size() ) {
            System.out.println("Index out of bound!");
        } else if (i1 > i2){
            System.out.println("List from given index "+i1+" and "+i2+":");
            for (int i = i2; i <= i1; i++) {
                System.out.print(list.get(i)+" ");
            }
        } else {
            System.out.println("List from given index " + i1 + " and " + i2 + ":");
            for (int i = i1; i <= i2; i++) {
                System.out.print(list.get(i)+" ");
            }
        }
    }
    public void display(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
