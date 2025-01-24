package JavaRecursion.Arrays;

import java.util.Arrays;

//Write a recursive function to count the number of even numbers in an array.
public class CountEvenNumbers {
    public static void main(String[] args) {
        CountEvenNumbers obj = new CountEvenNumbers();

        int[] array = {2,12,7,10,99};//
        System.out.println("Given array:\n"+ Arrays.toString(array));//
        System.out.println("\nProduct of the array:\n"+obj.countEven(array, 0, 0));

    }

    public int countEven(int[] data, int index, int count){
        if (index == data.length){
            return count;
        }
        if(checkEven(data[index])){
            count++;
        }
        return countEven(data, index+1, count);
    }

    public boolean checkEven(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }
}
