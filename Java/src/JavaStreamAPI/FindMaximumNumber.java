package JavaStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

//Given a list of integers, use the Stream API to find the maximum number.
public class FindMaximumNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int result = list.stream().mapToInt(Integer::intValue).max().orElse(0);

        System.out.println(result);
    }
}
