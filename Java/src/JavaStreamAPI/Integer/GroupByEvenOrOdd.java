package JavaStreamAPI.Integer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByEvenOrOdd {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4);

        Map<String, List<Integer>> tem = list.stream().collect(Collectors.groupingBy(n-> n%2 !=0 ? "odd": "even"));

        System.out.println(tem);
    }
}
