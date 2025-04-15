package JavaStreamAPI.String;


import java.util.List;

// Given a list of strings, use the Stream API to count how many strings start with the letter "A".
public class CountStringsWithSpecificLetter {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry");

        long count = words.stream().filter(n -> n.startsWith("A")).count();


        System.out.println(count);
    }
}
