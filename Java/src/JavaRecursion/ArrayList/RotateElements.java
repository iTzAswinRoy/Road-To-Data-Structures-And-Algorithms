package JavaRecursion.ArrayList;

import java.util.ArrayList;

// Write a recursive function to rotate elements of an ArrayList to the right by k positions.
public class RotateElements {
    public static void main(String[] args) {
        RotateElements obj = new RotateElements();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        System.out.println("Given array list:\n" + list);
        System.out.println("\nRotating the element in the array list:");

        obj.generateRotation(list, 0);
    }

    public void generateRotation(ArrayList<Integer> data, int index){
        if(index >= data.size()){
            return;
        }
        printList(data);

        rotateList(data);

        generateRotation(data, index+1);
    }

    public void rotateList(ArrayList<Integer> data){
        int first = data.getFirst();

        for (int i = 0; i < data.size()-1; i++) {
            data.set(i, data.get(i+1));
        }
        data.set(data.size()-1, first);
    }

    public void printList(ArrayList<Integer> data){
        System.out.println(data);
    }
}
