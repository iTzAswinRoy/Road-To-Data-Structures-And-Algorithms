package JavaStreamAPI.String;

import java.util.List;
import java.util.stream.Collectors;

// Count the number of strings in a list that have length greater than 5.

public class AboveLength {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry");

        List<String> result = words.stream().filter(n-> n.length() > 5).toList();
        System.out.println(result);
    }
}
