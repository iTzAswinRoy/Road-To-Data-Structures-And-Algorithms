package JavaHashSet;

import java.util.HashSet;

// Write a program that iterates over a HashSet and prints each element.
public class HS4 {
    public static void main(String[] args) {
        HS4 obj = new HS4();
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        obj.iterator(set);
    }

    public void iterator(HashSet<Integer> data){
        System.out.println("Displaying each element in the hast set using iteration method:");
        for(int num: data){
            System.out.println(num);
        }
    }
}