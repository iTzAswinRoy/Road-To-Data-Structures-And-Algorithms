package JavaStreamAPI.String;

import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, use the Stream API to sort them in alphabetical order.

public class SortStringsList {
    public static void main(String[] args) {

        List<String> words = List.of("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry");

        List<String> result = words.stream().sorted().collect(Collectors.toList());

        System.out.println(result);
    }
}
