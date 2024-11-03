package JavaHashSet;

import java.util.HashSet;//

// Write a program to check if one HashSet is a subset of another.
public class HS10 {//
    public static void main(String[] args) {//
        // Create two HashSet objects
        HashSet<Integer> set1 = new HashSet<>();//
        HashSet<Integer> set2 = new HashSet<>();//

        // Add elements to set1
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Add elements to set2
        set2.add(1);
        set2.add(2);

        if(set1.containsAll(set2)){
            System.out.println("set-2 is a subset of set-1.");
        } else {
            System.out.println("set-2 is not a subset of set-1!");
        }
    }
}
