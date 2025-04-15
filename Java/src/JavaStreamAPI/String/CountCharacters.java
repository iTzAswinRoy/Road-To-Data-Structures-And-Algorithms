package JavaStreamAPI.String;


import java.util.List;
import java.util.stream.Collectors;

// Count frequency of each character in a string

public class CountCharacters {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry");

        List<Long> result = words.stream()
                .map(String::toLowerCase)
                .map(s-> s.chars()
                        .mapToObj(c -> String.valueOf((char) c))
                        .count())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
