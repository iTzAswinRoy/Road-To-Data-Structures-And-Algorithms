package JavaStreamAPI.String;

// Given a list of strings, use the Stream API to concatenate them into a single string, separated by commas.

import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateStrings {
    public static void main(String[] args) {
        List<String> list = List.of("Aswin", "Melwin", "Joan");

//        String str = list.stream().reduce("", (a,b) -> a+" "+b);

        String str = list.stream().collect(Collectors.joining(" "));

        System.out.println(str);
    }
}
