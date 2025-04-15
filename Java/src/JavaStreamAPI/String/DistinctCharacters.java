package JavaStreamAPI.String;

// Get a list of distinct characters used in a list of strings.

import java.util.List;
import java.util.stream.Collectors;

public class DistinctCharacters {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry");

        List<String> result = words.stream()
                .map(String::toLowerCase)
                .map(String::toLowerCase)
                .map(w-> w.chars().distinct()
                        .mapToObj(c->String.valueOf((char)c))
                        .collect(Collectors.joining()))
                        .collect(Collectors.toList());

        System.out.println(result);
    }
}
