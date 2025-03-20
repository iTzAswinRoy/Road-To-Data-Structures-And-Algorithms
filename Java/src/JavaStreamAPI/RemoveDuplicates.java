package JavaStreamAPI;

import java.util.List;
import java.util.stream.Collectors;
// Given a list of integers, use the Stream API to remove duplicates and return a list of unique elements.


public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 1, 2, 3, 2);


        List<Integer> result = list.stream().distinct().collect(Collectors.toList());

        System.out.println(result);
    }
}
