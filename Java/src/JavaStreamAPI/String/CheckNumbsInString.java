package JavaStreamAPI.String;

import java.util.List;

public class CheckNumbsInString {
    public static void main(String[] args) {
        List<String> words = List.of("App1le", "Banan2a", "Avocad3o", "Cherry", "Apricot", "Blueberry");

        boolean result = words.stream().anyMatch(s-> s.chars().anyMatch(Character::isDigit));

        System.out.println(result);
    }
}
