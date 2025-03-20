package JavaStreamAPI;

//Given a list of strings, use the Stream API to convert all strings to uppercase.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringsToUppercase {
    public static void main(String[] args) {

        List<String> name = Arrays.asList("aswin", "Melwin");
        List<String> result = name.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(result);
    }
}
