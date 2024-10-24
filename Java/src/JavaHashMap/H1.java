package JavaHashMap;//
import java.util.HashMap;//

// Given an array of integers, return the indices of the two numbers that add up to a specific target.
// Use a hash map to store numbers and their indices.
public class H1 {       //
    public static int[] twoSum(int[] array, int target) {        //
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= array.length; i++){
            int complement = target - array[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(array[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] numbArray = {2, 7, 11, 5};
        int target = 16;
        int[] result = twoSum(numbArray, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

