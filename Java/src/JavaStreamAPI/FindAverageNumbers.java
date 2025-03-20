package JavaStreamAPI;

import java.util.List;

//Given a list of integers, use the Stream API to calculate the average of the numbers.
public class FindAverageNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);

        int avg = (int) list.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println(avg);
    }
}
