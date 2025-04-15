package JavaStreamAPI.String;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesString {
    public static void main(String[] args) {
        String str = "Speed";

        Arrays.stream(str.split("")).map(String::toLowerCase).distinct().forEach(System.out::print);

//        List<String> list = List.of("Aswiin", "melwiin");
//
//
//        List<String> sortChar = list.stream().map(String::toLowerCase)
//                .map(s->s.chars().sorted().mapToObj(c->String.valueOf(c))
//
//        System.out.println(result);

                List<Integer> list1 = List.of(1,2,3,4,5);
        List<Integer> list2 = List.of(2,23,4,45);

        List<Integer> result = list1.stream().filter(n->list2.contains(n)).collect(Collectors.toList());
        System.out.println(result);

    }
}
