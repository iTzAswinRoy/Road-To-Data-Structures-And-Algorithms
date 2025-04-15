package JavaStreamAPI.Integer;

// Given a list of integers, use the Stream API to calculate the sum of all the numbers.

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int result = list.stream().mapToInt(Integer::intValue).sum();

        System.out.println(result);
    }
}
