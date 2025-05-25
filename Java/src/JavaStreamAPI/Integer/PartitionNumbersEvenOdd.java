package JavaStreamAPI.Integer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of integers, use the Stream API to partition them into two lists: one for even numbers and one for odd numbers

public class PartitionNumbersEvenOdd {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);

        Map<Boolean, List<Integer>> result = list.stream().collect(Collectors.partitioningBy(n -> n%2==0));


        System.out.println(result);
    }
}
