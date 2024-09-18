package JavaHashSet;

import java.util.HashSet;
import java.util.Scanner;

// Write a program that adds a list of integers to a HashSet and prints the set.
public class HS1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();//
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(4);
        set.add(4);//

        System.out.println("Adding elements to the hash set...");
        System.out.println("\nOriginal hash set:\n" + set);

    }
}
