package JavaHashSet;

import java.util.Arrays;//
import java.util.HashSet;//

// Write a program that converts an array of strings into a HashSet to remove duplicates.
public class HS6 {//
    public static void main(String[] args) {//
        HashSet<Integer> set = new HashSet<>();

        int[] array = {1,5,2,7,2,5,1};
        System.out.println("Given array:\n"+ Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        System.out.println("\nConverting arrays into hash map:\n"+set);
    }
}
