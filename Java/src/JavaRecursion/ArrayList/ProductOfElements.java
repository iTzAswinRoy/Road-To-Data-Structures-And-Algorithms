package JavaRecursion.ArrayList;


import java.util.ArrayList;

// Write a recursive function to find the product of all elements in an ArrayList of integers.
public class ProductOfElements {
    public static void main(String[] args) {
        ProductOfElements obj = new ProductOfElements();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int result = obj.multiplyingElements(list, 0);
        System.out.println("Given array list:\n" + list);
        System.out.println("\nFinding the product of the elements in the array list:\n"+ result);
    }

    public int multiplyingElements(ArrayList<Integer> data, int index){
        if (index >= data.size()){
            return 1;
        }
        return multiplyingElements(data, index+1) * data.get(index);
    }
}
