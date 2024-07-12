package JavaArrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Write a Java program to shuffle elements in an array list.
public class WAL10 {
    public static void main(String[] args) {
        WAL10 obj = new WAL10();
        ArrayList<Integer> list = obj.userInputs();

        System.out.println("Given array list:");
        obj.display(list);

        System.out.println("Array list after being shuffled:");
        obj.display(obj.shuffle(list));
    }
    public ArrayList<Integer> userInputs(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the list:");
        int size = in.nextInt();
        ArrayList<Integer> tempList = new ArrayList<>();
        System.out.println("Enter the values to add in the list:");
        for (int i = 0; i < size; i++) {
            tempList.add(in.nextInt());
        }
        System.out.println();
        in.close();
        return tempList;
    }
    public ArrayList<Integer> shuffle(ArrayList<Integer> list){
        Random rnd = new Random();
        for (int i = 0; i < list.size(); i++) {
            int randomValue = rnd.nextInt(i+1); // The reason for (i + 1) is the nextInt range cant be zero, so it should start with a value
            int temp = list.get(randomValue);
            list.set(randomValue, i);
            list.set(i, temp);
        }
        return list;
    }
    public void display(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println("\n");
    }
}
