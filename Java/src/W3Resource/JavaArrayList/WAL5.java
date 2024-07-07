package W3Resource.JavaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

// Write a Java program to update an array element by the given element.
public class WAL5 {
    public static void main(String[] args) {
        WAL5 obj = new WAL5();    // Creating an object
        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list
        System.out.println("Given array list:");
        obj.display(list);      // Calling the method to display the array list
        obj.setElement(list);
        System.out.println("The updated list:");
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
    public void setElement(ArrayList<Integer> temp){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the index to set a new element:");
        int index = in.nextInt();
        System.out.println("Enter the value of the new element:");
        temp.set(index, in.nextInt());
    }
    public void display(ArrayList<Integer> temp) {
        for (int i = 0; i < temp.size(); i++) {
            System.out.print(temp.get(i) + " ");
        }
        System.out.println();
    }
}
