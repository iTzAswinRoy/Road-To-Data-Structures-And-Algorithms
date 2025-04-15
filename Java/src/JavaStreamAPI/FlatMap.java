package JavaStreamAPI;


//Given a list of lists (e.g., List<List<Integer>>), use the Stream API to flatten it into a single list.

import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9));

        List<Integer> result = list.stream().flatMap(l -> l.stream()).collect(Collectors.toList());

        System.out.println(result);
    }
}
