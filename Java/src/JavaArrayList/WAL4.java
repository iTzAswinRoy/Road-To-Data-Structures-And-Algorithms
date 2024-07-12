package JavaArrayList;
import java.util.ArrayList;
import java.util.Scanner;
// Write a Java program to retrieve an element (at a specified index) from a given array list.
public class WAL4 {
    public static void main(String[] args) {
        WAL4 obj = new WAL4();    // Creating an object
        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list
        System.out.println("List containing name of colours:");
        obj.display(list);      // Calling the method to display the array list
        obj.getElement(list);
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
    public void getElement(ArrayList<Integer> temp){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the index to retrieve the element from the list:");
        int index = in.nextInt();
        System.out.print("Element at index "+index+" is "+temp.get(index));
    }
    public void display(ArrayList<Integer> temp) {
        for (int i = 0; i < temp.size(); i++) {
            System.out.print(temp.get(i) + " ");
        }
        System.out.println();
    }
}
