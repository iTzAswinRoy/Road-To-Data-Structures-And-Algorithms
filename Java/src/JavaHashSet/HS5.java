package JavaHashSet;

import java.util.HashSet;//

// Write a program that clears all elements from a HashSet.
public class HS5 {//
    public static void main(String[] args) {
        HS5 obj = new HS5();
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println("Original hash set:\n"+ set);
        obj.clearHashSet(set);
        System.out.println(obj.checkingIsEmpty(set));
    }

    public void clearHashSet(HashSet<Integer> data){
        System.out.println("\nClearing all the elements in the hash set..");
        data.clear();
    }

    public boolean checkingIsEmpty(HashSet<Integer> set){
        System.out.println("\nChecking if the HashSet is empty:");
        return set.isEmpty();
    }
}
