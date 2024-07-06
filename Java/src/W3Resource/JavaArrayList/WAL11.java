package W3Resource.JavaArrayList;
import java.util.ArrayList;
import java.util.Scanner;
// Write a Java program to reverse elements in an array list
public class WAL11 {
    public static void main(String[] args) {    // Main method
        WAL11 obj = new WAL11();    // Creating an object
        ArrayList<Integer> list = obj.userInputs();     //  Creating an array list
        System.out.println("Given list;");
        obj.display(list);      //

        System.out.println("Reversed list:");
        obj.reverseList(list);
    }
    public ArrayList<Integer> userInputs(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of hte array list:");
        int size = in.nextInt();
        ArrayList<Integer> temp = new ArrayList<Integer>(size);
        System.out.println("Enter the values in the list:");
        for (int i = 0; i < size; i++) {
            temp.add(in.nextInt());
        }
        in.close();
        return temp;
    }
    public void reverseList(ArrayList<Integer> list){
        for (int i = list.size()-1; i >= 0 ; i--) {
            list.add(list.set(i, list.get(i)));
            System.out.print(list.get(i)+" ");
        }
    }
    public void display(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
