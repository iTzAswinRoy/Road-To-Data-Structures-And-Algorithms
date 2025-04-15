package JavaStreamAPI.String;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CheckPalindrome {
    public static void main(String[] args) {
        List<String> words = List.of("abab", "hoho", "abc", "abcd", "hello", "testtest", "tot");

        Map<Boolean, List<String>> result = words.stream()
                .collect(Collectors.groupingBy(
                        s -> s.length() % 2 != 0 && s.substring(0, s.length() / 2).equals(s.substring((s.length() / 2) + 1)) ||
                                s.length() % 2 == 0 && s.substring(0, s.length() / 2).equals(s.substring(s.length() / 2))
                ));

        System.out.println(result);
    }
}
