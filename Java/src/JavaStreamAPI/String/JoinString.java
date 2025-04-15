package JavaStreamAPI.String;

// Join a list of strings into a single comma-separated string.

import java.util.List;
import java.util.stream.Collectors;

public class JoinString {
    public static void main(String[] args) {

        List<String> words = List.of("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry");

        String result = words.stream().collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
