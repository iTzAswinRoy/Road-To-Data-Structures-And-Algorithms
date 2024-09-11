package JavaHashSet;

import java.util.HashSet;

//Write a program to find the union of two HashSets (i.e., all unique elements from both sets).
public class HS8 {
    public static void main(String[] args) {
    HS8 obj = new HS8();
    HashSet<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

    HashSet<Integer> set2 = new HashSet<>();

        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        set2.add(10);

        System.out.println("Set - 1: "+ set1);
        System.out.println("Set - 2: "+ set2);

        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println("\nPerforming union on both the hash sets:\n" + union);
    }
}
