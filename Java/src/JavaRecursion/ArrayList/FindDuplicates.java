package JavaRecursion.ArrayList;

import java.util.ArrayList;

// Write a recursive function to find duplicate elements in an ArrayList.
public class FindDuplicates {
    public static void main(String[] args) {
        FindDuplicates obj = new FindDuplicates();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(5);

        System.out.println("Given array list:\n" + list);
        System.out.println("\nFinding duplicate elements in the array list:\n"+obj.duplicateElements(list, 0, new ArrayList<>()));
    }

    public ArrayList<Integer> duplicateElements(ArrayList<Integer> data, int index, ArrayList<Integer> result){
        if (index == data.size()){
            return result;
        }
        int currentElements = data.get(index);
        boolean isChecked = false;

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) == currentElements && index != i) {
                isChecked = true;
                break;
            }
        }

        if (isChecked) {
            if (!result.contains(currentElements)){
                result.add(currentElements);
            }
        }
        return duplicateElements(data, index+1, result);
    }
}
