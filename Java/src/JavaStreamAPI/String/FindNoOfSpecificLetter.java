package JavaStreamAPI.String;

import java.util.List;

// Find no. of specific letters in a string

public class FindNoOfSpecificLetter {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry");

        List<Long> count = words.stream().map(s -> s.toLowerCase().chars().filter(c -> c == 'a').count()).toList();

        System.out.println(count);
    }
}
