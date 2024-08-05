package JavaRecursion.Arrays;

import java.util.Arrays;

//Write a recursive function to replace all occurrences of a specific element in an array with another element.
public class ReplaceOccurrence {
    public static void main(String[] args) {
    ReplaceOccurrence obj = new ReplaceOccurrence();
    int[] array = {1,2,4,2,5,8,2,10};
    int[] result = obj.replaceElements(array, 0, 2, 99);

    System.out.println("Given array:\n"+ Arrays.toString(array));
    System.out.println("\nArray after replacing all the occurrence with the specie element:\n" + Arrays.toString(result));
    }

    public int[] replaceElements(int[] data, int index, int specificElement, int replace) {
        if (index == data.length) {
        return data;
        }

        if(data[index] == specificElement) {
            data[index] = replace;
        }
        return replaceElements(data, index + 1, specificElement, replace);
    }
}
