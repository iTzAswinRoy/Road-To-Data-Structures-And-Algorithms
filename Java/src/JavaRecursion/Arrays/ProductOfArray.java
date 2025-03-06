package JavaRecursion.Arrays;

import java.util.Arrays;//

//Write a recursive function to find the product of all elements in an array.
public class ProductOfArray {
    public static void main(String[] args) {//
        ProductOfArray obj = new ProductOfArray();
        int[] array = {2,3,5,1};

        System.out.println("Given array:\n"+ Arrays.toString(array));
        System.out.println("\nProduct of the array:\n"+obj.multiplyingElements(array, 0, 0));
    }

    public int multiplyingElements(int[] data, int index, int product){
        if( index >= data.length) {
            return 1;
        }
        return data[index] * multiplyingElements(data, index + 1, product);
    }
}
