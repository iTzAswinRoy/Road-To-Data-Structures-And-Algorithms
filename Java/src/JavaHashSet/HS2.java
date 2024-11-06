package JavaHashSet;

import java.util.HashSet;

// Write a program to remove a specified element from a HashSet.
public class HS2 {//
    public static void main(String[] args) {//
        HashSet<Integer> set = new HashSet<>();//

        set.add(1);//
        set.add(2);//
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println("Original hash set:\n"+ set);    //
        set.remove(3);//
        System.out.println("\nHashSet after removing a specific element:\n" + set);
    }
}
