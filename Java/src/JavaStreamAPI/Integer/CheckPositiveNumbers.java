package JavaStreamAPI.Integer;

import java.util.List;

// Given a list of integers, use the Stream API to check if all numbers are positive.

public class CheckPositiveNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,-1);

        boolean result = list.stream().allMatch(n -> n > 0);

        System.out.println(result);
    }
}
