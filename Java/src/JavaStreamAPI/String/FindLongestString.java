package JavaStreamAPI.String;

import java.util.List;

// Given a list of strings, use the Stream API to find the longest string.

public class FindLongestString {
    public static void main(String[] args) {
        List<String> list = List.of("Abishek", "Melwin", "Joan");

        String result = list.stream().sorted((a,b) -> b.length() - a.length()).findFirst().orElse("");

        System.out.println(result);
    }
}
