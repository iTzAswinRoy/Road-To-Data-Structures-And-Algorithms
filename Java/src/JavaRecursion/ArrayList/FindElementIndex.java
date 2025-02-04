package JavaRecursion.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

// Write a recursive function to find the first index of a specific element in an ArrayList.
public class FindElementIndex {
    public static void main(String[] args) {
        FindElementIndex obj = new FindElementIndex();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Given array list:\n" + list);
        System.out.println("\nEnter the element to find its index:");

        Scanner in = new Scanner(System.in);
        int findElement = in.nextInt();

        if (obj.elementCheck(list, 0, findElement) ) {
            int result = obj.findingIndex(list, 0, findElement);

            System.out.println("\nElement " + findElement + " is found at given index " + result);
        } else {
            System.out.println("\nElement not found!");
        }

        in.close();
    }

    public int findingIndex(ArrayList<Integer> data, int index, int element) {
            if (index >= data.size()) {
                return -1;
            }
            if (data.get(index) == element) {
                return index;
            }
            return findingIndex(data, index + 1, element);
    }

    public boolean elementCheck(ArrayList<Integer> data, int index, int specificElement) {
        if (index >= data.size()) {
            return false;
        }

        if (data.get(index) == specificElement) {
            return true;
        }
        return elementCheck(data, index + 1, specificElement);
    }
}
