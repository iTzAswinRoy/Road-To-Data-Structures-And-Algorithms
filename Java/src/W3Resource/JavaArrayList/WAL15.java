package W3Resource.JavaArrayList;
import java.util.ArrayList;
import java.util.Scanner;
// Write a Java program to join two array lists.
public class WAL15 {
    public static void main(String[] args) {    // Main method
        WAL15 obj = new WAL15();    // Creating an object

        ArrayList<Integer> list1 = obj.userInputs();     //  Creating an array list
        ArrayList<Integer> list2 = obj.userInputs();     //  Creating an array list

        System.out.println("The given array list are");
        System.out.println("List-1:\n" +list1);
        System.out.println("List-2:\n"+list2);

        obj.joinList(list1, list2);
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
    public void joinList(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int i = 0; i < (list1.size() + list2.size()); i++) {       // Initializing null values to the entire new list.
            newList.add(null);      // Because we can't set values to an empty list. This avoids IndexOutOfBound exception.
        }
        for (int i = 0; i < list1.size(); i++) {
            newList.set(i, list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            newList.set(i+list1.size(), list2.get(i));
        }
        System.out.println("\nJoined list: "+newList);
    }
}
