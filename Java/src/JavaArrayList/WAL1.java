package JavaArrayList;
import java.util.ArrayList;
import java.util.Scanner;
// Write a Java program to create an array list, add some colors (strings) and print out the collection.
public class WAL1 {
    public static void main(String[] args) {
        WAL1 obj = new WAL1();    // Creating an object
        ArrayList<String> list = obj.userInputs();     //  Creating an array list
        System.out.println("List containing name of colours:");
        obj.display(list);      // Calling the method to display the array list
    }
    public ArrayList<String> userInputs(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array list:");
        int size = in.nextInt();
        in.nextLine();
        ArrayList<String> temp = new ArrayList<String>(size);
        System.out.println("Enter colour name:");
        for (int i = 0; i < size; i++) {
            temp.add(in.nextLine());
        }
        in.close();
        return temp;
    }
    public void display(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
