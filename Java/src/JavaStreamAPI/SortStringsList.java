package JavaStreamAPI;

import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, use the Stream API to sort them in alphabetical order.

public class SortStringsList {
    public static void main(String[] args) {

        List<String> list = List.of("Aswin", "DataNimbus", "Book");

        List<String> result = list.stream().sorted().collect(Collectors.toList());

        System.out.println(result);
    }
}
