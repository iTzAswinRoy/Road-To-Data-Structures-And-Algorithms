package JavaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//Write a Java program to sort a given array list.
public class WAL8 {
    public static void main(String[] args) {
        WAL8 obj = new WAL8();
        ArrayList<String> stringList = obj.userInputs();

        System.out.println("Given array list:");
        obj.display(stringList);

        System.out.println("Sorted array list:");
        obj.display(obj.sortArrayList(stringList));
    }

    public ArrayList<String> userInputs(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the list:");
        int size = in.nextInt();

        in.nextLine(); // Consume the newline after nextInt()

        ArrayList<String> newArrayList = new ArrayList<>(size);
        System.out.println("Enter the string in the array list:");

        for (int i = 0; i < size; i++) {
            newArrayList.add(in.next());
        }
        in.close();
        System.out.println();

        return newArrayList;
    }

    public ArrayList<String> sortArrayList(ArrayList<String> list){
        for (int i = 0; i < list.size()-1; i++) {

            for (int j = 0; j < list.size()-1; j++) {

                if(list.get(j).charAt(0) > list.get(j+1).charAt(0)){

                    String temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
        return list;
    }

    public void display(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println("\n");
    }
}
