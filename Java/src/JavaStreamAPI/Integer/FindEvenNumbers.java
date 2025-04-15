package JavaStreamAPI.Integer;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

// Given a list of integers, use the Stream API to find all the even numbers.

public class FindEvenNumbers {
     public static void main(String[] args) {
         List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

         List<Integer> result = list.stream().filter(n -> n % 2 == 0)
                 .collect(Collectors.toList());

         System.out.println(result);
     }
}