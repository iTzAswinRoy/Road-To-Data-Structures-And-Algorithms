package JavaHashSet;

import java.util.HashSet;//

// Write a method to check whether a given element exists in a HashSet.
public class HS3 {//
    public static void main(String[] args) {//
        HS3 obj = new HS3();//
        HashSet<Integer> set = new HashSet<>();//

        set.add(1);//
        set.add(2);//
        set.add(3);//
        set.add(4);//
        set.add(5);//

        System.out.println("Original hash set:\n"+ set);
        System.out.println(obj.checkingElement(set, 5));//
    }

    public boolean checkingElement(HashSet<Integer> set, int data){//
        System.out.println("\nChecking if the element " + data + " is preset in the hash set:");
        return set.contains(data);//
    }
}
