package JavaArrayList;

import java.util.ArrayList;       // Importing scanner class
import java.util.Scanner;       // Importing scanner class

// Write a Java program to extract a portion of an array list.
public class WAL12 {
    public static void main(String[] args) {        // Main method
        WAL12 obj = new WAL12();     // Creating an object
        ArrayList<Integer> list = obj.userInputs();         //  Creating an array list
        System.out.println("Given list:" + list);
        obj.extractList(list);

    }
    public ArrayList<Integer> userInputs() {        // Method to get inputs from the user
        Scanner in = new Scanner(System.in);      // Creating a scanner object

        System.out.println("Enter the size:");
        int size = in.nextInt();        // Getting the size from the user

        ArrayList<Integer> tempList = new ArrayList<>();        // Creating a temporary array list
        System.out.println("Enter the values:");

        for (int i = 0; i < size; i++) {        // Iterating over the array list
            tempList.add(in.nextInt());       // Adding elements for each iteration
        }
        in.close();         // Closing scanner for avoid excess memory storage

        return tempList;        // Returning the array list
    }

    public void extractList(ArrayList<Integer> list) {
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
}
