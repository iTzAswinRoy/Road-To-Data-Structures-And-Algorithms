package JavaArrayList;

import java.util.ArrayList;         // Importing array list class
import java.util.Random;        // Importing random class
import java.util.Scanner;       // Importing scanner class

// Write a Java program to shuffle elements in an array list.
public class WAL10 {
    public static void main(String[] args) {        // Main method
        WAL10 obj = new WAL10();        //Creating an object
        ArrayList<Integer> list = obj.userInputs();         // Creating a empty list to stroe inputs

        System.out.println("Given array list:\n" + list);

        System.out.println("Array list after being shuffled:");
        obj.display(obj.shuffle(list));
    }

    public ArrayList<Integer> userInputs() {        // Method to get inputs from the user
        Scanner in = new Scanner(System.in);      // Creating a scanner object

        System.out.println("Enter the size of the list:");
        int size = in.nextInt();        // Getting the size from the user

        ArrayList<Integer> tempList = new ArrayList<>();        // Creating a temporary array list
        System.out.println("Enter the values to add in the list:");

        for (int i = 0; i < size; i++) {        // Iterating over the array list
            tempList.add(in.nextInt());       // Adding elements for each iteration
        }
        in.close();         // Closing scanner for avoid excess memory storage

        return tempList;        // Returning the array list
    }

    public ArrayList<Integer> shuffle(ArrayList<Integer> list) {        // Method to shuffle elements ion the array list
        Random rnd = new Random();      // Creating an object from random class

        for (int i = 0; i < list.size(); i++) {     // Iterating over the array list

            int randomValue = rnd.nextInt(i+1);     // The reason for (i + 1) is the nextInt range can't be zero, so it should start with a value
            int temp = list.get(randomValue);       // Strong the random value from the lsit

            list.set(randomValue, i);
            list.set(i, temp);
        }
        return list;
    }

    public void display(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println("\n");
    }
}
