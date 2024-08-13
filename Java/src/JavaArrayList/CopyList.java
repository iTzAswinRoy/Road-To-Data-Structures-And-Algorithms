package JavaArrayList;

import java.util.ArrayList;     // Importing array list class
import java.util.Scanner;        // Importing scanner class
import java.lang.Character;      // Importing Character class

// Write a Java program to copy one array list into another.
public class CopyList {
    int count = 1;      // Initialing count in the main class

    public static void main(String[] args) {        // Main method
        CopyList obj = new CopyList();      // Creating a class object

        ArrayList<Character> list1 = obj.userInputs();      // Getting inputs from list user for list - 1
        ArrayList<Character> list2 = obj.userInputs();      // Getting inputs from list user for list - 1

        // Displaying the array list
        System.out.println("Given array list:");
        System.out.println("list - 1: " + list1);
        System.out.println("list - 2: " + list2);

        if(obj.checkIndex(list1, list2)) {      // Checking if the both the list contains same size

            System.out.println("\nList 2 after being copied from List 1\n");
            obj.copyList(list1, list2);     // Calling the method to copy the list 2

            // Displaying the updated list
            System.out.println("List - 1: " + list1);
            System.out.println("List - 2: " + list2);
        }
    }

    public ArrayList<Character> userInputs() {      // Method to get inputs from the user
        Scanner in = new Scanner(System.in);        // Creating a scanner object

        System.out.println("Enter the size for list-" + count + ":");
        int size = in.nextInt();        // Getting the size from the user

        in.nextLine();       // Consume the newline after nextInt()

        ArrayList<Character> tempList = new ArrayList<>();      // Creating a temporary array list
        System.out.println("Enter a single character:");

        for (int i = 0; i < size; i++) {        // Iterating over the array list
            tempList.add(in.next().charAt(0));      // Adding elements for each iteration
        }
        in.close();     // Closing scanner for avoid excess memory storage
        count++;       // Incrementing count for each variable calls

        return tempList;    // Returning the array list
    }

    public void copyList(ArrayList<Character> list1, ArrayList<Character> list2) {      // Method to copy list and initializing to another list
        for (int i = 0; i < list2.size(); i++) {        // Iterating over the array list
            list2.set(i, list1.get(i));         // Copying the list - 2 from list - 1
        }
    }

    public boolean checkIndex(ArrayList<Character> list1, ArrayList<Character> list2) {     // Method to check if both the list has the same size
        if (list1.size() != list2.size()) {     // Condition to check th size

            System.out.println("\nIndex out of bound! Enter the same size for both the list.");     // Error message
            return false;       // Returns false if the conditions is are met
        }
        return true;        // Returns true, if the conditions are not met
    }
}
