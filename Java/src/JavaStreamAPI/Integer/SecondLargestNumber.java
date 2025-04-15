package JavaStreamAPI.Integer;

import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, use the Stream API to find the second-largest number.

public class SecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(3,5,1,2,4);

//        int result = list.stream().sorted((a,b) -> b - a).skip(1).findFirst().orElse(0);

        List<Integer> result = list.stream().sorted((a,b) -> b - a).skip(1).limit(1).collect(Collectors.toList());

        System.out.println(result);
    }
}
