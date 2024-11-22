package JavaHashSet;

import java.util.HashMap;//
import java.util.HashSet;//

// Write a program to find the intersection of two HashSets (i.e., common elements).
public class HS7 {
    public static void main(String[] args) {//
        HS7 obj = new HS7();//
        HashSet<Integer> set1 = new HashSet<>();//

        set1.add(1);//
        set1.add(3);//
        set1.add(2);//
        set1.add(5);
        set1.add(4);

        HashSet<Integer> set2 = new HashSet<>();

        set2.add(8);
        set2.add(3);
        set2.add(5);
        set2.add(1);
        set2.add(9);

        System.out.println("Set - 1: "+ set1);
        System.out.println("Set - 2: "+ set2);

        System.out.println("\nFinding intersection from both the hash sets:\n" + obj.findIntersection(set1, set2));
    }

    public HashSet<Integer> findIntersection(HashSet<Integer> data1, HashSet<Integer> data2){
        HashSet<Integer> intersection = new HashSet<>();

        for (Integer element : data1){
            if(data2.contains(element)){
                intersection.add(element);
            }
        }

        return intersection;
    }
}
