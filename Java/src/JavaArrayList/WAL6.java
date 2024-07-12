package JavaArrayList;
import java.util.ArrayList;
import java.util.Scanner;
// Write a Java program to remove the required element from an array list
public class WAL6 {
    public static void main(String[] args) {
        WAL6 obj = new WAL6();    // Creating an object
        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list
        System.out.println("Given array list:");
        obj.display(list);      // Calling the method to display the array list
        obj.removeElement(list);
        System.out.println("List after removing:");
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
    public void removeElement(ArrayList<Integer> temp){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the index to remove the element from the list:");
        int index = in.nextInt();
        temp.remove(index);
    }
    public void display(ArrayList<Integer> temp) {
        for (int i = 0; i < temp.size(); i++) {
            System.out.print(temp.get(i) + " ");
        }
        System.out.println();
    }
}
