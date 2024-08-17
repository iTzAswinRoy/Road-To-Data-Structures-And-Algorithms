//package JavaArrayList;
//
//import java.util.ArrayList;     // Importing array list class
//import java.util.Scanner;       // Importing scanner class
//
//// Write a Java program to update an array element by the given element.
//public class ReplacingRepeatedElement {
//    public static void main(String[] args) {        // Main method
//        ReplacingRepeatedElement obj = new ReplacingRepeatedElement();    // Creating an object
//
//        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list
//        System.out.println("Given array list:\n" + list);        // Displaying the list
//
////        ArrayList<Integer> updatedList = obj.setElement(list);      // Calling the method to replace the element
//
////        System.out.println("\nThe updated list:\n" + updatedList);    // Displaying the updated list
//    }
//
//    public ArrayList<Integer> userInputs() {        // Method to get inputs from the user
//        Scanner in = new Scanner(System.in);        // Creating a scanner object
//
//        System.out.println("Enter the size:");
//        int size = in.nextInt();        // Getting the size from the user
//
//        ArrayList<Integer> temp = new ArrayList<>(size);        // Creating a temporary array list
//        System.out.println("Enter the value:");
//
//        for (int i = 0; i < size; i++) {        // Iterating over the array list
//            temp.add(in.nextInt());     // Adding elements for each iteration
//        }
//        return temp;        // Returning the array list
//    }
//
//    public void setElement(ArrayList<Integer> list) {        // Method to replace the element at a specific index
//        Scanner in = new Scanner(System.in);        // Creating a scanner object
//
//        System.out.println("\nEnter the index to be replaced:");
//        int index = in.nextInt();       // Getting the inputs from the user
//
//        if (index > list.size()) {      // Checking if the size is lesser than the size of the list
//            System.out.println("\nIndex out of bound!");
//
//        } else {
//            System.out.println("Enter the new element:");
//            list.set(index, in.nextInt());      // Replacing the element at a specific index
//
//            System.out.println("\nList after being replaced by the specified index:\n" + list);     // Displaying the list after replacing element
//        }
//
//    }
//}
