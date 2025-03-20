package JavaStreamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of strings, use the Stream API to group them by their length.

public class GroupStringLength {
    public static void main(String[] args) {
        List<String> list = List.of("Aswin", "Melwin", "Abishek", "Prince", "Foods");

        Map<Integer, List<String>> result = list.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(result);
        
    }


}
