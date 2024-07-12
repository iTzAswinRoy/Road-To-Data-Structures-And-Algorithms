package JavaArrayList;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Character;
// Write a Java program to copy one array list into another.
public class WAL9 {
    int count = 1;
    public static void main(String[] args) {
        WAL9 obj = new WAL9();
        ArrayList<Character> list1 = obj.userInputs();
        ArrayList<Character> list2 = obj.userInputs();

        System.out.println("Given array list - 1:");
        obj.display(list1);

        System.out.println("Given array list - 2:");
        obj.display(list2);

        if(obj.checkIndex(list1, list2)) {
            System.out.println("List 2 after being copied from List 1:");
            obj.copyList(list1, list2);

            System.out.println("List - 1:");
            obj.display(list1);

            System.out.println("List - 2:");
            obj.display(list2);
        }
    }
    public ArrayList<Character> userInputs(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the list - "+count+":");
        int size = in.nextInt();
        in.nextLine();
        ArrayList<Character> tempList = new ArrayList<>();
        System.out.println("Enter a single character to add in the list - "+count+":");
        for (int i = 0; i < size; i++) {
            tempList.add(in.next().charAt(0));
        }
        System.out.println();
        count++;
        return tempList;
    }
    public void copyList(ArrayList<Character> list1, ArrayList<Character> list2){
        for (int i = 0; i < list2.size(); i++) {
            list2.set(i, list1.get(i));
        }
    }
    public void display(ArrayList<Character> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(Character.toUpperCase(list.get(i))+" ");
        }
        System.out.println("\n");
    }
    public boolean checkIndex(ArrayList<Character> list1, ArrayList<Character> list2){
        if(list1.size() != list2.size()){
            System.out.println("Index out of bound! Enter the same size for both the list.");
            return false;
        }
        return true;
    }
}
