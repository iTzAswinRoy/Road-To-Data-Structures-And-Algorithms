package JavaHashSet;

import java.util.HashSet;//

// Write a program that finds the difference between two HashSets (i.e., elements present in one set but not the other).
public class HS9 {//
    public static void main(String[] args) {
        // Create two HashSet objects
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Add elements to set2
        set2.add(3);
        set2.add(4);
        set2.add(5);

        HashSet<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("Hash set after removing all the common elements:\n"+ difference);
    }
}
