package JavaArrayList;
import java.util.ArrayList;
import java.util.Scanner;
// Write a Java program to search for an element in an array list.
public class WAL7 {
    public static void main(String[] args) {
        WAL7 obj = new WAL7();    // Creating an object
        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list
        System.out.println("Given array list:");
        obj.display(list);      // Calling the method to display the array list
        obj.searchingElement(list);
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
    public void searchingElement(ArrayList<Integer> temp){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the element to be searched:");
        int element = in.nextInt();
        boolean isFound = false;
        for (int i = 0; i < temp.size(); i++) {
            if(temp.get(i) == element){
                isFound = true;
            }
            if(isFound){
                System.out.println("Element is found at index "+i);
            }
        }
        if(!isFound){
            System.out.println("Element not found!");
        }
    }
    public void display(ArrayList<Integer> temp) {
        for (int i = 0; i < temp.size(); i++) {
            System.out.print(temp.get(i) + " ");
        }
        System.out.println();
    }
}
