package W3Resource.JavaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

// Write a Java program to insert an element into the array list at the first position.
public class WAL3 {
    public static void main(String[] args) {
        WAL3 obj = new WAL3();    // Creating an object
        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list
        System.out.println("List containing name of colours:");
        obj.display(list);      // Calling the method to display the array list
        obj.insertElementAtFirst(list);
        System.out.println("List after adding the element:");
        obj.display(list);
    }
    public ArrayList<Integer> userInputs(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array list:");
        int size = in.nextInt();
        ArrayList<Integer> temp = new ArrayList<Integer>(size);
        System.out.println("Enter the value:");
        for (int i = 0; i < size; i++) {
            temp.add(in.nextInt());
        }
        return temp;
    }
    public void insertElementAtFirst(ArrayList<Integer> temp){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the element to add at the first:");
        temp.add(0,in.nextInt());
    }
    public void display(ArrayList<Integer> temp){
        for (int i = 0; i < temp.size(); i++) {
            System.out.print(temp.get(i)+" ");
        }
        System.out.println();
    }
}
