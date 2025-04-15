package JavaStreamAPI.String;

import java.util.List;

// Find the longest string in a list using Stream API.

public class LargestString {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry");

        List<String> result = words.stream().sorted((a,b)-> b.length() - a.length()).limit(1).toList();

        System.out.println(result);
    }
}
