package JavaArrayList;
import java.util.ArrayList;
import java.util.Scanner;
//Write a Java program to compare two array lists.
public class WAL13 {
    public static void main(String[] args) {    // Main method
        WAL13 obj = new WAL13();    // Creating an object

        ArrayList<Integer> list1 = obj.userInputs();     //  Creating an array list
        ArrayList<Integer> list2 = obj.userInputs();     //  Creating an array list

        System.out.println("\nThe given array lists are");
        System.out.println("List-1:");
        obj.display(list1);

        System.out.println("List-2:");
        obj.display(list2);

        System.out.println(obj.compareList(list1, list2));
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

    public boolean compareList(ArrayList<Integer> list1, ArrayList<Integer> list2){
        System.out.println("\nChecking whether the elements in the list are same:");

        if(list1.equals(list2)){
            return true;

        } else if(list1.size() != list2.size()){
            System.out.print("The size of the lists are different. ");
        }
        return false;
    }

    public void display(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
