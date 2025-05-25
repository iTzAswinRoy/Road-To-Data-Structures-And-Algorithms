package JavaStreamAPI.String;


import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// Count frequency of each character in a string

public class CountCharacters {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry");

        List<Long> result = words.stream().map(s-> s.chars().count()).toList();

        System.out.println(result);

    }
}
